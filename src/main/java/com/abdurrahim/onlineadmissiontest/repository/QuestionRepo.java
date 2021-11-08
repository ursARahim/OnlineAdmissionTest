package com.abdurrahim.onlineadmissiontest.repository;


import com.abdurrahim.onlineadmissiontest.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
