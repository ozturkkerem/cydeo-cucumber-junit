Feature: TC#4: SmartBear order process

  @smartBear
  Scenario:User order a product
    When :User is logged into SmartBear Tester account and on Order page
    And  :User selects "FamilyAlbum" from product dropdown
    And  User enters "4" to quantity
    And :User enters "John Wick" to costumer name
    And :User enters "Kinzie Ave" to street
    And :User enters "Chicago" to city
    And :User enters "IL" to state
    And :User enters "60056" zipcode
    And :User selects "Visa" as card type
    And :User enters "1111222233334444" to card number
    And :User enters "12/22" to expiration date
    And :User clicks process button
    Then :verifies "John Wick" is in the list


  @smartBearOutline
  Scenario Outline:User order a product
    When :User is logged into SmartBear Tester account and on Order page
    And  :User selects "<product>" from product dropdown
    And  User enters "<quantity>" to quantity
    And :User enters "<customer name>" to costumer name
    And :User enters "<street>" to street
    And :User enters "<city>" to city
    And :User enters "<state>" to state
    And :User enters "<zipcode>" zipcode
    And :User selects "<cardType>" as card type
    And :User enters "<cardno>" to card number
    And :User enters "<expDate>" to expiration date
    And :User clicks process button
    Then :verifies "<expectedName>" is in the list

    Examples: search values
      | product      | quantity | customer name | street    | city     | state | zipcode | cardType         | cardno       | expDate | expectedName |
      | FamilyAlbum | 5        | Fara          | hux       | NY       | NY    | 10471   | Visa             | 555664268456 | 03/26   | Fara         |
      | MyMoney      | 1        | Ken Adams     | Kinzie st | Chicago  | IL    | 60004   | Visa             | 313313133315 | 12/22   | Ken Adams    |
      | ScreenSaver  | 5        | Magda         | Red st    | Bluffton | SC    | 41233   | Visa             | 555313133315 | 09/22   | Magda        |
      | ScreenSaver  | 5        | John Smith    | Red st    | Bluffton | SC    | 41233   | American Express | 555313133315 | 09/22   | John Smith   |
      | MyMoney      | 10       | Sophie Lex    | Brown st  | Boston   | MA    | 54622   | Visa             | 667313133315 | 03/22   | Sophie Lex   |

















