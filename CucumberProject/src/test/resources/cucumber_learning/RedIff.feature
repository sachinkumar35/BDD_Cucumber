@Rediff
Feature: Validating RediffLoginLogout
  I want to validate the login and logout of Rediff

  @Login
  Scenario: This is Login scenario of Rediff
    Given I open a Chorme Browser
    And I enter the url of Rediff in the address bar
    Then I click on the signin link
    And I enter the RediffMail page
    And I enter correct username and password
    Then I click on the SignIn button
    And I check if I am in he Inbox page of RediffMail

  @Logout
  Scenario: This is Logout scenario of Rediff
    Given I am inside the Inbox page
    And I validate the persence of the Logout link
    When I click on the Logout link
    Then I am logged out of RediffMail
    And I can validate the presence of RediffHome link
