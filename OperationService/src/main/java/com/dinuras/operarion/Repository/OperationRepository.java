package com.dinuras.operarion.Repository;

import com.dinuras.operarion.Model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepository extends JpaRepository<Operation,Integer> {
}
