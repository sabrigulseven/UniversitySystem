# UniversitySystem
University Enrollment System

1.	INTRODUCTION

In this project, the main purpose is to provide a tool for faculty members, students, and administrative staﬀ so that it can digitize the workflow of opening sessions, registering to classes, and assigning grades. By doing so, we add value to the business area and reduce wasted time of actors.


2. FULLY DRESSED USE CASES

![image](https://user-images.githubusercontent.com/80418105/194512284-146bb6a8-445e-4cbf-962e-2b729c23207e.png)


![image](https://user-images.githubusercontent.com/80418105/194512361-f02fbcd2-4dda-451a-8992-39fbecd55dc5.png)

3.SYSTEM SEQUENCE DIAGRAMS

![image](https://user-images.githubusercontent.com/80418105/194512873-14efee72-5382-4bbb-a258-ca8901c603db.png)

4. SEQUENCE DIAGRAMS

4.1. Registering to a Session

![image](https://user-images.githubusercontent.com/80418105/194513183-140483ef-e761-4782-9d62-ef14b71db2b0.png)

Discussion of Grasp Patterns

A Controller is a non-user interface object responsible for receiving or handling a system event. Controller pattern suggests that there should be a separating “Handler” class between the user input and the domain objects. This way when the domain logic changes, there will be no need to change user input handling. This is because the user input will only “know” the handler object and will not have any information about the domain. This separation is obtained with the ‘Department’ class in our example.

Information expert implies that a job must be carried out by the class that has the information to complete the job. In this example, Student has all the information to process to approve drafts. So, we assign the responsibility to approve draft to student object.

Let us assume that we have a class 'B' and we need to use its instances in somewhere in the code. This pattern makes us consider in which class the instances of ‘B’ created. Class ‘A’ should create an instance of class ‘B’ if one of these is true:

-	A contains/aggregates B,
-	A records instances of B,
-	A closely uses B objects,
-	A has the initializing data for B objects

According to these conditions (especially the first and second ones) the most logical creator of student objects is StudentCatalog object. Similarly, the most logical creator of term objects is the TermCatalog.

To achieve a higher degree of <b>low coupling and high cohesion</b>, we maintain the draft objects and the process of approving drafts in Student class. 


4.2. Advisor Approval

![image](https://user-images.githubusercontent.com/80418105/194513545-1f6bb982-c464-4d41-8d02-b19e6b875f02.png)


5.DOMAIN MODEL

![image](https://user-images.githubusercontent.com/80418105/194512964-4449b536-0abf-4846-ad78-fbeb7fbe2857.png)

