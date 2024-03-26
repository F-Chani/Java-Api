package com.example.javaapi.repositores;

import com.example.javaapi.entities.Pupil;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PupilRepositores extends CrudRepository<Pupil,Integer> {
}
