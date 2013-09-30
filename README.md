Cetriolo
========

**Status of the project and future development/bugs**

From an email of Andras: 

**Q:** I hope you are well and I apologize to disturb you with my email. I
would like to ask whether is there any chance you are going to
continue developing the Cetriolo plugin? I started to use it because
I'm a test engineer and I want to test my project using BDD method. On
the other hand, I don't want to use Eclipse. If so, than I would be
happy and as a user-tester I would like to contribute to your project.


**A:** First of all thank you for your feedback and sorry for the late response. Basically this was project was something i wrote because i needed to use. I put it in github because i thought it could be valuable for other people too. And that was the case.
The problems with this project though is that there are few bugs and a few feature missing, expecially regarding multiple gherkin language support.
So to be completely honest with you I really have no time to work on it by myself. I think this plugin is a good starting point to make the
support of cucumber awesome in Netbeans but unless someone starts to contribute to the project i will not keep developing it. In the next month i might review it a little bit to get rid of the bugs that are currently open and make some documentation, but as I told you I am not going to keep developing it by myself. If i do, it will be for supporting the scalatest framework too, but as yoiu can imagine that would be a big undertaking.


[Wiki](https://github.com/kinkadzs/Cetriolo/wiki/Home)<br/>

Started as a porting to NetBeans of the https://github.com/rlogiacco/Natural plugin for Eclipse. Natural is a collection of Eclipse plugins to enable rich smart editing of acceptance tests using natural language definition files.

**This plugin adds to NetBeans support for Cucumber**. Cucumber is a tool for running automated acceptance tests written in a behavior driven development (BDD) style. You can use it to automate functional validation in a form that is easily readable and understandable to business users, developers and testers.

![overview](https://github.com/kinkadzs/Cetriolo/raw/master/screenshots/overview.png)

Cucumber lets software development teams describe how software should behave in plain text; and this text follows some conventions and keyword specified by a syntax called Gherkin. At the moment the feature supported for this langualge are:

* **Syntax Highlighting** (Colors, editable in the preference)
* **Navigation** of feature files (the navigator view)
* **A palette** to visually add new elements
* **Code Completion** (Triggered by Ctrl+Space)
* **Code Folding** (Folding on blocks like Feature, Scenario ...)
* **Code Formatting** (Triggered by Alt+Shift+F)
* **Language Templates** to create new .feature and .future files
* **Hints** to fix grammar errors
* **Code Navigation** go to the implementation of any step definition using hints
