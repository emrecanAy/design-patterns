package com.ayemrecan.factory;

/**
 * @author Emrecan
 * @created 05/09/2022 - 17:04
 */
public class PhoneSeller {

    public static void main(String[] args) {
        Phone s8 = PhoneFactory.getPhone("s8", "3200", 5, 9);
        Phone note8 = PhoneFactory.getPhone("note8", "4000", 8, 12);

        System.out.println("S8 Phone Specifications");
        System.out.println(s8);

        System.out.println("Note8 Phone Specifications");
        System.out.println(note8);

    }

}
