package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Results;

@Repository
public interface ResultRepository extends JpaRepository<Results, Long> {
}
