Feature: Todolist
  In order to manage my tasks easily.
  As a result, I don't forget any task and get higher salary.

  Scenario: Puts a task and delete a task
    Given Set a database
    When I go to the home page
    Then I should see "0 task"
    Then Take screenshot
    When I fill in "label" with "Sleep after lunch"
    And  I push "create"
    Then I should see "1 task"
    Then Take screenshot
    And I am in the home page
    And  I should see "Sleep after lunch"
    When I push "delete"
    Then I should see "0 task"
    And I should not see "Sleep after lunch"
    Then Take screenshot
