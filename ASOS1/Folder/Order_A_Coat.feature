Feature: Order A Coat #Overall Functioanlity-Pascal Casing

  Scenario: A user sucessfully orders a coat
    Given user Is On The Home Page Of ASOS
    When user Is On The Home Page Click The Men Tab #Action
    And user IS Now On The Men Page Scrolls Down and Click The Fresh Coats#Addition Action
    And user IS Now On The Fresh Coats Page Click On The Category Dropdown Performs ScrollDown and Click Suits&Tailoring
    And user Is Now On The Suits&Tailoring Page Selects The Desire Product
    Then user Is Now On The Add To Bag Page Selects The Size From Dropdown and Click On Add To Bag Sucessfully#Positive Outcome

