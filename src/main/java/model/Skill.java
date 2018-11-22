package model;

import javax.persistence.Column;

public class Skill extends BaseEntity {
    @Column(name = "skill")
    private String name;

    public Skill(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
