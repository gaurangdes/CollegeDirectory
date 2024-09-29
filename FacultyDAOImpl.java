package com.collegedirectory.dao.impl;

import com.collegedirectory.dao.FacultyDAO;
import com.collegedirectory.model.Faculty;
import com.collegedirectory.model.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class FacultyDAOImpl implements FacultyDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Faculty faculty) {
        entityManager.merge(faculty);
    }

    @Override
    public List<Student> findByFacultyId(int facultyId) {
        String query = "SELECT s FROM Student s JOIN s.faculty f WHERE f.id = :facultyId";
        return entityManager.createQuery(query, Student.class)
                .setParameter("facultyId", facultyId)
                .getResultList();
    }
}
