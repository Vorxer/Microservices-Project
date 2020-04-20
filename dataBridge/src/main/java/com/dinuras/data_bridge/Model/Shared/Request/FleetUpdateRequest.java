package com.dinuras.data_bridge.Model.Shared.Request;

import lombok.Data;

@Data
public class FleetUpdateRequest {

    public FleetUpdateRequest() {
    }

    public Integer operationalRange;
    public Integer endurance;
    public String GPSLocation;
}
