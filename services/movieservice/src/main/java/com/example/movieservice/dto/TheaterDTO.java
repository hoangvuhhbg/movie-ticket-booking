package com.example.movieservice.dto;

import com.example.movieservice.entity.Theater;
import lombok.Data;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Data
public class TheaterDTO {
    private int id;
    private String name;
    private String address;
}
