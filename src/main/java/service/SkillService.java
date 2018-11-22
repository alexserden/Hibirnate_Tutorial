package service;

import model.Skill;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class SkillService {
    //SkillRepository skillService = new SkillService();

    public SkillService() throws IOException {
    }

    public void save(Skill skill) throws IOException {
       // skillService.save(skill);
    }

    public void update(Set<Skill> skill) throws IOException {

       // skillService.update(skill);

    }
    public void delete(Long id) throws IOException {
       // skillService.delete(id);
    }


    public Skill getById(Long id) throws IOException {
        return null ;//skillService.getById(id);
    }


    public List<Skill> getAll() throws IOException {
        return null; //skillService.getAll();
    }
}
