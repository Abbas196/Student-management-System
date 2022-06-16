package com.example.StudentmanagementSystem.repository;

import com.example.StudentmanagementSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// here second parameter is the type of the primary key. And first parameter is the type of the entity key.
// jpaRepository is already annotated with @Repository so we donot need to add it above the interface.
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
