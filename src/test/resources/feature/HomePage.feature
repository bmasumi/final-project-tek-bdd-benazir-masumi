Feature: This is the home page validation

  Scenario: Validate When user navigate to home page title is TEK Insurance UI
  and create Primary Account Button is exist

    Given Navigate to home page
    When the home page is loaded
    Then the title is TEK Insurance UI
    And the create Primary Account button exists
