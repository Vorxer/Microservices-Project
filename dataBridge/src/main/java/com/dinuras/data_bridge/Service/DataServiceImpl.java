package com.dinuras.data_bridge.Service;

import com.dinuras.data_bridge.Model.Shared.Request.FleetUpdateRequest;
import com.dinuras.data_bridge.Model.Shared.Request.OperationlUpdateRequest;
import com.dinuras.data_bridge.Model.Shared.Request.VesselUpdateRequest;
import com.dinuras.data_bridge.Model.Shared.Response.FleetResponse;
import com.dinuras.data_bridge.Model.Shared.Response.OperationResponse;
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
public class DataServiceImpl implements DataService{

    static final String vesselURL = "localhost:8080/vessel";
    static final String fleetURL = "localhost:8090/fleet";
    static final String operationURL = "localhost:8100/operation";

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Override
    public void updateVessel(VesselUpdateRequest vesselUpdateRequest) {

    }

    @Override
    public void updateFleet(FleetUpdateRequest fleetUpdateRequest) {

    }

    @Override
    public void updateOperation(OperationlUpdateRequest operationlUpdateRequest) {

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
        ResponseEntity<List<OperationResponse>> responseEntity = restTemplate().exchange(fleetURL + "/fleets", HttpMethod.POST, httpEntity, new ParameterizedTypeReference<List<OperationResponse>>() {});
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
        ResponseEntity<OperationResponse> responseEntity = restTemplate().exchange(vesselURL + "/fleet/" + id, HttpMethod.GET, httpEntity, OperationResponse.class);
        return responseEntity.getBody();
    }

    @Override
    public List<VesselResponse> getVesselsByFleet(int fleetID) {
        return null;
    }

    @Override
    public List<FleetResponse> getFleetByOperation(int operationID) {
        return null;
    }

/*    static final String vesselURL = "http://localhost:8081/vessel/";
    static final String fleetURL =  "http://localhost:8092/fleet/";

    public Vessel getVessel(int id){
        HttpEntity<String> httpEntity = new HttpEntity<>("", new HttpHeaders());
        ResponseEntity<Vessel> responseEntity = restTemplate().exchange(vesselURL + "vessel/" + id, HttpMethod.GET, httpEntity, Vessel.class);
        return responseEntity.getBody();
    }

    public List<Vessel> getVessels(){
        HttpEntity<String> httpEntity = new HttpEntity<>("", new HttpHeaders());
        ResponseEntity<List<Vessel>> responseEntity = restTemplate().exchange(vesselURL + "vessels/", HttpMethod.POST, httpEntity, new ParameterizedTypeReference<List<Vessel>>() {});
        return responseEntity.getBody();
    }

    public List<Vessel> getSpecificVessels(List<Integer> IDS){
        HttpEntity<List> httpEntity = new HttpEntity<List>(IDS, new HttpHeaders());
        ResponseEntity<List<Vessel>> responseEntity = restTemplate().exchange(vesselURL + "specificVessels/", HttpMethod.POST, httpEntity, new ParameterizedTypeReference<List<Vessel>>() {});
        return responseEntity.getBody();
    }

    public Fleet getFleet(int id){
        HttpEntity<String> httpEntity = new HttpEntity<>("", new HttpHeaders());
        ResponseEntity<Fleet> responseEntity = restTemplate().exchange(fleetURL + "fleet/" + id, HttpMethod.GET, httpEntity, Fleet.class);
        return responseEntity.getBody();
    }


    public List<Fleet> getFleets(){
        HttpEntity<String> httpEntity = new HttpEntity<>("", new HttpHeaders());
        ResponseEntity<List<Fleet>> responseEntity = restTemplate().exchange(fleetURL+"fleets/", HttpMethod.POST, httpEntity, new ParameterizedTypeReference<List<Fleet>>() {});
        return responseEntity.getBody();
    }

    public List<Vessel> getFleetVessels(int fleetID){
        return getSpecificVessels(getFleet(fleetID).vesselRecords.stream().map(VesselRecord::getID).collect(Collectors.toList()));
    }*/



}
