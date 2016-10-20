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

    private void sout(IWorker iWorker){
        System.out.println(iWorker.getPosition());
        System.out.println(iWorker.getId());
        System.out.println(iWorker.getName());

    }
    @Override
    public void print(Integer id) {

        Manager manager= (Manager) managerDao.findOne(id);
        if (manager != null ) {
            sout(manager);
        }
        Developer developer = (Developer) devDao.findOne(id);

        if (developer != null ) {
            sout(developer);

        }
        if( developer == null && manager == null) {
          System.out.println("id's isn't find ");

        }
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
