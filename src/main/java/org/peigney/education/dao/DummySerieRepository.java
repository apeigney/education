package org.peigney.education.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.peigney.education.model.Level;
import org.peigney.education.model.Serie;
import org.peigney.education.model.Theme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DummySerieRepository implements SerieRepository {

    @Autowired
    private DummySerieLoader dummySerieLoader;

    @Override
    public Serie findById(int id) {
        return dummySerieLoader.getSeries()
                .stream()
                .filter(serie -> serie.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Serie> findAll() {
        return dummySerieLoader.getSeries();
    }

    @Override
    public List<Serie> findByTheme(Theme theme) {
        return dummySerieLoader.getSeries()
                .stream()
                .filter(serie -> serie.getTheme() == theme)
                .collect(Collectors.toList());
    }

    @Override
    public List<Serie> findByLevel(Level level) {
        return dummySerieLoader.getSeries()
                .stream()
                .filter(serie -> serie.getLevel() == level)
                .collect(Collectors.toList());
    }

    @Override
    public List<Serie> findByLevelAndTheme(Level level, Theme theme) {
        return dummySerieLoader.getSeries()
                .stream()
                .filter(serie -> serie.getLevel() == level && serie.getTheme() == theme)
                .collect(Collectors.toList());
    }
}
