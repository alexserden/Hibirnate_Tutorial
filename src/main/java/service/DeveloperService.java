package service;

import model.Developer;
import repository.DeveloperRepository;
import repository.impl.JavaIODeveloperRepositoryImpl;

import java.io.IOException;
import java.util.List;

public class DeveloperService {
    static DeveloperRepository developerRepository;

    public DeveloperService() throws IOException {
        developerRepository = new JavaIODeveloperRepositoryImpl();
    }

    public void save(Developer developer) throws IOException {
        developerRepository.save(developer);
    }

    public void update(Developer developer) throws IOException {

        developerRepository.update(developer);

    }

    public void delete(Long id) throws IOException {
        developerRepository.delete(id);
    }


    public Developer getById(Long id) throws IOException {
        return developerRepository.getById(id);
    }


    public List<Developer> getAll() throws IOException {
        return developerRepository.getAll();
    }
}
