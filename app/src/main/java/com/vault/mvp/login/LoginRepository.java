package com.vault.mvp.login;

public interface LoginRepository {

    User getUser();
    void saveUser(User user);

}
