Feature: Outlookmail

Scenario: outlooklogin
Given User Launch on  Chrome Browser
When User  open url with "https://outlook.live.com/"
And click on signup
And Enter the Registered emailid as "praveenkalakoti1@gmail.com"
And click on next
And enter the password "pnk@1234"
And click signin
And click on yes
And click on new mail
And add recipient mail id "naveenk1@gmail.com"
And click on cc
And add cc recipient mail id "karan@gmail.com"
And add subject "assignment4"
And add content "PFA,follow the rules given"
And click on send  
Then Verify mail has been sent successfully 

 
 Scenario:  
 Given User Launch on  Chrome Browser
When User  open url with "https://outlook.live.com/"
And click on signup
And Enter the Registered emailid as "praveenkalakoti1@gmail.com"
And click on next
And enter the password "pnk@1234"
And click signin
And click on yes
And click on new mail
And click on send  
Then verify warned with a warning message 
 
