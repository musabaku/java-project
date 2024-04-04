package com.musab.quizapp.dao;

import com.musab.quizapp.model.quiz_questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository

public interface QuestionDao extends JpaRepository<quiz_questions,Integer> {

    List<quiz_questions> getByCategory(String category);
}
