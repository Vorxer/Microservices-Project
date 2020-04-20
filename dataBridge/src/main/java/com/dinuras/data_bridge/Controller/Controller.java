package com.dinuras.data_bridge.Controller;

import com.dinuras.data_bridge.Model.Shared.Request.FleetUpdateRequest;
import com.dinuras.data_bridge.Model.Shared.Request.OperationlUpdateRequest;
import com.dinuras.data_bridge.Model.Shared.Request.VesselUpdateRequest;
import com.dinuras.data_bridge.Model.Shared.Response.FleetResponse;
import com.dinuras.data_bridge.Model.Shared.Response.OperationResponse;
import com.dinuras.data_bridge.Model.Shared.Response.VesselResponse;
import com.dinuras.data_bridge.Service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/bridge")
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {

    @Autowired
    DataService dataService;

    @RequestMapping("/updateVessel/{id}")
    public String updateVessel(@PathVariable int id, @RequestBody VesselUpdateRequest vesselUpdateRequest){
        return dataService.updateVessel(id,vesselUpdateRequest);
    }

    @RequestMapping("/updateFleet/{id}")
    public String updateFleet(@PathVariable int id, @RequestBody FleetUpdateRequest fleetUpdateRequest){
        return dataService.updateFleet(id,fleetUpdateRequest);
    }

    @RequestMapping("/updateOperation/{id}")
    public String updateOperation(@PathVariable int id, @RequestBody OperationlUpdateRequest operationUpdateRequest){
        return dataService.updateOperation(id, operationUpdateRequest);
    }

    @RequestMapping("/getVessels")
    public List<VesselResponse> getVessels() {
        return dataService.getVessels();
    }

    @RequestMapping("/getFleets")
    public List<FleetResponse> getFleets() {
        return dataService.getFleets();
    }

    @RequestMapping("/getOperations")
    public List<OperationResponse> getOperations() {
        return dataService.getOperations();
    }

    @RequestMapping("/getVessel/{id}")
    public VesselResponse getVessel(@PathVariable int id) {
        return dataService.getVessel(id);
    }

    @RequestMapping("/getFleet/{id}")
    public FleetResponse getFleet(@PathVariable int id) {
        return dataService.getFleet(id);
    }

    @RequestMapping("/getOperation/{id}")
    public OperationResponse getOperation(@PathVariable int id) {
        return dataService.getOperation(id);
    }

    @RequestMapping("/getVesselsByFleet/{fleetID}")
    public List<VesselResponse> getVesselsByFleet(@PathVariable int fleetID) {
        return dataService.getVesselsByFleet(fleetID);
    }

    @RequestMapping("/getFleetByOperation/{operationID}")
    public List<FleetResponse> getFleetByOperation(@PathVariable int operationID) {
        return dataService.getFleetByOperation(operationID);
    }

}
