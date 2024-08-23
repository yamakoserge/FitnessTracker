package com.gsoft.FitnessTracker.dto;

import lombok.Data;

import java.util.Date;

@Data
public class WorhoutDTO {
    private Long id;

    private String type;

    private Date date;

    private int duration;

    private int caloriesBurned;

    public  WorhoutDTO getWorhoutDto(){
        WorhoutDTO worhoutDTO = new WorhoutDTO();

        worhoutDTO.setId(id);
        worhoutDTO.setType(type);
        worhoutDTO.setDate(date);
        worhoutDTO.setDuration(duration);
        worhoutDTO.setCaloriesBurned(caloriesBurned);

        return worhoutDTO;
    }
}
