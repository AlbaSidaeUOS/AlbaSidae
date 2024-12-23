package albabe.albabe.domain.dto;

import albabe.albabe.domain.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    Description : 개인 회원 Dto 소스파일
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalDto {

    private Long id;
    private String email;
    private String name;
    private String birthDate;
    private String gender;
    private String phone;
    private String image;
    private UserRole role;
}