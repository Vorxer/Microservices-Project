package com.dinuras.data_bridge.Model.Shared.Response;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class VesselResponse {
    public VesselResponse(Integer vesselID, String vesselName, String VRN, Integer availableRange, Integer enduarance, Integer combatReaddinesssRating, Integer classID, String className, BigDecimal cruiseSpeed, BigDecimal flankSpeed, Integer stsCombatRating, Integer aswCombatRating, Integer aaCombatRating, Integer pdsRating, Integer commanderID, String commanderName, String commanderRank) {
        this.vesselID = vesselID;
        this.vesselName = vesselName;
        this.VRN = VRN;
        this.availableRange = availableRange;
        this.enduarance = enduarance;
        this.combatReaddinesssRating = combatReaddinesssRating;
        this.classID = classID;
        this.className = className;
        this.cruiseSpeed = cruiseSpeed;
        this.flankSpeed = flankSpeed;
        this.stsCombatRating = stsCombatRating;
        this.aswCombatRating = aswCombatRating;
        this.aaCombatRating = aaCombatRating;
        this.pdsRating = pdsRating;
        this.commanderID = commanderID;
        this.commanderName = commanderName;
        this.commanderRank = commanderRank;
    }

    Integer vesselID;
    String vesselName;
    String VRN;
    Integer availableRange;
    Integer enduarance;
    Integer combatReaddinesssRating;

    Integer classID;
    String className;
    BigDecimal cruiseSpeed;
    BigDecimal flankSpeed;
    Integer stsCombatRating;
    Integer aswCombatRating;
    Integer aaCombatRating;
    Integer pdsRating;

    Integer commanderID;
    String commanderName;
    String commanderRank;


}
