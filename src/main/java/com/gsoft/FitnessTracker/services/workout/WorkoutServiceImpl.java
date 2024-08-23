package com.gsoft.FitnessTracker.services.workout;

import com.gsoft.FitnessTracker.dto.WorhoutDTO;
import com.gsoft.FitnessTracker.entity.Worhout;
import com.gsoft.FitnessTracker.repository.WorhoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkoutServiceImpl implements WorkoutService {

    private final WorhoutRepository worhoutRepository;

    public WorhoutDTO postWorhout(WorhoutDTO worhoutDTO){
        Worhout worhout = new Worhout();

        worhout.setDate(worhoutDTO.getDate());
        worhout.setType(worhoutDTO.getType());
        worhout.setDuration(worhoutDTO.getDuration());
        worhout.setCaloriesBurned(worhoutDTO.getCaloriesBurned());

        return worhoutRepository.save(worhout).getWorhoutDto();


    }
}
