# **Data Elements**

## **Grades**  
| **Element** | **Alias** | **Description** | **Type** | **Base/Derived** | **Validation Criteria** | **Default Value** | **Comments** |
|------------|-----------|----------------|----------|------------------|------------------------|------------------|--------------|
| **GradeID** | GradeIdentifier | Unique identifier for the grade record | Integer | Base | Positive integer | None | None |
| **StudentID** | StudentRef | Reference to the student receiving the grade | Integer | Base | Must match existing StudentID in Student structure | None | None |
| **ClassID** | ClassRef | Reference to the class where the grade was assigned | Integer | Base | Must match existing ClassID in ClassData structure | None | None |
| **AssignmentID** | AssignmentRef | Identifier for the specific assignment | Integer | Base | Positive integer | None | None |
| **Grade** | Score | Actual grade value assigned to the student | Float | Base | Between 0.0 and 100.0 | None | None |
| **DateSubmitted** | SubmissionDate | Date when the grade was recorded | Date | Base | Valid date format (YYYY-MM-DD) | None | None |

---

## **Application Records**  
| **Element** | **Alias** | **Description** | **Type** | **Base/Derived** | **Validation Criteria** | **Default Value** | **Comments** |
|------------|-----------|----------------|----------|------------------|------------------------|------------------|--------------|
| **ApplicationID** | AppRef | Unique identifier for the application record | Integer | Base | Positive integer | None | None |
| **StudentID** | ApplicantRef | Reference to the student submitting the application | Integer | Base | Must match existing StudentID in Student structure | None | None |
| **Status** | AppStatus | Current status of the application | String | Base | "Pending", "Approved", or "Rejected" | "Pending" | None |
| **ReviewerNotes** | ReviewComments | Notes from the reviewer about the application | String | Derived | None | None | Optional |
| **DecisionDate** | DecisionTimestamp | Date when the final decision was made | Date | Derived | Valid date format (YYYY-MM-DD) | None | None |

---

## **Withdrawal**  
| **Element** | **Alias** | **Description** | **Type** | **Base/Derived** | **Validation Criteria** | **Default Value** | **Comments** |
|------------|-----------|----------------|----------|------------------|------------------------|------------------|--------------|
| **WithdrawalID** | WithdrawRef | Unique identifier for the withdrawal record | Integer | Base | Positive integer | None | None |
| **StudentID** | StudentRef | Reference to the student withdrawing from the class | Integer | Base | Must match existing StudentID in Student structure | None | None |
| **ClassID** | ClassRef | Reference to the class being withdrawn from | Integer | Base | Must match existing ClassID in ClassData structure | None | None |
| **WithdrawalDate** | WithdrawDate | Date when the withdrawal occurred | Date | Base | Valid date format (YYYY-MM-DD) | None | None |
| **Reason** | WithdrawReason | Explanation for the withdrawal | String | Derived | None | None | Optional |

---

## **Student**  
| **Element** | **Alias** | **Description** | **Type** | **Base/Derived** | **Validation Criteria** | **Default Value** | **Comments** |
|------------|-----------|----------------|----------|------------------|------------------------|------------------|--------------|
| **StudentID** | ID | Unique identifier for a student | Integer | Base | Positive, unique | None | None |
| **Name** | FullName | Student’s full legal name | String | Base | Not null, max length 100 characters | None | None |
| **DOB** | DateOfBirth | Student’s date of birth | Date | Base | Must be valid date, not in future | None | None |
| **Major** | FieldOfStudy | Student’s current major | String | Base | Must match predefined list of majors | None | None |
| **AcademicStatus** | Standing | Student’s academic standing (e.g., Good, Probation) | String | Derived | Must match predefined list of statuses | "Good" | None |
| **GraduationEligibility** | EligibleToGraduate | Whether the student meets graduation requirements | Boolean | Derived | True or False | False | None |

---

## **ClassData**  
| **Element** | **Alias** | **Description** | **Type** | **Base/Derived** | **Validation Criteria** | **Default Value** | **Comments** |
|------------|-----------|----------------|----------|------------------|------------------------|------------------|--------------|
| **ClassID** | ClassRef | Unique identifier for a class | Integer | Base | Positive, unique | None | Primary key |
| **CourseID** | CID | Identifier for the related course | Integer | Base | Must match an existing course ID | None | None |
| **FacultyID** | InstructorID | Identifier for the faculty teaching the class | Integer | Base | Must match an existing faculty ID | None | None |
| **Term** | Semester | Academic term (e.g., Fall 2025) | String | Base | Valid term format (e.g., "Fall YYYY") | None | None |
| **Capacity** | MaxEnrollment | Maximum number of students allowed | Integer | Base | Positive integer | None | None |
| **EnrolledStudents** | CurrentEnrollment | Number of students currently enrolled | Integer | Derived | Cannot exceed Capacity | 0 | None |

