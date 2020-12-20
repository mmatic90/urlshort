# urlshort
Url Shortener - Infobip HTTP service task

Account Registration
localhost:8080/account for creating a new account (POST method: "AccountId":"insertYourUsernameHere").
After successful creation you will get a 8-character password.

Get authenticated (username and password).

URL Shortener
localhost:8080/register for registering url to shorten (POST method: "Url":"inertYourUrlHere").
After successful url insertion you will get the shortened url.

Statistics
localhost:8080/statistic/{accountName} to access the statistics page for the account and view the list of registered url and number of hits for each url.
