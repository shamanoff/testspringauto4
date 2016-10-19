package com.example.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")


public class Manager extends WorkerAbstract{

    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Manager(String name, Integer id, String position) {
        super(name, id);
        this.position = position;

    }
}
