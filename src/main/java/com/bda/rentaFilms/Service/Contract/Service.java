package com.bda.rentaFilms.Service.Contract;

import java.util.List;

public interface Service<T,E>{
    List<T> getAll();

    T getById(E id);

    void delete(E id);

    T save(T object);

}
