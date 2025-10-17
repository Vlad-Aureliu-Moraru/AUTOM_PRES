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



