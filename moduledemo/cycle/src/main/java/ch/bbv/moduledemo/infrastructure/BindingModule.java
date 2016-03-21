package ch.bbv.moduledemo.infrastructure;

import ch.bbv.moduledemo.adapter.CarWashRepositoryImpl;
import ch.bbv.moduledemo.application.CarWashService;
import ch.bbv.moduledemo.domain.CarWashRepository;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class BindingModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(CarWashRepository.class).to(CarWashRepositoryImpl.class);

        bind(CarWashService.class).in(Singleton.class);
    }
}
