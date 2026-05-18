package com.quizApp.QUIZ.controller;

import com.quizApp.QUIZ.entity.Question;
import com.quizApp.QUIZ.service.QuestionService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.lang.*;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService qS;

    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions() {
        return qS.getAllQuestion();
    }

    @GetMapping("{language}")
    public List<Question> getQuestions(@PathVariable String language){
        return qS.getQuestions(language);
    }

    @PostMapping("/add")
    public ResponseEntity<Question> addQuestion(@RequestBody Question q){
        try{
            return new ResponseEntity<>(qS.addQuestion(q), HttpStatus.CREATED);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
    }

}