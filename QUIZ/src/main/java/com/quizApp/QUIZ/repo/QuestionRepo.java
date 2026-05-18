package com.quizApp.QUIZ.repo;

import com.quizApp.QUIZ.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
    List<Question> findByLanguage(String language);
}

