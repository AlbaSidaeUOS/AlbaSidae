package albabe.albabe.domain.service;

import albabe.albabe.domain.dto.CompanyDto;
import albabe.albabe.domain.dto.JobApplicationDto;
import albabe.albabe.domain.dto.JobPostResponse;
import albabe.albabe.domain.entity.JobApplicationEntity;
import albabe.albabe.domain.entity.JobPostEntity;
import albabe.albabe.domain.entity.ResumeEntity;
import albabe.albabe.domain.entity.UserEntity;
import albabe.albabe.domain.repository.JobApplicationRepository;
import albabe.albabe.domain.repository.JobPostRepository;
import albabe.albabe.domain.repository.ResumeRepository;
import albabe.albabe.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/*
    Description : 알바 지원 Service 소스파일. 알바 지원 관련 함수들,
    JobPostEntity를 JobPostDto로 변환하는 함수 구현
 */

@Service
public class JobApplicationService {

    @Autowired
    private JobApplicationRepository jobApplicationRepository;

    @Autowired
    private JobPostRepository jobPostRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ResumeRepository resumeRepository;

    public void applyForJob(Long jobPostId, String applicantEmail, JobApplicationDto applicationDto) {
        JobPostEntity jobPost = jobPostRepository.findById(jobPostId)
                .orElseThrow(() -> new IllegalArgumentException("구인 공고를 찾을 수 없습니다."));
        UserEntity applicant = userRepository.findByEmail(applicantEmail)
                .orElseThrow(() -> new IllegalArgumentException("지원자를 찾을 수 없습니다."));
        ResumeEntity resume = resumeRepository.findById(applicationDto.getResume())
                .orElseThrow(() -> new IllegalArgumentException("해당 이력서를 찾을 수 없습니다."));

        if (jobApplicationRepository.existsByJobPostAndApplicant(jobPost, applicant)) {
            throw new IllegalArgumentException("이미 지원한 알바입니다.");
        }

        JobApplicationEntity application = new JobApplicationEntity();
        application.setJobPost(jobPost);
        application.setApplicant(applicant);
        application.setResume(resume);
        application.setDescription(applicationDto.getDescription());

        jobApplicationRepository.save(application);
    }

    public List<JobApplicationDto> getApplicationsForJobPost(Long jobPostId) {
        List<JobApplicationEntity> applications = jobApplicationRepository.findByJobPostId(jobPostId);
        return applications.stream()
                .map(application -> new JobApplicationDto(
                        application.getId(),
                        application.getResume().getId(),
                        application.getDescription()
                ))
                .collect(Collectors.toList());
    }

    public List<JobPostResponse> getAppliedJobPosts(String email) {
        List<JobPostEntity> jobPosts = jobApplicationRepository.findJobPostsByUserEmail(email);

        // 지원 내역이 없을 경우 예외 처리
        if (jobPosts.isEmpty()) {
            throw new IllegalArgumentException("해당 이메일로 지원한 공고가 없습니다.");
        }

        // 각 JobPostEntity를 JobPostResponse로 변환
        return jobPosts.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private JobPostResponse convertToDto(JobPostEntity jobPost) {
        CompanyDto companyDto = new CompanyDto(
                jobPost.getCompany().getId(),
                jobPost.getCompany().getEmail(),
                jobPost.getCompany().getName(),
                jobPost.getCompany().getImage(),
                jobPost.getCompany().getRole()
        );

        return new JobPostResponse(
                jobPost.getId(),
                jobPost.getTitle(),
                jobPost.getCompanyName(),
                jobPost.getCompanyContent(),
                jobPost.getCompanyImage(),
                jobPost.getPlace(),
                jobPost.getPlaceDetail(),
                jobPost.getWorkCategory(),
                jobPost.getWorkType(),
                jobPost.getWorkTimeCategory(),
                jobPost.getPeopleNum(),
                jobPost.getCareer(),
                jobPost.getWorkTerm(),
                jobPost.getWorkDays(),
                jobPost.getWorkTime(),
                jobPost.getPay(),
                jobPost.getGender(),
                jobPost.getAge(),
                jobPost.getDeadline(),
                jobPost.getSubmitMethod(),
                companyDto,
                jobPost.getCreatedAt()
        );
    }
}

