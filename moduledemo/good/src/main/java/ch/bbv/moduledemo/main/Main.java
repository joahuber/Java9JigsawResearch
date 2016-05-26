package ch.bbv.moduledemo.main;

import ch.bbv.moduledemo.application.CarWashService;
import ch.bbv.moduledemo.domain.CarWash;
import ch.bbv.moduledemo.infrastructure.BindingModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new BindingModule());

        CarWashService carWashService = injector.getInstance(CarWashService.class);

        carWashService.washACar(new CarWash());
        carWashService.washMoney();
    }
}
