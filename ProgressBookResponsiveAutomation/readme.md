# Automated Accessibility/Responsiveness Testing Using Galen Framework

This project uses Galen Framwork to automate Accessibility/Responsiveness testing of an Application. It helps in reducing the manual work done to ensure accessibility of an application with respect to different environments/browsers.

## Problem Statement

In the world of Web Applications, Layout/Functional Testing performs a great role. It takes a lot of effors to manually test the layout and perform functional testing. In order to reduce manual efforts, we need to automate the Layout testing of our Application in the best possible way.

## Solution 

Here, We are using Galen Framework to automate our Layout testing.


### Galen Framework 
Galen is an open-source tool for testing layout and responsive design of web applications. It is also a powerfull functional testing framework. For more information visit http://galenframework.com

#### How does it work?
When it comes to testing a responsive layout it works in a following way:

* Open a page in browser
* Resize it to specified size
* Test the layout according to user-defined specs
* Use Selenium for interacting with elements on page and getting their locations   and dimensions.
 
 Once it sees that something is wrong – 
* It reports the error, makes a screenshot and highlights the misbehaving element on it.

#### Why Galen Framework? 

##### Advantages

* Helps Development teams to get early feedback over different resolutions
* Reduce manual effort
* Find differences in UI which is not easily identified by naked eyes
* Run test using Selenium Grid. 
* Easy to execute in Android, iOS devices using appium
* Easy to integrate Galen in gulp or grunt
* Easy to execute on browserstack, sauce lab etc. services
* Using selenium capabilities free to do whatever you need like: clicking, typing, injecting client-side javascript etc.

##### Value Addition
###### Developers
* When developer changes the css.
* When new views are implemented.
* When dev want to verify bug related to UI is fixed for various devices with various resolutions
###### Testers
* When QA wants to verify web app layout stays responsive and displayed correctly on all kind of devices with various resolution
* When sprint testing is going on
* When changes happens in UI like text alignment, font family, color, image size, font size etc. changes




## Getting Started

### Prerequisites

* Java 1.8 or higher version 
* Galen Framework(version 2.0 or higher)
* Selenium 
* IDE(Eclipse)
* Browser/Environment driver (Crome/firefox)

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.



## Running the tests

Explain how to run the automated tests for this system


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## License
Galen Framework is Open-Sourced.
Galen Framework is distributed under Apache License 2 and the sources are available on Github.



