package org.peigney.education.dao;

import java.util.Collections;
import java.util.List;

import org.peigney.education.model.Question;
import org.peigney.education.model.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DummyQuestionRepository implements QuestionRepository {

    @Autowired
    private DummySerieLoader dummySerieLoader;

    @Override
    public Question findById(int id) {
        return dummySerieLoader.getSeries()
                .stream()
                .flatMap(serie -> serie.getQuestions().stream())
                .filter(question -> question.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Question> findBySerie(int serieId) {
        return dummySerieLoader.getSeries()
                .stream()
                .filter(serie -> serie.getId() == serieId)
                .findFirst()
                .map(Serie::getQuestions)
                .orElse(Collections.emptyList());
    }
}
