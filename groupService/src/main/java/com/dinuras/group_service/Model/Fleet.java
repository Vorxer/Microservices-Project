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

    public Integer getFlagshipID() {
        return flagshipID;
    }

    public void setFlagshipID(Integer flagshipID) {
        this.flagshipID = flagshipID;
    }

    public Integer getFlagCommanderID() {
        return flagCommanderID;
    }

    public void setFlagCommanderID(Integer flagCommanderID) {
        this.flagCommanderID = flagCommanderID;
    }

    public Integer getOperationalRange() {
        return operationalRange;
    }

    public void setOperationalRange(Integer operationalRange) {
        this.operationalRange = operationalRange;
    }

    public Integer getEnduarance() {
        return enduarance;
    }

    public void setEnduarance(Integer enduarance) {
        this.enduarance = enduarance;
    }

    public String getGPSLocation() {
        return GPSLocation;
    }

    public void setGPSLocation(String GPSLocation) {
        this.GPSLocation = GPSLocation;
    }

    public OperationalBase getBase() {
        return base;
    }

    public void setBase(OperationalBase base) {
        this.base = base;
    }

    public List<VesselRecord> getVesselRecords() {
        return vesselRecords;
    }

    public void setVesselRecords(List<VesselRecord> vesselRecords) {
        this.vesselRecords = vesselRecords;
    }
}
