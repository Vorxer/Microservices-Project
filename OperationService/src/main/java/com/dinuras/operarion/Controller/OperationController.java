package com.dinuras.operarion.Controller;

import com.dinuras.operarion.Model.Operation;
import com.dinuras.operarion.Model.Request.OperationlUpdateRequest;
import com.dinuras.operarion.Model.Response.OperationResponse;
import com.dinuras.operarion.Service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/operation")
public class OperationController {

    @Autowired
    OperationService operationService;

    @RequestMapping("/operation/{id}")
    public Operation getOperation(@PathVariable int id){
        return operationService.getOperationByID(id);
    }

    @RequestMapping("/operations")
    public List<Operation> getAllOperations(){
        return operationService.getOperations();
    }

    @RequestMapping("/specificOperations")
    public List<Operation> getSpecificOperations(@RequestBody List<Integer> IDS){
        return operationService.getOperationsByID(IDS);
    }
    @RequestMapping("/add")
    public Operation getAllOperations(@RequestBody Operation operation){
        return operationService.add(operation);
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id){

        operationService.delete(id);

        return "operation id " + id + " deleted";
    }

    @RequestMapping("/OperationInfo/{id}")
    public OperationResponse operationResponse(@PathVariable int id){
        return operationService.getOperationResponseByID(id);
    }

    @RequestMapping("/allOperationInfo")
    public List<OperationResponse> allOperationResponse(){
        return operationService.getAllOperationResponses();
    }

    @RequestMapping("/specificOperationsInfo")
    public List<OperationResponse> getSpecificOperationsInfo(@RequestBody List<Integer> IDS){
        return operationService.getOperationResponsesByID(IDS);
    }

    @RequestMapping("/update/{id}")
    public String updateOperation(@PathVariable int id, @RequestBody OperationlUpdateRequest operationUpdateRequest){
        operationService.updateOperationRecord(id,operationUpdateRequest);
        return "Update Operation Complete";
    }
}
