package ch.bbv.moduledemo.domain;

import ch.bbv.moduledemo.domain.menu.Menu;

public class CarWashOperator {

    public void executeOp(int id) {
        Menu m = new Menu();
        m.showOptions().get(id);
    }
}
