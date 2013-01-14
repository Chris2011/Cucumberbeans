#----------------------------------
# Example of Cucumber .feature file
#----------------------------------
    
@RunWith 
Feature: Fight or flight
   In order to increase the ninja survival rate,
   As a ninja commander
   I want my 3 ninjas to decide whether to take on an opponent based on their skill levels

   # A very simple scenario
   Scenario: Simple Chuck
      Given the ninja has a third level black-belt 
      When attacked by "Chuck Norris"
      Then the ninja should apologise 

   # A scenario using the 'But' and 'And'
   Scenario: Angry Chuck
      Given the ninja has a third level black-belt 
      But the ninja has never fought Chuck Norris before 
      When attacked by "Chuck Norris"
      Then the ninja should apologise 
      And the ninja should run away

   # A scenario using sets of attributes
   Scenario: Fully armed 
      Given a ninja with the following experience
         | belt_level | katana | sake | fought | magic |
         | third | two | three | samurai | five |
      When attacked by a samurai
      Then the ninja should engage the opponent

   # A scenario outline using placeholders
   Scenario Outline: third-level ninjas engage samurai
      Given the ninja has a <belt-level> level black-belt  
      When attacked by <opponent>
      Then the ninja should <expected-action> 
      Examples:
         | belt level| opponent    | expected action    |
         | third     | a samurai   | engage the opponent|
         | third     | Chuck Norris| run for his life   |       