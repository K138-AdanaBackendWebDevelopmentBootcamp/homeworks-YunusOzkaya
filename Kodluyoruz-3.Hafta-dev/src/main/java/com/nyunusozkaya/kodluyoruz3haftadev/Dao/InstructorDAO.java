package com.nyunusozkaya.kodluyoruz3haftadev.Dao;


import javax.transaction.Transactional;

public interface InstructorDAO<Instructor> extends BaseDAO<Instructor>{
    void deleteByPhoneNumber(Long phone_number);

    @Transactional
    void deleteByPhoneNumber(String phNum);

    Instructor updateByPhoneNumber(Instructor instructor, Long phone_number);
}