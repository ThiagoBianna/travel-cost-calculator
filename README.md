![Tela do Projeto](./img/preview.png)

"Vai dar quanto?" — Trip Cost Calculator

🔗 Deploy: https://vai-dar-quanto-web-front.onrender.com/ ⚠️ Note on access: This project is hosted on Render's free tier. Therefore, if the site has been inactive for a while, the first access may take about 30-40 seconds to "wake up" the container. Thank you for your patience!

"Vai dar quanto?" is a full-stack application designed to help drivers estimate the real fuel cost of their trips. Using integrations with the Google Maps API, the system calculates the precise distance between two points and applies intelligent business rules, such as alerts for high-consumption (peak) hours. Key Features

Accurate Calculation: Integration with Google Distance Matrix API for exact mileage.

Address Autocomplete: Intelligent location search via Google Places API.

Multiple Fuel Support: Specific calculations for Gasoline, Ethanol, Diesel, and CNG (GNV).

Smart Consumption: Display of averages in km/L and km/m³ (for CNG).

Peak Hour Alert: System that identifies business hours and suggests that consumption may be higher.
Technologies Used

Project Architecture
The application is structured into an independent frontend and backend ecosystem. The frontend consumes the REST API built with Spring Boot, which handles the core logic and safely stores user data. Both services are fully containerized using Docker, allowing easy deployment and scalability in production environments.

Frontend: React (Vite), Styled Components/Dynamic CSS.

Backend: Java 17+, Spring Boot, PostgreSQL, Docker.

APIs: Google Maps (Distance Matrix and Places).
How to run the project

Since the project uses environment variables for security, you will need to configure the API keys locally.

Clone the repository:
Bash

git clone https://github.com/ThiagoBianna/travel-cost-calculator.git

Frontend Configuration:

    Create a .env file in the root of the frontend folder.

    Add your key: VITE_GOOGLE_MAPS_API_KEY=your_key_here.

Backend Configuration:

    Ensure your PostgreSQL database is running.

    Configure the credentials in application.properties.

This project was developed with the support
of Gemini for code refactoring and logic optimization,
following CS50’s academic honesty policy.

Acknowledgments and Final Considerations
I would like to express my deepest gratitude to the entire CS50x staff and Harvard University for providing this incredible, high-quality educational journey. This final project represents the culmination of months of hard work, continuous learning, and intense dedication to software engineering principles, transforming my technical skills completely.

Developer
Thiago Bianna Pessanha da Cruz, Software Engineering Student at UNINTER.
