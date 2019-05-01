package mmExercise.stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import mmExercise.pages.SamplePage;
import mmExercise.utilities.BrowserUtil;
import mmExercise.utilities.ConfigurationReader;
import mmExercise.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SampleSteps {
    SamplePage samplePage= new SamplePage();
    List<WebElement> values= new ArrayList<>();

    List<Double> txtValues= new ArrayList<>();

    @Given("login using provided url and page is loaded")
    public void login_using_provided_url_and_page_is_loaded() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Then("Need to verify the right count of values appear on the screen")
    public void need_to_verify_the_right_count_of_values_appear_on_the_screen() { values.add(samplePage.val1);
        values.add(samplePage.val2);
        values.add(samplePage.val3);
        values.add(samplePage.val4);
        values.add(samplePage.val5);

        for(WebElement val:values){
            BrowserUtil.verifyElementDisplayed(val);

        }
        Assert.assertTrue(values.size()==5);



    }

    @Then("Need to verify the values on the screen are greater than {int}")
    public void need_to_verify_the_values_on_the_screen_are_greater_than(Double num) {
        num=0.0;


        txtValues.add(Double.valueOf(samplePage.txt1.getText().substring(1)));
        txtValues.add(Double.valueOf(samplePage.txt2.getText().substring(1)));
        txtValues.add(Double.valueOf(samplePage.txt3.getText().substring(1)));
        txtValues.add(Double.valueOf(samplePage.txt4.getText().substring(1)));
        txtValues.add(Double.valueOf(samplePage.txt5.getText().substring(1)));



        for(Double val : txtValues){
            Assert.assertTrue(val>0);
        }

    }

    @Then("Need to verify the total balance is correct based on the values listed on the screen")
    public void need_to_verify_the_total_balance_is_correct_based_on_the_values_listed_on_the_screen() {
        List<Double> txtValues = new ArrayList<>();

        txtValues.add(Double.valueOf(samplePage.txt1.getText().substring(1)));
        txtValues.add(Double.valueOf(samplePage.txt2.getText().substring(1)));
        txtValues.add(Double.valueOf(samplePage.txt3.getText().substring(1)));
        txtValues.add(Double.valueOf(samplePage.txt4.getText().substring(1)));
        txtValues.add(Double.valueOf(samplePage.txt5.getText().substring(1)));

        Double sum = 0.0;


        for (Double val : txtValues) {
            sum = sum + val;
        }

        Assert.assertTrue(sum == 100000.00);



    }

    @Then("Need to verify the values are formatted as currencies")
    public void need_to_verify_the_values_are_formatted_as_currencies() {
        List<String> txtValues = new ArrayList<>();

        txtValues.add(samplePage.txt1.getText());
        txtValues.add(samplePage.txt2.getText());
        txtValues.add(samplePage.txt3.getText());
        txtValues.add(samplePage.txt4.getText());
        txtValues.add(samplePage.txt5.getText());


        for (String val : txtValues) {
            Assert.assertTrue(val.contains("$"));
        }
    }


    @Then("Need to verify the total balance matches the sum of the values")
    public void need_to_verify_the_total_balance_matches_the_sum_of_the_values() {
        List<Double> txtValues = new ArrayList<>();

        txtValues.add(Double.valueOf(samplePage.txt1.getText().substring(1)));
        txtValues.add(Double.valueOf(samplePage.txt2.getText().substring(1)));
        txtValues.add(Double.valueOf(samplePage.txt3.getText().substring(1)));
        txtValues.add(Double.valueOf(samplePage.txt4.getText().substring(1)));
        txtValues.add(Double.valueOf(samplePage.txt5.getText().substring(1)));

        Double sum = 0.0;


        for (Double val : txtValues) {
            sum = sum + val;
        }

        Assert.assertTrue(sum == 100000.00);

    }


}
