package ru.itpark.service;

public class InicialService {
    public String initials(String name) {
        String[] names = name.split(" ");
        String result = "";
        for (int i = 0; i < names.length; i++) {


            if (i == 0 || i == names.length - 1) {


                result = result + names[i].substring(0, 1);


                if (i != names.length - 1) {
                    result = result + " ";
                }
            }


        }
        return result.toUpperCase();
    }


}
