package com.tts.crystalAPI;

import com.tts.crystalAPI.model.Crystal;
import com.tts.crystalAPI.repo.CrystalRepository;
import com.tts.crystalAPI.service.CrystalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Runner implements CommandLineRunner {

    @Autowired
    CrystalRepository crystalRepository;

    @Override
    public void run(String... args) throws Exception {
        crystalRepository.save(new Crystal("clear" , "Clear quartz"));
        crystalRepository.save(new Crystal("Purple" , "Amethyst"));
        crystalRepository.save(new Crystal("Yellow" , "Citraine"));
        crystalRepository.save(new Crystal("clear" , "Diamond"));
        crystalRepository.save(new Crystal("White","Pearl"));
    }
}
