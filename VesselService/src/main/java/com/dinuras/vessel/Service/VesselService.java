package com.dinuras.vessel.Service;

import com.dinuras.vessel.Model.Vessel;
import com.dinuras.vessel.Model.VesselResponse;

import java.util.List;

public interface VesselService {
    Vessel getVesselByID(int id);

    Vessel add(Vessel vessel);

    void delete(Integer id);

    List<Vessel> getVessels();

    public List<Vessel> getSpecificVessels(List<Integer> vesselList);

    public VesselResponse infoResponse(int id);

}
