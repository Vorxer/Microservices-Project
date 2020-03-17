package com.dinuras.vessel.Controller;

import com.dinuras.vessel.Model.Vessel;
import com.dinuras.vessel.Model.VesselResponse;
import com.dinuras.vessel.Service.VesselServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vessel")
public class VesselController {

    @Autowired
    VesselServiceImpl vesselService;

    @RequestMapping("/vessel/{id}")
    public Vessel getVessel(@PathVariable int id){
        return vesselService.getVesselByID(id);
    }

    @RequestMapping("/vessels")
    public List<Vessel> getAllVessels(){
        return vesselService.getVessels();
    }

    @RequestMapping("/specificVessels")
    public List<Vessel> getSpecificVessels(@RequestBody List<Integer> IDS){
        return vesselService.getSpecificVessels(IDS);
    }

    @RequestMapping("/add")
    public Vessel getAllVessels(@RequestBody Vessel vessel){
        return vesselService.add(vessel);
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id){

        vesselService.delete(id);

        return "vessel id " + id + " deleted";
    }

    @RequestMapping("/VesselInfo/{id}")
    public VesselResponse infoResponse(@PathVariable int id){
        return vesselService.infoResponse(id);
    }
}
