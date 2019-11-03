# mobiliya_task
Spring boot micro-services application
To run this application below are the steps:
1) First run DiscoveryServerApplication.java file from discovery-server application.
Application dashboard endpoint: http://localhost:8761/
Descreption: After hitting this url eureka admin dashboard will be displayed,
In this dashboard we can monitor System Status, Instances currently registered with Eureka
General Info like : 
Name	                      Value
total-avail-memory	        59mb
environment	                test
num-of-cpus	                4
current-memory-usage	      42mb (71%)
server-uptime	              00:27
registered-replicas	        http://localhost:8761/eureka/
unavailable-replicas	      http://localhost:8761/eureka/,

available-replicas	
Instance Info
Name	                      Value
ipAddr	                    192.168.0.101
status	                    UP

2) Now run MatchServiceApplication.java file from match-service application.
Rese request endpoint : http://localhost:8083/matches/getPlayerMatches/1/1
You will get response like:
{ 
   "player":{ 
      "playerId":1,
      "playerName":"Sachin",
      "totalScore":200,
      "noOfMatches":2
   },
   "matches":{ 
      "matchId":1,
      "date":"10-05-2011",
      "series_name":"WC2011",
      "runScored":"100",
      "playerId":1
   }
}

2) Now run PlayerServiceApplication.java file from player-service application.
Rese request endpoint : http://localhost:8082/player/getPlayerMatches/1
You will get response like:

{ 
   "player":{ 
      "playerId":1,
      "playerName":"Sachin",
      "totalScore":200,
      "noOfMatches":2
   },
   "matchDetailsList":[ 
      { 
         "matchId":1,
         "date":"10-05-2011",
         "series_name":"WC2011",
         "runScored":"100",
         "playerId":1
      },
      { 
         "matchId":2,
         "date":"22-08-2001",
         "series_name":"INDBAN",
         "runScored":"100",
         "playerId":1
      }
   ]
}
