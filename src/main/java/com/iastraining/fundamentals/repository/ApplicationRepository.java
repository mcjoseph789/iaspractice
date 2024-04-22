package com.iastraining.fundamentals.repository;

import com.iastraining.fundamentals.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}

