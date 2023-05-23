package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.repository.UserRepository;


import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    @Transactional
    public void createUser(User user) {
        userRepository.createUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Override
    public User readUser(long id) {
        return userRepository.readUser(id);
    }

    @Override
    @Transactional
    public User deleteUser(long id) {
        User user = null;
        if (user == null) {
            throw new NullPointerException();
        }

        userRepository.deleteUser(id);
        return user;
    }
}
