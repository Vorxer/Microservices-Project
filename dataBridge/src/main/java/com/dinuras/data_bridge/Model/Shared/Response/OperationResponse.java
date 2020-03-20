package com.dinuras.data_bridge.Model.Shared.Response;

import lombok.Data;

import java.util.List;

@Data
public class OperationResponse {

    public OperationResponse() {
    }

    public OperationResponse(Integer ID, String name, List<FleetRecord> fleetRecords,
                             String commandingAuthorityName, String duration, String status, String location, String log) {
        this.ID = ID;
        this.name = name;
        this.fleetRecords = fleetRecords;
        this.commandingAuthorityName = commandingAuthorityName;
        this.duration = duration;
        this.status = status;
        this.location = location;
        this.log = log;
    }

    public Integer ID;
    public String name;
    List<FleetRecord> fleetRecords;
    public String commandingAuthorityName;

    String duration;
    String status;
    String location;
    String log;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<FleetRecord> getFleetRecords() {
        return fleetRecords;
    }

    public void setFleetRecords(List<FleetRecord> fleetRecords) {
        this.fleetRecords = fleetRecords;
    }

    public String getCommandingAuthorityName() {
        return commandingAuthorityName;
    }

    public void setCommandingAuthorityName(String commandingAuthorityName) {
        this.commandingAuthorityName = commandingAuthorityName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}