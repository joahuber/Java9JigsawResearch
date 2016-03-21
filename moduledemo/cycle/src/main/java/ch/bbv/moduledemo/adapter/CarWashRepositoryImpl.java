package ch.bbv.moduledemo.adapter;

import ch.bbv.moduledemo.domain.CarWash;
import ch.bbv.moduledemo.domain.CarWashRepository;

public class CarWashRepositoryImpl implements CarWashRepository {
    @Override
    public void save(CarWash cw) {
        System.out.println("CarWash stored " + cw);
    }
}
