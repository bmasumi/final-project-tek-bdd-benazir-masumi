Feature: This is the home page validation

  Scenario: Validate When user navigate to home page title is TEK Insurance UI
  and create Primary Account Button is exist

    Given user has loaded "chrome" browser
    When user navigates to home page
    Then the title is TEK Insurance UI
    And the create Primary Account button exists
