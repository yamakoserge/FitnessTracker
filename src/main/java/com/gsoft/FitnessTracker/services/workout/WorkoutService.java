package com.gsoft.FitnessTracker.services.workout;


import com.gsoft.FitnessTracker.dto.WorkoutDTO;

import java.util.List;

public interface WorkoutService {
    WorkoutDTO postWorkout(WorkoutDTO workoutDTO);
    List<WorkoutDTO> getWorkout();
}
