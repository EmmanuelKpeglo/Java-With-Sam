package com.company;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Register {

    List<Nameable> nameables = new ArrayList<>();

    public Register(List<Nameable> nameables) {
        this.nameables = nameables;
    }

    public List<String> getRegister() {
        return nameables.stream().map(Nameable::getName).collect(Collectors.toList());
    }
}
