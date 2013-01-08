#----------------------------------
# Example of Cucumber .feature file
#----------------------------------

@RunWith 
Feature: Search courses
    In order to ensure better utilization of courses potential students should be able to search for courses
    As a  would like that many many users sign up to this amazing website that i just developed and tested and
    I want that 
    As a great ninja commander,
    I want my ninjas to decide wherther to take on an opponent

    Scenario Outline: This is a title for scenario outline.
        Remember that this section is completely optional and gives you the outline for all following 
        scenarios. 
        Given the user is an asshole	# gfhgfhf

        And mauri e baravop
        Then he should find zero, one or more courses
        


    Scenario: Search by topic
        Given there are 240 <courses> which do not have the topic "biology"
        And there are 2 courses A001, B205 that this each have "biology" as one of the topics
        When I search for "biology"
        But I search for "biology"
        Then I should see the following courses:
            | Course code | Course Description | Avail  |
            | A001        | Antlr guide        | Yes    |
            | B205        | Parsers and Lexers | No     |