package com.gsoft.FitnessTracker.dto;

import lombok.Data;

import java.util.Date;

@Data
public class GoalDTO {
    private Long id;

    private String description;

    private String startDate;

    private Date endDate;

    private boolean achieved;
}
