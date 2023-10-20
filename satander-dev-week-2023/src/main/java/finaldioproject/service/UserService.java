package finaldioproject.service;

import finaldioproject.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}