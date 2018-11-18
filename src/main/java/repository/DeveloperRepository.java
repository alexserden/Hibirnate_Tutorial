package repository;


import model.Developer;

import java.io.IOException;
import java.util.List;

public interface DeveloperRepository extends GenericRepository<Developer, Long> {
    void save(Developer developer) throws IOException;

    void delete(Long id) throws IOException;

    void update(Developer developer) throws IOException;

    Developer getById(Long id) throws IOException;

    List<Developer> getAll() throws IOException;

}
