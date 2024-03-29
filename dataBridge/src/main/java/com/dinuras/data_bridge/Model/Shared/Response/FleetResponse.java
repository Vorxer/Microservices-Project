package com.dinuras.data_bridge.Model.Shared.Response;

import lombok.Data;

import java.util.List;

@Data
public class FleetResponse {

    public FleetResponse() {
    }

    public FleetResponse(Integer fleetID, String fleetName, Integer flagshipID, Integer flagCommanderID, Integer operationalRange, Integer endurance, String GPSLocation, List<VesselRecord> vesselRecords, Integer baseID, String baseName) {
        this.fleetID = fleetID;
        this.fleetName = fleetName;
        FlagshipID = flagshipID;
        this.flagCommanderID = flagCommanderID;
        this.operationalRange = operationalRange;
        this.endurance = endurance;
        this.GPSLocation = GPSLocation;
        this.vesselRecords = vesselRecords;
        this.baseID = baseID;
        this.baseName = baseName;
    }

    Integer fleetID;
    String fleetName;
    Integer FlagshipID;
    Integer flagCommanderID;
    Integer operationalRange;
    Integer endurance;
    String GPSLocation;
    List<VesselRecord> vesselRecords;

    Integer baseID;
    String  baseName;

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

    public Integer getOperationalRange() {
        return operationalRange;
    }

    public void setOperationalRange(Integer operationalRange) {
        this.operationalRange = operationalRange;
    }

    public Integer getEndurance() {
        return endurance;
    }

    public void setEndurance(Integer endurance) {
        this.endurance = endurance;
    }

    public String getGPSLocation() {
        return GPSLocation;
    }

    public void setGPSLocation(String GPSLocation) {
        this.GPSLocation = GPSLocation;
    }

    public List<VesselRecord> getVesselRecords() {
        return vesselRecords;
    }

    public void setVesselRecords(List<VesselRecord> vesselRecords) {
        this.vesselRecords = vesselRecords;
    }

    public Integer getBaseID() {
        return baseID;
    }

    public void setBaseID(Integer baseID) {
        this.baseID = baseID;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }
}
