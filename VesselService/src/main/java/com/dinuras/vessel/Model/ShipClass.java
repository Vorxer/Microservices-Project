package com.dinuras.vessel.Model;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class ShipClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int ID;

    String name;

    @OneToMany(mappedBy = "shipClass")
    List<Vessel> vessels;

    Integer complement;

    //@DecimalMin(value = "0.0", inclusive = false)
    //@Digits(integer=3, fraction=2)
    BigDecimal standardLength;
    BigDecimal beam;
    BigDecimal draft;

    BigDecimal displacement;

    BigDecimal cruiseSpeed;
    //BigDecimal flankSpeed;

    Integer OperationalRange;

    Integer stsCombatRating;
    Integer aswCombatRating;
    Integer aaCombatRating;
    Integer pdsRating;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vessel> getVessels() {
        return vessels;
    }

    public void setVessels(List<Vessel> vessels) {
        this.vessels = vessels;
    }

    public Integer getComplement() {
        return complement;
    }

    public void setComplement(Integer complement) {
        this.complement = complement;
    }

    public BigDecimal getStandardLength() {
        return standardLength;
    }

    public void setStandardLength(BigDecimal standardLength) {
        this.standardLength = standardLength;
    }

    public BigDecimal getBeam() {
        return beam;
    }

    public void setBeam(BigDecimal beam) {
        this.beam = beam;
    }

    public BigDecimal getDraft() {
        return draft;
    }

    public void setDraft(BigDecimal draft) {
        this.draft = draft;
    }

    public BigDecimal getDisplacement() {
        return displacement;
    }

    public void setDisplacement(BigDecimal displacement) {
        this.displacement = displacement;
    }

    public BigDecimal getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(BigDecimal cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public Integer getOperationalRange() {
        return OperationalRange;
    }

    public void setOperationalRange(Integer operationalRange) {
        OperationalRange = operationalRange;
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
}
