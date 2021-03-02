package com.tts.crystalAPI.controller;

import com.tts.crystalAPI.model.Crystal;
import com.tts.crystalAPI.service.CrystalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/crystal")
@RestController
public class CrystalController {


    CrystalService crystalService;

    public CrystalController (CrystalService crystalService) {
        this.crystalService = crystalService;
    }

    @GetMapping("/{id}")
    public Optional<Crystal> getCrystalById(@PathVariable Long id) {
        return crystalService.getCrystal(id);
    }

    @GetMapping("/all")
    public Iterable<Crystal> getAllCrystals() {
        return crystalService.getAllCrystals();
    }
}
