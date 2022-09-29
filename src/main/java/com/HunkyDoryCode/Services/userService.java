package com.HunkyDoryCode.Services;

import com.HunkyDoryCode.Entities.user;
import com.HunkyDoryCode.Repositories.userRepository;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class userService {
    private userRepository repository;
    public  userService(userRepository repository) {
        this.repository = repository;
    }
    public user createUser(user newUser){
        return this.repository.save(newUser);
    }
    public user findUserByEmail(String email){
        return this.repository.findByEmail(email);
    }

    public user getOrCeateUser(Map<String, Object> userData) {
        String email = (String) userData.get("email");

        user user = findUserByEmail(email);
        if (user == null){
            String name = (String) userData.get("nickname");
            String image = (String) userData.get("picture");
            String auth0Id = (String) userData.get("sub");

        user newUser = new user(email = email, image = image, auth0Id = auth0Id);
        return createUser((newUser));
    }
    return user;

    }
}
