# How to Checkout and Run the Project

# **Clone the Repository**
Open a terminal and run:

git clone https://github.com/Sridhar-M-S/pricegrid.git


# How to Run the Application

## Run Spring Boot Application

Prerequisites:
Ensure Java (JDK 17 or higher) and Maven are installed.

Open a terminal and Check the versions using:

   java -version
   
   mvn -version

1. Open a terminal and Navigate to the `priceGrid` Spring Boot project folder.

   cd   priceGrid
   
2. Run the following command in a terminal:

   mvn spring-boot:run
   
3. The Spring Boot application will start successfully

4. The application should start running on http://localhost:8080/

To stop the running application, press CTRL + C


## Run Angular Application

Prerequisites:
Install Node.js and Angular CLI

Open a terminal and Check the versions using:

   node -v
   
   npm -v
   
   ng version

1. Open a terminal and Navigate to the `price-grid-app` angular project folder.

   cd price-grid-app  
   
   npm install

3. In a terminal start the Angular application with:

   ng serve

5. The application should now be running.

6. The Angular app should be accessible at http://localhost:4200/

To stop the Angular app, press CTRL + C


# Final Steps
Once both applications are running:

Backend (Spring Boot) → Runs on http://localhost:8080/

Frontend (Angular) → Runs on http://localhost:4200/

## Stop the Running Application
  Press CTRL + C
