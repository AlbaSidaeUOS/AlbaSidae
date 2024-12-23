package albabe.albabe.domain.entity;

import albabe.albabe.domain.enums.UserRole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
    Description : 회원 Entity 소스파일
 */

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email")) // 이메일 중복 방지
@Getter
@Setter
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true) // 이메일 중복 방지
    private String email;

    @Column(nullable = false)
    private String password;


    private String name;

    private String birthDate;

    private String gender;

    @Column(unique = true)
    private String phone;

    @Column(unique = true)
    private String businessNumber;

    private String image;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;
}
