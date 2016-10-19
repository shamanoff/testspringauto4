package com.example.entity;

import com.example.IWorker;
import org.springframework.stereotype.Component;

@Component


public abstract class WorkerAbstract implements IWorker {

    private String name;
    private Integer id;


    public WorkerAbstract(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "WorkerAbstract{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
