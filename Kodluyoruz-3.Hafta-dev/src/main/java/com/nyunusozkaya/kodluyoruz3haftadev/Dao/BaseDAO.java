package com.nyunusozkaya.kodluyoruz3haftadev.Dao;

import com.nyunusozkaya.kodluyoruz3haftadev.Exception.AlreadyExistsException;

import java.util.List;
public interface BaseDAO<T> {
    List<T> findAll();
    T findById(int id);
    T save(T object) throws AlreadyExistsException;
    void deleteById(int id);
    T update(T object,int id);
}