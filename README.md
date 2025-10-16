-----


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


