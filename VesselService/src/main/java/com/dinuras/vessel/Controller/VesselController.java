package com.dinuras.vessel.Controller;

import com.dinuras.vessel.Model.Request.VesselUpdateRequest;
import com.dinuras.vessel.Model.Response.VesselResponse;
import com.dinuras.vessel.Model.Vessel;
import com.dinuras.vessel.Service.VesselService;
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
    VesselService vesselService;

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
        return vesselService.getVesselsByID(IDS);
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
    public VesselResponse vesselResponse(@PathVariable int id){
        return vesselService.getVesselResponseByID(id);
    }

    @RequestMapping("/allVesselInfo")
    public List<VesselResponse> allVesselResponse(){
        return vesselService.getAllVesselResponses();
    }

    @RequestMapping("/specificVesselsInfo")
    public List<VesselResponse> getSpecificVesselsInfo(@RequestBody List<Integer> IDS){
        return vesselService.getVesselResponsesByID(IDS);
    }

    @RequestMapping("/update/{id}")
    public String updateVessel(@PathVariable int id, @RequestBody VesselUpdateRequest vesselUpdateRequest){
        vesselService.updateVesselRecord(id,vesselUpdateRequest);
        return "Update Operation Complete";
    }
}
