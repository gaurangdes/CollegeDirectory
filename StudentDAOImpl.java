package com.collegedirectory.dao.impl;

import com.collegedirectory.dao.StudentDAO;
import com.collegedirectory.model.Student;
import com.collegedirectory.model.Faculty;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Student findById(int studentId) {
        return entityManager.find(Student.class, studentId);
    }

    @Override
    public List<Student> searchByNameDepartmentYear(String name, String department, String year) {
        String query = "SELECT s FROM Student s WHERE s.name LIKE :name AND s.department LIKE :department AND s.year LIKE :year";
        return entityManager.createQuery(query, Student.class)
                .setParameter("name", "%" + name + "%")
                .setParameter("department", "%" + department + "%")
                .setParameter("year", "%" + year + "%")
                .getResultList();
    }

    @Override
    public List<Faculty> findAdvisorsByStudentId(int studentId) {
        String query = "SELECT f FROM Faculty f JOIN f.students s WHERE s.id = :studentId";
        return entityManager.createQuery(query, Faculty.class)
                .setParameter("studentId", studentId)
                .getResultList();
    }
}
