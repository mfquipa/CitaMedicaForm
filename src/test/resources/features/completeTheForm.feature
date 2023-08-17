Feature: book appointmente

  Scenario:choose the facility, health program, date and view when the appointment is confirmed.
    Given the user is on the katalon cure page and clicks on the make appointment button.
    When the user enters with valid credentials and enters
    And the user chooses the options of the form and will book in the button at the end
    Then The user will see the appointment confirmation message with the summary of the form