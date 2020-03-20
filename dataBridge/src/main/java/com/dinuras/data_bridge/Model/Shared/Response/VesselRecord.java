package com.dinuras.data_bridge.Model.Shared.Response;

import lombok.Data;

@Data
public class VesselRecord {

    public VesselRecord() {
    }

    Integer ID;

    Integer vesselID;
    String vesselName;

    String VRN;

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

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public String getVRN() {
        return VRN;
    }

    public void setVRN(String VRN) {
        this.VRN = VRN;
    }
}
