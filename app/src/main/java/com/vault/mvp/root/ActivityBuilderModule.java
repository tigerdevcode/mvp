package com.vault.mvp.root;


import com.vault.mvp.login.LoginActivity;
import com.vault.mvp.login.LoginModel;
import com.vault.mvp.login.LoginModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = LoginModule.class)
    abstract LoginActivity contributeLoginActivity();
}
