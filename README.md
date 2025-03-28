# How to Checkout and Run the Project

# **Clone the Repository**
Open a terminal and run:

git clone <repository_url>

cd <project-folder>


# How to Run the Application

## Run Spring Boot Application

To run the Spring Boot application, ensure you have **Java** and **Maven** installed.

1. Navigate to the `priceGrid` Spring Boot project folder.
2. Open a terminal/command prompt and run the following command:

   mvn spring-boot:run
   
3.The Spring Boot application will start successfully

## Run Angular Application

To run the Angular application, you need **Node.js** and **Angular CLI** installed.

1.Open a terminal and navigate to the Angular project folder.

2.Install dependencies by running:
    npm install

3.Start the Angular application with:
    ng serve

The application should now be running.


## Stop the Running Application
  Press CTRL + C



## Spring Boot and Angular Price API Project

Overview

This project is a full-stack web application developed using Spring Boot (Java 17) for the backend and Angular for the frontend. The application retrieves and displays pricing information through a REST API and a user-friendly UI.

Backend - Spring Boot


Technologies Used:

Java 17

Spring Boot (Initialized via Spring Initializr)

Spring Web

IntelliJ IDEA


Development Steps:

Analyze Response Object: Determined the expected structure of the response for the price API.

Develop REST API:

Implemented a GET API to fetch pricing data.

Used a hardcoded file for initial price values.


Test API:

Verified the API response in a browser to ensure correctness.


JUnit Testing:

Wrote both positive and negative test cases.

Successfully passed all test cases.


API Endpoint:

GET http://localhost:8080/api/prices - Retrieves price data.


CORS Configuration:

Configured the Spring Boot application to allow cross-origin requests from http://localhost:4200.


Frontend - Angular


Technologies Used:

Angular

TypeScript

Bootstrap

Node.js

Visual Studio Code (VS Code)

Development Steps:

Install Node.js & Angular CLI


Create Angular Application:

Used Angular CLI to initialize a new project.

Tested the initial setup.

Install Bootstrap:

Imported Bootstrap into the project.


Develop Components & Services:

Created a new component with TypeScript, CSS, and HTML files.

Created a model and service file.

Implemented an HTTP request in the service file to fetch data from http://localhost:8080/api/prices.


Display Data in UI:

Integrated the service with the component.

Displayed the fetched price data on the UI.


Frontend URL:

http://localhost:4200/

How to Run the Project


Backend:

Clone the repository.

Open the project in IntelliJ IDEA.

Build and run the Spring Boot application.

Ensure the backend is running at http://localhost:8080/.


Frontend:

Navigate to the Angular project folder.

Run npm install to install dependencies.

Start the Angular application with ng serve.

Open http://localhost:4200/ in a browser to view the UI.


Conclusion

This project demonstrates a simple integration between a Spring Boot backend and an Angular frontend to fetch and display pricing data. The system has been tested using JUnit for backend logic and manually verified for UI functionality.
