package com.ayemrecan.abstractFactory;

/**
 * @author Emrecan
 * @created 05/09/2022 - 18:25
 */
public class S8Factory implements PhoneFactory{

    @Override
    public Phone getPhone(String model, String battery, int width, int height) {
        return new S8(model, battery, width, height);
    }
}
