package com.example.SQLServerJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users createUser(Users user){
        return  userRepository.save(user);
    }

    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<Users> getUserById(Long id){
        return userRepository.findById(id);
    }

    public Users updateUser(Long id, Users userDetails){
        return  userRepository.findById(id)
                .map(user->{
                    user.setName(userDetails.getName());
                    user.setEmail(userDetails.getEmail());
                    return  userRepository.save(user);
                }).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }


}
