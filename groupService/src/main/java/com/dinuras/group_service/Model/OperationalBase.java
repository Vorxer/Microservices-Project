package com.dinuras.group_service.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

public class OperationalBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID;

    String name;

    @OneToMany(mappedBy = "operationalBase")
    List<Group> groups;
}
