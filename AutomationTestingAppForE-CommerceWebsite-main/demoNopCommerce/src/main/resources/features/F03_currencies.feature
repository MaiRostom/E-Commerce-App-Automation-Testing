@smoke
  Feature: usingCurrencies
    Scenario: Logged User could switch between currencies
      Given user navigate to home page
    #Login again if not Logged yet
      Given user navigate to home page
      And user click on log in
      And user fill his or her email "ahmedgamal12@gmail.com"
      And user fill his or her password "P@ssw0rd"
      And user click on log in button
      Then user should login successfully and see log out appears at the top right
    #Start of steps
      Given user change current currency to EURO
      Then user should found all products prices in EURO
      Given user change current currency to US Dollar
      Then user should found all products prices in US Dollar

