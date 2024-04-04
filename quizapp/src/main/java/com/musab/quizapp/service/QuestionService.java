package com.musab.quizapp.service;

import com.musab.quizapp.dao.QuestionDao;
import com.musab.quizapp.model.quiz_questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<quiz_questions> getAllQuestions() {

        return questionDao.findAll();
    }


    public List<quiz_questions> getByCategory(String category) {
        return questionDao.getByCategory(category);

    }

//    public String AddQuestion(quiz_questions quizQuestions) {
//        questionDao.save(quizQuestions);
//        return "success";
//    }
    public String AddQuestion(quiz_questions quizQuestions) {
        System.out.println("Received question: " + quizQuestions.toString()); // Add this line
        questionDao.save(quizQuestions);
        System.out.println("Question saved successfully."); // Add this line
        return "success";
    }



}
