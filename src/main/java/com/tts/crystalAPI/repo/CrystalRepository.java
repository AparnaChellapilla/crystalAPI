package com.tts.crystalAPI.repo;

import com.tts.crystalAPI.model.Crystal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrystalRepository extends CrudRepository<Crystal,Long> {
}
