package com.example.service;


import com.example.IEntityDao;
import com.example.IWorker;
import com.example.entity.Developer;
import com.example.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WorkerSalary implements IWServ {

    @Autowired
    private IEntityDao devDao;
    @Autowired
    private IEntityDao managerDao;

    @Autowired
    public WorkerSalary(IEntityDao devDao, IEntityDao managerDao) {
        this.devDao = devDao;
        this.managerDao = managerDao;
    }

    @Override
    public void print(Integer id) {

       IWorker iWorker = (Manager) managerDao.findOne(id);
//        iWorker = (Manager) managerDao.findOne(id);


        System.out.println(iWorker.getPosition());
        System.out.println(iWorker.getId());
        System.out.println(iWorker.getName());


    }


    @Override
    public void save(List<IWorker> listWorkers) {

        for (IWorker iWorker : listWorkers) {

            if (iWorker instanceof Developer) {
                devDao.save(iWorker);
            }
            if (iWorker instanceof Manager) {
                managerDao.save(iWorker);
            }
        }
    }
}
