package com.example.issue;

import java.io.File;

import org.openqa.selenium.WebDriver;

public class Application {
    private String driverPath;

    public static void main(String[] args) {
        File driverExecutable;

        try {
            driverExecutable = new File(args[0]);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException(
                    "Please pass in the absolute file path of your desired driver executable.");
        }

        if (driverExecutable.exists()) {
            Application app = new Application(args[0]);
            app.run();

        } else {
            throw new Error("Please pass in the absolute file path of your desired driver executable.");
        }

    }

    public Application(String driverPath) {
        this.driverPath = driverPath;

    }

    public void run() {
        WebDriver driver = DriverFactory.getDriver(DriverName.CHROME, driverPath);

        driver.get("https://google.com");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }

}
