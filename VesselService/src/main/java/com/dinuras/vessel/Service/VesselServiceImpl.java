package com.dinuras.vessel.Service;

import com.dinuras.vessel.Model.Vessel;
import com.dinuras.vessel.Model.VesselResponse;
import com.dinuras.vessel.Repository.VesselRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
    public Vessel add(Vessel vessel) {

        return repository.save(vessel);

    }

    @Override
    public void delete(Integer id) {

        repository.deleteById(id);

    }


    @Override
    public List<Vessel> getVessels() {

        return repository.findAll();

    }

    @Override
    public List<Vessel> getSpecificVessels(List<Integer> vesselList){

        //List<Vessel> vessels = repository.findAll().stream().filter(vessel -> vessel.ID.equals(vesselList.))
        //List<Vessel> vessels = null;
        //for (int i = 0; i < vesselList.size(); i++) {

        return repository.findAllById(vesselList);

    }

    @Override
    public VesselResponse infoResponse(int id){
        Vessel vessel = getVesselByID(id);
        VesselResponse vesselResponse = new VesselResponse();
        vesselResponse.name = vessel.getName();
        vesselResponse.VRN =vessel.getVRN();
        vesselResponse.ShipClass = vessel.getShipClass().getName();
        vesselResponse.CO = vessel.getCommandingOfficer().getName();
        return vesselResponse;
    }


}
