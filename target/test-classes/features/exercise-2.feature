
@SuccessfulLogin
Feature: Successful login with username and password
  Background: Validate login with correct credentials

    Scenario: Login into the website with correct username and password
      Given the user go to the website
      When the user enter a valid username and password
      Then the user enter to the website

    Scenario: Add two products to the shop car and checkout
        Given the user select two products
        When the user press the shop car button
        Then the user press checkout button

    Scenario: Complete sales form with user information
      Given the user complete the sales form information
      When the user press continue button and finish button
      Then the user see the successful confirmation message




