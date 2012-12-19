/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.completion;

/**
 *
 * @author SessonaD
 */
public enum GerkinCompletionNames {
    
    //blocks
    FEATURE ("feature", 
            "Feature: ",
            "<span style=\"color: blue\"> Each feature file starts with the <b>Feature</b> keyword, followed by a colon  and the feature name.</span><br/><br/>The feature name helps a reader understand what the file contains. A good technique for deciding on a title is to think about what you would type to Google to search for this file if it were online. <br/><br/>Example: <br/><br/><span style=\"color: gray;font-style: italic\"> <b><span style=\"color: blue\">Feature:</span>Fight or flight</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">As a</span> great ninja commander,<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">In order</span> to increase the ninja survival rate,<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">I want</span> my ninjas to decide whether to take on an opponent.</span><br/><br/>            In this example the title of the feature is \"Fight or flight\" and all the remaining text is called narrative, used to describe the feature.",
            "block",
            1),
    SCENOUT ("scenario outline:",
            "Scenario Outline: ",
            "<span style=\"color: blue\"> <b>Scenario outlines</b> are essentially template scenarios, allowing us to provide the scenario structure once and then illustrate the behaviour with different combinations of parameters.</span><br/><br/>Scenario outlines are a great way to consolidate and simplify related scenarios and present them in a way that is easier to understand. <br/><br/>Example: <br/><br/><span style=\"color: gray;font-style: italic\"> <b><span style=\"color: blue\">Scenario Outline:</span> third-level ninjas engage samurai</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Given</span> the ninja has a <span style=\"color: purple\">&lt;belt level&gt;</span> level black-belt,<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">When</span> attacked by <span style=\"color: purple\">&lt;opponent&gt;</span>,<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Then</span> the ninja should <span style=\"color: purple\">&lt;expected action&gt;</span>.<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Example: </span><br/><span style=\"color: purple\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|belt level |opponent |expected action |<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|third |a samurai |engage the opponent |<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|third |Chuck Norris |run for his life |<br/></span></span><br/><ul><li>The steps have placeholders enclosed into less-than and greater-than (< and >).</li><li>There is a new block after the steps, starting with a line that contains the Examples keyword and a colon.</li><li>A table in the normal wiki format (pipes separate cells, one row per line) defines the examples and expected outcomes. The first row of the table contains placeholder names.</li></ul>What\'s nice about this format is that we can easily add more examples. To make the specification stronger, let\'s add another example that shows that second level ninjas don\'t even fight against samurai. We add just one line to the table: |second |a samurai |run for his life | The result is easier to read and understand than if we added another four-line scenario. With more complex scenarios, the result is even better.",
            "block",
            2),
    SCENARIO("scenario:",
            "Scenario: ",
            "<span style=\"color: blue\"> One or more scenarios follow the narrative paragraph, each starting with the <b>Scenario</b> keyword, followed by a colon and a scenario title on the first line.</span><br/><br/>A scenario title provides a reader with the context required to understand the key example described by the scenario. A good strategy to use when deciding on a scenario title is to try to summarise the intent of an example covered by the scenario to another person, and capture the phrase you used to explain it. <br/><br/>Example: <br/><br/><span style=\"color: gray;font-style: italic\"> <b><span style=\"color: blue\">Scenario:</span>Weaker opponent</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Given</span> the ninja has a third level black-belt,<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">When</span> attacked by a samurai,<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Then</span> the ninja should engage the opponent.</span><br/><br/>In this example the title of the scenario is \"Weaker opponent\" and all the remaining lines are the step definition (at least one is required).",
            "block",
            3),
    //steps
    GIVEN   ("given",
            "Given ",
            "<span style=\"color: blue\">A <b>Given</b> step defines the preconditions for a scenario. Technically, the step definition that automates it should put the system into a known state for an automated test.</span><br/><br/>Given steps should describe the state of the world before an interesting action.Avoid writing them as actions, but instead explain the state. For example, it is much better to write:<br/><br/><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Given</span> a ninja is in the room <br/></span><br/>than writing:<br/><br/><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Given</span> a ninja enters a room <br/></span><br/>Although there is no syntax check to prevent misuse, the steps in a scenario should follow the  <b>Given-When-Then flow</b>, which means that the entire context comes first, then an action, and then the expected outcome of the action. Structuring scenarios like this ensures that they are focused and makes them easier to understand.",
            "step",
            4),
    WHEN   ("when",
            "When ",
            "<span style=\"color: blue\">A <b>When</b> step describes the primary action of a scenario. Some good examples of the primary action are:</span><ul><li>An activity of a user</li><li>A domain event</li><li>A system function</li></ul>Try to write When steps as actions, something that happens:<br/><br/><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">When</span> a ninja enters a room <br/></span><br/>Although there is no syntax check to prevent misuse, the steps in a scenario should follow the  <b>Given-When-Then flow</b>, which means that the entire context comes first, then an action, and then the expected outcome of the action. Structuring scenarios like this ensures that they are focused and makes them easier to understand.",
            "step",
            5),
    AND     ("and",
            "And ",
            "<span style=\"color: blue\">Steps can also start with keywords <b>And</b> and <b>But</b>.</span><br/><br/>They continue the current section and allow us to use multiple steps to set up the context or validate several outcomes. Using these keywords can improve readability. For example, the following scenario uses two validations:<br/><br/><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Given</span> the ninja has a third level black-belt <br/></span><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Given</span> the ninja has never fought Chuck Norris before <br/></span><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">When</span> attacked by Chuck Norris <br/></span><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Then</span> the ninja should apologise <br/></span><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Then</span> the ninja should run away <br/></span><br/>It reads better when it is written in the following way:<br/><br/><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Given</span> the ninja has a third level black-belt <br/></span><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\"><b>But</b></span> the ninja has never fought Chuck Norris before <br/></span><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">When</span> attacked by Chuck Norris <br/></span><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Then</span> the ninja should apologise <br/></span><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\"><b>And</b></span> the ninja should run away <br/></span><br/><br/>Technically, it isn\'t really important whether a step starts with Given, And or But(or  Then and  When, actually). Cucumber will match the step using a regular expression and execute it. Using And and But makes it easier to read the specification.",
            "step",
            6),
    BUT   ("but",
            "But ",
            "<span style=\"color: blue\">Steps can also start with keywords <b>And</b> and <b>But</b>.</span><br/><br/>They continue the current section and allow us to use multiple steps to set up the context or validate several outcomes. Using these keywords can improve readability. For example, the following scenario uses two validations:<br/><br/><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Given</span> the ninja has a third level black-belt <br/></span><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Given</span> the ninja has never fought Chuck Norris before <br/></span><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">When</span> attacked by Chuck Norris <br/></span><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Then</span> the ninja should apologise <br/></span><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Then</span> the ninja should run away <br/></span><br/>It reads better when it is written in the following way:<br/><br/><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Given</span> the ninja has a third level black-belt <br/></span><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\"><b>But</b></span> the ninja has never fought Chuck Norris before <br/></span><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">When</span> attacked by Chuck Norris <br/></span><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Then</span> the ninja should apologise <br/></span><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\"><b>And</b></span> the ninja should run away <br/></span><br/><br/>Technically, it isn\'t really important whether a step starts with Given, And or But(or  Then and  When, actually). Cucumber will match the step using a regular expression and execute it. Using And and But makes it easier to read the specification.",
            "step",
            7),
    THEN    ("then",
            "Then ",
            "<span style=\"color: blue\">A <b>Then</b> specifies post-conditions, expected observable outcomes of the primary action in the given context.</span><br/><br/>It is important that these are observable outcomes, something that the business users can actually understand and see. Otherwise, they won\'t be able to engage in specifying it. Internal state changes, though they may be easy to test, do not guarantee that the user of the system benefits in any way from the feature.<br/><br/><span style=\"color: gray;font-style: italic\"> &nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\">Then</span> the ninja should engage the opponent. <br/></span><br/>Although there is no syntax check to prevent misuse, the steps in a scenario should follow the  <b>Given-When-Then flow</b>, which means that the entire context comes first, then an action, and then the expected outcome of the action. Structuring scenarios like this ensures that they are focused and makes them easier to understand.",
            "step",
            8),
    //narrative
    AS_A    ("as a",
            "As a ",
            "<span style=\"color: blue\"> The paragraph which follows the feature title is a free-form text that describes the intention of the feature. For better readability the syntax highlight the words <b>In order</b>,<b>I want</b> and <b>As a.</b></span><br/><br/>Example: <br/><br/><span style=\"color: gray;font-style: italic\"> <span style=\"color: blue\">Feature: </span> Fight or flight <br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\"><b>In order</b></span> to increase the ninja survival rate,<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\"><b>As a </b></span> great ninja commander,<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\"><b>I want </b></span> my ninjas to decide whether to take on an opponent.</span><br/><br/>This paragraph should give the reader a context to understand the rest of the file. Describing features in the user story format is a common practice, although they do not necessarily map directly to user stories. To describe a feature, name the stakeholder, the benefit and the intended solution. A description in the user story format also helps people decide later whether a new scenario belongs to a particular feature file or not.",
            "narrative",
            9),
    IN_ORDER("in order",
            "In order ",
            "<span style=\"color: blue\"> The paragraph which follows the feature title is a free-form text that describes the intention of the feature. For better readability the syntax highlight the words <b>In order</b>,<b>I want</b> and <b>As a.</b></span><br/><br/>Example: <br/><br/><span style=\"color: gray;font-style: italic\"> <span style=\"color: blue\">Feature: </span> Fight or flight <br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\"><b>In order</b></span> to increase the ninja survival rate,<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\"><b>As a </b></span> great ninja commander,<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\"><b>I want </b></span> my ninjas to decide whether to take on an opponent.</span><br/><br/>This paragraph should give the reader a context to understand the rest of the file. Describing features in the user story format is a common practice, although they do not necessarily map directly to user stories. To describe a feature, name the stakeholder, the benefit and the intended solution. A description in the user story format also helps people decide later whether a new scenario belongs to a particular feature file or not.",
            "narrative",
            10),
    I_WANT  ("i want",
            "I want ",
            "<span style=\"color: blue\"> The paragraph which follows the feature title is a free-form text that describes the intention of the feature. For better readability the syntax highlight the words <b>In order</b>,<b>I want</b> and <b>As a.</b></span><br/><br/>Example: <br/><br/><span style=\"color: gray;font-style: italic\"> <span style=\"color: blue\">Feature: </span> Fight or flight <br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\"><b>In order</b></span> to increase the ninja survival rate,<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\"><b>As a </b></span> great ninja commander,<br/>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: blue\"><b>I want </b></span> my ninjas to decide whether to take on an opponent.</span><br/><br/>This paragraph should give the reader a context to understand the rest of the file. Describing features in the user story format is a common practice, although they do not necessarily map directly to user stories. To describe a feature, name the stakeholder, the benefit and the intended solution. A description in the user story format also helps people decide later whether a new scenario belongs to a particular feature file or not.",
            "narrative",
            11);
    
    public String word;
    public String display;    
    public String documentation;    
    public String type;
    public int priority;
    
    private GerkinCompletionNames(String word, String display,String documentation,String type,int priority) {
        this.word = word;
        this.display = display;
        this.documentation=documentation;
        this.type=type;
        this.priority=priority;
    }

    public String getWord() {
        return word;
    }

    public String getDisplay() {
        return display;
    }

    public String getDocumentation() {
        return documentation;
    }

    public String getType() {
        return type;
    }

    public int getPriority() {
        return priority;
    }
}
