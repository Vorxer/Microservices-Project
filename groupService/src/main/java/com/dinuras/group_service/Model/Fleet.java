package com.dinuras.group_service.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Fleet{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID;

    String name;

    Integer flagshipID;
    Integer flagCommanderID;

    Integer operationalRange;
    Integer enduarance;

    String GPSLocation;

    @ManyToOne(cascade = CascadeType.ALL)
    OperationalBase base;

    @OneToMany(mappedBy = "fleet")
    List<VesselRecord> vesselRecords;

}
