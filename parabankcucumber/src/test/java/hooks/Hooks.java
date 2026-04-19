package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ExtentManager;
import utils.ScreenshotUtil;
import io.cucumber.java.After;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import factory.DriverFactory;

public class Hooks {
	 public static ExtentReports extent = ExtentManager.getInstance();
	    public static ExtentTest test;

    @Before
    public void setup(Scenario scenario) {
    	
    	
    	
        DriverFactory.setup();
        
        test = extent.createTest(scenario.getName());
        test.info("Scenario Started: " + scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario) {
    	
    	if (scenario.isFailed()) {

            String path = ScreenshotUtil.takeScreenshot(scenario.getName());

            try {
                scenario.attach(
                        java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(path)),
                        "image/png",
                        scenario.getName()
                );
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //DriverFactory.tearDown();
        
        extent.flush();
    }
}