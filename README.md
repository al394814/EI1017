# EI1017
Task Management Tool - README

This project involves developing a task management tool to efficiently handle the tasks of a single project. In the second phase, you'll learn to store data, allowing you to manage multiple projects and select the project you want to work on when launching the tool.

A project comprises a group of individuals assigned to various tasks. Each person can participate in multiple tasks, and each task will have a designated responsible person. Tasks aim to produce results of different types.

Person Class:

Fields: Name, Email, List of tasks for which they are responsible.
Task Class:

Fields: Title, Description, List of assigned persons, Responsible person, Priority (1: very low, 5: very high), Creation date, Completion date (optional), Status (completed or not), Expected task outcome, List of tags for common topics.
Result Class:

Fields: Identifier (unique string), Expected hours of production, Internal or commercial designation.
Result Subclasses:

Documentation: Fields for format (Word, PDF, plain text, etc.), number of pages, and disk space.
Program: Fields for programming language used, number of lines of code, and number of modules.
Library: Similar fields to the Program subclass.
Web page: Fields to indicate if it's static or dynamic, programming language used, and back-end technology.
Functionalities:

Start a new project and assign a name to it.
Add individuals working on the project.
Add tasks along with their details.
Mark a task as completed.
Add or remove individuals from a task.
List the people assigned to a project.
List the tasks of a project with the following details:
Task title
Assigned persons, highlighting the responsible person
Task completion status
Task outcome
