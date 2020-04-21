package ibrahimkocak.springbasicservice.repository;

import ibrahimkocak.springbasicservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IRepositoryUserMongodb extends MongoRepository<User, String> {

    List<User> findByName(String name);
    List<User> findByAccountType(User.AccountType accountType);

}
