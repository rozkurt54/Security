package com.rozkurt.Security.business.concretes;

import com.rozkurt.Security.business.abstracts.UserService;
import com.rozkurt.Security.dataAccess.UserRepository;
import com.rozkurt.Security.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private final UserRepository userRepository;

    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getOne(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User update(Long id, User user) {

        User inDbUser = userRepository.findById(id).get();
        inDbUser.setFirstName(user.getFirstName());
        inDbUser.setMiddleName(user.getMiddleName());
        inDbUser.setLastName(user.getLastName());
        return userRepository.save(inDbUser);

    }

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }

    @Override
    public Boolean activate(Long id) {
        userRepository.findById(id).get().setActive(true);
        return true;
    }

    @Override
    public Boolean deActivate(Long id) {
        userRepository.findById(id).get().setActive(false);
        return true;
    }




    @Override
    public Boolean revoke(Long id) {
        return null;
    }
}
