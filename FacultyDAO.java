package com.collegedirectory.dao;

import com.collegedirectory.model.Faculty;
import com.collegedirectory.model.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class FacultyDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Faculty faculty) {
        entityManager.merge(faculty);
    }

    public List<Student> findByFacultyId(int facultyId) {
        String query = "SELECT s FROM Student s JOIN s.faculty f WHERE f.id = :facultyId";
        return entityManager.createQuery(query, Student.class)
                .setParameter("facultyId", facultyId)
                .getResultList();
    }
}
