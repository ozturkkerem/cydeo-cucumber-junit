@wiki
Feature:Wikipedia Search Functionality


  Scenario: Search page title verification
    When :User is on Wikipedia home page
    And :User types "Steve Jobs" in the wiki search box
    And :User clicks wiki search button
    Then :User sees "Steve Jobs" is in the wiki title


  Scenario: Search page Header Verification
    When :User is on Wikipedia home page
    And :User types "Steve Jobs" in the wiki search box
    And :User clicks wiki search button
    Then :User sees "Steve Jobs" is in the main header


  Scenario Outline: Search page title verification
    When :User is on Wikipedia home page
    And :User types "<searchValue>" in the wiki search box
    And :User clicks wiki search button
    Then :User sees "<expectedTitle>" is in the wiki title
    Then :User sees "<expectedMainHeader>" is in the main header

    Examples: search values we are going to be using in this scenario is as below
      | searchValue       | expectedTitle     | expectedMainHeader |
      | Steve Jobs        | Steve Jobs        | Steve Jobs         |
      | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo  |
      | Bob Marley        | Bob Marley        | Bob Marley         |
      | Chuck Norris      | Chuck Norris      | Chuck Norris       |
      | Antony Hopkins    | Antony Hopkins    | Antony Hopkins     |
      | Marie Curie       | Marie Curie       | Marie Curie        |
      | Lady Gaga         | Lady Gaga         | Lady Gaga          |
      | Kate Winslet      | Kate Winslet      | Kate Winslet       |





















#    Scenario: Search page Image Header Verification
 #     When :User is on Wikipedia home page
  #    And :User types "Steve Jobs" in the wiki search box
   #   And :User clicks wiki search button
    #  Then :User sees "Steve Jobs" is in the image header

