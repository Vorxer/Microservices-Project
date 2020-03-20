package com.dinuras.data_bridge.Service;

import com.dinuras.data_bridge.Model.Shared.Request.FleetUpdateRequest;
import com.dinuras.data_bridge.Model.Shared.Request.OperationlUpdateRequest;
import com.dinuras.data_bridge.Model.Shared.Request.VesselUpdateRequest;
import com.dinuras.data_bridge.Model.Shared.Response.FleetResponse;
import com.dinuras.data_bridge.Model.Shared.Response.OperationResponse;
import com.dinuras.data_bridge.Model.Shared.Response.VesselResponse;

import java.util.List;

public interface DataService {
    String updateVessel(int id, VesselUpdateRequest vesselUpdateRequest);

    String updateFleet(int id, FleetUpdateRequest fleetUpdateRequest);

    String updateOperation(int id, OperationlUpdateRequest operationlUpdateRequest);

    List<VesselResponse> getVessels();

    List<FleetResponse> getFleets();

    List<OperationResponse> getOperations();

    VesselResponse getVessel(int id);

    FleetResponse getFleet(int id);

    OperationResponse getOperation(int id);

    List<FleetResponse> getSpecificFleetsInfo(List<Integer> IDS);

    List<VesselResponse> getSpecificVesselsInfo(List<Integer> IDS);

    List<VesselResponse> getVesselsByFleet(int fleetID);

    List<FleetResponse> getFleetByOperation(int operationID);
}
