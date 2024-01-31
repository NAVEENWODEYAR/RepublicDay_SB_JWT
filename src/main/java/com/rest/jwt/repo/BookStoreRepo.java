package com.rest.jwt.repo;

import com.rest.jwt.entity.BookStore;
import org.springframework.data.repository.CrudRepository;

public interface BookStoreRepo extends CrudRepository<BookStore,Integer> {
}
