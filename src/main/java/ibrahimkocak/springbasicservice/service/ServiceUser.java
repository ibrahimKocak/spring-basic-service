package ibrahimkocak.springbasicservice.service;

import ibrahimkocak.springbasicservice.model.User;
import ibrahimkocak.springbasicservice.repository.IRepositoryUserMongodb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceUser {

    @Autowired
    private IRepositoryUserMongodb repositoryUser;

    public List<User> getAll() {
        return repositoryUser.findAll();
    }

    public User getId(String id) {
        return repositoryUser.findById(id).get();
    }

    public List<User> getAccountType(User.AccountType accountType ) {
        return  repositoryUser.findByAccountType(accountType);
    }

    public List<User> getName(String name) {
        return  repositoryUser.findByName(name);
    }

    public User save(User user) {
        return repositoryUser.save(user);
    }

    public Boolean deleteAll() {
        repositoryUser.deleteAll();
        return true;
    }

    public User delete(String id) {
        User user = repositoryUser.findById(id).get();
        repositoryUser.deleteById(id);
        return user;
    }

    public User update(String id, User user) {
        User userDb = repositoryUser.findById(id).get();
        userDb.setUser(user);
        return repositoryUser.save(userDb);
    }

}
