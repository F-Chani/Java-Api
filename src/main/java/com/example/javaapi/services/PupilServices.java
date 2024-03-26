package com.example.javaapi.services;

import com.example.javaapi.entities.Pupil;
import com.example.javaapi.entities.TempDB;
import com.example.javaapi.repositores.PupilRepositores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PupilServices {

    //הזרקת תלויות
    @Autowired
    PupilRepositores pupilRepositores;

    public List<Pupil> getPupils() {
        return (List<Pupil>) pupilRepositores.findAll();
    }

    public Pupil getPupilById(int id) {
        return pupilRepositores.findById(id).get();
    }

    public void addPupil(Pupil pupil) {
        pupilRepositores.save(pupil);
    }

    public void deletePupil(int id) {
        pupilRepositores.deleteById(id);
    }

    public void updatePupil(int id, Pupil pupil) {
        pupilRepositores.save(pupil);
    }

}
