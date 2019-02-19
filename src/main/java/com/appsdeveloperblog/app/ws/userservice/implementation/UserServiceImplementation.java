package com.appsdeveloperblog.app.ws.userservice.implementation;

import com.appsdeveloperblog.app.ws.shared.Utils;
import com.appsdeveloperblog.app.ws.ui.controller.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.controller.model.response.UserRest;
import com.appsdeveloperblog.app.ws.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImplementation implements UserService {

    Map<String, UserRest> users;
    Utils utils;

    public UserServiceImplementation() {
    }

    @Autowired
    public UserServiceImplementation(Utils utils) {
        this.utils = utils;
    }

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetails) {
        UserRest userRest = new UserRest();
        userRest.setFirstName(userDetails.getFirstName());
        userRest.setLastName(userDetails.getLastName());
        userRest.setEmail(userDetails.getEmail());
        String userId = utils.generateUserId();
        userRest.setUserId(userId);
        if(users == null) users = new HashMap<>();
        users.put(userId, userRest);
        return userRest;
    }
}
