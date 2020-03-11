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
}
