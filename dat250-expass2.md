# Mikael's Assignment 2 Report

## Introduction

The goal of this assignment was to develop a simple REST API for a Poll application, which includes a domain model comprising users, polls, vote options, and votes. I implemented CRUD operations for each of these resources while making decisions regarding the serialization of associated entities. Managing relationships between these entities was key, as improper serialization could lead to issues like circular dependencies.

Throughout the process, I tested the API using an HTTP client, although I was unable to fully automate the testing process within the given timeframe.

## Setup and Installation

For this assignment, the primary tool I needed to install was the HTTP client for testing. I chose Bruno, as it allowed me to easily create and run a collection of HTTP requests whenever I launched a new instance of the application. This worked smoothly.

I faced some challenges during the previous assignment while setting up IntelliJ IDEA, particularly with the Flatpak version of the IDE, which caused complications. However, I resolved this by switching to a manual installation, and since then, the IDE has worked without issues.

## Domain Model

I encountered difficulties when designing the domain model according to the class diagram provided, while also ensuring that the code remained clean and maintainable. As of the deadline, the current model does not fully match the assignment requirements. Specifically, I struggled to establish the correct relationships between the classes in a way that avoided serialization problems.

I haven’t yet encountered circular dependency issues since there are no cycles in the current model. However, I expect to face challenges when I revise the model to fully implement the correct dependencies. In particular, I found representing the votes resource problematic, especially when it came to updating votes. This area may need significant refactoring in the future.

## Testing

I consistently tested the application using HTTP requests in Bruno as I iterated on the code. While this manual testing helped ensure the functionality of the API, I did not manage to set up automated tests before the deadline. Automation would be a key focus for future iterations of the project.

## Conclusion

This assignment provided valuable experience with Spring Web MVC annotations, and I now feel more confident addressing some of the issues I encountered. However, I believe that the domain model we were tasked with implementing presents certain challenges for a REST API, particularly with user management and access control.

Given that the assignment does not involve databases, it sometimes felt like the logic was difficult to manage. Moving forward, I plan to revise the model and improve how the relationships between entities are handled, especially concerning votes and serialization.