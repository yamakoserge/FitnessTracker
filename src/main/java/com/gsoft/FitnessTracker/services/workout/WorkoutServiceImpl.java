package com.gsoft.FitnessTracker.services.workout;


import com.gsoft.FitnessTracker.dto.WorkoutDTO;
import com.gsoft.FitnessTracker.entity.Workout;
import com.gsoft.FitnessTracker.repository.WorkoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<WorkoutDTO> getWorkout(){
        List<Workout> workout = workoutRepository.findAll();
        return workout.stream().map(Workout::getWorkoutDto).collect(Collectors.toList());
    }
}
