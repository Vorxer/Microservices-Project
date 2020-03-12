package com.dinuras.data_bridge.Model.Shared;

import lombok.Data;

import java.util.List;

@Data
public class OperationalBase {

    Integer ID;
    String name;
    List<Fleet> fleets;
}
