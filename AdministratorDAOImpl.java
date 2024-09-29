package com.collegedirectory.dao.impl;

import com.collegedirectory.dao.AdministratorDAO;
import com.collegedirectory.model.Administrator;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class AdministratorDAOImpl implements AdministratorDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Administrator administrator) {
        entityManager.merge(administrator);
    }

    @Override
    public Administrator findById(int administratorId) {
        return entityManager.find(Administrator.class, administratorId);
    }
}
