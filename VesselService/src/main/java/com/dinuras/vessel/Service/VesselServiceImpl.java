package com.dinuras.vessel.Service;

import com.dinuras.vessel.Model.Request.VesselUpdateRequest;
import com.dinuras.vessel.Model.Response.VesselResponse;
import com.dinuras.vessel.Model.Vessel;
import com.dinuras.vessel.Repository.VesselRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VesselServiceImpl implements VesselService {

    @Autowired
    VesselRepository repository;

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Override
    public Vessel getVesselByID(int id){
        Optional<Vessel> vessel = repository.findById(id);

        if(vessel.isPresent())
            return vessel.get();

        return null;
    }

    @Override
    public List<Vessel> getVessels() {

        return repository.findAll();

    }

    @Override
    public Vessel add(Vessel vessel) {

        return repository.save(vessel);

    }

    @Override
    public List<Vessel> getVesselsByID(List<Integer> vesselList){

        return repository.findAllById(vesselList);

    }

    @Override
    public void delete(Integer id) {

        repository.deleteById(id);

    }

    @Override
    public VesselResponse getVesselResponseByID(int id){

        Optional<Vessel> vessel = repository.findById(id);

        if(vessel.isPresent()) {
            Vessel v = vessel.get();
            VesselResponse vesselResponse = new VesselResponse(
                    v.ID,
                    v.name,
                    v.VRN,
                    v.getAvailableRange(),
                    v.getEnduarance(),
                    v.getCombatReaddinesssRating(),
                    v.getShipClass().getID(),
                    v.getShipClass().getName(),
                    v.getShipClass().getCruiseSpeed(),
                    v.getShipClass().getFlankSpeed(),
                    v.getShipClass().getStsCombatRating(),
                    v.getShipClass().getAswCombatRating(),
                    v.getShipClass().getAaCombatRating(),
                    v.getShipClass().getPdsRating(),
                    v.getCommandingOfficer().getID(),
                    v.getCommandingOfficer().getName(),
                    v.getCommandingOfficer().getRank()
            );
            return vesselResponse;

        }
        return null;
    }


    @Override
    public List<VesselResponse> getAllVesselResponses() {

        List<Vessel> vessels = repository.findAll();
        List<VesselResponse> vesselResponses = new ArrayList<>();

        for (Vessel v : vessels) {
            VesselResponse vr = new VesselResponse(
                    v.ID,
                    v.name,
                    v.VRN,
                    v.getAvailableRange(),
                    v.getEnduarance(),
                    v.getCombatReaddinesssRating(),
                    v.getShipClass().getID(),
                    v.getShipClass().getName(),
                    v.getShipClass().getCruiseSpeed(),
                    v.getShipClass().getFlankSpeed(),
                    v.getShipClass().getStsCombatRating(),
                    v.getShipClass().getAswCombatRating(),
                    v.getShipClass().getAaCombatRating(),
                    v.getShipClass().getPdsRating(),
                    v.getCommandingOfficer().getID(),
                    v.getCommandingOfficer().getName(),
                    v.getCommandingOfficer().getRank()
            );
            vesselResponses.add(vr);
        }

        return vesselResponses;

    }

    @Override
    public List<VesselResponse> getVesselResponsesByID(List<Integer> vesselList){

        List<Vessel> vessels = repository.findAllById(vesselList);
        List<VesselResponse> vesselResponses = new ArrayList<>();

        for (Vessel v : vessels) {
            VesselResponse vr = new VesselResponse(
                    v.ID,
                    v.name,
                    v.VRN,
                    v.getAvailableRange(),
                    v.getEnduarance(),
                    v.getCombatReaddinesssRating(),
                    v.getShipClass().getID(),
                    v.getShipClass().getName(),
                    v.getShipClass().getCruiseSpeed(),
                    v.getShipClass().getFlankSpeed(),
                    v.getShipClass().getStsCombatRating(),
                    v.getShipClass().getAswCombatRating(),
                    v.getShipClass().getAaCombatRating(),
                    v.getShipClass().getPdsRating(),
                    v.getCommandingOfficer().getID(),
                    v.getCommandingOfficer().getName(),
                    v.getCommandingOfficer().getRank()
            );
            vesselResponses.add(vr);
        }

        return vesselResponses;

    }

    @Override
    public void updateVesselRecord(int ID, VesselUpdateRequest vesselUpdateRequest){
        Vessel vessel = repository.findById(ID).get();
        if (vesselUpdateRequest.availableRange != null)
            vessel.setAvailableRange(vesselUpdateRequest.availableRange);
        if (vesselUpdateRequest.combatReaddinesssRating != null)
            vessel.setCombatReaddinesssRating(vesselUpdateRequest.combatReaddinesssRating);
        if (vesselUpdateRequest.enduarance != null)
            vessel.setEnduarance(vesselUpdateRequest.enduarance);
        repository.save(vessel);
    }



}
