Feature: Validating Favourite shows

Scenario: Validation for Favorite shows under My Videos

 Given Navigate to  Discovery channel Application
 When Select “See All Shows” available in “Shows” tab
 And Select the show which contain Apollo
 Then Verify the favourite status is displayed or not
 When Click on favourite Icon
 And Click on menu Icon
 And Click on My Videos
 Then Verify favorite or unfavorite titles under “FAVORITE SHOWS” is displayed or not
 When Close the Application