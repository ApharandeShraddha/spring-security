package demo.spring.security.service;

import demo.spring.security.repository.UserRepository;
import demo.spring.security.resources.MyUserDetails;
import demo.spring.security.resources.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
       Optional<User> users = userRepository.findByUserName(s);
        users.orElseThrow(() -> new UsernameNotFoundException("User not found!"));
        return users.map(MyUserDetails::new).get();
    }
}

