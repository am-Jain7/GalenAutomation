package com.progressbook.test;
import com.galenframework.api.Galen;
import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.HtmlReportBuilder;
import com.galenframework.reports.model.LayoutReport;

import org.junit.After;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginPageTest
{
    private WebDriver driver;

    @Before
    public void setUp()
    {
      
        driver = new ChromeDriver();
//        Set the browser size for desktop   
      driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(1200, 800));
        driver.get("https://demo-ca.progressbook.com/");
    }

    @Test
    public void loginLayoutTest() throws IOException
    {
//        Create a layoutReport object
//        checkLayout function checks the layout and returns a LayoutReport object
        LayoutReport layoutReport = Galen.checkLayout(driver, "specs/LoginPage.gspec", Arrays.asList("desktop"));

        //Create a tests list
        List<GalenTestInfo> tests = new LinkedList<GalenTestInfo>();

        //Create a GalenTestInfo object
        GalenTestInfo test = GalenTestInfo.fromString("Login page layout");

        //Get layoutReport and assign to test object
        test.getReport().layout(layoutReport, "Check login page layout");

        //Add test object to the tests list
        tests.add(test);

        //Create a htmlReportBuilder object
        HtmlReportBuilder htmlReportBuilder = new HtmlReportBuilder();

        //Create a report under /target folder based on tests list
        htmlReportBuilder.build(tests, "target");

//        If layoutReport has errors Assert Fail
        if (layoutReport.errors() > 0)
        {
            Assert.fail("Layout test failed");
        }
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

}


 