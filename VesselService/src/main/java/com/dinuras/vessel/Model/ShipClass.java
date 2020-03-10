package com.dinuras.vessel.Model;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;
import java.util.List;

@Data
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

}
