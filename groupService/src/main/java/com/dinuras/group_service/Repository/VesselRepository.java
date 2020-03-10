package com.dinuras.group_service.Repository;

import com.dinuras.vessel.Model.Vessel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VesselRepository extends JpaRepository<Vessel,Integer> {
}
