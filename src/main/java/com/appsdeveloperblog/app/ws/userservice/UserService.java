package com.appsdeveloperblog.app.ws.userservice;

import com.appsdeveloperblog.app.ws.ui.controller.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.controller.model.response.UserRest;

public interface UserService {
    UserRest createUser(UserDetailsRequestModel userDetails);
}
