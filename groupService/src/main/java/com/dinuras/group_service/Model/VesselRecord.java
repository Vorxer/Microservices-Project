package com.dinuras.group_service.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class VesselRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID;

    Integer vesselID;
    String vesselName;

    String VRN;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    Fleet fleet;
}
