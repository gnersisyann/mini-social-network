# Mini Social Network

This is a mini social network project that allows users to:

- Create accounts
- Show user list
- Log in/Log out

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/gnersisyann/mini-social-network.git
2. Navigate to the project directory:
   ```bash
   cd mini-social-network
3. Make sure you have Java 8 or above installed.
4. Set up PostgreSQL:  
   - Install PostgreSQL if you don’t have it installed.  
   - Create a new PostgreSQL user `admin` with the password `0000`.  
   - Create a database named `app_db`. Use the following commands:  
     ```sql
     CREATE USER admin WITH PASSWORD '0000';
     CREATE DATABASE app_db;
     GRANT ALL PRIVILEGES ON DATABASE app_db TO admin;
     ```
6. Build and run the project using Maven:
   ```bash
   mvn clean install
   mvn spring-boot:run
7. Open your browser and go to:
   http://localhost:8080

# Future Features

  - **News feed: Display posts from users you follow.**
  - **Liking and commenting on posts.**
  - **Private messaging between users.**
  - **Profile**: Each user has a profile with their username and password (additional profile features will be added soon).
  - **Followers & Following**: Users can follow other users and be followed in return.
  - **Post Creation**: Users can create posts that will appear in their profiles.
  - **User Search**: Find users by their username.

# Contributing

Feel free to fork this project, open issues, and submit pull requests. If you find any bugs or want to propose a new feature, let me know!
    
# License

This project is licensed under the MIT License - see the LICENSE file for details.
