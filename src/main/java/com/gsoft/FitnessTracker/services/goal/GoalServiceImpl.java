package com.gsoft.FitnessTracker.services.goal;

import com.gsoft.FitnessTracker.dto.GoalDTO;
import com.gsoft.FitnessTracker.entity.Goal;
import com.gsoft.FitnessTracker.repository.GoalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GoalServiceImpl implements GoalService {

    private final GoalRepository goalRepository;

    public GoalDTO postGoal(GoalDTO dto){
        Goal goal = new Goal();

        goal.setDescription(dto.getDescription());
        goal.setStartDate(dto.getStartDate());
        goal.setEndDate(dto.getEndDate());
        goal.setAchieved(dto.isAchieved());

        return goalRepository.save(goal).getGoalDTO();
    }

    public List<GoalDTO> getGoals(){
        List<Goal> goals = goalRepository.findAll();

        return goals.stream().map(Goal::getGoalDTO).collect(Collectors.toList());
    }
}
