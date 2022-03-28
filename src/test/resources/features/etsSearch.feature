@ets
Feature: Etsy Search Verification

  @tc51
  Scenario:Etsy Title Verification
    When user is on www.etsy.com
    Then User sees title is as expected

  @tc52
  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    When user is on www.etsy.com
    And User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title

  @tc53
  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    When user is on "https://www.etsy.com"
    And User types "Wooden Spoon" in the search box
    And User clicks search button
    Then User sees "Wooden Spoon" is in the title