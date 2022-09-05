package com.ayemrecan.abstractFactory;

/**
 * @author Emrecan
 * @created 05/09/2022 - 18:24
 */
public interface PhoneFactory {

    Phone getPhone(String model, String battery, int width, int height);

}
