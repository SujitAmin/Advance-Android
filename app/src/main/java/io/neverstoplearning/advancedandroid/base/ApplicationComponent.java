package io.neverstoplearning.advancedandroid.base;
import android.app.Application;
import javax.inject.Singleton;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        ActivityBindingModule.class,
})
public interface ApplicationComponent {
       void inject(MyApplication myApplication);
}
