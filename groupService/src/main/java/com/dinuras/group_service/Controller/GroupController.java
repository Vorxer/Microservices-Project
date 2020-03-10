package com.dinuras.group_service.Controller;

import com.dinuras.vessel.Model.Vessel;
import com.dinuras.vessel.Service.VesselServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vessel")
public class GroupController {

    @Autowired
    VesselServiceImpl vesselService;

    @RequestMapping("/ping")
    public String ping(){
        return "vessel service 200";
    }

    @RequestMapping("/getVessel/{id}")
    public Vessel getVessel(@PathVariable int id){
        return vesselService.getVesselByID(id);
    }

    @RequestMapping("/vessels")
    public List<Vessel> getAllVessels(){
        return vesselService.getVessels();
    }

    @RequestMapping("/add")
    public Vessel getAllVessels(@RequestBody Vessel vessel){
        return vesselService.add(vessel);
    }
}
