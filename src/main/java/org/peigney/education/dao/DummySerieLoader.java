package org.peigney.education.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.peigney.education.model.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class DummySerieLoader {

    @Autowired
    private ResourceLoader resourceLoader;

    private List<Serie> series;

    @PostConstruct
    public void init() throws IOException {
        series = new ArrayList<>();

        ObjectMapper jsonMapper = new ObjectMapper();
        for (File jsonFile : getSerieFiles()) {
            Serie serie = jsonMapper.readValue(jsonFile, Serie.class);
            series.add(serie);
        }

    }

    private List<File> getSerieFiles() throws IOException {
        List<File> result = new ArrayList<>();
        Resource[] resources = ResourcePatternUtils.getResourcePatternResolver(resourceLoader).getResources("classpath:/dummy/*.json");
        for (Resource resource : resources) {
            result.add(resource.getFile());
        }
        return result;
    }

    public List<Serie> getSeries() {
        return series;
    }
}
