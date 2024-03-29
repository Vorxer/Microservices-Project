package com.dinuras.group_service.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class OperationalBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID;

    String name;

    @OneToMany(mappedBy = "base")
    List<Fleet> fleets;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Fleet> getFleets() {
        return fleets;
    }

    public void setFleets(List<Fleet> fleets) {
        this.fleets = fleets;
    }
}
