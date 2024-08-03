# Bus_Reservation
## Database :
Go to MySql Workbench -> File -> New Query Tab Create a database :- "create database busresv;" "use busresv;" Create two tables (One for storing the bus details and the other is for the booking details) : "create table bus(id int primary key, ac boolean, capacity int);" "create table booking(passenger_name varchar(50), bus_no int, travel_date date);" Insert the data for the bus table : "insert into bus values(1,1,10),(2,1,48),(3,1,52),(4,0,30),(5,0,40),(6,0,35); // You can insert your own data

## JAR File :

Download the "mysql-connector-j-9.0.0.zip" from the mysql official website.
Extract the zip file in your PC.
Go to Eclipse IDE -> Right Click on the project -> Build Path -> Configure Build Path -> Libraries -> Select Classpath -> Click Add External jar's -> Choose the mysql jar file -> Click Apply then Apply and Close.
