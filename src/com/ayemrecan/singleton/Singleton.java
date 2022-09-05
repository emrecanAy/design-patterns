package com.ayemrecan.singleton;

/**
 * @author Emrecan
 * @created 05/09/2022 - 03:58
 */
public class Singleton {

    private static Singleton singleton = null;

    private static int count = 0;

    private Singleton(){
        System.out.println("I'm exist!");
    }

    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (Singleton.class){
                singleton = new Singleton();
            }

        }
        count++;
        System.out.println(count);
        return singleton;
    }

}
