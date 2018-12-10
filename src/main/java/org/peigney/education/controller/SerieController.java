package org.peigney.education.controller;

import java.util.List;

import org.peigney.education.dao.SerieRepository;
import org.peigney.education.model.Level;
import org.peigney.education.model.Serie;
import org.peigney.education.model.Theme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerieController {

    @Autowired
    private SerieRepository serieRepository;

    @GetMapping("/series")
    public List<Serie> getAll() {
        return serieRepository.findAll();
    }

    @GetMapping("/series/{id}")
    public Serie getById(@PathVariable int id) {
        return serieRepository.findById(id);
    }

    @GetMapping("/series/by/theme/{theme}")
    public List<Serie> getByTheme(@PathVariable String theme) {
        return serieRepository.findByTheme(Theme.valueOf(theme));
    }

    @GetMapping("/series/by/level/{level}")
    public List<Serie> getByLevel(@PathVariable String level) {
        return serieRepository.findByLevel(Level.valueOf(level));
    }

    @GetMapping("/series/by/level/{level}/and/theme/{theme}")
    public List<Serie> getByLevelAndTheme(@PathVariable String level, @PathVariable String theme) {
        return serieRepository.findByLevelAndTheme(Level.valueOf(level), Theme.valueOf(theme));
    }

}
