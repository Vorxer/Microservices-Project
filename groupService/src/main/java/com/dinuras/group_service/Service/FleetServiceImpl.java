package com.dinuras.group_service.Service;

import com.dinuras.group_service.Model.Request.FleetUpdateRequest;
import com.dinuras.group_service.Model.Response.FleetResponse;
import com.dinuras.group_service.Model.Fleet;
import com.dinuras.group_service.Repository.FleetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FleetServiceImpl implements com.dinuras.group_service.Service.FleetService {

    @Autowired
    FleetRepository repository;

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Override
    public Fleet getFleetByID(int id){
        Optional<Fleet> fleet = repository.findById(id);

        if(fleet.isPresent())
            return fleet.get();

        return null;
    }

    @Override
    public List<Fleet> getFleets() {

        return repository.findAll();

    }

    @Override
    public Fleet add(Fleet fleet) {

        return repository.save(fleet);

    }

    @Override
    public List<Fleet> getFleetsByID(List<Integer> fleetList){

        return repository.findAllById(fleetList);

    }

    @Override
    public void delete(Integer id) {

        repository.deleteById(id);

    }

    @Override
    public FleetResponse getFleetResponseByID(int id){

        Optional<Fleet> fleet = repository.findById(id);

        if(fleet.isPresent()) {
            Fleet f = fleet.get();
            FleetResponse fleetResponse = new FleetResponse(
                    f.getID(),
                    f.getName(),
                    f.getFlagshipID(),
                    f.getFlagCommanderID(),
                    f.getOperationalRange(),
                    f.getEnduarance(),
                    f.getGPSLocation(),
                    f.getVesselRecords(),
                    f.getBase().getID(),
                    f.getBase().getName()
            );
            return fleetResponse;

        }
        return null;
    }


    @Override
    public List<FleetResponse> getAllFleetResponses() {

        List<Fleet> fleets = repository.findAll();
        List<FleetResponse> fleetResponses = new ArrayList<>();

        for (Fleet f : fleets) {
            FleetResponse fr = new FleetResponse(
                    f.getID(),
                    f.getName(),
                    f.getFlagshipID(),
                    f.getFlagCommanderID(),
                    f.getOperationalRange(),
                    f.getEnduarance(),
                    f.getGPSLocation(),
                    f.getVesselRecords(),
                    f.getBase().getID(),
                    f.getBase().getName()
            );
            fleetResponses.add(fr);
        }

        return fleetResponses;

    }

    @Override
    public List<FleetResponse> getFleetResponsesByID(List<Integer> fleetList){

        List<Fleet> fleets = repository.findAllById(fleetList);
        List<FleetResponse> fleetResponses = new ArrayList<>();

        for (Fleet f : fleets) {
            FleetResponse fr = new FleetResponse(
                    f.getID(),
                    f.getName(),
                    f.getFlagshipID(),
                    f.getFlagCommanderID(),
                    f.getOperationalRange(),
                    f.getEnduarance(),
                    f.getGPSLocation(),
                    f.getVesselRecords(),
                    f.getBase().getID(),
                    f.getBase().getName()
            );
            fleetResponses.add(fr);
        }

        return fleetResponses;

    }

    @Override
    public void updateFleetRecord(int ID, FleetUpdateRequest fleetUpdateRequest){
        Fleet fleet = repository.findById(ID).get();
        if (fleetUpdateRequest.enduarance != null)
            fleet.setEnduarance(fleetUpdateRequest.enduarance);
        if (fleetUpdateRequest.GPSLocation != null)
            fleet.setGPSLocation(fleetUpdateRequest.GPSLocation);
        if (fleetUpdateRequest.operationalRange != null)
            fleet.setEnduarance(fleetUpdateRequest.operationalRange);
        repository.save(fleet);
    }



}
