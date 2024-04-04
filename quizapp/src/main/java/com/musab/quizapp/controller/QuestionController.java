package com.musab.quizapp.controller;

import com.musab.quizapp.model.quiz_questions;
import com.musab.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

@RequestMapping("questions")

public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allquestions")
    public List<quiz_questions> getAllQue(){

        return questionService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public List<quiz_questions> getByCategory(@PathVariable String category){

        return questionService.getByCategory(category);
    }
    @PostMapping("add")
    public String AddQuestion(@RequestBody  quiz_questions quiz_questions){

        return questionService.AddQuestion(quiz_questions);
    }

}





