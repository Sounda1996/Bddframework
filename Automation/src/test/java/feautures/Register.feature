Feature: Demo cart feature

  Scenario Outline: User Registeration for demo cart application
    Given user is already in registration page
    Then user enters "<Firstname>" and "<Lastname>" and "<Email>" and "<Telephone>"
    Then enters "<Password>" and "<confirmpwd>"
    Then accept policy and click on continue
    Then verify the title and hit on continue button
    Then Logout

    Examples: 
      | Firstname | Lastname | Email                   | Telephone  | Password | confirmpwd |
      | Anupuma   | Rahul    | Anuoopprr2223@gmail.com | 9448744250 | Ab112@11 | Ab112@11   |
