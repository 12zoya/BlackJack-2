package com.company;

/**
 * Created by student2 on 14.11.16.
 */
public class Computer extends Player {
    String[] names = {"Катя", "Диана", "Коля", "Семен", "Саша",};
    public Computer(Intellect intellect) {
        super("", intellect);
        //2: выбрать случайное имя
        double a = Math.random();
        int p =(int)(a*names.length);
        //3: присвоить его этому компьютеру
        name=names[p];

    }
}
