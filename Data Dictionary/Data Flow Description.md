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

---

# Data Flow Descriptions for External Entity: Faculty and Process 3 with Data Stores  

## 17. Class Information  
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

## 18. Course Information  
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

## 19. Course Information  
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

## 20. Grades  
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

## 21. Grades  
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

---

# Data Flow Descriptions for External Entity: Staff and Process 4, 5, 6, 7 with Data Stores  

## 22. Records A  
**Description:**  
Represents staff input of application-related records, including application status, decisions, and reviewer notes.  

**Source:**  
Staff  

**Destination:**  
D3: Application Records  

**Associated Data Structure:**  
ApplicationRecords  

**Comments:**  
This data flow updates the application records with new or modified application status information.  

---

## 23. Records B  
**Description:**  
Represents staff updates to student records, including personal details, academic status, and major changes.  

**Source:**  
Staff  

**Destination:**  
D4: Student Records  

**Associated Data Structure:**  
StudentRecords  

**Comments:**  
This data flow ensures that student records remain up-to-date with any staff-entered changes.  

---

## 24. Records C  
**Description:**  
Represents staff updates to administrative records, including graduation eligibility and dropout status.  

**Source:**  
Staff  

**Destination:**  
D5: Administrative Records  

**Associated Data Structure:**  
AdministrativeRecords  

**Comments:**  
This data flow ensures that administrative records reflect the most current student status.  

---

## 25. Application Status  
**Description:**  
Represents the status of a student’s application, including approval, rejection, or pending status.  

**Source:**  
D3: Application Records  

**Destination:**  
Process 4: Application  

**Associated Data Structure:**  
ApplicationRecords  

**Comments:**  
This data flow allows the application process to notify the student of the current application status.  

---

## 26. Request Status  
**Description:**  
Represents the status of a student’s major change request, including approval, rejection, and comments.  

**Source:**  
D4: Student Records  

**Destination:**  
Process 5: Changing Major  

**Associated Data Structure:**  
StudentRecords  

**Comments:**  
This data flow allows the major change process to notify the student of the request’s outcome.  

---

## 27. Graduation Status  
**Description:**  
Represents the student’s graduation status, including whether the student has met all graduation requirements.  

**Source:**  
D5: Administrative Records  

**Destination:**  
Process 6: Graduation  

**Associated Data Structure:**  
AdministrativeRecords  

**Comments:**  
This data flow allows the graduation process to confirm the student’s eligibility to graduate.  

---

## 28. Dropout Status  
**Description:**  
Represents the official dropout status of a student, including the effective date and reason for withdrawal.  

**Source:**  
D5: Administrative Records  

**Destination:**  
Process 7: Dropping Out  

**Associated Data Structure:**  
AdministrativeRecords  

**Comments:**  
This data flow confirms and records the student’s dropout status in the administrative records.  

---

# Data Flow Descriptions for Child Proccesses of Process 1: Class Registration  

## 29. Registration Request  
**Description:**  
Contains information about a student’s request to enroll in a class, including the class ID and student details.  

**Source:**  
Process 1.1 (Class Request Validation)  

**Destination:**  
D1: Class Data  

**Associated Data Structure:**  
RegistrationRequest  

**Comments:**  
Used to validate the student’s request against class availability and prerequisites.  

---

## 30. Request Approval  
**Description:**  
Confirms that the class request meets prerequisites and has been approved.  

**Source:**  
Process 1.1 (Class Request Validation)  

**Destination:**  
Process 1.2 (Class Enrollment)  

**Associated Data Structure:**  
RequestApproval  

**Comments:**  
Approval status will be either “Approved” or “Denied.”  

---

## 31. Prerequisites  
**Description:**  
Provides the list of prerequisites required for a class.  

**Source:**  
D1 (Class Data)  

**Destination:**  
Process 1.1 (Class Request Validation)  

**Associated Data Structure:**  
Prerequisites  

**Comments:**  
Multiple prerequisite courses may be listed.  

---

## 32. Request Notification  
**Description:**  
Informs the notification process whether the student’s enrollment was successful.  

**Source:**  
Process 1.2 (Class Enrollment)  

**Destination:**  
Process 1.3 (Enrollment Notification)  

**Associated Data Structure:**  
RequestNotification  

**Comments:**  
Enrollment status will be “Success” or “Failed” depending on class availability and prerequisites.  

---

## 33. Updated Roster  
**Description:**  
Sends the updated class roster to the faculty after a student is successfully enrolled.  

**Source:**  
Process 1.3 (Enrollment Notification)  

**Destination:**  
Faculty  

**Associated Data Structure:**  
Roster  

**Comments:**  
Status reflects the student’s enrollment status.  

---

## 34. Class Information  
**Description:**  
Faculty provides details about class capacity and enrollment availability.  

**Source:**  
Faculty  

**Destination:**  
Process 1.2 (Class Enrollment)  

**Associated Data Structure:**  
ClassData  

**Comments:**  
Used to determine if there is room for enrollment.  

---

## 35. Class Information  
**Description:**  
Faculty provides details about the class, including prerequisites and available seats.  

**Source:**  
Faculty  

**Destination:**  
Process 1.1 (Class Request Validation)  

**Associated Data Structure:**  
ClassData  

**Comments:**  
Used to validate the student’s eligibility for enrollment based on prerequisites and class capacity.  