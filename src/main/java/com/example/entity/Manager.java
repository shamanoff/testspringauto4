package com.example.entity;

import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Getter

public class Manager extends WorkerAbstract{

    private String position;

    public Manager(String name, Integer id, String position) {
        super(name, id);
        this.position = position;
    }
}
