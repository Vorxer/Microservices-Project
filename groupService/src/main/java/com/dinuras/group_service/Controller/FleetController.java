package com.dinuras.group_service.Controller;

import com.dinuras.group_service.Model.Fleet;
import com.dinuras.group_service.Model.Request.FleetUpdateRequest;
import com.dinuras.group_service.Model.Response.FleetResponse;
import com.dinuras.group_service.Service.FleetService;
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
    FleetService fleetService;

    @RequestMapping("/fleet/{id}")
    public Fleet getFleet(@PathVariable int id){
        return fleetService.getFleetByID(id);
    }

    @RequestMapping("/fleets")
    public List<Fleet> getAllFleets(){
        return fleetService.getFleets();
    }

    @RequestMapping("/specificFleets")
    public List<Fleet> getSpecificFleets(@RequestBody List<Integer> IDS){
        return fleetService.getFleetsByID(IDS);
    }
    @RequestMapping("/add")
    public Fleet getAllFleets(@RequestBody Fleet fleet){
        return fleetService.add(fleet);
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id){

        fleetService.delete(id);

        return "fleet id " + id + " deleted";
    }

    @RequestMapping("/FleetInfo/{id}")
    public FleetResponse fleetResponse(@PathVariable int id){
        return fleetService.getFleetResponseByID(id);
    }

    @RequestMapping("/allFleetInfo")
    public List<FleetResponse> allFleetResponse(){
        return fleetService.getAllFleetResponses();
    }

    @RequestMapping("/specificFleetsInfo")
    public List<FleetResponse> getSpecificFleetsInfo(@RequestBody List<Integer> IDS){
        return fleetService.getFleetResponsesByID(IDS);
    }

    @RequestMapping("/update/{id}")
    public String updateFleet(@PathVariable int id, @RequestBody FleetUpdateRequest fleetUpdateRequest){
        fleetService.updateFleetRecord(id,fleetUpdateRequest);
        return "Update Operation Complete";
    }
}
