package com.smart.connect.repository;

import com.smart.connect.entity.LoggingException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggingRepository extends JpaRepository<LoggingException, Long> {

}