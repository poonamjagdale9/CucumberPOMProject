Feature: Login Functionality for OpenCart E-commerce website

  As a user of the Opencart website
  I want to be able to login in with my account
  So that I can access my account-related features and manage my orders

  Background: I am on the Opencart login page

    Scenario: Successful login with valid credentials
      Given I have entered a valid username and password
      When I click the login button
      Then I should be logged in successfully

      Scenario Outline: Unsuccessful login with invalid credentials or empty fields
        Given I have entered invalid "<username>" and "<password>"
        When I click on the login button
        Then I should see an error message indicating "<error_message>"

        Examples:
          | username          | password        | error_message       |
          | invalid@gmail.com | invalidpassword | Invalid credentials |
          | abccc             | Valid password  | Invalid credentials |

        Scenario: Navigating to the forgotten password page
          Given I was on the login page
          When I click on the "Forgot password" button
          Then I was redirected to the reset password page

