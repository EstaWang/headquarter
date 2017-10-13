package net.wangzhen.service;

import net.wangzhen.entity.User;
import net.wangzhen.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by estaw on 2017/10/12.
 * email: zhen.wang@dianrong.com
 */
@Service
public class UserService {

    private UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getAllUsers() {
        return userMapper.getAll();
    }

}
