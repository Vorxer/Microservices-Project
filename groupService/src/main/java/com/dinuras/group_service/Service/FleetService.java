package com.dinuras.group_service.Service;

import com.dinuras.group_service.Model.Fleet;
import com.dinuras.group_service.Model.Request.FleetUpdateRequest;
import com.dinuras.group_service.Model.Response.FleetResponse;

import java.util.List;

public interface FleetService {
    Fleet getFleetByID(int id);

    List<Fleet> getFleets();

    Fleet add(Fleet fleet);

    List<Fleet> getFleetsByID(List<Integer> fleetList);

    void delete(Integer id);

    FleetResponse getFleetResponseByID(int id);

    List<FleetResponse> getAllFleetResponses();

    List<FleetResponse> getFleetResponsesByID(List<Integer> fleetList);

    void updateFleetRecord(int ID, FleetUpdateRequest fleetUpdateRequest);
}
