package com.progressbook.test;
import com.galenframework.api.Galen;
import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.HtmlReportBuilder;
import com.galenframework.reports.model.LayoutReport;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GalenHomePageTest
{
    public WebDriver driver;

    @Before
    public void setUp() throws InterruptedException
    {
      
        driver = new ChromeDriver();
        //Set the browser size for desktop
//        driver.manage().window().setSize(new Dimension(1200, 800));
        driver.manage().window().maximize();
        driver.get("https://demo-ca.progressbook.com/");
        driver.findElement(By.id("user")).sendKeys("Master1");
        driver.findElement(By.id("password")).sendKeys("QA@SA6770");
        driver.findElement(By.id("domain")).sendKeys("SAAutomate");
        driver.findElement(By.id("domain")).sendKeys("SAAutomate");
        driver.findElement(By.xpath("//button[@stateful-button='isLocalLogin']")).click();
        Thread.sleep(5000);
    }

    @Test
    public void progressbookHomePageLayoutTest() throws IOException
    {
        //Create a layoutReport object
        //checkLayout function checks the layout and returns a LayoutReport object
        LayoutReport layoutReport = Galen.checkLayout(driver, "specs/GalenHomePage.gspec", Arrays.asList("desktop"));

        //Create a tests list
        List<GalenTestInfo> tests = new LinkedList<GalenTestInfo>();

        //Create a GalenTestInfo object
        GalenTestInfo test = GalenTestInfo.fromString("Homepage layout");

        //Get layoutReport and assign to test object
        test.getReport().layout(layoutReport, "Check homepage layout");

        //Add test object to the tests list
        tests.add(test);

        //Create a htmlReportBuilder object
        HtmlReportBuilder htmlReportBuilder = new HtmlReportBuilder();

        //Create a report under /target folder based on tests list
        htmlReportBuilder.build(tests, "target");

//        If layoutReport has errors Assert Fail
        if (layoutReport.errors() > 0)
        {
            Assert.fail("Homepage layout test failed");
        }
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

}