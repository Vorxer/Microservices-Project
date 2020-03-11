package com.dinuras.group_service.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ID;

    String name;

    boolean deployable;

    Integer flagshipID;
    Integer flagCommanderID;

    Integer operationalRange;
    Integer enduarance;

    String GPSLocation;

    @ManyToOne(cascade = CascadeType.ALL)
    OperationalBase operationalBase;

    @OneToMany(mappedBy = "group")
    List<VesselRecord> vesselRecords;

}
