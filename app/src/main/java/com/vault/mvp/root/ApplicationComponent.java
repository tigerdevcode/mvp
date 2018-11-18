package com.vault.mvp.root;

import android.app.Application;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {ApplicationModule.class, AndroidSupportInjectionModule.class, ActivityBuilderModule.class})
public interface ApplicationComponent {

    interface Builder {

        @BindsInstance
        Builder application(Application application);
        ApplicationComponent build();
    }

    void inject(App app);

}
