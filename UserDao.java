package dao;

import base.User;

import java.util.List;

/**
 * @author： 吕二宁
 * @date： 2021-11-13 14:46
 */
public interface UserDao {
    //添加用户
    public boolean  addUser(User user);
    //删除用户
    public void deleteUser(User user);
    //修改用户
    public void updateUser(User user);
    //查询所有用户
    public List<User> getUsers(User user);

}
