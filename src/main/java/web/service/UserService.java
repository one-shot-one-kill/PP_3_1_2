package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> allUsers();
    public void saveUser(User user);
    public void deleteUser(Long id);
    public void editUser(User user);
    public User getUserById(Long id);
}
