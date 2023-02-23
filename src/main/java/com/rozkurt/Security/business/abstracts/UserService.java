package com.rozkurt.Security.business.abstracts;

import com.rozkurt.Security.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getOne(Long id);


    User update(Long id, User user);

    User add(User user);

    Boolean activate(Long id);

    Boolean deActivate(Long id);

    Boolean revoke(Long id);


}
