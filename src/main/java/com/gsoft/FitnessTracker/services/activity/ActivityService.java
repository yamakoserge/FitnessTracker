package com.gsoft.FitnessTracker.services.activity;

import com.gsoft.FitnessTracker.dto.ActivityDTO;

import java.util.List;

public interface ActivityService {

    ActivityDTO postActivity(ActivityDTO dto);

    List<ActivityDTO> getActivities();
}
