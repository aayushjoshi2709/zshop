package com.aayushjoshi2709.zshop.service;

import com.aayushjoshi2709.zshop.Entity.User;
import com.aayushjoshi2709.zshop.Entity.UserPrincipal;
import com.aayushjoshi2709.zshop.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    UserRepository userRepository;

    public MyUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserPrincipal loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRepository.findByUsername(username).orElseThrow(
                () -> new UsernameNotFoundException("Username not found"));
        return new UserPrincipal(user);
    }
}
