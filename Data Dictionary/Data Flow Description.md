# Data Flow Descriptions for External Entity: Student

## 1. Registration Information  
**Description:**  
Contains information provided by the student to register for a class, including student ID, class ID, and preferred section.  

**Source:**  
Student  

**Destination:**  
Process 1: Class Registration  

**Associated Data Structure:**  
*(Leave blank for now)*  

**Comments:**  
This data flow triggers the class registration process and updates the roster in the class data store.  

---

## 2. Withdrawal Information  
**Description:**  
Contains details about a student's request to withdraw from a class, including student ID and class ID.  

**Source:**  
Student  

**Destination:**  
Process 2: Class Withdrawal  

**Associated Data Structure:**  
*(Leave blank for now)*  

**Comments:**  
This data flow triggers the withdrawal process and updates the class data store to reflect the withdrawal.  

---

## 3. Assignments  
**Description:**  
Contains student-submitted assignments for a class, including student ID, class ID, assignment ID, and content.  

**Source:**  
Student  

**Destination:**  
Process 3: Grade Submission  

**Associated Data Structure:**  
*(Leave blank for now)*  

**Comments:**  
This data flow provides input for the grading process and updates the course database with assignment submissions.  
