package com.iastraining.fundamentals.service;

import com.iastraining.fundamentals.entity.Application;

public interface ApplicationService {
    Iterable<Application> listApplications();
}