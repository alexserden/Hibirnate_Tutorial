package controller;


import model.Skill;
import service.SkillService;

import java.io.IOException;
import java.util.List;
import java.util.Set;


public class SkillsController {
    SkillService skillService = new SkillService();

    public SkillsController() throws IOException {
    }

    public void save(Skill skill) throws IOException {
        skillService.save(skill);
    }

    public void update(Set<Skill> skill) throws IOException {

        skillService.update(skill);

    }
    public void delete(Long id) throws IOException {
        skillService.delete(id);
    }


    public Skill getById(Long id) throws IOException {
        return skillService.getById(id);
    }


    public List<Skill> getAll() throws IOException {
        return skillService.getAll();
    }


}
