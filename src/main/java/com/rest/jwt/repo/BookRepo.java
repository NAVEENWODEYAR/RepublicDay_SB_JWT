package com.rest.jwt.repo;

import com.rest.jwt.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepo extends CrudRepository<BookEntity,Long> {
}
