<div class="article"><h1 ><font color="#AAA">class </font>WarningStatusItem</h1></div>

~~~java
 class WarningStatusItem implements Comparable<WarningStatusItem> 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.logics.warningstatuslogic</td></tr></table></html>



##### Description:



<font color="#666">This class wraps the required elements of the status into one WarningStatusItem.



##### Class Members:



##### Related:

<div class="api-row" id="djiwarningstatusitem_warninglevel"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwarningstatusitem_warninglevel_inline">WarningLevel</a></div></div><div class="inline-doc" id="djiwarningstatusitem_warninglevel_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WarningLevel</h6></div>

~~~java
 enum WarningLevel 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.logics.warningstatuslogic</td></tr></table></html>



##### Description:



<font color="#666">The warning level of the status



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwarningstatusitem_warninglevel_none_inline"></a>NONE</td><td><font color="#666">The status has an undetermined warning level.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwarningstatusitem_warninglevel_offline_inline"></a>OFFLINE</td><td><font color="#666">The status is offline.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwarningstatusitem_warninglevel_good_inline"></a>GOOD</td><td><font color="#666">The status is good.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwarningstatusitem_warninglevel_warning_inline"></a>WARNING</td><td><font color="#666">The status is a warning.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwarningstatusitem_warninglevel_error_inline"></a>ERROR</td><td><font color="#666">The status is an error.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwarningstatusitem_isurgentmessage"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwarningstatusitem_isurgentmessage_inline">isUrgentMessage</a></div></div><div class="inline-doc" id="djiwarningstatusitem_isurgentmessage_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isUrgentMessage</h6></div>

~~~java
 boolean isUrgentMessage() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.logics.warningstatuslogic</td></tr></table></html>



##### Description:



<font color="#666">Get the urgency of the message.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if message is urgent, <code>false</code> otherwise.</i></td></tr></table></html></div>

<div class="api-row" id="djiwarningstatusitem_getwarninglevel"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwarningstatusitem_getwarninglevel_inline">getWarningLevel</a></div></div><div class="inline-doc" id="djiwarningstatusitem_getwarninglevel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWarningLevel</h6></div>

~~~java
 WarningLevel getWarningLevel() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.logics.warningstatuslogic</td></tr></table></html>



##### Description:



<font color="#666">Get the warning level of the message.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">WarningLevel</td><td><font color="#666"><i>WarningLevel type of the warning level.</i></td></tr></table></html></div>

<div class="api-row" id="djiwarningstatusitem_getmessage"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwarningstatusitem_getmessage_inline">getMessage</a></div></div><div class="inline-doc" id="djiwarningstatusitem_getmessage_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMessage</h6></div>

~~~java
 String getMessage() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.logics.warningstatuslogic</td></tr></table></html>



##### Description:



<font color="#666">Get the message of the warning status item.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>String message for the WarningStatusItem.</i></td></tr></table></html></div>

<div class="api-row" id="djiwarningstatusitem_getdefaultitem"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwarningstatusitem_getdefaultitem_inline">getDefaultItem</a></div></div><div class="inline-doc" id="djiwarningstatusitem_getdefaultitem_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDefaultItem</h6></div>

~~~java
 static WarningStatusItem getDefaultItem() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.logics.warningstatuslogic</td></tr></table></html>



##### Description:



<font color="#666">Get a default warning status item with <br> - Warning level: WarningLevel.OFFLINE  <br> - urgentMessage: false <br> - message: "" (Empty string) <br> This can be used for initialization.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Utils/DJIWarningStatusItem.html#djiwarningstatusitem">WarningStatusItem</a></td><td><font color="#666"><i>Default WarningStatusItem.</i></td></tr></table></html></div>

<div class="api-row" id="djiwarningstatusitem_gettestitem"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwarningstatusitem_gettestitem_inline">getTestItem</a></div></div><div class="inline-doc" id="djiwarningstatusitem_gettestitem_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTestItem</h6></div>

~~~java
 static WarningStatusItem getTestItem() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.logics.warningstatuslogic</td></tr></table></html>



##### Description:



<font color="#666">Get a test warning status item with <br> - Warning level: WarningLevel.ERROR <br> -  urgentMessage: true <br> - message: "Test Warning Status Logic Item"  <br> This can be used for unit and integration testing as required.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Utils/DJIWarningStatusItem.html#djiwarningstatusitem">WarningStatusItem</a></td><td><font color="#666"><i>Default WarningStatusItem.</i></td></tr></table></html></div>


