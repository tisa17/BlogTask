package com.tunde.springSNVA.StudenCRUD.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tunde.springSNVA.StudenCRUD.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
