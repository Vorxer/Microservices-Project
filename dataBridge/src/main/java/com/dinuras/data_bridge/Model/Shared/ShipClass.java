package com.dinuras.data_bridge.Model.Shared;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ShipClass {
    int ID;

    String name;

    List<Vessel> vessels;

    Integer complement;

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
