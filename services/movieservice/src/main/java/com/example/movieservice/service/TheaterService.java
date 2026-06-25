package com.example.movieservice.service;

import com.example.movieservice.dto.TheaterDTO;
import com.example.movieservice.entity.Theater;
import com.example.movieservice.mapper.TheaterMapper;
import com.example.movieservice.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheaterService {
    @Autowired
    private TheaterRepository theaterRepository;

    @Autowired
    private TheaterMapper theaterMapper;

    public List<TheaterDTO> getListTheater(){
        List<TheaterDTO> theaterDTOs = new ArrayList<>();
        List<Theater> theaterList = theaterRepository.findAll();
        for(Theater theater : theaterList){
            TheaterDTO theaterDTO = theaterMapper.toTheaterDTO(theater);
            theaterDTOs.add(theaterDTO);
        }
        return theaterDTOs;
    }

    public void createTheater(TheaterDTO TheaterDTO){
        Theater theater = theaterMapper.toTheater(TheaterDTO);
        theaterRepository.save(theater);
    }

    public void updateTheater(TheaterDTO TheaterDTO){
        Theater theater = theaterRepository.findById(TheaterDTO.getId()).orElseThrow(() -> new RuntimeException("Không tồn tại Theater"));
        theaterMapper.updateTheaterFromDto(TheaterDTO, theater);
        theaterRepository.save(theater);
    }

    public void deleteTheater(int id){
        theaterRepository.deleteById(id);
    }
}
