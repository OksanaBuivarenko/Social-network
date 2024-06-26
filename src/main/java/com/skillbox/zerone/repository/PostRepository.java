package com.skillbox.zerone.repository;

import com.skillbox.zerone.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>, JpaSpecificationExecutor<Post> {
    List<Post> findAllByTimeDeleteBefore(LocalDateTime beforeThisTime);

    List<Post> findAllByAuthorId(Long authorId);
}
