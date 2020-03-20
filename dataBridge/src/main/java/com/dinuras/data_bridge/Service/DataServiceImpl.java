package com.dinuras.data_bridge.Service;

import com.dinuras.data_bridge.Model.Shared.Request.FleetUpdateRequest;
import com.dinuras.data_bridge.Model.Shared.Request.OperationlUpdateRequest;
import com.dinuras.data_bridge.Model.Shared.Request.VesselUpdateRequest;
import com.dinuras.data_bridge.Model.Shared.Response.FleetResponse;
import com.dinuras.data_bridge.Model.Shared.Response.OperationResponse;
import com.dinuras.data_bridge.Model.Shared.Response.VesselRecord;
import com.dinuras.data_bridge.Model.Shared.Response.VesselResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataServiceImpl implements DataService {

    static final String vesselURL = "localhost:8080/vessel";
    static final String fleetURL = "localhost:8090/fleet";
    static final String operationURL = "localhost:8100/operation";

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Override
    public String updateVessel(int id, VesselUpdateRequest vesselUpdateRequest) {

        HttpEntity<VesselUpdateRequest> httpEntity = new HttpEntity<>(vesselUpdateRequest, new HttpHeaders());
        ResponseEntity<String> responseEntity = restTemplate().exchange(vesselURL + "/update/"+id, HttpMethod.GET, httpEntity, String.class);
        return responseEntity.getBody();

    }

    @Override
    public String updateFleet(int id, FleetUpdateRequest fleetUpdateRequest) {
        HttpEntity<FleetUpdateRequest> httpEntity = new HttpEntity<>(fleetUpdateRequest, new HttpHeaders());
        ResponseEntity<String> responseEntity = restTemplate().exchange(fleetURL + "/update/"+id, HttpMethod.GET, httpEntity, String.class);
        return responseEntity.getBody();
    }

    @Override
    public String updateOperation(int id, OperationlUpdateRequest operationlUpdateRequest) {
        HttpEntity<OperationlUpdateRequest> httpEntity = new HttpEntity<>(operationlUpdateRequest, new HttpHeaders());
        ResponseEntity<String> responseEntity = restTemplate().exchange(operationURL + "/update/"+id, HttpMethod.GET, httpEntity, String.class);
        return responseEntity.getBody();
    }

    @Override
    public List<VesselResponse> getVessels() {
        HttpEntity<String> httpEntity = new HttpEntity<>("", new HttpHeaders());
        ResponseEntity<List<VesselResponse>> responseEntity = restTemplate().exchange(vesselURL + "/vessels", HttpMethod.POST, httpEntity, new ParameterizedTypeReference<List<VesselResponse>>() {});
        return responseEntity.getBody();
    }

    @Override
    public List<FleetResponse> getFleets() {
        HttpEntity<String> httpEntity = new HttpEntity<>("", new HttpHeaders());
        ResponseEntity<List<FleetResponse>> responseEntity = restTemplate().exchange(fleetURL + "/fleets", HttpMethod.POST, httpEntity, new ParameterizedTypeReference<List<FleetResponse>>() {});
        return responseEntity.getBody();
    }

    @Override
    public List<OperationResponse> getOperations() {
        HttpEntity<String> httpEntity = new HttpEntity<>("", new HttpHeaders());
        ResponseEntity<List<OperationResponse>> responseEntity = restTemplate().exchange(operationURL + "/operations", HttpMethod.POST, httpEntity, new ParameterizedTypeReference<List<OperationResponse>>() {});
        return responseEntity.getBody();
    }

    @Override
    public VesselResponse getVessel(int id) {
        HttpEntity<String> httpEntity = new HttpEntity<>("", new HttpHeaders());
        ResponseEntity<VesselResponse> responseEntity = restTemplate().exchange(vesselURL + "/vessel/" + id, HttpMethod.GET, httpEntity, VesselResponse.class);
        return responseEntity.getBody();
    }

    @Override
    public FleetResponse getFleet(int id) {
        HttpEntity<String> httpEntity = new HttpEntity<>("", new HttpHeaders());
        ResponseEntity<FleetResponse> responseEntity = restTemplate().exchange(vesselURL + "/fleet/" + id, HttpMethod.GET, httpEntity, FleetResponse.class);
        return responseEntity.getBody();
    }

    @Override
    public OperationResponse getOperation(int id) {
        HttpEntity<String> httpEntity = new HttpEntity<>("", new HttpHeaders());
        ResponseEntity<OperationResponse> responseEntity = restTemplate().exchange(operationURL + "/operation/" + id, HttpMethod.GET, httpEntity, OperationResponse.class);
        return responseEntity.getBody();
    }

    @Override
    public List<FleetResponse> getSpecificFleetsInfo(List<Integer> IDS){
        HttpEntity<List> httpEntity = new HttpEntity<>(IDS, new HttpHeaders());
        ResponseEntity<List<FleetResponse>> responseEntity = restTemplate().exchange(fleetURL + "/specificFleetsInfo", HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<FleetResponse>>() {});
        return responseEntity.getBody();
    }

    @Override
    public List<VesselResponse> getSpecificVesselsInfo(List<Integer> IDS){
        HttpEntity<List> httpEntity = new HttpEntity<>(IDS, new HttpHeaders());
        ResponseEntity<List<VesselResponse>> responseEntity = restTemplate().exchange(vesselURL + "/specificVesselsInfo", HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<VesselResponse>>() {});
        return responseEntity.getBody();
    }

    @Override
    public List<VesselResponse> getVesselsByFleet(int fleetID) {

        FleetResponse fleetResponse = getFleet(fleetID);
        if(fleetResponse != null){
            List<Integer> VIDs = fleetResponse.getVesselRecords().stream().map(VesselRecord::getID)
                    .collect(Collectors.toList());
            return getSpecificVesselsInfo(VIDs);
        }

        return null;
    }

    @Override
    public List<FleetResponse> getFleetByOperation(int operationID) {
        FleetResponse fleetResponse = getFleet(operationID);
        if(fleetResponse != null){
            List<Integer> FIDs = fleetResponse.getVesselRecords().stream().map(VesselRecord::getID)
                    .collect(Collectors.toList());
            return getSpecificFleetsInfo(FIDs);
        }

        return null;
    }


}
