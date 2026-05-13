package com.quizApp.QUIZ.service;

import com.quizApp.QUIZ.entity.Question;
import com.quizApp.QUIZ.repo.QuestionRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
public class QuestionService {

    @Autowired
    QuestionRepo questionrepo;
    public List<Question> getAllQuestion(){
        log.info("Fetching questions");
        return questionrepo.findAll();
    }


}

