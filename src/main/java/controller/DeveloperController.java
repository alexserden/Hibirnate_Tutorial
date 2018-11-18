package controller;

import model.Developer;
import service.DeveloperService;

import java.io.IOException;
import java.util.List;

public class DeveloperController {
    static DeveloperService developerService;

    public DeveloperController() throws IOException {
        developerService = new DeveloperService();
    }

    public void save(Developer developer) throws IOException {
        developerService.save(developer);
    }

    public void update(Developer developer) throws IOException {

        developerService.update(developer);

    }

    public void delete(Long id) throws IOException {
        developerService.delete(id);
    }


    public Developer getById(Long id) throws IOException {
        return developerService.getById(id);
    }


    public List<Developer> getAll() throws IOException {
        return developerService.getAll();
    }

}
