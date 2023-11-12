package com.oosman.movies.repos;

import com.oosman.movies.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepo extends MongoRepository<Review, ObjectId> {
}
