package com.dinuras.group_service.Service;

import com.dinuras.group_service.Model.Fleet;

import java.util.List;

public interface FleetService {
    Fleet getFleetByID(int id);

    Fleet add(Fleet group);

    void delete(Integer id);

    List<Fleet> getFleets();
}
