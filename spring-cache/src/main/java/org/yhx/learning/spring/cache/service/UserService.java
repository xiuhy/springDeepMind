package org.yhx.learning.spring.cache.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.yhx.learning.spring.cache.entity.User;

@Service
public class UserService {

    @Cacheable("users")
    public User getUserById(Integer id){
        System.out.println("get data from servie");
        return getUserFromDB(id);
    }

    private User getUserFromDB(Integer id){
        System.out.println("get data from DB");
        User dbUser= new User();
        dbUser.setAge(10);
        dbUser.setName("db");
        return dbUser;
    }

    @CacheEvict("users")
    public void removeUserById(Integer id){
        System.out.println("remove data from Service");
        removeUserFromDB(id);
    }

    private void removeUserFromDB(Integer id){
        System.out.println("remove data from DB");
    }
}
