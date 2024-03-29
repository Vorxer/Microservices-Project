package com.dinuras.vessel.Model.Request;

import lombok.Data;

@Data
public class VesselUpdateRequest {
    public Integer availableRange;
    public Integer endurance;
    public Integer combatReadinessRating;
}
