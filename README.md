    --DATABASE-- A STUDENT has a name, surname , MAC address and ID , GROUP and YEAR. He can be pressent at a COURSE which is described by , the LECTER , the date , ID. The LECTER is also identfied by name ,surname and ID, he can have multiple COURSES
---
DATABASE TAMEPLATE
        
        CURS

| id | DATA | LECTOR |
----------------------
|    |      |        |

             STUDENT

| id | nume | prenume |GROUP|YEAR|MAC address|
----------------------------------------------
|    |      |         |     |    |           |

        PREZENTA
  |idCURS|idStudent|
  ------------------
  |      |         |

    ---BACKEND--
A STUDENT can be present to a CLASS only after loggin in , the MAC address i supose will be given by the router ? idk yet;
STUDENTS just have to open the browser once and they will be promted to register with NAME: and SURNAME and GROUP: and YEAR: if the system doesnt find their MAC address if it does it automatically counts a pressence
  ** A STUDENT CAN:
--  BE CREATED
--  BE DELETED
--  BE UPDATED
--  BE RECEIVED
--  BE SET AS PRESENT IN A CLASS

  ** A LECTOR CAN:
-- CREATE COURSES
-- UPDATE COURSES
-- DELETE COURSES 
-- CAN ALSO CREATE EVENTS | WHICH ARE SIMMILAR TO COURSES BUT HAVE A SPECIFIC NAME

  ** CLASES ARE AUTOMATICALLY FETCHED AND HAVE ASSIGNED LECTORS

  **USEFULL METHODS :
-- GET PRESSENCE BY STUDENT
-- GET PRESSENCE BY LECTOR
-- GET PRESSENCE BY DATE
-- GET PRESSENCE AVERAGE
-- GET PRESSENCE BY GROUP
-- GET PRESSENCE BY YEAR

    --FRONTEND--
WHEN ENTERING THE WEBSITE YOU WILL HAVE TO CHOOSE IF YOU ARE A STUDENT OR A PROFFESOR
IF CHOSEN STUDENT PROMT A LOGIN FORM IF NOT FOUND IN THE DB ELSE SET AS PRESSENT AND SHOW AN ANIMATION WITH VIBRATION

IF NOTHING IS CHOSEN YOU CAN VIEW A STATISC ON PRESSENCE

IF PROFFESOR IS CHOSEN PROMT A LOGIN FORM AND LOG THEM 
  THEN THERE SHOULD APPEAR SOMETHING LIKE , Buna ziua , #@!%^
  AND SOMETHING LIKE THIS:

  Creaza PREZENTA : <ALEGE CURS> / <CURS>  #IN CAZ CA UN PROF ARE MAI MULTE CURSURI#
  sau UN EVENT 
  <DATA > AUTOMATICALLY set 
  <RECIEVE NOTIFICATIONS ON PRESSENCE >
  <HOLD :TIME:>  // time which students can log the pressence // default 2 hrs // after that the COURSE state WILL BE SET TO CLOSED
