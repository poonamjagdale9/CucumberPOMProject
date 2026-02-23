Feature Login page feature

  Scenario: Login page title
    Given User is on login page
    When User gets the title of the page
    Then Page title should be "Account Login"

    Scenario: Forgot Password link
      Given User is on login page
      Then Forgtten Password link should be displayed

      Scenario: Login with correct credentials
        Given User is on login page
        When User enters the user name "Radha@gmail.com"
        And user enters the correct password"@Selenium123"
        And user clicks on login button
        Then user gets the title of the page
        And Page title should be "My Account"





