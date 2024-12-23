// 사용자의 정보를 불러와 표시, 프로필 이미지 변경 기능

import React, { useState, useEffect, useContext, useRef } from "react";
import { ReactComponent as SettingIcon } from "../../images/Setting.svg";
import { AuthContext } from "../auth/AuthContext";
import S from "../../uis/ProfileUI";
import { useNavigate } from "react-router-dom";

const UserInfo = () => {
  const API_URL = process.env.REACT_APP_API_URL;
  const navigate = useNavigate();
  const { email } = useContext(AuthContext);
  const [formData, setFormData] = useState({
    name: "",
    image: "",
    email: "",
    phone: "",
  });
  const fileInputRef = useRef(null);

  useEffect(() => {
    const fetchUserData = async () => {
      try {
        const response = await fetch(
          `${API_URL}/api/users/${encodeURIComponent(email)}`,
          {
            headers: {
              "ngrok-skip-browser-warning": "69420",
            },
          }
        );
        const data = await response.json();
        if (response.ok && data.result) {
          const formattedPhone = data.data.phone.replace(
            /(\d{3})(\d{4})(\d{4})/,
            "$1-$2-$3"
          );
          setFormData({
            name: data.data.name,
            image: data.data.image,
            email: data.data.email,
            phone: formattedPhone,
          });
        } else {
          console.error("Fail to fetch : ", data.message);
        }
      } catch (error) {
        console.error("Error fetching user data : ", error);
      }
    };
    fetchUserData();
  }, [email, API_URL]);

  const handleSettingClick = () => {
    navigate("/userinfochange");
  };

  const handleImageClick = () => {
    fileInputRef.current.click();
  };

  const handleImageChange = async (e) => {
    const file = e.target.files[0];
    if (file) {
      const formData = new FormData();
      formData.append("image", file);

      try {
        const response = await fetch(
          `${API_URL}/api/users/${encodeURIComponent(email)}/image`,
          {
            method: "PUT",
            headers: {
              Accept: "application/json",
              "ngrok-skip-browser-warning": "69420",
            },
            body: formData,
          }
        );

        if (response.ok) {
          const updatedImageURL = URL.createObjectURL(file);
          setFormData((prev) => ({
            ...prev,
            image: updatedImageURL,
          }));
        } else {
          const data = await response.json();
          console.error("Upload failed: ", data.message);
        }
      } catch (error) {
        console.error("Error uploading image: ", error);
      }
    }
  };

  return (
    <S.UserInfo>
      <S.SettingIcon onClick={handleSettingClick}>
        <SettingIcon />
      </S.SettingIcon>
      <S.UserInfoTop>
        <S.ImageWrapper onClick={handleImageClick}>
          {formData.image ? (
            <S.UserImage src={formData.image} />
          ) : (
            <S.ProfileImage />
          )}
          <input
            type="file"
            accept="image/*"
            ref={fileInputRef}
            style={{ display: "none" }}
            onChange={handleImageChange}
          />
        </S.ImageWrapper>

        <S.UserName>{formData.name}</S.UserName>
      </S.UserInfoTop>
      <S.UserInfoBottom>
        <S.BottomText>이메일</S.BottomText>
        <S.BottomData>{formData.email}</S.BottomData>
      </S.UserInfoBottom>
      <S.UserInfoBottom>
        <S.BottomText>연락처</S.BottomText>
        <S.BottomData>{formData.phone}</S.BottomData>
      </S.UserInfoBottom>
    </S.UserInfo>
  );
};

export default UserInfo;
