package com.dinuras.data_bridge.Model.Shared.Request;

import lombok.Data;

@Data
public class VesselUpdateRequest {
    public Integer availableRange;
    public Integer endurance;
    public Integer combatReadinessRating;
}
