package org.peigney.education.dao;

import java.util.List;

import org.peigney.education.model.Question;

public interface QuestionRepository {

    Question findById(int id);
    List<Question> findBySerie(int serieId);
    
}
