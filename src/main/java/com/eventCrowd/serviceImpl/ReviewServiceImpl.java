package com.eventCrowd.serviceImpl;

import com.eventCrowd.entity.Review;
import com.eventCrowd.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Override
    public Review addReview(Review review) {
        return null;
    }

    @Override
    public Optional<Review> findReviewById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Review> findAllReviews() {
        return List.of();
    }

    @Override
    public List<Review> findReviewsByServiceId(Long serviceId) {
        return List.of();
    }

    @Override
    public void deleteReview(Long id) {

    }
}
