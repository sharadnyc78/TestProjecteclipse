Feature: Amazon site testing
  

@smoketest
Scenario: Login with correct creds
    Given I am using correct creds
    

@regressiontest
 Scenario: Login with INcorrect creds
    Given I am using INcorrect creds
  
 @smoketest @regressiontest   
Scenario: Search for products
    Given i am searching for products
    
@smoketest     
Scenario: Search for carts
    Given i am searching for carts