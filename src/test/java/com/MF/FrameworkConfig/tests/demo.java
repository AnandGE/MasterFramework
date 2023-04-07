package com.MF.FrameworkConfig.tests;

import com.MF.Converters.Frameworkconfig;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;

public class demo {

    @Test
    public void testlogin(){

        Frameworkconfig config = ConfigFactory.create(Frameworkconfig.class);
         System.out.println(config.browser());

       /* WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.co.in");
        driver.quit();
*/
    }
}
