package service;

import model.User;
import repository.IUserRepository;
import repository.impl.UserRepository;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements IUserService {
    private IUserRepository iUserRepository = new UserRepository();

    @Override
    public void insertUser(User user) throws SQLException {
        iUserRepository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return iUserRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUser() {
        return iUserRepository.selectAllUser();
    }

    @Override
    public void deleteUser(int id) throws SQLException {
         iUserRepository.deleteUser(id);
    }

    @Override
    public void updateUser(User user) throws SQLException {
         iUserRepository.updateUser(user);
    }

    @Override
    public List<User> searchByCountry(String country) {
        return iUserRepository.searchByCountry(country);
    }
}
