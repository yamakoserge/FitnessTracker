package com.gsoft.FitnessTracker.controller;

import com.gsoft.FitnessTracker.dto.WorkoutDTO;
import com.gsoft.FitnessTracker.services.workout.WorkoutService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class WorkoutController {

    private final WorkoutService workoutService;
@PostMapping("/workout")
    public ResponseEntity<?> postWorkout(@RequestBody WorkoutDTO workoutDTO){
        try{
            return ResponseEntity.ok(workoutService.postWorkout(workoutDTO));

        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Some thing went wrong");
        }
    }
}
