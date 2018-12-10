package org.peigney.education.dao;

import java.util.List;

import org.peigney.education.model.Level;
import org.peigney.education.model.Serie;
import org.peigney.education.model.Theme;

public interface SerieRepository {

    Serie findById(int id);
    List<Serie> findAll();
    List<Serie> findByTheme(Theme theme);
    List<Serie> findByLevel(Level level);
    List<Serie> findByLevelAndTheme(Level level, Theme theme);
    
}
