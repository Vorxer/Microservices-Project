package com.dinuras.group_service.Model.Request;

import lombok.Data;

@Data
public class FleetUpdateRequest {
    public Integer operationalRange;
    public Integer enduarance;
    public String GPSLocation;
}
