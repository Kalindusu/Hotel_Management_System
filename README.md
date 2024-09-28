# CeylonTours Hotel Booking Management  Website with an Admin panel

CeylonTours is a full-featured hotel booking platform designed to streamline the booking process for users and hotel management alike. Built with modern technologies, this application offers a smooth, secure, and intuitive experience for both customers and administrators. The platform is scalable, efficient, and ready for cloud deployment.


## Key Features

### Frontend (ReactJS)
- **Interactive UI**: A dynamic and responsive interface built with ReactJS for seamless navigation.
- **Real-Time Booking**: View room availability in real time, book, and receive instant confirmation.
- **Room Gallery**: High-quality images of rooms and hotels stored and retrieved from AWS S3.
- **User Authentication**: Secure user login/registration with JWT authentication and Spring Security.
- **Search & Filter**: Easily search and filter hotels based on location, price, and amenities.
- **Responsive Design**: Optimized for both desktop and mobile devices, ensuring a smooth experience.

### Backend (Spring Boot & Spring Security)
- **Spring Boot API**: Backend RESTful services built using Spring Boot for booking, user management, and hotel operations.
- **Spring Security**: Secure authentication and authorization with JWT and role-based access control (admin vs. user).
- **Booking Management**: Complete reservation system with availability checks, booking confirmation, and management dashboard for admins.
- **Email Notifications**: Automated email confirmations and notifications for bookings.

### Database (MySQL)
- **Relational Database**: MySQL database for storing user data, bookings, room information, and hotel details.
- **ORM with Hibernate**: Efficient data management using Hibernate for mapping Java objects to database tables.

### Image Upload (AWS S3)
- **AWS S3 Integration**: Images of rooms and hotels are uploaded and stored securely in AWS S3.
- **Efficient Image Retrieval**: Display high-quality images in real-time with fast loading times.

### Cloud Deployment
- **AWS EC2 Hosting**: The application is hosted on AWS EC2 to ensure scalability and high availability.
- **Scalable Design**: Designed to handle growing traffic with AWS infrastructure.

---

## Tech Stack

### Frontend
- **ReactJS**: Core library for building the UI.
- **Axios**: For HTTP requests to the backend API.
- **CSS/SCSS**: Styling the website for a modern look and feel.
- **React Router**: Client-side routing for seamless page transitions.

### Backend
- **Spring Boot**: Framework for creating the backend RESTful API.
- **Spring Security**: Ensuring secure authentication and role-based access control.
- **JWT**: Token-based authentication system.
- **MySQL**: Relational database for storing user, booking, and room data.
- **Hibernate**: Object-relational mapping for database interactions.

### Cloud Services
- **AWS S3**: Storage for images and multimedia.
- **AWS EC2**: Hosting and deployment.

---

## Architecture
The CeylonTours platform follows a modular architecture, separating concerns between the frontend and backend. The frontend, built with ReactJS, interacts with the backend API, which is built using Spring Boot. Authentication and security are managed with Spring Security and JWT. Images are stored in AWS S3, while the entire application is deployed on AWS EC2.

---

## Screenshots
(Add your application screenshots here to provide users with a visual overview of the project.)

---

## Setup Instructions

### Prerequisites:
- **Node.js** and **npm** installed
- **Java** and **Maven** installed
- **MySQL** database setup
- **AWS S3** bucket and credentials for image uploads

### Steps to Set Up:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Kalindusu/Hotel_Management_System.git
   cd CeylonToursHotel
