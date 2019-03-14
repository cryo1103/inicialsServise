package ru.itpark.service;

public class InicialService {
    public String initials(String name) {
        String[] parts = name.split(" ");
        return parts[0].substring(0, 1) + parts[1].substring(0, 1);

    }
}
