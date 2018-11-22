package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "developer")

public class Developer extends BaseEntity {
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "specialty")
    private String specialty;
    @ManyToMany
    @JoinTable (name = "developer_skill",
            joinColumns = {@JoinColumn (name = "developer_id")},
            inverseJoinColumns ={ @JoinColumn (name = "skill_id")})
    private Set<Skill> skills;
    @OneToOne
    @PrimaryKeyJoinColumn
    private Account account;

    public Developer(Long id, String firstName, String lastName, String specialty,
                     Set<Skill> skills, Account account) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.skills = skills;
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
