package com.gsoft.FitnessTracker.services.workout;


import com.gsoft.FitnessTracker.dto.WorkoutDTO;

public interface WorkoutService {
    WorkoutDTO postWorkout(WorkoutDTO workoutDTO);
}
