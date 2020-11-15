#Monitor your application via Micrometer
If you want to monitor your application or let's say better a part of your application 
you should annotate your code (public class) with @Timed. 
(In case you want to record private method you could use MeterRegistry)

When your code is executed the result will be exposed via /actuator. 

Now a prerequisite is to have installed micrometer db which retrieves the result via pooling mechanism from actuator endpoints. 

Now you should have all your data stored in micrometer db. 
From that point you can observe the behavior via micrometer page or you could setup Grafana.


# SonarQube 
It depends from project to project how you wish to setup Sonar-Qube.
In our case we give the sonar properties via configuration.
So, now you need to install a sonar scanner in order to send your application result to SonarQube server.

 