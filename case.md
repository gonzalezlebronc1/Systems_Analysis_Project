Use Case 1: Applying to the University
Actors: Student, Administrator
Description: The student submits an application for admission, which is reviewed by an administrator.
Triggering Event: Student initiates the application process.
Steps Performed with Needed Information:
1. Student fills out and submits the application.
2. System verifies provided information.
3. Administrator reviews and processes the application.
4. System notifies the student of the decision.
Preconditions: Student meets eligibility requirements. 
Postconditions: Application is accepted or rejected. 
Alternate Scenarios: Application requires additional documentation. 
Exception Scenarios: System downtime prevents submission.

Use Case 2: Scheduling Classes
Actors: Student, Teacher, Administrator
Description: The student registers for classes, with potential approval from a teacher or administrator.
Triggering Event: Student requests class enrollment.
Steps Performed with Needed Information:
1. Student selects classes.
2. System checks prerequisites and availability.
3. If necessary, teacher or administrator approves.
4. System finalizes enrollment.

Preconditions: Student is eligible for enrollment. 
Postconditions: Student is successfully enrolled in classes. 
Alternate Scenarios: Class is full, student is waitlisted. 
Exception Scenarios: System error prevents registration.

Use Case 3: Withdrawing from a Class
Actors: Student, Teacher, Administrator
Description: A student requests to withdraw from a class, requiring approval.
Triggering Event: Student submits a withdrawal request.
Steps Performed with Needed Information:
   1. Student requests withdrawal.
   2. System verifies eligibility.
   3. Teacher or administrator approves withdrawal.
   4. System updates student records.
Preconditions: Student is enrolled in the class. 
Postconditions: Withdrawal is recorded. 
Alternate Scenarios: Student decides to stay in the class. 
Exception Scenarios: System error prevents withdrawal.

Use Case 4: Final Class Grade Submission
Actors: Student, Teacher
Description: A teacher submits final grades, allowing students to view them.
Triggering Event: End of the term.
Steps Performed with Needed Information:
   1. Teacher enters grades.
   2. System validates entries.
   3. System updates student transcripts.
   4. Student views grades.
Preconditions: Student has completed coursework. 
Postconditions: Final grades are recorded. 
Alternate Scenarios: Teacher requests grade change. 
Exception Scenarios: System prevents submission due to an error.

Use Case 5: Changing Your Major
Actors: Student, Administrator
Description: A student submits a request to change majors, which is approved by an administrator.
Triggering Event: Student submits a major change request.
Steps Performed with Needed Information:
   1. Student selects a new major.
   2. Administrator reviews and approves request.
   3. System updates student records.
Preconditions: Student meets major change requirements. 
Postconditions: Student’s major is updated.
Alternate Scenarios: Major change requires additional approval. 
Exception Scenarios: System prevents the request due to missing prerequisites.

Use Case 6: Viewing Your Transcript
Actors: Student, Teacher, Administrator
Description: A student or authorized user requests to view the transcript.
Triggering Event: Student requests transcript access.
Steps Performed with Needed Information:
   1. Student logs in and requests transcript.
   2. System retrieves transcript.
   3. Transcript is displayed or sent.

Preconditions: Student has a valid account. 
Postconditions: Transcript is accessed. 
Alternate Scenarios: Administrator prints transcript.
Exception Scenarios: System downtime prevents retrieval.


Use Case 7: Graduation Process

Actors: Student, Administrator

Description: A student applies for graduation, which is processed by an administrator.

Triggering Event: Student submits a graduation request.

Steps Performed with Needed Information:
   1. Student applies for graduation.
   2. System verifies requirements.
   3. Administrator approves graduation.
   4. System updates student records.

Preconditions: Student meets graduation criteria. 

Postconditions: Student is marked as a graduate. 

Alternate Scenarios: Student defers graduation. 

Exception Scenarios: System fails to process graduation request.