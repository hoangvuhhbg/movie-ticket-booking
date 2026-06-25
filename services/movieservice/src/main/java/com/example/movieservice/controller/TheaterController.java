package com.example.movieservice.controller;

import com.example.movieservice.dto.TheaterDTO;
import com.example.movieservice.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/theater")
public class TheaterController {
    @Autowired
    private TheaterService theaterService;

    @PostMapping("/create")
    public ResponseEntity<?> createTheater(@RequestBody TheaterDTO TheaterDTO){
        try {
            theaterService.createTheater(TheaterDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateTheater(@RequestBody TheaterDTO TheaterDTO){
        try {
            theaterService.updateTheater(TheaterDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTheater(@PathVariable int id){
        try {
            theaterService.deleteTheater(id);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().build();
    }
}
