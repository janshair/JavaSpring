package com.tapdevs.backend.service;

/**
 * Created by Tapdevs on 16/02/2017.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.tapdevs.backend.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * http://websystique.com/springmvc/spring-mvc-4-restful-web-services-crud-example-resttemplate/
 */

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

    private static final AtomicLong counter = new AtomicLong();

    private static List<User> users;

    static{
        users= populateDummyUsers();
    }

    public List<User> findAllUsers() {
        return users;
    }

    public User findById(long id) {
        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public User findByName(String name) {
        for(User user : users){
            if(user.getFullName().equalsIgnoreCase(name)){
                return user;
            }
        }
        return null;
    }

    @Override
    public User loginUser(String name, String password) {

        for(User user : users){
            if(user.getFullName().equalsIgnoreCase(name)){
                if(user.getPassword().equalsIgnoreCase(password)){
                    return user;
                }else {
                    return null;
                }
            }
        }
        return null;
    }

    public void saveUser(User user) {
        user.setId(counter.incrementAndGet());
        users.add(user);
    }

    public void updateUser(User user) {
        int index = users.indexOf(user);
        users.set(index, user);
    }

    public void deleteUserById(long id) {

        for (Iterator<User> iterator = users.iterator(); iterator.hasNext(); ) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
            }
        }
    }

    public boolean isUserExist(User user) {
        return findByName(user.getFullName())!=null;
    }

    private static List<User> populateDummyUsers(){
        List<User> users = new ArrayList<User>();
        users.add(new User(counter.incrementAndGet(),"Sam","abc123", "a@b.com"));
        users.add(new User(counter.incrementAndGet(),"Tom","abc123", "a@c.com"));
        users.add(new User(counter.incrementAndGet(),"Jerome","abc123", "a@d.com"));
        users.add(new User(counter.incrementAndGet(),"Silvia","abc123", "a@e.com"));
        return users;
    }

    public void deleteAllUsers() {
        users.clear();
    }

}
