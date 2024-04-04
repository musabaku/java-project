package com.musab.quizapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class quiz_questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String category;
    private String difficulty_type;
    private String option_1;
    private String option_2;
    private String option_3;
    private String option_4;
    private String question_title;
    private String right_answer;
}
