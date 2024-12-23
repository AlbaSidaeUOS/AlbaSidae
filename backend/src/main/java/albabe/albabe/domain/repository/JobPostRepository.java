package albabe.albabe.domain.repository;

import albabe.albabe.domain.entity.JobPostEntity;
import albabe.albabe.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/*
    Description : 모집 공고 Repository 소스파일. 모집 공고 정렬, 찾기, 필터링된 모집 공고 조회, 검색 함수 존재
 */

@Repository
public interface JobPostRepository extends JpaRepository<JobPostEntity, Long> {
    // 이메일이 제공되지 않을 경우 전체 조회
    @Query("SELECT jp FROM JobPostEntity jp WHERE :email IS NULL OR jp.company.email = :email")
    List<JobPostEntity> findJobPostsByEmail(@Param("email") String email);


    // 이메일이 없는 경우, 모든 공고를 최신순으로 정렬
    List<JobPostEntity> findAllByOrderByCreatedAtDesc();

    // 이메일이 있는 경우, 해당 이메일의 공고를 최신순으로 정렬
    List<JobPostEntity> findByCompany_EmailOrderByCreatedAtDesc(String email);

    List<JobPostEntity> findTop12ByOrderByCreatedAtDesc();

    List<JobPostEntity> findTop12ByOrderByApplicantCountDesc();

    List<JobPostEntity> findAllByCompany(UserEntity company);

    @Query(value = "SELECT DISTINCT post.* " +
            "FROM job_posts as post " +
            "JOIN job_post_entity_work_days as days ON post.id = days.job_post_entity_id " +
            "JOIN job_post_entity_work_category as categories ON post.id = categories.job_post_entity_id " +
            "JOIN job_post_entity_work_time_category as timeCategories ON post.id = timeCategories.job_post_entity_id " +
            "WHERE (:workLocationsSize = 0  OR post.place IN :workLocations) AND " +
            "(:workDaysSize = 0 OR days.work_days IN :workDays) AND " +
            "(:workCategoriesSize = 0 OR categories.work_category IN :workCategories) AND " +
            "(:workTimeCategoriesSize = 0 OR timeCategories.work_time_category IN :workTimeCategories) AND " +
            "(:workTermsSize = 0 OR post.work_term IN :workTerms)", nativeQuery = true)
    List<JobPostEntity> findJobPostsByFilter(
            @Param("workLocations") List<String> workLocations,
            @Param("workLocationsSize") Integer workLocationsSize,
            @Param("workDays") List<String> workDays,
            @Param("workDaysSize") Integer workDaysSize,
            @Param("workCategories") List<String> workCategories,
            @Param("workCategoriesSize") Integer workCategoriesSize,
            @Param("workTimeCategories") List<String> workTimeCategories,
            @Param("workTimeCategoriesSize") Integer workTimeCategoriesSize,
            @Param("workTerms") List<String> workTerms,
            @Param("workTermsSize") Integer workTermsSize
    );

    @Query("SELECT jp FROM JobPostEntity jp WHERE " +
            "(:keyword IS NULL OR jp.title LIKE %:keyword% OR jp.companyContent LIKE %:keyword%)")
    List<JobPostEntity> searchByTitleOrContent(@Param("keyword") String keyword);
}
