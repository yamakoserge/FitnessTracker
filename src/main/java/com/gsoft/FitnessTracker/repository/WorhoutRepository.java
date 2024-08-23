package com.gsoft.FitnessTracker.repository;

import com.gsoft.FitnessTracker.entity.Worhout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorhoutRepository extends JpaRepository<Worhout, Long> {
}
