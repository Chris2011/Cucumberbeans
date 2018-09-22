#----------------------------------
# Example of Cucumber .feature file
#----------------------------------
    
@RunWith 
Feature: Fight or flight

   # A very simple scenario
   Scenario: Simple Chuck
      Given the ninja has a third level black-belt 
      When attacked by "Chuck Norris"
      Then the ninja should apologise 
   