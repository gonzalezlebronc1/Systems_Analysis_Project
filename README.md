# Systems_Analysis_Project

Gislain Rubuto

Phillip Phuong

Anthony Boykin

CPS 310 - Phase 1 - System Overview & Use Cases

**1. Introduction**  

*Purpose*  
&nbsp;&nbsp;&nbsp;&nbsp;This document outlines the system analysis for a university process management system. The goal is to improve  
&nbsp;&nbsp;&nbsp;&nbsp;system tasks such as applying to the university, scheduling classes, withdrawing from a class, final grade submission,  
&nbsp;&nbsp;&nbsp;&nbsp;changing majors, viewing transcripts, and graduation.  

*Scope*  
&nbsp;&nbsp;&nbsp;&nbsp;This document covers the first analysis phase, including system requirements, context diagrams, and use case definitions.  

*Definitions & Acronyms*  

&nbsp;&nbsp;&nbsp;&nbsp;*DFD: Data Flow Diagram*  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A data flow diagram (DFD) is a graphical representation that visually depicts how data moves through a system or process,  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;illustrating the flow of information from its source to its destination, including where it is stored and how it is transformed  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;along the way, using standardized symbols to represent different elements like processes, data stores, and external entities.  

&nbsp;&nbsp;&nbsp;&nbsp;*ERD: Entity Relationship Diagram*  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;An entity relationship diagram (ERD) is a visual representation that shows how different entities (people, objects, or concepts)  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;relate to each other within a system.  

&nbsp;&nbsp;&nbsp;&nbsp;*Use Case Diagram*  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A use case diagram is a visual representation of how users (called "actors") interact with a system, highlighting the different  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;functionalities and goals they can achieve within that system.  


*References*  
&nbsp;&nbsp;&nbsp;&nbsp;University of Dayton system requirements  

*Overview*  
&nbsp;&nbsp;&nbsp;&nbsp;The document will provide an overview of the environment that this system must operate within, including other software and hardware  
&nbsp;&nbsp;&nbsp;&nbsp;systems that will interface with this system. An overview of the features to be provided by the software. Description of the  
&nbsp;&nbsp;&nbsp;&nbsp;types of users that will interact with this software and assumed properties of those users. Any constraints that have been placed  
&nbsp;&nbsp;&nbsp;&nbsp;on the project (that are not, in themselves, requirements). Any assumptions that are being made in specifying these requirements.  


**2. Overall Description**  

*Product Perspective*  
&nbsp;&nbsp;&nbsp;&nbsp;The system's goal is to interface with the student management and university databases that are currently in place.  
&nbsp;&nbsp;&nbsp;&nbsp;It will act as a focal point for managing administrative procedures for students.  

*Product Functions*  
&nbsp;&nbsp;&nbsp;&nbsp;*applying to the university*  
&nbsp;&nbsp;&nbsp;&nbsp;*scheduling classes*  
&nbsp;&nbsp;&nbsp;&nbsp;*withdrawing from a class*  
&nbsp;&nbsp;&nbsp;&nbsp;*final class grade submission*  
&nbsp;&nbsp;&nbsp;&nbsp;*changing your major*  
&nbsp;&nbsp;&nbsp;&nbsp;*viewing your transcript*  
&nbsp;&nbsp;&nbsp;&nbsp;*graduation process*  
&nbsp;&nbsp;&nbsp;&nbsp;*dropping out of the university*  

*User Characteristics*  
&nbsp;&nbsp;&nbsp;&nbsp;**Students:** Primary users interacting with the system for academic management  
&nbsp;&nbsp;&nbsp;&nbsp;**Administrators:** Manage student records and approve requests  
&nbsp;&nbsp;&nbsp;&nbsp;**Professors:** Submit final grades  

*Constraints*  
&nbsp;&nbsp;&nbsp;&nbsp;Web-based with mobile compatibility  

*Assumptions*  
&nbsp;&nbsp;&nbsp;&nbsp;Users have basic technical proficiency  
&nbsp;&nbsp;&nbsp;&nbsp;University maintains up-to-date records  


**3. Systems Analysis** 

*Context Level Data Flow Diagram*
&nbsp;&nbsp;&nbsp;&nbsp;The Context-Level Data Flow Diagram includes the main process representing the University's processing system. The entities include the students both enrolled  
&nbsp;&nbsp;&nbsp;&nbsp;and not yet enrolled, the faculty who manage approvals and update records via the system, and finally the staff who store and retrieve records.
