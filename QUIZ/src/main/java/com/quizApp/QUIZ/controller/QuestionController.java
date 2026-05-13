package com.quizApp.QUIZ.controller;

import com.quizApp.QUIZ.entity.Question;
import com.quizApp.QUIZ.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService qS;

    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions() {
        return qS.getAllQuestion();
    }

    @PostMapping("/add")
    public Question addQuestion(@RequestBody Question q){
        return qS.addQuestion(q);
    }
}