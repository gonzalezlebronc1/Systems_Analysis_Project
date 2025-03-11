# Data Store Descriptions 

## 1. D1 - Class Data   
**Data store ID:**  
D1

**Data Store Name :**  
Class Data

**Alias:**  
Course Enrollment Information

**Description:**  
This data store holds information about class registration, withdrawals, and rosters.  

**File Type:**  
Computer

**Format:**  
Database table

**Maximun and Average Number :**  
*(Leave blank for now)*  

**Data Set Name :**  
Class Data Master

**Data Structure Name:**  
Class Data

**Primary Key:**  
Class_ID

**Secondary Key:**  
Student_ID

**Comments:**
This data store is primarily accessed by faculty for class information and student rosters.  

---

## 2. D2 - Course Database   
**Data store ID:**  
D2

**Data Store Name :**  
Course Database

**Alias:**  
Course Information Storage

**Description:**  
This database contains course information such as course name, code, faculty details, and grades.

**File Type:**  
Computer

**Format:**  
Database table

**Maximun and Average Number :**  
*(Leave blank for now)*  

**Data Set Name :**  
Course Database Master

**Data Structure Name:**  
Course Database

**Primary Key:**  
Course_ID

**Secondary Key:**  
Faculty_ID, Student_ID

**Comments:**
This database helps in maintaining academic records, grades, and course details.  

---

## 3. D3- Application Record  
**Data store ID:**  
D3

**Data Store Name :**  
Application Records

**Alias:**  
Student Application Database

**Description:**  
This data store holds information about student applications, their status, and associated documents.

**File Type:**  
Computer

**Format:**  
Database table

**Maximun and Average Number :**  
*(Leave blank for now)*  

**Data Set Name :**  
Application Records Master

**Data Structure Name:**  
Application Records

**Primary Key:**  
Application_ID

**Secondary Key:**  
Student_ID

**Comments:**
This data store is mostly accessed by staff for processing student applications.  

---

## 4. Student Record  
**Data store ID:**  
D4

**Data Store Name :**  
Student Record 

**Alias:**  
Student Data File

**Description:**  
This file contains all records related to students, including major change requests, enrollment details, and academic history.

**File Type:**  
Computer

**Format:**  
Database table

**Maximun and Average Number :**  
*(Leave blank for now)*  

**Data Set Name :**  
Student Record Master

**Data Structure Name:**  
Student Record 

**Primary Key:**  
Student_ID

**Secondary Key:**  
Major_ID, Class_ID

**Comments:** 
This data store is essential for tracking student progress and academic changes. 

---

## 5. Administrative Records  
**Data store ID:**  
D5

**Data Store Name :**  
Administrative Records

**Alias:**  
Student Status Records 

**Description:**
This data store contains information related to graduation, dropout status, and other administrative records.  

**File Type:**  
Computer

**Format:**  
Database table

**Maximun and Average Number :**  
*(Leave blank for now)*  

**Data Set Name :**  
AdminRecord Master 

**Data Structure Name:**  
AdminRecord

**Primary Key:**  
Record_ID

**Secondary Key:**  
Student_ID

**Comments:**
Staff primarily accesses this data for administrative purposes like processing graduation or dropout cases.  
