package gov.ae.Tests;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import gov.ae.Cases.Abilitytomaxandminthefontsize;
import gov.ae.Cases.NavigateToServiceIn3Clicks;
import gov.ae.Cases.UserCanLoginViaNationalID;
import gov.ae.ExtentListeners.ExtentManager;
import gov.ae.base.TestBase;
import gov.ae.utils.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;


public class UserExperienceTestCases extends TestBase {



    ExtentReports report;
    ExtentTest test;

    @Test(priority = 1 , enabled = false)
    public void validate_three_clicks_navigation() {
        test = report.createTest("Validate user can navigate to service page by 3 clicks");
        ExtentManager.setExtentTest(test);
        NavigateToServiceIn3Clicks userCases = new NavigateToServiceIn3Clicks(DriverManager.getDriver());
        int count = userCases.validate_three_clicks_navigation();
        Assert.assertTrue(count == 3);
    }

    @Test(priority = 2,enabled = false)
    public void validate_national_identity_option() {
        test = report.createTest("Validate user can access services via national ID");
        ExtentManager.setExtentTest(test);
        UserCanLoginViaNationalID userCases = new UserCanLoginViaNationalID(DriverManager.getDriver());
        boolean valid = userCases.validate_national_identity_option();
        Assert.assertTrue(valid);

    }
    @Test(priority = 3)
    public void Ability_to_max_and_min_the_font_size() {
        report = ExtentManager.getExtentReports();

        test = report.createTest("Validate user can access services via national ID");
        ExtentManager.setExtentTest(test);
        Abilitytomaxandminthefontsize userCases = new Abilitytomaxandminthefontsize(DriverManager.getDriver());
         userCases.Ability_to_max_and_min_the_font_size();

    }


}
