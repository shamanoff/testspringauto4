package com.example;

public interface IEntityDao<T extends IWorker> {

    void save(T entity);

    T findOne(Integer id);
}
