# Grootan-Assessment-Round-Project

<h1 align="center">
🌐 Java 1.8
</h1>

> This project holds the source code of Conference-Time-Management project

## clone or download
```terminal
$ git clone https://github.com/sharangramana/Grootan-Assessment-Round-Project.git
```

## Problem Statement
### CONFERENCE TIME MANAGEMENT
<p>
You are planning a big programming conference and have received many proposals which have passed the initial screen process but you'rehaving trouble fitting them into the time constraints of the day --there are so many possibilities! So you write a program to do it for you.· The conference has multiple tracks each of which has a morning and afternoon session.· Each session contains multiple talks.· Morning sessions begin at 9am and must finish by 12 noon, forlunch.· Afternoon sessions begin at 1pm and must finish in time for the networking event.· The networking event can start no earlier than 4:00 and no later than 5:00.· No talk title has numbers in it.· All talk lengths are either in minutes (not hours) or lightning (5minutes).· Presenters will be very punctual; there needs to be no gap between sessions.Note that depending on how you choose to complete this problem, your solution may give a different ordering or combination of talks intotracks. This is acceptable; you don't need to exactly duplicate the sample output given here.
</p>

### Test input:
```terminal
Writing Fast Tests Against Enterprise Rails 60min
Overdoing it in Python 45min
Lua for the Masses 30min
Ruby Errors from Mismatched Gem Versions 45min
Common Ruby Errors 45min
Rails for Python Developers lightning
Communicating Over Distance 60min
Accounting-Driven Development 45min
Woah 30minSit Down and Write 30min
Pair Programming vs Noise 45min
Rails Magic 60minRuby on Rails: Why We Should Move On 60min
Clojure Ate Scala (on my project) 45min
Programming in the Boondocks of Seattle 30min
Ruby vs. Clojure for Back-End Development 30min
Ruby on Rails Legacy App Maintenance 60min
A World Without HackerNews 30min
User Interface CSS in Rails Apps 30min
```
### Test Output:
```terminal
Track 1:

09:00AM Writing Fast Tests Against Enterprise Rails 60min
10:00AM Overdoing it in Python 45min
10:45AM Lua for the Masses 30min
11:15AM Ruby Errors from Mismatched Gem Versions 45min
12:00PM Lunch01:00PM Ruby on Rails: Why We Should Move On 60min
02:00PM Common Ruby Errors 45min
02:45PM Pair Programming vs Noise 45min
03:30PM Programming in the Boondocks of Seattle 30min
04:00PM Ruby vs. Clojure for Back-End Development 30min
04:30PM User Interface CSS in Rails Apps 30min
05:00PM Networking Event

Track 2:

09:00AM Communicating Over Distance 60min
10:00AM Rails Magic 60min
11:00AM Woah 30min
11:30AM Sit Down and Write 30min
12:00PM Lunch
01:00PM Accounting-Driven Development 45min
01:45PM Clojure Ate Scala (on my project) 45min
02:30PM A World Without HackerNews 30min
03:00PM Ruby on Rails Legacy App Maintenance 60min
04:00PM Rails for Python Developers lightning
05:00PM Networking Event
```

### Algorithm

<div>
  <ul>
    <li> Read the input from the file and store it as list of strings</li>
    <li> Parse each String and get the necessary fields and store it in the object</li>
    <li> Sort the events based on time in descending order</li>
    <li> Morning session is 180 minutes and the evening is 240 minutes</li>
    <li> Find the best fit combination for each session and remove it from the main List of events</li>
    <li> Track the events that are removed and store it in the list in the format of output (using calender class to get the timings)</li>
    <li> If some sessions are yet to be filled, pass it on to the next day and repeat the above steps</li>
  </ul>
</div>

> Input.txt holds the input of the program

## BUGs or comments
[Create new Issues](https://github.com/sharangramana/Grootan-Assessment-Round-Project/issues) (preferred)
<br>
Email Me: sharangramana20@gmail.com

### License
[MIT](https://github.com/sharangramana/Grootan-Assessment-Round-Project/blob/master/LICENSE)

