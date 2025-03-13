# Data Flow Descriptions for External Entity: Student

## 1. Registration Information  
**Description:**  
Contains information provided by the student to register for a class, including student ID, class ID, and preferred section.  

**Source:**  
Student  

**Destination:**  
Process 1: Class Registration  

**Associated Data Structure:**  
Roster  

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
Withdrawal  

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
Grades  

**Comments:**  
This data flow provides input for the grading process and updates the course database with assignment submissions.  

---

## 4. Application Information  
**Description:**  
Contains details about a student’s application for admission or program enrollment, including personal information, academic history, and desired program.  

**Source:**  
Student  

**Destination:**  
Process 4: Application  

**Associated Data Structure:**  
Application Records  

**Comments:**  
This data flow initiates the application review process and updates the application records store with the student’s submission.  

---

## 5. Major Change Request  
**Description:**  
Contains a student’s request to change their major, including student ID, current major, and desired major.  

**Source:**  
Student  

**Destination:**  
Process 5: Changing Major  

**Associated Data Structure:**  
MajorChangeRequest  

**Comments:**  
This data flow triggers the evaluation of the major change request and updates the student records store.  

---

## 6. Grade Information  
**Description:**  
Contains a student’s request to access or verify their grade information, including student ID and class ID.  

**Source:**  
Student  

**Destination:**  
Process 6: Graduation  

**Associated Data Structure:**  
Grades  

**Comments:**  
This data flow helps determine if the student meets graduation requirements based on the recorded grades.  

---

## 7. Dropout Information  
**Description:**  
Contains a student’s request to drop out of the institution, including student ID and reason for dropping out.  

**Source:**  
Student  

**Destination:**  
Process 7: Dropping Out  

**Associated Data Structure:**  
Administrative Records  

**Comments:**  
This data flow triggers the administrative process for recording a dropout and updates the administrative records store.  

---

# Data Flow Descriptions for Process 1 and Process 2 with Data Store D1  

## 8. Roster  
**Description:**  
Represents the class roster generated or updated during the class registration process, including student details and class assignments.  

**Source:**  
Process 1: Class Registration  

**Destination:**  
D1: Class Data  

**Associated Data Structure:**  
Roster  

**Comments:**  
This data flow updates the class data store to reflect newly registered students.  

---

## 9. Roster  
**Description:**  
Represents the existing class roster retrieved from the class data store to verify class availability and enrollment status.  

**Source:**  
D1: Class Data  

**Destination:**  
Process 1: Class Registration  

**Associated Data Structure:**  
Roster  

**Comments:**  
This data flow ensures that students are only registered for available classes.  

---

## 10. Withdrawals  
**Description:**  
Represents a record of a student’s class withdrawal, including student and class information.  

**Source:**  
Process 2: Class Withdrawal  

**Destination:**  
D1: Class Data  

**Associated Data Structure:**  
Withdrawal  

**Comments:**  
This data flow updates the class data store to reflect the student's withdrawal.  

---

## 11. Withdrawals  
**Description:**  
Represents a request to retrieve withdrawal records from the class data store to confirm class withdrawal status.  

**Source:**  
D1: Class Data  

**Destination:**  
Process 2: Class Withdrawal  

**Associated Data Structure:**  
Withdrawal  

**Comments:**  
This data flow ensures that the system confirms a withdrawal before processing any updates.  

---

# Data Flow Descriptions for External Entity: Faculty and Process 3 with Data Stores  

## 12. Class Information  
**Description:**  
Contains information about the classes taught by the faculty member, including class schedules, capacity, and instructor details.  

**Source:**  
Faculty  

**Destination:**  
D1: Class Data  

**Associated Data Structure:**  
ClassData  

**Comments:**  
This data flow updates the class data store with current class information provided by faculty members.  

---

## 13. Course Information  
**Description:**  
Contains information about courses offered by the faculty, including course descriptions, prerequisites, and credit hours.  

**Source:**  
Faculty  

**Destination:**  
D2: Course Database  

**Associated Data Structure:**  
CourseDatabase  

**Comments:**  
This data flow updates the course database with new or revised course details.  

---

## 14. Course Information  
**Description:**  
Represents course information retrieved from the course database, including schedules, requirements, and enrollment limits.  

**Source:**  
D2: Course Database  

**Destination:**  
Faculty  

**Associated Data Structure:**  
CourseDatabase  

**Comments:**  
This data flow allows faculty to verify or update course details.  

---

## 15. Grades  
**Description:**  
Contains student grade information submitted by the faculty member, including student ID, class ID, and grade.  

**Source:**  
Process 3: Grade Submission  

**Destination:**  
D2: Course Database  

**Associated Data Structure:**  
Grades  

**Comments:**  
This data flow updates the course database with student grades.  

---

## 16. Grades  
**Description:**  
Represents existing grade records retrieved from the course database for review or modification.  

**Source:**  
D2: Course Database  

**Destination:**  
Process 3: Grade Submission  

**Associated Data Structure:**  
Grades  

**Comments:**  
This data flow allows for the retrieval and validation of previously recorded grades.  

