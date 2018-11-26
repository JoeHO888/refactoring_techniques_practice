package com.tws.refactoring.extract_variable;

public class BannerRender {
    void renderBanner(String platform, String browser) {

        String platformInUpperCase = platform.toUpperCase();
        String browserInUpperCase = browser.toUpperCase();

        boolean platformIsMAC = platformInUpperCase.contains("MAC");
        boolean browserIsIE = browserInUpperCase.contains("IE");


        if(platformIsMAC&&browserIsIE) {
                System.out.println(platform + ": " + browser);
        }

    }
}
