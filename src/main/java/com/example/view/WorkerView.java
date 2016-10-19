package com.example.view;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class WorkerView {

    private String name;
    private String position;
    private Integer id;

    @Override
    public String toString() {
        return "WorkerView{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", id=" + id +
                '}';
    }
}
