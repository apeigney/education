package org.peigney.education.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Serie extends Item implements Serializable {

    private List<Question> questions;
    private Theme theme;
    private Level level;


    public List<Question> getQuestions() {
        if (questions == null) {
            questions = new ArrayList<>();
        }
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
