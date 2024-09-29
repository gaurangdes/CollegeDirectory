package com.collegedirectory.dao;

import com.collegedirectory.model.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class StudentDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Student findById(int studentId) {
        return entityManager.find(Student.class, studentId);
    }

    public List<Student> searchByNameDepartmentYear(String name, String department, String year) {
        String query = "SELECT s FROM Student s WHERE s.name LIKE :name AND s.department LIKE :department AND s.year LIKE :year";
        return entityManager.createQuery(query, Student.class)
                .setParameter("name", "%" + name + "%")
                .setParameter("department", "%" + department + "%")
                .setParameter("year", "%" + year + "%")
                .getResultList();
    }

    public List<Faculty> findAdvisorsByStudentId(int studentId) {
        String query = "SELECT f FROM Faculty f JOIN f.students s WHERE s.id = :studentId";
        return entityManager.createQuery(query, Faculty.class)
                .setParameter("studentId", studentId)
                .getResultList();
    }
}
