package com.nyunusozkaya.kodluyoruz3haftadev.service;

import com.nyunusozkaya.kodluyoruz3haftadev.Dao.InstructorDAO;
import com.nyunusozkaya.kodluyoruz3haftadev.models.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImpl {

        private final InstructorDAO<Instructor> InstructorDAO ;

        @Autowired
        public InstructorServiceImpl(InstructorDAO<Instructor> iInstructorDAO) {
            this.InstructorDAO = InstructorDAO;
        }

        @Override
        public List<Instructor> findAll() {
            return InstructorDAO.findAll();
        }

        @Override
        public Instructor findById(int id) {
            return InstructorDAO.findById(id);
        }

        @Override
        public Instructor save(Instructor instructor) {
            return InstructorDAO.save(instructor);
        }

        @Override
        public void deleteById(int id) {
            InstructorDAO.deleteById(id);
        }

        @Override
        public void deleteByPhoneNumber(Long phone_number) {
            InstructorDAO.deleteByPhoneNumber(phone_number);
        }

        @Override
        public Instructor update(Instructor instructor, int id) {
            return InstructorDAO.update(instructor,id);
        }
        @Override
        public Instructor updateByPhoneNumber(Instructor instructor,Long phone_number) {
            return InstructorDAO.updateByPhoneNumber(instructor, phone_number);
        }
}
