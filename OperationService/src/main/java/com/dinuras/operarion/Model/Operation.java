package com.dinuras.operarion.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer ID;
    public String name;


    @ManyToOne(cascade = CascadeType.ALL)
    CommandingAuthority commandingAuthority;

    @OneToMany(mappedBy = "operation")
    List<FleetRecord> fleetRecords;

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

    public CommandingAuthority getCommandingAuthority() {
        return commandingAuthority;
    }

    public void setCommandingAuthority(CommandingAuthority commandingAuthority) {
        this.commandingAuthority = commandingAuthority;
    }

    public List<FleetRecord> getFleetRecords() {
        return fleetRecords;
    }

    public void setFleetRecords(List<FleetRecord> fleetRecords) {
        this.fleetRecords = fleetRecords;
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
