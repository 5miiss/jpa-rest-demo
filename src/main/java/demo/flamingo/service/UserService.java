package demo.flamingo.service;

import demo.flamingo.Repository.UsersRepo;
import demo.flamingo.entities.users;

public class UserService {
    
    private final UsersRepo usersRepo;

    {
        usersRepo = new UsersRepo();
    }

    public users getUser(int id )
    {
        return usersRepo.getUser(id);
    }
}
