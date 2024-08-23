package com.gsoft.FitnessTracker.controller;

import com.gsoft.FitnessTracker.dto.ActivityDTO;
import com.gsoft.FitnessTracker.services.activity.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin("*")
public class ActivityController {

    private final ActivityService activityService;

    @PostMapping("/activity")
    public ResponseEntity<?> postActivity(@RequestBody ActivityDTO dto) {
        ActivityDTO createActivity = activityService.postActivity(dto);

        if (createActivity != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createActivity);

        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
        }
    }

    @GetMapping("/activities")
    public ResponseEntity <?> getActivities(){
        try{
            return ResponseEntity.ok(activityService.getActivities());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Some thing went wrong,");
        }
    }

}
