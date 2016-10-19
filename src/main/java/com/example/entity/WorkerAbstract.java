package com.example.entity;

import com.example.IWorker;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter

public abstract class WorkerAbstract implements IWorker {

    private String name;
    private Integer id;


    public WorkerAbstract(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public Integer getId() {
        return null;
    }


}
