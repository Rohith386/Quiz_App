package com.quizApp.QUIZ.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String questionTitle;
    private String quest;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correctAnswer;
}

