package com.dinuras.group_service.Service;

import com.dinuras.group_service.Model.Group;

import java.util.List;

public interface GroupService {
    Group getGroupByID(int id);

    Group add(Group group);

    void delete(Integer id);

    List<Group> getGroups();
}
