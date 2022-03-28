Feature: user should be able to login using correct credentials

  Background: user is on the login page
    Given user is on the login page of web table app


  Scenario: Positive login scenario
    When user enter username "Test"
    And  user enter password "Tester"
    And user click to login button
    Then user should see url contains orders



  Scenario: Positive login scenario
    When user enter username "Test" password "Tester" and logins
    Then user should see url contains orders


  Scenario: User should be able to see all 12 months in months dropdown

    When User enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then user should see url contains orders