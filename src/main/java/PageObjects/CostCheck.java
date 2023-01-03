package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CostCheck
{
    public WebDriver ldriver;

    public CostCheck(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(new AjaxElementLocatorFactory(ldriver, 30), this);
    }

    By btnStartnNext=By.xpath("//*[@id=\"next-button\"]");
    By rdEngland=By.xpath("//*[@id=\"radio-england\"]");
    By rdScotland=By.xpath("//*[@id=\"radio-scotland\"]");
    By rdWales=By.xpath("//*[@id=\"radio-wales\"]");
    By rdNrIreland=By.xpath("//*[@id=\"radio-nire\"]");
    By btnlink=By.xpath("//*[@id=\"content\"]/div[2]/div/form/details/summary/span");
    By btnlinkTax=By.xpath("//*[@id=\"content\"]/div[2]/div/form/div[2]/details/summary/span");
    By btnlinkTaxCredit=By.xpath("//*[@id=\"content\"]/div[2]/div/form/details/summary/span");
    By rdNo=By.xpath("//*[@id=\"radio-no\"]");
    By rdYes=By.xpath("//*[@id=\"radio-yes\"]");
    By rddentalnotreg=By.xpath("//*[@id=\"radio-not-registered\"]");
    By txtdobDay=By.xpath("//*[@id=\"dob-day\"]");
    By txtdobMonth=By.xpath("//*[@id=\"dob-month\"]");
    By txtdobYear=By.xpath("//*[@id=\"dob-year\"]");
    By rdYesUnicredit=By.xpath("//*[@id=\"yes-universal\"]");
    By rdNotyet=By.xpath("//*[@id=\"not-yet\"]");
    By rdNoDiffBenf=By.xpath("//*[@id=\"different-benefit\"]");
    By chkboxTax=By.xpath("//*[@id=\"taxCredit\"]");
    By chkboxincome=By.xpath("//*[@id=\"incSupport\"]");
    By chkboxesa=By.xpath("//*[@id=\"esa\"]");
    By chkboxjsa=By.xpath("//*[@id=\"jsa\"]");
    By chkboxpension=By.xpath("//*[@id=\"penCredit\"]");
    By chkboxNone=By.xpath("//*[@id=\"continue\"]");
    By rdWrkingChildTax=By.xpath("//*[@id=\"workingChildTaxCredit\"]");
    By rdWrkingDisblity=By.xpath("//*[@id=\"workingDisabilityTaxCredit\"]");
    By rdChildTax=By.xpath("//*[@id=\"childTaxCredit\"]");
    By rdWrkingTax=By.xpath("//*[@id=\"workingTaxCredit\"]");
    By rdIncomeEsa=By.xpath("//*[@id=\"income-esa\"]");
    By rdContbaseEsa=By.xpath("//*[@id=\"contribution-esa\"]");
    By rdIncomeJsa=By.xpath("//*[@id=\"income-jsa\"]");
    By rdContbaseJsa=By.xpath("//*[@id=\"contbasejsa\"]");
    By rdCreditOnly=By.xpath("//*[@id=\"guaranteecreditonly\"]");
    By rdCreditwithSaving=By.xpath("//*[@id=\"guaranteecreditwithsavingcredit\"]");
    By rdSavingCredit=By.xpath("//*[@id=\"savingcredit\"]");

    //Action Methods

    public String getPageTitle()
    {
        Boolean result = ldriver.getTitle().contains("Check what help you could get to pay for NHS costs - NHSBSA");
        String actual = new Boolean(result).toString();
        return actual;
    }
    public void clickonStratnoworNext()
    {
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnStartnNext));
        ldriver.findElement(btnStartnNext).click();
    }
    public void selectCountry(String country)
    {
        if ("England".equals(country))
        {
            ldriver.findElement(rdEngland).click();
        }
        else if ("Scotland".equals(country))
        {
            ldriver.findElement(rdScotland).click();
        }
        else if ("Wales".equals(country))
        {
            ldriver.findElement(rdWales).click();
        }
        else if ("Northern Ireland".equals(country))
        {
            ldriver.findElement(rdNrIreland).click();
        }
        clickonStratnoworNext();
    }

    public void YesorNo(String yesorno)
    {
        if(yesorno.equals("Yes"))
        {
            ldriver.findElement(rdYes).click();
            clickonStratnoworNext();
        }
        else if(yesorno.equals("No"))
        {
            ldriver.findElement(rdNo).click();
            clickonStratnoworNext();
        }
        else
        {
            System.out.print("NA input ");
        }
    }

    public void selectDental(String dentcountry)
    {
        if ("England".equals(dentcountry))
        {
            ldriver.findElement(rdEngland).click();
        }
        else if ("Scotland".equals(dentcountry))
        {
            ldriver.findElement(rdScotland).click();
        }
        else if ("Wales".equals(dentcountry))
        {
            ldriver.findElement(rdWales).click();
        }
        else if ("Northern Ireland".equals(dentcountry))
        {
            ldriver.findElement(rdNrIreland).click();
        }
        else
        {
            ldriver.findElement(rddentalnotreg).click();
        }
        clickonStratnoworNext();
    }
    public void setDob(String dd, String mm, String yyyy)
    {
        ldriver.findElement(btnlink).click();
        ldriver.findElement(txtdobDay).sendKeys(dd);
        ldriver.findElement(txtdobMonth).sendKeys(mm);
        ldriver.findElement(txtdobYear).sendKeys(yyyy);
        clickonStratnoworNext();
    }

    public void universalCredit(String credit)
    {
        if(credit.equals("Yescredit"))
        {
            ldriver.findElement(rdYesUnicredit).click();
        }
        else if(credit.equals("NotYet"))
        {
            ldriver.findElement(rdNotyet).click();
        }
        else if(credit.equals("No"))
        {
            ldriver.findElement(rdNoDiffBenf).click();
        }
        clickonStratnoworNext();
    }

    public void benefits(String benefits)
    {
        if ("Tax Credit".equals(benefits))
        {
            ldriver.findElement(btnlinkTax).click();
            ldriver.findElement(chkboxTax).click();
            clickonStratnoworNext();
        }
        else if ("Income Support".equals(benefits))
        {
            ldriver.findElement(chkboxincome).click();
            clickonStratnoworNext();
        }
        else if ("ESA".equals(benefits))
        {
            ldriver.findElement(chkboxesa).click();
            clickonStratnoworNext();
        }
        else if ("JSA".equals(benefits))
        {
            ldriver.findElement(chkboxjsa).click();
            clickonStratnoworNext();
        }
        else if ("Pension".equals(benefits))
        {
            ldriver.findElement(chkboxpension).click();
            clickonStratnoworNext();
        }
        else if ("None".equals(benefits))
        {
            ldriver.findElement(chkboxNone).click();
            clickonStratnoworNext();
        } else
        {
            System.out.print("NA input ");
        }
    }

    public void taxCredit(String taxcredit)
    {
        if ("WorkingTaxChild".equals(taxcredit))
        {
            ldriver.findElement(btnlinkTaxCredit).click();
            ldriver.findElement(rdWrkingChildTax).click();
            clickonStratnoworNext();
        }
        else if ("WorkingTaxCredit".equals(taxcredit))
        {
            ldriver.findElement(rdWrkingDisblity).click();
            clickonStratnoworNext();
        }
        else if ("ChildTax".equals(taxcredit))
        {
            ldriver.findElement(rdChildTax).click();
            clickonStratnoworNext();
        }
        else if ("WorkingTax".equals(taxcredit))
        {
            ldriver.findElement(rdWrkingTax).click();
            clickonStratnoworNext();
        }
        else
        {
            System.out.print("NA input ");
        }
    }

    public void esa(String esa)
    {
        if(esa.equals("Income"))
        {
            ldriver.findElement(rdIncomeEsa).click();
            ldriver.findElement(btnStartnNext).click();
        }
        else
        {
            ldriver.findElement(rdContbaseEsa).click();
            ldriver.findElement(btnStartnNext).click();
        }
    }

    public void jsa(String jsa)
    {
        if(jsa.equals("Income"))
        {
            ldriver.findElement(rdIncomeJsa).click();
            ldriver.findElement(btnStartnNext).click();
        }
        else
        {
            ldriver.findElement(rdContbaseJsa).click();
            ldriver.findElement(btnStartnNext).click();
        }
    }

    public void pension(String pension)
    {
        if(pension.equals("Granty Credit"))
        {
            ldriver.findElement(rdCreditOnly).click();
            ldriver.findElement(btnStartnNext).click();
        }
        else if(pension.equals("Granty CreditSavings"))
        {
            ldriver.findElement(rdCreditwithSaving).click();
            ldriver.findElement(btnStartnNext).click();
        }
        else
        {
            ldriver.findElement(rdSavingCredit).click();
            ldriver.findElement(btnStartnNext).click();
        }
    }

}

