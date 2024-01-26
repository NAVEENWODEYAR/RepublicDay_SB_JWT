package com.rest.jwt.repo;

import com.rest.jwt.entity.Author;
import com.rest.jwt.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository<Author,Long> {
}
