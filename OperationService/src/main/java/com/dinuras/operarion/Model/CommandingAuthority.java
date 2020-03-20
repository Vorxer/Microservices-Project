package com.dinuras.operarion.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class CommandingAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer ID;
    public String name;

    @OneToMany(mappedBy = "commandingAuthority")
    List<Operation> operations;

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

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
}
