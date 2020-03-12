package com.dinuras.group_service.Controller;

import com.dinuras.group_service.Model.Fleet;
import com.dinuras.group_service.Service.FleetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fleet")
public class FleetController {

    @Autowired
    FleetServiceImpl fleetService;

    @RequestMapping("/ping")
    public String ping(){
        return "fleet service 200";
    }

    @RequestMapping("/fleet/{id}")
    public Fleet getFleet(@PathVariable int id){
        return fleetService.getFleetByID(id);
    }

    @RequestMapping("/fleets")
    public List<Fleet> getAllFleets(){
        return fleetService.getFleets();
    }

    @RequestMapping("/add")
    public Fleet getAllFleets(@RequestBody Fleet group){
        return fleetService.add(group);
    }
}
