package com.rest.jwt.repo;

import com.rest.jwt.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepo extends JpaRepository<BookEntity,Long> {
}
