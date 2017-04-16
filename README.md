# COMP373: Bridge-Pattern Louie + Adil Project 3
Observer-Pattern

#Class Notes:
Definition: When there is one-to-many relationships between objects
such as if one object is modified, its dependent object are to be 
notified automatically. In observer pattern, the object that watch on the state of another object are called
Observer and the object that is being watched is called the Subject.

Example of Observer Pattern: Louie decides that for this 21'st birthday
he wants to buy a Brand New, black-on-black 2018 Mustang. So
he goes on Ford's dealership website, chooses the packages
he wants in his car. But the option and packages he chooses is currently out of stock!
He doesn't want to get another car, so he signs up and registers his 
email ID and clicks the 'NOTIFY ME' button. The Notify Me button is the observer pattern.
Similarly, there may be other users known as user1, or user 2, etc who have
also registered for notification just like Louie for the car. and they will
be notified once their car is available. If for example user4 is not 
registered since he/she never clicked on the 'NOTIFY ME' button, 
no email will be sent to him/her when the car is in stock
All the users who registered for notifications are Observers, the subject
of their observation is the black 2018 Mustang, which is the Observable.

#Supporting Document(s)

https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
Good resource With the basic definition and gives steps towards
implementing the pattern.

https://sourcemaking.com/design_patterns/observer
The example was really helpful along with the visual structure
helped paint a picture of what we wanted our design to be like.

https://www.youtube.com/watch?v=ojbT9WA70Fw
Good overview and unique example that also uses Intellij as its IDE.
