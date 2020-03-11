package com.dinuras.group_service.Service;

import com.dinuras.group_service.Model.Group;
import com.dinuras.group_service.Repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    GroupRepository repository;

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Override
    public Group getGroupByID(int id){
        Optional<Group> group = repository.findById(id);

        if(group.isPresent())
            return group.get();

        return null;
    }

    @Override
    public Group add(Group group) {

        return repository.save(group);

    }

    @Override
    public void delete(Integer id) {

        repository.deleteById(id);

    }


    @Override
    public List<Group> getGroups() {

        return repository.findAll();

    }


}
