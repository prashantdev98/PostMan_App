package com.postman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postman.entity.InstructorDetail;

@Repository
public interface InstructorDetailRepository extends JpaRepository<InstructorDetail,Integer>{

}
