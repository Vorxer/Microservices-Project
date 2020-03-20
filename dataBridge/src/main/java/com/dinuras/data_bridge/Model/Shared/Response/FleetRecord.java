package com.dinuras.data_bridge.Model.Shared.Response;

import lombok.Data;

@Data
public class FleetRecord {

    Integer fleetID;

    String fleetName;
    Integer FlagshipID;
    Integer flagCommanderID;

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

}
