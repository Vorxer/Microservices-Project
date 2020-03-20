package com.dinuras.operarion.Service;

import com.dinuras.operarion.Model.Operation;
import com.dinuras.operarion.Model.Request.OperationlUpdateRequest;
import com.dinuras.operarion.Model.Response.OperationResponse;

import java.util.List;

public interface OperationService {
    Operation getOperationByID(int id);

    List<Operation> getOperations();

    Operation add(Operation operation);

    List<Operation> getOperationsByID(List<Integer> operationList);

    void delete(Integer id);

    OperationResponse getOperationResponseByID(int id);

    List<OperationResponse> getAllOperationResponses();

    List<OperationResponse> getOperationResponsesByID(List<Integer> operationList);

    void updateOperationRecord(int ID, OperationlUpdateRequest operationUpdateRequest);
}
