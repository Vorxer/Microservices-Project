package com.dinuras.data_bridge.Model.Shared.Response;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class VesselResponse {

    public VesselResponse() {
    }

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

    public Integer getAvailableRange() {
        return availableRange;
    }

    public void setAvailableRange(Integer availableRange) {
        this.availableRange = availableRange;
    }

    public Integer getEnduarance() {
        return enduarance;
    }

    public void setEnduarance(Integer enduarance) {
        this.enduarance = enduarance;
    }

    public Integer getCombatReaddinesssRating() {
        return combatReaddinesssRating;
    }

    public void setCombatReaddinesssRating(Integer combatReaddinesssRating) {
        this.combatReaddinesssRating = combatReaddinesssRating;
    }

    public Integer getClassID() {
        return classID;
    }

    public void setClassID(Integer classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public BigDecimal getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(BigDecimal cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public BigDecimal getFlankSpeed() {
        return flankSpeed;
    }

    public void setFlankSpeed(BigDecimal flankSpeed) {
        this.flankSpeed = flankSpeed;
    }

    public Integer getStsCombatRating() {
        return stsCombatRating;
    }

    public void setStsCombatRating(Integer stsCombatRating) {
        this.stsCombatRating = stsCombatRating;
    }

    public Integer getAswCombatRating() {
        return aswCombatRating;
    }

    public void setAswCombatRating(Integer aswCombatRating) {
        this.aswCombatRating = aswCombatRating;
    }

    public Integer getAaCombatRating() {
        return aaCombatRating;
    }

    public void setAaCombatRating(Integer aaCombatRating) {
        this.aaCombatRating = aaCombatRating;
    }

    public Integer getPdsRating() {
        return pdsRating;
    }

    public void setPdsRating(Integer pdsRating) {
        this.pdsRating = pdsRating;
    }

    public Integer getCommanderID() {
        return commanderID;
    }

    public void setCommanderID(Integer commanderID) {
        this.commanderID = commanderID;
    }

    public String getCommanderName() {
        return commanderName;
    }

    public void setCommanderName(String commanderName) {
        this.commanderName = commanderName;
    }

    public String getCommanderRank() {
        return commanderRank;
    }

    public void setCommanderRank(String commanderRank) {
        this.commanderRank = commanderRank;
    }
}
