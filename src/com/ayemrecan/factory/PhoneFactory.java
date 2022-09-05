package com.ayemrecan.factory;

/**
 * @author Emrecan
 * @created 05/09/2022 - 17:00
 */
public class PhoneFactory {

    public static Phone getPhone(String model, String battery, int width, int height) {

        Phone phone;
        if("s8".equalsIgnoreCase(model)){
            phone = new S8(model, battery, width, height);
        } else if("note8".equalsIgnoreCase(model)) {
            phone = new Note8(model, battery, width, height);
        } else {
            throw new RuntimeException("Please enter a valid model!");
        }

        return phone;
    }

}
