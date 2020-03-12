package com.dinuras.data_bridge.Controller;


import com.dinuras.data_bridge.Model.Shared.Fleet;
import com.dinuras.data_bridge.Model.Shared.Vessel;
import com.dinuras.data_bridge.Service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bridge")
public class Controller {

    @Autowired
    DataService dataService;

    @RequestMapping("/ping")
    public String ping() {
        return "bridge service 200";
    }

    @RequestMapping("/getVessel/{id}")
    public Vessel getVessel(@PathVariable int id) {
        return dataService.getVessel(id);
    }

    @RequestMapping("/getFleet/{id)")
    public Fleet getFleet(@PathVariable int id) {
        return dataService.getFleet(id);
    }

    @RequestMapping("/getVessels")
    public List<Vessel> getVessels() {
        return dataService.getVessels();
    }

    @RequestMapping("/getSpecificVessels")
    public List<Vessel> getSpecificVessels(@RequestBody List<Integer> IDs) {
        return dataService.getSpecificVessels(IDs);
    }

    @RequestMapping("/getFleets")
    public List<Fleet> getFleets() {
        return dataService.getFleets();
    }

    @RequestMapping("/getFleetVessels/{id}")
    public List<Vessel> getFleetVessels(@PathVariable int fleetID) {
        return dataService.getFleetVessels(fleetID);
    }

}
