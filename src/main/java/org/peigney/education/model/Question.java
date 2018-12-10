package org.peigney.education.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Question extends Item implements Serializable {

    private List<Answer> answers;

    public List<Answer> getAnswers() {
        if (answers == null) {
            answers = new ArrayList<>();
        }
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
