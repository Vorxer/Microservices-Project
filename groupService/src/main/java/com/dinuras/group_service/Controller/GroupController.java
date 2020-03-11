package com.dinuras.group_service.Controller;

import com.dinuras.group_service.Model.Group;
import com.dinuras.group_service.Service.GroupServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    GroupServiceImpl groupService;

    @RequestMapping("/ping")
    public String ping(){
        return "group service 200";
    }

    @RequestMapping("/getGroup/{id}")
    public Group getGroup(@PathVariable int id){
        return groupService.getGroupByID(id);
    }

    @RequestMapping("/groups")
    public List<Group> getAllGroups(){
        return groupService.getGroups();
    }

    @RequestMapping("/add")
    public Group getAllGroups(@RequestBody Group group){
        return groupService.add(group);
    }
}
