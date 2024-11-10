# Online Fundraising Platform

## Overview
This project is an *Online Fundraising Platform* developed in *Java*. The platform enables individuals and organizations to raise funds for various causes, events, and emergencies. Users can create campaigns, donate to ongoing projects, and track funding progress. The platform provides a secure, user-friendly experience for both campaign creators and donors.

## Features
- *User Registration and Authentication*: Secure sign-up and login for campaign creators and donors.
- *Campaign Creation*: Users can create fundraising campaigns with details, target amounts, deadlines, and images.
- *Donation Process*: Support for multiple payment options, allowing donors to contribute to campaigns securely.
- *Progress Tracking*: Real-time tracking of campaign progress and donation totals.
- *User Profiles*: Donors and creators have profiles that display their contributions or campaigns.
- *Admin Panel*: An admin can manage campaigns, verify authenticity, and handle user reports.
- *Notifications*: Automatic notifications to users about their contributions, goal completions, and deadlines.
- *Search and Filters*: Allows users to search campaigns by category, target amount, or recent updates.

## Tech Stack
- *Backend*: Java (Spring Boot or Java EE)
- *Frontend*: JSP, HTML5, CSS3, JavaScript (or JavaFX for a desktop client)
- *Database*: MySQL or PostgreSQL
- *Payment Integration*: PayPal or Stripe API
- *Logging and Monitoring*: SLF4J with Logback, Prometheus (optional)
- *Testing*: JUnit and Mockito for unit testing
- *Version Control*: Git

## Project Setup
1. *Clone the repository*:
   bash
   git clone https://github.com/username/online-fundraising-platform.git
   cd online-fundraising-platform
   
2. *Database Setup*:
   - Configure the database connection in application.properties.
   - Run the SQL scripts in src/main/resources/sql to set up necessary tables.

3. *Install Dependencies*:
   - Make sure Maven/Gradle is installed.
   - Install required dependencies:
     bash
     mvn clean install
     

4. *Run the Application*:
   bash
   mvn spring-boot:run
   
   The application will be accessible at http://localhost:8080.

5. *Configure Payment Gateway*:
   - Set up API keys for PayPal/Stripe in application.properties.

## Usage
1. *Sign up*: New users can sign up using their email and password.
2. *Create Campaign*: Log in as a campaign creator and start a new campaign with relevant details.
3. *Donate*: As a donor, browse or search for campaigns and make a secure donation.
4. *Monitor Progress*: View campaign progress in real-time and check updates.

## File Structure
- src/main/java/com/example/fundraising - Main Java files for the application.
- src/main/resources/templates - HTML and JSP files for the front end.
- src/main/resources/static - CSS, JS, and image files.
- src/test/java - Unit and integration tests.

.
