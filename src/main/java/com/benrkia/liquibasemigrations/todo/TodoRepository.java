package com.benrkia.liquibasemigrations.todo;

import org.springframework.data.repository.PagingAndSortingRepository;


public interface TodoRepository extends PagingAndSortingRepository<Todo, Long> {}
