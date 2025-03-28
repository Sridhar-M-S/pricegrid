# How to Checkout and Run the Project

# **Clone the Repository**
Open a terminal and run:

git clone <repository_url>

cd <project_folder>


# How to Run the Application

## Run Spring Boot Application

Prerequisites:
Ensure Java (JDK 17 or higher) and Maven are installed.

Check the versions using:
java -version
mvn -version

1. Navigate to the `priceGrid` Spring Boot project folder.
2. Open a terminal/command prompt and run the following command:

   mvn spring-boot:run
   
3.The Spring Boot application will start successfully

The application should start running on http://localhost:8080/

To stop the running application, press CTRL + C


## Run Angular Application

Prerequisites:
Install Node.js and Angular CLI

Check the versions using:

node -v

npm -v

ng version

cd frontend  # Navigate to the Angular project folder

npm install

Start the Angular application with:
    ng serve

The application should now be running.

The Angular app should be accessible at http://localhost:4200/

To stop the Angular app, press CTRL + C


Final Steps
Once both applications are running:

Backend (Spring Boot) → Runs on http://localhost:8080/

Frontend (Angular) → Runs on http://localhost:4200/

## Stop the Running Application
  Press CTRL + C
