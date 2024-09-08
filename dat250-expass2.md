# Mikael's Assignment 2 Report

## Introduction

In this assignment I will set up a a model specified by the given class diagram
consisting of the classes User, Poll, Vote and VoteOption. I will then have to
implement the mapping functionality of spring in order to register and fetch
the resources, which will be stored in memory as the server runs. I should
also set up automated testing for the API.

## Installation

I did not experience any trouble installing the HTTP client detailed in the task
description, although for the first assignment I had a little trouble with Intellij
as I first tried the flatpak version, which was more trouble than it was worth.
Now that it is installed without containerization it works just fine.

## Model

The user class has been no problem implementing and setting up mappings for,
as  that is quite straightforward. I have been somewhat confused about how to
represent the other classes however, as it is quite unusual storing this kind
of information in memory, and the way the classes are interconnected and then
the question of how the requests will work when you have a user being the
"owner" of a poll for example, is not something I grasp entirely.

## Testing

So far I have only set up some test scenarios in a bruno collection, which I run
as I make changes to the project to see if I get the desired behaviour. There
is not yet any automation.