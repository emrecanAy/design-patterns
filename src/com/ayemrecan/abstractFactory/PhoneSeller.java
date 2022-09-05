package com.ayemrecan.abstractFactory;

/**
 * @author Emrecan
 * @created 05/09/2022 - 18:27
 */
public class PhoneSeller {

    public static void main(String[] args) {

        S8Factory s8Factory = new S8Factory();
        Phone s8 = s8Factory.getPhone("s8", "3600mah", 5, 9);

        Note8Factory note8Factory = new Note8Factory();
        Phone note8 = note8Factory.getPhone("note8", "4200mah", 8, 12);

        System.out.println(s8);
        System.out.println(note8);

    }

}
