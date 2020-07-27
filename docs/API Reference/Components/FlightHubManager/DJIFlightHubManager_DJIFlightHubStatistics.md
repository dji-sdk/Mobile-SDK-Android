<div class="article"><h1 ><font color="#AAA">class </font>Statistics</h1></div>

~~~java
 final class Statistics 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub.model</td></tr></table></html>



##### Description:



<font color="#666">The flight statistics includes total and average flight duration. It also provides a distributed  diagram data of flight duration.



##### Class Members:

<div class="api-row" id="djiflighthubmanager_djiflighthubstatistics_totalduration"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_djiflighthubstatistics_totalduration_inline">getTotalDuration</a></div></div><div class="inline-doc" id="djiflighthubmanager_djiflighthubstatistics_totalduration_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTotalDuration</h6></div>

~~~java
 double getTotalDuration() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub.model</td></tr></table></html>



##### Description:



<font color="#666">Gets total flight duration over a period of time in minutes.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double</td><td><font color="#666"><i>The total flight duration.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_djiflighthubstatistics_averageduration"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_djiflighthubstatistics_averageduration_inline">getAverageDuration</a></div></div><div class="inline-doc" id="djiflighthubmanager_djiflighthubstatistics_averageduration_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAverageDuration</h6></div>

~~~java
 double getAverageDuration() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub.model</td></tr></table></html>



##### Description:



<font color="#666">Gets average flight duration over a period of time in minutes.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double</td><td><font color="#666"><i>The average flight duration.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_djiflighthubstatistics_durationdistribution"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_djiflighthubstatistics_durationdistribution_inline">getDurationDistribution</a></div></div><div class="inline-doc" id="djiflighthubmanager_djiflighthubstatistics_durationdistribution_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDurationDistribution</h6></div>

~~~java
 LinkedHashMap<String, Integer> getDurationDistribution() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub.model</td></tr></table></html>



##### Description:



<font color="#666">Gets the histogram distribution of the flight durations (in minutes). The duration intervals  are [0, 5), [5, 10), [10, 15), [15, 20) and [20, +&#x221E;).



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">LinkedHashMap&lt;String, Integer&gt;</td><td><font color="#666"><i>A LinkedHashMap with string keys "0-5", "5-10", "10-15", "15-20" and "20+" in order. The values are the number of flights in the duration range.</i></td></tr></table></html></div>


