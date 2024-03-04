package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface IGenerateService<T> {
    List<T> findAll();

    void save(T t);

    T findById(Long id);

    void remove(Long id);
}