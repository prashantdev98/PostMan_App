package com.postman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postman.entity.Instructor;
import com.postman.entity.InstructorDetail;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor,Integer>{

}
