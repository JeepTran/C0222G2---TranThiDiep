package com.codegym.coffee_store_feedback.repository;

import com.codegym.coffee_store_feedback.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface IFeedbackRepository extends JpaRepository<Feedback, Integer> {
    @Modifying
    @Query(value = " insert into feedback (code, feedback_date, creator, email, content, rating, image) " +
            " values (:code, :feedback_date, :creator, :email, " +
            " :content, :rating, :image) ",
            nativeQuery = true)
    void saveFeedback(@Param("code") String code, @Param("feedback_date") String date, @Param("creator") String creator,
                      @Param("email") String email, @Param("content") String content, @Param("rating") int rating,
                      @Param("image") String image);

    @Query(value = "select max(id) from feedback ", nativeQuery = true)
    Integer findLastFeedbackId();
}
