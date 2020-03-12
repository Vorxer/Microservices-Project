package com.dinuras.data_bridge.Model.Shared;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


@Data
public class Vessel {

    Integer ID;

    Officer commandingOfficer;

    //@JsonIgnore
    ShipClass shipClass;

    Integer availableRange;
    Integer enduarance;
    Integer combatReaddinesssRating;

    //Duration duration;




}
