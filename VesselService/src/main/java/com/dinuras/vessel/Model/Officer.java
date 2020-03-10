package com.dinuras.vessel.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Officer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int ID;

    @OneToOne(cascade = CascadeType.ALL)
    Vessel vessel;

    String name;
    String rank;

}
