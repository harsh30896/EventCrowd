package com.eventCrowd.service;

import com.eventCrowd.entity.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    Review addReview(Review review);
    Optional<Review> findReviewById(Long id);
    List<Review> findAllReviews();
    List<Review> findReviewsByServiceId(Long serviceId);
    void deleteReview(Long id);
}
