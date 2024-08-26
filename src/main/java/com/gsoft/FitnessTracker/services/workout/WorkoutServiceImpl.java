package com.gsoft.FitnessTracker.services.workout;


import com.gsoft.FitnessTracker.dto.WorkoutDTO;
import com.gsoft.FitnessTracker.entity.Workout;
import com.gsoft.FitnessTracker.repository.WorkoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkoutServiceImpl implements WorkoutService {

    private final WorkoutRepository workoutRepository;

    public WorkoutDTO postWorkout( WorkoutDTO workoutDTO){
        Workout workout = new Workout();

        workout.setDate(workoutDTO.getDate());
        workout.setType(workoutDTO.getType());
        workout.setDuration(workoutDTO.getDuration());
        workout.setCaloriesBurned(workoutDTO.getCaloriesBurned());

        return workoutRepository.save(workout).getWorkoutDto();
    }
}
