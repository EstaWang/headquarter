package net.wangzhen.mapper;

import net.wangzhen.entity.User;
import org.apache.ibatis.annotations.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by estaw on 2017/10/12.
 * email: zhen.wang@dianrong.com
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "jointime", column = "jointime", javaType = LocalDateTime.class)
    })
    List<User> getAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    @Results({
            @Result(property = "jointime", column = "jointime", javaType = LocalDateTime.class)
    })
    User getUserById(Long id);

    @Select("SELECT * FROM user WHERE username = #{username}")
    @Results({
            @Result(property = "jointime", column = "jointime", javaType = LocalDateTime.class)
    })
    User getUserByName(String username);

    @Insert("INSERT INTO user(username, password, adminlabel) VALUES(#{username}, #{password}, #{adminlabel})")
    void insert(User user);

    @Update("UPDATE user SET password = #{password} WHERE id = #{id}")
    void updateUserPassword(String password, Long id);

    @Delete("DELETE FROM user WHERE id = #{id}")
    void deleteUserById(Long id);

}
