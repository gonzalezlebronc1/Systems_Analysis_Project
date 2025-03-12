# Data Structures

## Student  
Student = StudentID +  
          Name +  
          DOB +  
          Major +  
          AcademicStatus +  
          GraduationEligibility  

---

## Faculty  
Faculty = FacultyID +  
          Name +  
          Department  

---

## ClassData  
ClassData = ClassID +  
            CourseID +  
            FacultyID +  
            Term +  
            Capacity +  
            EnrolledStudents  

---

## CourseDatabase  
CourseDatabase = CourseID +  
                 CourseName +  
                 Description +  
                 (Prerequisites = {CourseID}) +  
                 Credits  

---

## Grades  
Grades = GradeID +  
         StudentID +  
         ClassID +  
         AssignmentID +  
         Grade +  
         DateSubmitted  

---

## ApplicationRecords  
ApplicationRecords = ApplicationID +  
                     StudentID +  
                     Status +  
                     (ReviewerNotes) +  
                     DecisionDate  

---

## StudentRecords  
StudentRecords = StudentID +  
                 CurrentMajor +  
                 (NewMajor) +  
                 Status +  
                 (DecisionDate) +  
                 (Comments)  

---

## AdministrativeRecords  
AdministrativeRecords = StudentID +  
                        [ GraduationStatus +  
                          CompletionDate +  
                          DegreeAwarded |  
                          DropoutStatus +  
                          DropoutDate +  
                          Reason ]  

---

## Roster  
Roster = RosterID +  
         ClassID +  
         StudentID +  
         Term +  
         Status  

---

# Data Element Descriptions
