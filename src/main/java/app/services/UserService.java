package app.services;

import java.util.List;
import app.models.User;

public interface UserService {

    User findById(Long id);

    List<User> findAll();

    void save(User user);

    void deleteById(Long id);
}