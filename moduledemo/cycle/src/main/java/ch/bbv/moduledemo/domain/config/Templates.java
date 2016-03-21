package ch.bbv.moduledemo.domain.config;

import ch.bbv.moduledemo.domain.CarWash;

public enum Templates {
    SIMPLE {
        public CarWash create() {
            return new CarWash();
        }
    }, FULL {
        public CarWash create() {
            return new CarWash();
        }
    };

    public abstract CarWash create();
}
