@smoke
Feature: F01_Register  users could register with new accounts

  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type "male"
    And user entering "automation" fisrtName
    And user entering "tester" lastName
    And user selecting day of birth 8
    And user selecting month 3
    And user selecting year 1999
    And user entering "ahmedgamal12@gmail.com" his email
    And user entering "Visa" his company
    And user entering "P@ssw0rd" his password
    And user ReEntering "P@ssw0rd" his Confirmation password
    Then user click on Register Button
    Then user should see "Your registration completed" message
#    And user should login successfully and see log out appears at the top right
#    Then user click on log out button
    And user should see color of text green


