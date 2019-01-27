package com.e2e.step.definition;

import com.e2e.config.WebConfigProps;
import com.e2e.config.WebDriverConfig;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {WebDriverConfig.class})
public class MyStepDef {

  @Autowired
  private WebConfigProps webConfigProps;

  @When("^I navigate to Amazon$")
  public void i_navigate_to_Amazon() {
    System.out.println("cool...");
  }
}
