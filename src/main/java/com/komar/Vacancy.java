package com.komar;

import java.util.Random;

public enum Vacancy {

    FULL_STACK_DEVELOPER("full-stack разработчик"),
    BACK_END_DEVELOPER("back-end разработчик"),
    FRONT_END_DEVELOPER("front-end разработчик"),
    DESIGNER("Дизайнер"),
    ANALYST("Аналитик"),
    TESTER("Тестировщик");


    private static final Vacancy[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static Vacancy getRandomVacancy() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }


    private final String description;

    Vacancy(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
