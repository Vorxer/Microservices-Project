package com.dinuras.vessel.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.boot.convert.DurationFormat;

import javax.persistence.*;
import java.time.*;

@Entity
public class Vessel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer ID;

    public String name;
    public String VRN;

    @OneToOne(cascade = CascadeType.ALL)
    Officer commandingOfficer;

    @JoinColumn
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    ShipClass shipClass;

    Integer availableRange;
    Integer enduarance;
    Integer combatReaddinesssRating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVRN() {
        return VRN;
    }

    public void setVRN(String VRN) {
        this.VRN = VRN;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Officer getCommandingOfficer() {
        return commandingOfficer;
    }

    public void setCommandingOfficer(Officer commandingOfficer) {
        this.commandingOfficer = commandingOfficer;
    }

    public ShipClass getShipClass() {
        return shipClass;
    }

    public void setShipClass(ShipClass shipClass) {
        this.shipClass = shipClass;
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
//Duration duration;




}
