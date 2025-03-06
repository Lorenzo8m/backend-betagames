package com.betagames.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betagames.model.Reviews;

/**
 *
 * @author FabriniMarco
 */
@Repository
public interface IReviewsRepository extends JpaRepository<Reviews, Integer> {
    List<Reviews> findByUserId(Integer userId);

    List<Reviews> findByGameId(Integer idGames);
    
    Optional<Reviews> findByUserIdAndGameId(Integer userId, Integer gameId);

}// interface
