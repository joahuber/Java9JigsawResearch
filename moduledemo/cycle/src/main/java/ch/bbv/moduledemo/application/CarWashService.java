package ch.bbv.moduledemo.application;

import ch.bbv.moduledemo.domain.CarWash;
import ch.bbv.moduledemo.domain.CarWashRepository;

import javax.inject.Inject;

public class CarWashService {

    @Inject
    private CarWashRepository carWashRepository;

    public void washACar(CarWash cw) {
        carWashRepository.save(cw);
        System.out.println("Wash the car " + cw);
    }

    public void washMoney() {
        System.out.println("Wash some money.");
    }
}
