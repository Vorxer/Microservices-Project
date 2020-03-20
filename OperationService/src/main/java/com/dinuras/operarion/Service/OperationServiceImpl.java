package com.dinuras.operarion.Service;

import com.dinuras.operarion.Model.Operation;
import com.dinuras.operarion.Model.Request.OperationlUpdateRequest;
import com.dinuras.operarion.Model.Response.OperationResponse;
import com.dinuras.operarion.Repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OperationServiceImpl implements OperationService {

    @Autowired
    OperationRepository repository;

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Override
    public Operation getOperationByID(int id){
        Optional<Operation> operation = repository.findById(id);

        if(operation.isPresent())
            return operation.get();

        return null;
    }

    @Override
    public List<Operation> getOperations() {

        return repository.findAll();

    }

    @Override
    public Operation add(Operation operation) {

        return repository.save(operation);

    }

    @Override
    public List<Operation> getOperationsByID(List<Integer> operationList){

        return repository.findAllById(operationList);

    }

    @Override
    public void delete(Integer id) {

        repository.deleteById(id);

    }

    @Override
    public OperationResponse getOperationResponseByID(int id){

        Optional<Operation> operation = repository.findById(id);

        if(operation.isPresent()) {
            Operation o = operation.get();
            OperationResponse operationResponse = new OperationResponse(
                    o.ID,
                    o.name,
                    o.getFleetRecords(),
                    o.getCommandingAuthority().getName(),
                    o.getDuration(),
                    o.getStatus(),
                    o.getLocation(),
                    o.getLog()
            );
            return operationResponse;

        }
        return null;
    }


    @Override
    public List<OperationResponse> getAllOperationResponses() {

        List<Operation> operations = repository.findAll();
        List<OperationResponse> operationResponses = new ArrayList<>();

        for (Operation o : operations) {
            OperationResponse or = new OperationResponse(
                    o.ID,
                    o.name,
                    o.getFleetRecords(),
                    o.getCommandingAuthority().getName(),
                    o.getDuration(),
                    o.getStatus(),
                    o.getLocation(),
                    o.getLog()
            );
            operationResponses.add(or);
        }

        return operationResponses;

    }

    @Override
    public List<OperationResponse> getOperationResponsesByID(List<Integer> operationList){

        List<Operation> operations = repository.findAllById(operationList);
        List<OperationResponse> operationResponses = new ArrayList<>();

        for (Operation o : operations) {
            OperationResponse or = new OperationResponse(
                    o.ID,
                    o.name,
                    o.getFleetRecords(),
                    o.getCommandingAuthority().getName(),
                    o.getDuration(),
                    o.getStatus(),
                    o.getLocation(),
                    o.getLog()
            );
            operationResponses.add(or);
        }

        return operationResponses;

    }

    @Override
    public void updateOperationRecord(int ID, OperationlUpdateRequest operationUpdateRequest){
        Operation operation = repository.findById(ID).get();
        if (operationUpdateRequest.duration != null)
            operation.setDuration(operationUpdateRequest.duration);
        if (operationUpdateRequest.location != null)
            operation.setLocation(operationUpdateRequest.location);
        if (operationUpdateRequest.status != null)
            operation.setStatus(operationUpdateRequest.status);
        if (operationUpdateRequest.log != null)
            operation.setLog(operationUpdateRequest.log);
        repository.save(operation);
    }



}
