package com.dinuras.vessel.Service;

import com.dinuras.vessel.Model.Vessel;

import java.util.List;

public interface VesselService {
    Vessel getVesselByID(int id);

    Vessel add(Vessel vessel);

    void delete(Integer id);

    List<Vessel> getVessels();
}
