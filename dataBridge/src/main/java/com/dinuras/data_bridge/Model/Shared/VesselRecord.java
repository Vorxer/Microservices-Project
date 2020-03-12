package com.dinuras.data_bridge.Model.Shared;

import lombok.Data;

public class VesselRecord {
    Integer ID;

    Integer vesselID;
    Integer vesselName;

    Fleet fleet;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getVesselID() {
        return vesselID;
    }

    public void setVesselID(Integer vesselID) {
        this.vesselID = vesselID;
    }

    public Integer getVesselName() {
        return vesselName;
    }

    public void setVesselName(Integer vesselName) {
        this.vesselName = vesselName;
    }

    public Fleet getFleet() {
        return fleet;
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }
}
