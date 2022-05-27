package com.postman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postman.entity.Course;
import com.postman.entity.InstructorDetail;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>{

}
