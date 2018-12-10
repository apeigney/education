package org.peigney.education.model;

public enum Theme {

    GEOM("Géométrie"),
    NUM("Numérique"),
    GRAMM("Grammaire"),
    ORTH("Orthographe"),
    CONJ("Conjugaison"),
    GEO("Géographie"),
    HIST("Histoire"),
    EN("English");

    private String label;

    Theme(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static Theme fromString(String label) {
        for (Theme theme : Theme.values()) {
            if (theme.getLabel().equalsIgnoreCase(label)) {
                return theme;
            }
        }
        return null;
    }
}
