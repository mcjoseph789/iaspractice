package com.iastraining.fundamentals.repository;

import com.iastraining.fundamentals.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}