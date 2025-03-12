# Data Structures

## Student  
Student = StudentID +  
&nbsp;&nbsp;&nbsp;&nbsp;Name +  
&nbsp;&nbsp;&nbsp;&nbsp;DOB +  
&nbsp;&nbsp;&nbsp;&nbsp;Major +  
&nbsp;&nbsp;&nbsp;&nbsp;AcademicStatus +  
&nbsp;&nbsp;&nbsp;&nbsp;GraduationEligibility  

---

## Faculty  
Faculty = FacultyID +  
&nbsp;&nbsp;&nbsp;&nbsp;Name +  
&nbsp;&nbsp;&nbsp;&nbsp;Department  

---

## ClassData  
ClassData = ClassID +  
&nbsp;&nbsp;&nbsp;&nbsp;CourseID +  
&nbsp;&nbsp;&nbsp;&nbsp;FacultyID +  
&nbsp;&nbsp;&nbsp;&nbsp;Term +  
&nbsp;&nbsp;&nbsp;&nbsp;Capacity +  
&nbsp;&nbsp;&nbsp;&nbsp;EnrolledStudents  

---

## CourseDatabase  
CourseDatabase = CourseID +  
&nbsp;&nbsp;&nbsp;&nbsp;CourseName +  
&nbsp;&nbsp;&nbsp;&nbsp;Description +  
&nbsp;&nbsp;&nbsp;&nbsp;(Prerequisites = {CourseID}) +  
&nbsp;&nbsp;&nbsp;&nbsp;Credits  

---

## Grades  
Grades = GradeID +  
&nbsp;&nbsp;&nbsp;&nbsp;StudentID +  
&nbsp;&nbsp;&nbsp;&nbsp;ClassID +  
&nbsp;&nbsp;&nbsp;&nbsp;AssignmentID +  
&nbsp;&nbsp;&nbsp;&nbsp;Grade +  
&nbsp;&nbsp;&nbsp;&nbsp;DateSubmitted  

---

## ApplicationRecords  
ApplicationRecords = ApplicationID +  
&nbsp;&nbsp;&nbsp;&nbsp;StudentID +  
&nbsp;&nbsp;&nbsp;&nbsp;Status +  
&nbsp;&nbsp;&nbsp;&nbsp;(ReviewerNotes) +  
&nbsp;&nbsp;&nbsp;&nbsp;DecisionDate  

---

## StudentRecords  
StudentRecords = StudentID +  
&nbsp;&nbsp;&nbsp;&nbsp;CurrentMajor +  
&nbsp;&nbsp;&nbsp;&nbsp;(NewMajor) +  
&nbsp;&nbsp;&nbsp;&nbsp;Status +  
&nbsp;&nbsp;&nbsp;&nbsp;(DecisionDate) +  
&nbsp;&nbsp;&nbsp;&nbsp;(Comments)  

---

## AdministrativeRecords  
AdministrativeRecords = StudentID +  
&nbsp;&nbsp;&nbsp;&nbsp;[ GraduationStatus +  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CompletionDate +  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;DegreeAwarded |  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;DropoutStatus +  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;DropoutDate +  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Reason ]  

---

## Roster  
Roster = RosterID +  
&nbsp;&nbsp;&nbsp;&nbsp;ClassID +  
&nbsp;&nbsp;&nbsp;&nbsp;StudentID +  
&nbsp;&nbsp;&nbsp;&nbsp;Term +  
&nbsp;&nbsp;&nbsp;&nbsp;Status  

---

# Data Element Descriptions
