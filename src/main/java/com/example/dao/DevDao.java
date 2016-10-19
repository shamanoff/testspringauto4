package com.example.dao;

import com.example.IEntityDao;
import com.example.entity.Developer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class DevDao implements IEntityDao<Developer> {

    @Autowired
    private BeanFactory beanFactory;


    @PostConstruct
    public void init(){
        Developer developer = beanFactory.getBean(Developer.class, "John", 10, "Programmer");
        this.save(developer);
        developer = beanFactory.getBean(Developer.class, "Tor", 11, "Programmer");
        this.save(developer);
    }

    private Map<Integer, Developer> map = new HashMap<>();



    @Override
    public void save(Developer entity) {
        map.put(entity.getId(), entity);

    }

    @Override
    public Developer findOne(Integer id){
        return map.get(id);
    }




}
