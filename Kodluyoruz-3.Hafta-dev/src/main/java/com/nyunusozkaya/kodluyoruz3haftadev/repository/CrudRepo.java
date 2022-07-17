package com.nyunusozkaya.kodluyoruz3haftadev.repository;

import java.util.List;

public interface CrudRepo<T> {
    List<T> findAll();
    T findById(int id);
    void saveToDatabase(T object);
    void deleteFromDatabase(T object);
    void deleteFromDatabase(int id);
    void updateOnDatabase(T obj, int id);
}
