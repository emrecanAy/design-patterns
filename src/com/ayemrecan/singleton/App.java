package com.ayemrecan.singleton;

/**
 * @author Emrecan
 * @created 05/09/2022 - 03:58
 */
public class App {

    public static void main(String[] args) {

        for(int i = 0; i<10; i++){
            Singleton singleton = Singleton.getSingleton();
        }

    }

}
