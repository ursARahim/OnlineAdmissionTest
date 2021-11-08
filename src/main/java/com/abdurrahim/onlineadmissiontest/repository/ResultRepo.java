package com.abdurrahim.onlineadmissiontest.repository;


import com.abdurrahim.onlineadmissiontest.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {

}
