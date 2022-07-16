package com.nyunusozkaya.kodluyoruz3haftadev.service;

import com.nyunusozkaya.kodluyoruz3haftadev.models.Instructor;

public interface InstructorService<Instructor> extends BaseService<Instructor>{
    void deleteByPhoneNumber(String phNum);
    Instructor updateByPhoneNumber(Instructor instructor, String phNum);
}

