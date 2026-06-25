package com.example.movieservice.mapper;

import com.example.movieservice.dto.TheaterDTO;
import com.example.movieservice.entity.Theater;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TheaterMapper{
    Theater toTheater(TheaterDTO theaterDTO);
    TheaterDTO toTheaterDTO(Theater theater);
    void updateTheaterFromDto(TheaterDTO dto, @MappingTarget Theater entity);
}
