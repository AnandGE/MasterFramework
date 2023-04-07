package com.MF.Converters;

import com.MF.StringToBrowserType;
import com.MF.enums.BrowserType;
import org.aeonbits.owner.Config;

@Config.Sources({
        "system:properties",
        "system:env",
        "file:Users/anandedulakanti/automation/MasterFramework/src/test/resources/config.properties"
})

public interface Frameworkconfig extends Config {


    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserType.class)
    BrowserType browser();




}
