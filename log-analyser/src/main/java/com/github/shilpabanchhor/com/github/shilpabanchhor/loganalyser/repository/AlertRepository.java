package com.github.shilpabanchhor.loganalyser.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.shilpabanchhor.loganalyser.model.cs.Alert;

@Repository
public interface AlertRepository extends CrudRepository<Alert, String> {
}
