package cn.smbms.dao;

import cn.smbms.beans.User;

import java.util.List;

/**
 * @author： 吕二宁
 * @date： 2021-11-26 08:35
 */
public interface UserDao {
    //查询所有用户
    public List<User> getUserList(User user);

    //添加用户
    public void addUser(User user);

    //根据id删除用户
    public void deleteUser(Integer id);

    //更新用户
    public void updateUser(User user);

    //根据id查询用户
    public List<User> getUserById(Integer id);
}
