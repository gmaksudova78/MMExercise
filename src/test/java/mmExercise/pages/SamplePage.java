package mmExercise.pages;

import mmExercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SamplePage {
    public SamplePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="lbl_val_1")
    public WebElement val1;

    @FindBy(id = "lbl_val_2")
    public WebElement val2;


    @FindBy(id="lbl_val_3")
    public WebElement val3;

    @FindBy(id = "lbl_val_4")
    public WebElement val4;

    @FindBy(id="lbl_val_5")
    public WebElement val5;

    @FindBy(id = "lbl_ttl_va")
    public WebElement totalVal;

    @FindBy(id="txt_val_1")
    public WebElement txt1;

    @FindBy(id = "txt_val_2")
    public WebElement txt2;


    @FindBy(id="txt_val_4")
    public WebElement txt3;

    @FindBy(id = "txt_val_5")
    public WebElement txt4;

    @FindBy(id="txt_val_6")
    public WebElement txt5;

    @FindBy(id = "txt_ttl_val")
    public WebElement totalTxtValue;




}
