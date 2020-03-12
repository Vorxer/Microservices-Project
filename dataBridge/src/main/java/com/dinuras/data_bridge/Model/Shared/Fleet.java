package com.dinuras.data_bridge.Model.Shared;

import lombok.Data;

import java.util.List;

@Data
public class Fleet{

    Integer ID;

    String name;

    Integer flagshipID;
    Integer flagCommanderID;

    Integer operationalRange;
    Integer enduarance;

    String GPSLocation;

    OperationalBase base;

    public List<VesselRecord> vesselRecords;

}
