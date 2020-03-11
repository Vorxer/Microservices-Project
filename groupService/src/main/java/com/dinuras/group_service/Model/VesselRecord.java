package com.dinuras.group_service.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class VesselRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID;

    Integer vesselID;
    Integer vesselName;

    @ManyToOne(cascade = CascadeType.ALL)
    Fleet fleet;
}
