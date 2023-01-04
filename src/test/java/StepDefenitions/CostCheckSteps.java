package StepDefenitions;

import PageObjects.CostCheck;
import Utilities.TestContext;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class CostCheckSteps
{
    TestContext testContext;
    CostCheck cc;
    public CostCheckSteps(TestContext context) {
        testContext = context;
        cc = testContext.getPageObjectManager().getCostCheck();
    }

    @When("I click on Start Now")
    public void clickOnStartNow()
    {
        cc.clickonStratnoworNext();
    }

    @Then("I should get navigated to select country page and validate the page")
    public void pageTitleShouldBe()
    {
        Assert.assertEquals("true",cc.getPageTitle());
    }

    @Given ("^I select \"(.*)\"$")
    public void iSelectCountry(String country)
    {
        cc.selectCountry(country);
    }

    @When("^I put my circumstances into the Checker tool \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void userPutCircumstances(String isgp, String dental, String date, String month, String year, String partner, String tax, String universalcredit, String usecredit, String creditperiod, String benefits, String taxcredit, String income, String pregnant, String injury, String diabetics, String glaucoma, String carehome, String savings)
    {
        cc.YesorNo(isgp);
        cc.selectDental(dental);
        cc.setDob(date,month,year);
        cc.YesorNo(partner);
        cc.YesorNo(tax);
        cc.universalCredit(universalcredit);
        cc.YesorNo(usecredit);
        cc.YesorNo(creditperiod);
        cc.benefits(benefits);
        cc.taxCredit(taxcredit);
        cc.YesorNo(income);
        cc.YesorNo(pregnant);
        cc.YesorNo(injury);
        cc.YesorNo(diabetics);
        cc.YesorNo(glaucoma);
        cc.YesorNo(carehome);
        cc.YesorNo(savings);
    }

    @Then("I should get a result of whether I will get help or not")
    public void userShouldGetResult() {
        Assert.assertEquals("true",cc.getPageTitle());
    }
    @When("^I put circumstance country as \"(.*)\"$")
    public void userPutCircumstancesforNorthernIreland(String country)
    {
        cc.selectCountry(country);
    }
    @Then("I should get cannot use this service because you live in Northern Ireland")
    public void userShouldGetResultforNorthernIreland() {
        Assert.assertEquals("true",cc.getPageTitle());
    }
}
