package albabe.albabe.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

/*
    Description : 이력서 Entity 소스파일
 */

@Getter
@Setter
@Entity
@Table(name = "resumes")
public class ResumeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String resumeTitle;

    @Column(length = 1023)
    private String selfIntroduction;

    // New Fields for Education and Preferences
    private String educationLevel; // 최종학력

    @Column(length = 1023)
    private String career; // 경력

    @ElementCollection
    private List<String> preferredWorkLocation; // 희망근무지

    @ElementCollection
    private List<String> preferredJobTypes; // 희망업직종

    @ElementCollection
    private List<String> employmentTypes; // 근무형태

    private String workPeriod; // 근무기간
    private String workDays; // 근무요일

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personal_id")
    private UserEntity personal;

}