package ch.bbv.moduledemo.domain.menu;

import ch.bbv.moduledemo.domain.config.Templates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Menu {
    public List<String> showOptions() {
        return Arrays.stream(Templates.values()).map(Templates::name).collect(Collectors.toList());
        //Templates.values();
        //return null;
    }
}
