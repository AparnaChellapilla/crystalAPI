package com.tts.crystalAPI.service;

import com.tts.crystalAPI.model.Crystal;

import java.util.Optional;

public interface CrystalService {

    Optional<Crystal> getCrystal(Long id);
    Iterable<Crystal> getAllCrystals();

}
