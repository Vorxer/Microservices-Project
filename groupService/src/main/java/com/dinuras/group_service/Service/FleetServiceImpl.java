package com.dinuras.group_service.Service;

import com.dinuras.group_service.Model.Fleet;
import com.dinuras.group_service.Repository.FleetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class FleetServiceImpl implements FleetService {

    @Autowired
    FleetRepository repository;

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Override
    public Fleet getFleetByID(int id){
        Optional<Fleet> group = repository.findById(id);

        if(group.isPresent())
            return group.get();

        return null;
    }

    @Override
    public Fleet add(Fleet group) {

        return repository.save(group);

    }

    @Override
    public void delete(Integer id) {

        repository.deleteById(id);

    }


    @Override
    public List<Fleet> getFleets() {

        return repository.findAll();

    }


}
