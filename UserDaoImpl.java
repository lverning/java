package cn.smbms.dao.impl;

import cn.smbms.beans.User;
import cn.smbms.dao.UserDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author： 吕二宁
 * @date： 2021-11-26 08:35
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<User> getUserList(User user) {
        return sqlSessionTemplate.selectList("cn.smbms.dao.UserDao.getUserList", user);
    }

    @Override
    public void addUser(User user) {
        sqlSessionTemplate.insert("cn.smbms.dao.UserDao.addUser",user);
    }

    @Override
    public void deleteUser(Integer id) {
        sqlSessionTemplate.delete("cn.smbms.dao.UserDao.deleteUser",id);
    }

    @Override
    public void updateUser(User user) {
        sqlSessionTemplate.update("cn.smbms.dao.UserDao.updateUser",user);
    }

    @Override
    public List<User> getUserById(Integer id) {
        return sqlSessionTemplate.selectList("cn.smbms.dao.UserDao.getUserById",id);
    }
}
