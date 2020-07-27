<div class="article"><h1 ><font color="#AAA">class </font>LEDColorPattern</h1></div>

~~~java
@EXClassNullAway
 class LEDColorPattern 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr></table></html>



##### Description:



<font color="#666">Pattern used to control a single color (red, green or blue) of the handheld controller's LED.



##### Class Members:

<div class="api-row" id="djihandheldcontroller_djihandheldcontrollerledcommand_djihandheldcontrollerledcolorpattern_pattern"><div class="api-col left">pattern</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandheldcontrollerledcommand_djihandheldcontrollerledcolorpattern_pattern_inline">pattern</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandheldcontrollerledcommand_djihandheldcontrollerledcolorpattern_pattern_inline"

><div class="article"><h6 ><font color="#AAA">property </font>pattern</h6></div>

~~~java
 ArrayList<Boolean> pattern
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr></table></html>



##### Description:



<font color="#666">Pattern to control the time varying behaviour of the LED color. Each element of <code>pattern</code> is a boolean  representing the LED on/off state for 0.125 seconds where <code>true</code> means the LED is on. The length of the pattern cannot exceed 32. By default, the array is empty, which will turn the LED color off.

</div>

<div class="api-row" id="djihandheldcontroller_djihandheldcontrollerledcommand_djihandheldcontrollerledcolorpattern_repeattimes"><div class="api-col left">repeatTimes</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandheldcontrollerledcommand_djihandheldcontrollerledcolorpattern_repeattimes_inline">repeatTimes</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandheldcontrollerledcommand_djihandheldcontrollerledcolorpattern_repeattimes_inline"

><div class="article"><h6 ><font color="#AAA">property </font>repeatTimes</h6></div>

~~~java
 int repeatTimes = 255
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr></table></html>



##### Description:



<font color="#666">The number of times to repeat the sequence with range [1, 255]. A value of 255 will repeat the sequence indefinitely until a new  command is sent. The default value is 255.

</div>


