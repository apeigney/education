package org.peigney.education.model;

import java.io.Serializable;

public class Answer extends Item implements Serializable {

    private boolean correct;

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
