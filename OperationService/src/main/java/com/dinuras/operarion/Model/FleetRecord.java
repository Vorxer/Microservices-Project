package com.dinuras.operarion.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class FleetRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer fleetID;

    String fleetName;
    Integer FlagshipID;
    Integer flagCommanderID;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    Operation operation;

    public Integer getFleetID() {
        return fleetID;
    }

    public void setFleetID(Integer fleetID) {
        this.fleetID = fleetID;
    }

    public String getFleetName() {
        return fleetName;
    }

    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

    public Integer getFlagshipID() {
        return FlagshipID;
    }

    public void setFlagshipID(Integer flagshipID) {
        FlagshipID = flagshipID;
    }

    public Integer getFlagCommanderID() {
        return flagCommanderID;
    }

    public void setFlagCommanderID(Integer flagCommanderID) {
        this.flagCommanderID = flagCommanderID;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
