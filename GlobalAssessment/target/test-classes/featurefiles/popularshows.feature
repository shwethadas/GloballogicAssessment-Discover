Feature: Validation for Popularshows

Scenario: Validation for Favorite shows under My Videos

 Given Login into Discovery channel Application
 When Scroll down to Popular Shows
 And Click on the last video by pressing the icon right arrow
 And Click on Explore the Show
 When Click on Show More
 Then Check list of shows are displayed
 When Create a file and write all the show titles and duration into it
 When quite the Application