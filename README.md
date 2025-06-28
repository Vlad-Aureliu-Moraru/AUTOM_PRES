-----

# 🚀 Smart Presence System

A modern and intuitive web-based system designed to streamline student attendance tracking for courses and events. This project offers distinct interfaces for students and lecturers, ensuring a seamless and efficient presence management experience.

-----

## ✨ Features

### For Students

  * **Effortless Check-in:** Simply open your browser; the system automatically detects your presence if your MAC address is recognized.
  * **First-time Registration:** New students are prompted to register with their name, surname, group, and year if their MAC address isn't found.
  * **Presence Confirmation:** Enjoy a delightful animation and vibration feedback upon successful check-in.
  * **CRUD Operations:** Students can be created, deleted, updated, and retrieved within the system.
  * **Mark as Present:** Students can be specifically marked as present in a class.

### For Lecturers

  * **Course Management:** Easily create, update, and delete courses.
  * **Event Creation:** Beyond courses, lecturers can create special events with unique names.
  * **Automated Course Assignment:** Classes are automatically fetched and assigned to their respective lecturers.
  * **Presence Monitoring:**
      * Create a "Presence Session" for a specific course or event.
      * Set the duration for student check-ins (default: 2 hours).
      * Receive real-time notifications on student presence.
      * Courses automatically close for presence after the defined time.
  * **Personalized Greeting:** Lecturers are greeted by name upon login.

### General

  * **Comprehensive Presence Analytics:**
      * Get presence by student.
      * Get presence by lecturer.
      * Get presence by date.
      * View average presence.
      * Filter presence by group.
      * Filter presence by year.

-----
-----

## 🗄️ Database Schema

### `STUDENT` Table

| Column      | Type        | Description                     |
| :---------- | :---------- | :------------------------------ |
| `id`        | INT         | Unique student ID (Primary Key) |
| `nume`      | VARCHAR     | Student's first name            |
| `prenume`   | VARCHAR     | Student's last name             |
| `GROUP`     | VARCHAR     | Student's academic group        |
| `YEAR`      | INT         | Student's academic year         |
| `MAC address` | VARCHAR     | Student's device MAC address    |

### `LECTOR` Table (Assumed, for Lecturer Management)

| Column    | Type    | Description                |
| :-------- | :------ | :------------------------- |
| `id`      | INT     | Unique lecturer ID (Primary Key) |
| `nume`    | VARCHAR | Lecturer's first name      |
| `prenume` | VARCHAR | Lecturer's last name       |

### `CURS` Table

| Column | Type    | Description                     |
| :----- | :------ | :------------------------------ |
| `id`   | INT     | Unique course ID (Primary Key)  |
| `DATA` | DATE    | Date of the course              |
| `LECTOR` | INT     | ID of the lecturer for the course (Foreign Key to `LECTOR.id`) |

### `PREZENTA` Table (Attendance)

| Column    | Type | Description                         |
| :-------- | :--- | :---------------------------------- |
| `idCURS`  | INT  | ID of the course (Foreign Key to `CURS.id`) |
| `idStudent` | INT  | ID of the student (Foreign Key to `STUDENT.id`) |

-----

## 🚦 Workflow

1.  **Landing Page:** Users choose between "Student" or "Professor."
2.  **Student Flow:**
      * If the user's MAC address is in the database, they are automatically marked as present for the current course and shown a confirmation animation.
      * If the MAC address is new, a registration form (Name, Surname, Group, Year) is prompted.
3.  **Professor Flow:**
      * A login form is displayed.
      * Upon successful login, the professor is greeted by name.
      * Options appear to:
          * Create a "Presence Session" for an existing course (selecting from a list if multiple courses exist).
          * Create a new "Event."
          * Set the duration for the presence session (default 2 hours).
          * Enable/disable notifications on student presence.
4.  **Public Statistics:** If neither "Student" nor "Professor" is chosen, a static view of presence statistics is displayed.

-----

## 🛠️ Installation & Setup (Placeholder)

Detailed instructions for setting up the project locally will go here, including:

  * Cloning the repository
  * Installing dependencies (backend and frontend)
  * Database setup and migration
  * Running the development servers

-----

## 🤝 Contributing

We welcome contributions\! Please see our `CONTRIBUTING.md` for guidelines.

-----

## 📜 License

This project is licensed under the [MIT License](https://www.google.com/search?q=LICENSE).

-----
