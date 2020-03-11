package com.dinuras.group_service.Repository;

import com.dinuras.group_service.Model.Fleet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FleetRepository extends JpaRepository<Fleet,Integer> {
}
