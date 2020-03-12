package com.dinuras.data_bridge.Model.Shared;

import lombok.Data;

@Data
public class Officer {

    int ID;
    Vessel vessel;
    String name;
    String rank;

}
