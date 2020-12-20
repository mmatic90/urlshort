package com.mmatic.urlshort.security;

import com.mmatic.urlshort.dao.AccountDao;
import com.mmatic.urlshort.model.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UrlShortenerUserDetailsService implements UserDetailsService {

    private final AccountDao accountDao;

    @Autowired
    public UrlShortenerUserDetailsService(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (!accountDao.existsByName(username)) {
            throw new UsernameNotFoundException("could not find the user '"
                    + username + "'");
        }
        Account account = accountDao.getByName(username);

        return new User(account.getUsername(), account.getPassword(), Collections.singletonList(() -> "ADMIN"));
    }
}

