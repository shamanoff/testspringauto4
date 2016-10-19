package com.example.dao;

import com.example.IEntityDao;
import com.example.entity.Manager;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class ManagerDao implements IEntityDao<Manager> {

    @Autowired
    private BeanFactory beanFactory;


    @PostConstruct
    public void init(){
        Manager manager = beanFactory.getBean(Manager.class, "Bob", 2,  "Manager");
        this.save(manager);
        manager = beanFactory.getBean(Manager.class, "Djon", 4,  "Manager");
        this.save(manager);
    }

    private Map<Integer, Manager> map = new HashMap<>();



    @Override
    public void save(Manager entity) {
        map.put(entity.getId(), entity);

    }

    @Override
    public Manager findOne(Integer id){
        return map.get(id);
    }

}
