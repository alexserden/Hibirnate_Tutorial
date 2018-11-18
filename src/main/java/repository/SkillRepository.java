package repository;

import model.Skill;

import java.io.IOException;
import java.util.List;
import java.util.Set;


public interface SkillRepository extends GenericRepository<Skill, Long> {
    void save(Skill skill) throws IOException;

    void update(Skill skill) throws IOException;

    void delete(Long id) throws IOException;

    Skill getById(Long id) throws IOException;

    List<Skill> getAll() throws IOException;
}
