#----------------------------------
# Example of Cucumber .feature file
#----------------------------------
    
#The '@RunWith' annotation demonstrates a tag to be utilized by Cucumber
@RunWith 
Feature: Fight or flight

   # A very simple scenario
   Scenario: Simple Chuck
      Given the ninja has a third level black-belt 
      When attacked by "Chuck Norris"
      Then the ninja should apologise 

Scenario Outline: Blenders
   Given I put <thing> in a blender,
    when I switch the blender on
    then it should transform into <other thing>

 Examples: Amphibians
   | thing         | other thing |
   | Red Tree Frog | mush        |

 Examples: Consumer Electronics
   | thing         | other thing |
   | iPhone        | toxic waste |
   | Galaxy Nexus  | toxic waste |

@Tags
Scenario Outline:
    Given   <belt-level>
    When    <opponent>
    Then    <expected-action>
    Examples:
        | belt level | opponent | expected action   |
        | belt level | opponent | expected action   |
        | belt level | opponent | expected action   |
    