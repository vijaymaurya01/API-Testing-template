@TESTAPIs
Feature: Sample feature file
#TestAPI

  @projectname @CreateUser @User
  Scenario: Validate the feature with the given scenario
    Given  I generate payload details from the backend
    When I request to create an user at testproject on "/create_user"
    Then I receive a successful response
    And the response status code is 200
    And I should get success message "user created successfully" in the response


  @projectname @GetUser @User
  Scenario: Retrieve and validate details of the created User from testproject
    Given I have the User details used for User creation
    When I request to get the account details from testproject on "/users"
    Then I receive a successful response
    And the response status code is 200
    And I validate the response details with the following account fields
      | UserName         |
      | Name             |
      | Phone            |

