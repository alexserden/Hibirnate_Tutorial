package model;

import javax.persistence.Column;
import javax.persistence.Id;

public class IdEntity {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    public IdEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
