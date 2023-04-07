package com.MF;

import com.MF.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToBrowserType implements Converter<BrowserType> {


    @Override
    public BrowserType convert(Method method, String browserName) {
        return BrowserType.valueOf(browserName.toUpperCase()) ;
    }
}
