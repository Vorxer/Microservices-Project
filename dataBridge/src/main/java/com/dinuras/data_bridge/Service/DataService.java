package com.dinuras.data_bridge.Service;

import com.dinuras.data_bridge.Model.Shared.Fleet;
import com.dinuras.data_bridge.Model.Shared.Vessel;
import com.dinuras.data_bridge.Model.Shared.VesselRecord;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class dataService {

    @Bean
    //@LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public Vessel getVessel(int id){
        HttpEntity<String> httpEntity = new HttpEntity<>("", new HttpHeaders());
        ResponseEntity<Vessel> responseEntity = restTemplate().exchange("http://localhost:xxxx" + id, HttpMethod.GET, httpEntity, Vessel.class);
        return responseEntity.getBody();
    }

    public Fleet getFleet(int id){

        HttpEntity<String> httpEntity = new HttpEntity<>("", new HttpHeaders());
        ResponseEntity<Fleet> responseEntity = restTemplate().exchange("http://localhost:xxxx" + id, HttpMethod.GET, httpEntity, Fleet.class);
        return responseEntity.getBody();

    }

    public List<Vessel> getVessels(){

        HttpEntity<String> httpEntity = new HttpEntity<>("", new HttpHeaders());
        ResponseEntity<List<Vessel>> responseEntity = restTemplate().exchange("http://localhost:xxxx", HttpMethod.POST, httpEntity, new ParameterizedTypeReference<List<Vessel>>() {});
        return responseEntity.getBody();

    }

    public List<Vessel> getSpecificVessels(List<Integer> IDS){

        HttpEntity<List> httpEntity = new HttpEntity<List>(IDS, new HttpHeaders());
        ResponseEntity<List<Vessel>> responseEntity = restTemplate().exchange("http://localhost:xxxx", HttpMethod.POST, httpEntity, new ParameterizedTypeReference<List<Vessel>>() {});
        return responseEntity.getBody();
    }

    public List<Fleet> getFleets(){

        HttpEntity<String> httpEntity = new HttpEntity<>("", new HttpHeaders());
        ResponseEntity<List<Fleet>> responseEntity = restTemplate().exchange("http://localhost:xxxx", HttpMethod.POST, httpEntity, new ParameterizedTypeReference<List<Fleet>>() {});
        return responseEntity.getBody();

    }

    public List<Vessel> getFleetVessels(int fleetID){
        return getSpecificVessels(getFleet(fleetID).vesselRecords.stream().map(VesselRecord::getID).collect(Collectors.toList()));
    }

}
