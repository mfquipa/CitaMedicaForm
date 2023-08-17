package com.katalon.demo.utils;

import java.util.concurrent.ThreadLocalRandom;

public class Random {

    public static class IndexRandom {
        public static int numeroAleatorioEnRango(int minimo, int maximo) {

            return ThreadLocalRandom.current().nextInt(minimo, maximo);
        }
    }
}
