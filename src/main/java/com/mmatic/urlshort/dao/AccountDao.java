package com.mmatic.urlshort.dao;

import com.mmatic.urlshort.model.account.Account;

public interface AccountDao {

    void create(String name, String password);

    Account getByName(String name);

    boolean existsByName(String name);
}
