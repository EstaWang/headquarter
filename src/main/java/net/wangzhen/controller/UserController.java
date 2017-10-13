package net.wangzhen.controller;

import net.wangzhen.entity.User;
import net.wangzhen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by estaw on 2017/10/12.
 * email: zhen.wang@dianrong.com
 */
@RestController
public class UserController {

    private UserService userService;

    @RequestMapping(value = "/allUser", method = RequestMethod.GET)
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
