package com.dinuras.vessel.Service;

import com.dinuras.vessel.Model.Request.VesselUpdateRequest;
import com.dinuras.vessel.Model.Response.VesselResponse;
import com.dinuras.vessel.Model.Vessel;

import java.util.List;

public interface VesselService {
    Vessel getVesselByID(int id);

    List<Vessel> getVessels();

    Vessel add(Vessel vessel);

    List<Vessel> getVesselsByID(List<Integer> vesselList);

    void delete(Integer id);

    VesselResponse getVesselResponseByID(int id);

    List<VesselResponse> getAllVesselResponses();

    List<VesselResponse> getVesselResponsesByID(List<Integer> vesselList);

    void updateVesselRecord(int ID, VesselUpdateRequest vesselUpdateRequest);
}
