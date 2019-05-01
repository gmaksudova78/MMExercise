$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/sample.feature");
formatter.feature({
  "name": "Balance and should be displayed correctly",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "login using provided url and page is loaded",
  "keyword": "Given "
});
formatter.match({
  "location": "SampleSteps.login_using_provided_url_and_page_is_loaded()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Need to verify the right count of values appear on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps.need_to_verify_the_right_count_of_values_appear_on_the_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Need to verify the values on the screen are greater than 0",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Need to verify the total balance is correct based on the values listed on the screen",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Need to verify the values are formatted as currencies",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Need to verify the total balance matches the sum of the values",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps.need_to_verify_the_total_balance_matches_the_sum_of_the_values()"
});
formatter.result({
  "status": "skipped"
});
});