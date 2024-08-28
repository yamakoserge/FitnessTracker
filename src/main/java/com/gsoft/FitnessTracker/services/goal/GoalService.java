package com.gsoft.FitnessTracker.services.goal;

import com.gsoft.FitnessTracker.dto.GoalDTO;

import java.util.List;

public interface GoalService {
    GoalDTO postGoal(GoalDTO dto);

    List<GoalDTO> getGoals();
}
