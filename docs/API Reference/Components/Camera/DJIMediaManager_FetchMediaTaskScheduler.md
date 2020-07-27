<div class="article"><h1 ><font color="#AAA">class </font>FetchMediaTaskScheduler</h1></div>

~~~java
 class FetchMediaTaskScheduler 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">The camera stores the media it captures to SD or SSD storage on the product. When the mobile device wants to access the media, it needs to download it from the product over the wireless link between the product, remote controller and mobile device (depending on the product). Each media file captured by the camera can have several types of content associated with it including the full resolution media content, a lower resolution preview, a lower resolution again thumbnail, and custom data within the file's XML meta data. The full resolution content can take a long time to download over the wireless link, so it is often useful to download previews or thumbnails of many media files, and then only download the full resolution content of fewer select media files. This scheduler conveniently allows the small content types of media files (preview, thumbnail and custom data) to be downloaded to the mobile device. The scheduler can be used to queue and download content from a series of files, as well as used to re-prioritize files during the download process. The scheduler holds a list of pending tasks and it completes them one by one in first-in-first-out order. To prioritize a new task, <code><a href="/Components/Camera/DJIMediaManager_FetchMediaTaskScheduler.html#djimediamanager_fetchmediataskscheduler_movetasktonext">moveTaskToNext</a></code> can be used. Each task relates to a media file and can download multiple content types sequentially. When the last content type of a task starts being downloaded, the task is removed from the list. Note, the scheduler cannot be used to queue the download of full resolution media content. Only <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_fetchfiledata">fetchFileData</a></code> can be used for this.



##### Class Members:

<div class="api-row" id="djimediamanager_fetchmediataskscheduler_state"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_fetchmediataskscheduler_state_inline">getState</a></div></div><div class="inline-doc" id="djimediamanager_fetchmediataskscheduler_state_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getState</h6></div>

~~~java
 FetchMediaTaskSchedulerState getState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">State of the scheduler.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_FetchMediaTaskScheduler.html#djimediamanager_djifetchmediataskschedulerstate">FetchMediaTaskSchedulerState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJIMediaManager_FetchMediaTaskScheduler.html#djimediamanager_djifetchmediataskschedulerstate">FetchMediaTaskSchedulerState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_fetchmediataskscheduler_pendingtasks"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_fetchmediataskscheduler_pendingtasks_inline">getPendingTasks</a></div></div><div class="inline-doc" id="djimediamanager_fetchmediataskscheduler_pendingtasks_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPendingTasks</h6></div>

~~~java
 List<FetchMediaTask> getPendingTasks() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Gets a copy of the pending tasks.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/Camera/DJIMediaManager_DJIFetchMediaTask.html#djimediamanager_djifetchmediatask">FetchMediaTask</a>&gt;</td><td><font color="#666"><i>A list of <code><a href="/Components/Camera/DJIMediaManager_DJIFetchMediaTask.html#djimediamanager_djifetchmediatask">FetchMediaTask</a></code> objects.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_fetchmediataskscheduler_movetasktoend"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_fetchmediataskscheduler_movetasktoend_inline">moveTaskToEnd</a></div></div><div class="inline-doc" id="djimediamanager_fetchmediataskscheduler_movetasktoend_inline"

><div class="article"><h6 ><font color="#AAA">method </font>moveTaskToEnd</h6></div>

~~~java
 void moveTaskToEnd(FetchMediaTask task) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Pushes a task to the back of the queue. The task will be executed after all other tasks are complete.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_DJIFetchMediaTask.html#djimediamanager_djifetchmediatask">FetchMediaTask</a> <font color="#000">task</td><td><font color="#666"><i>Task to schedule.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_fetchmediataskscheduler_movetasktonext"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_fetchmediataskscheduler_movetasktonext_inline">moveTaskToNext</a></div></div><div class="inline-doc" id="djimediamanager_fetchmediataskscheduler_movetasktonext_inline"

><div class="article"><h6 ><font color="#AAA">method </font>moveTaskToNext</h6></div>

~~~java
 void moveTaskToNext(FetchMediaTask task) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Pushes a task to the front of the queue. The task will be executed after the executing task is complete.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_DJIFetchMediaTask.html#djimediamanager_djifetchmediatask">FetchMediaTask</a> <font color="#000">task</td><td><font color="#666"><i>Task to schedule.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_fetchmediataskscheduler_removetask"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_fetchmediataskscheduler_removetask_inline">removeTask</a></div></div><div class="inline-doc" id="djimediamanager_fetchmediataskscheduler_removetask_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeTask</h6></div>

~~~java
 void removeTask(MediaFile file, FetchMediaTaskContent content) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Remove content from tasks, and tasks from the scheduler. If all content is removed from a task, then the task is removed from the scheduler.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a> <font color="#000">file</td><td><font color="#666"><i>An object of <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_DJIFetchMediaTask.html#djimediamanager_djifetchmediataskcontent">FetchMediaTaskContent</a> <font color="#000">content</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJIMediaManager_DJIFetchMediaTask.html#djimediamanager_djifetchmediataskcontent">FetchMediaTaskContent</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_fetchmediataskscheduler_removealltasks"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_fetchmediataskscheduler_removealltasks_inline">removeAllTasks</a></div></div><div class="inline-doc" id="djimediamanager_fetchmediataskscheduler_removealltasks_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAllTasks</h6></div>

~~~java
 void removeAllTasks() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Removes all the pending tasks.

</div>

<div class="api-row" id="djimediamanager_fetchmediataskscheduler_suspend"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_fetchmediataskscheduler_suspend_inline">suspend</a></div></div><div class="inline-doc" id="djimediamanager_fetchmediataskscheduler_suspend_inline"

><div class="article"><h6 ><font color="#AAA">method </font>suspend</h6></div>

~~~java
 void suspend(CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Suspends the scheduler. The scheduler will not continue to execute tasks in the queue.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The <code>completion callback</code> with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_fetchmediataskscheduler_resume"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_fetchmediataskscheduler_resume_inline">resume</a></div></div><div class="inline-doc" id="djimediamanager_fetchmediataskscheduler_resume_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resume</h6></div>

~~~java
 void resume(CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Resumes the scheduler. The scheduler will execute tasks in the queue sequentially.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The <code>completion callback</code> with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_fetchmediataskscheduler_issuspendaftersinglefetchtaskfailure"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_fetchmediataskscheduler_issuspendaftersinglefetchtaskfailure_inline">isSuspendAfterSingleFetchTaskFailure</a></div></div><div class="inline-doc" id="djimediamanager_fetchmediataskscheduler_issuspendaftersinglefetchtaskfailure_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isSuspendAfterSingleFetchTaskFailure</h6></div>

~~~java
 boolean isSuspendAfterSingleFetchTaskFailure() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Determines whether suspend the scheduler when an error occurs during the execution.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_fetchmediataskscheduler_setsuspendaftersinglefetchtaskfailure"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_fetchmediataskscheduler_setsuspendaftersinglefetchtaskfailure_inline">setSuspendAfterSingleFetchTaskFailure</a></div></div><div class="inline-doc" id="djimediamanager_fetchmediataskscheduler_setsuspendaftersinglefetchtaskfailure_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSuspendAfterSingleFetchTaskFailure</h6></div>

~~~java
 void setSuspendAfterSingleFetchTaskFailure(boolean suspendAfterSingleFetchTaskFailure) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Sets if suspend the scheduler when an error occurs during the execution.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">suspendAfterSingleFetchTaskFailure</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djimediamanager_djifetchmediataskschedulerstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djifetchmediataskschedulerstate_inline">FetchMediaTaskSchedulerState</a></div></div><div class="inline-doc" id="djimediamanager_djifetchmediataskschedulerstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FetchMediaTaskSchedulerState</h6></div>

~~~java
 enum FetchMediaTaskSchedulerState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">States of the fetch media file task scheduler <code><a href="/Components/Camera/DJIMediaManager_FetchMediaTaskScheduler.html#djimediamanager_fetchmediataskscheduler">FetchMediaTaskScheduler</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djifetchmediataskschedulerstate_idle_inline"></a>IDLE</td><td><font color="#666">Scheduler is waiting for tasks.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djifetchmediataskschedulerstate_executing_inline"></a>EXECUTING</td><td><font color="#666">Scheduler is executing tasks.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djifetchmediataskschedulerstate_suspended_inline"></a>SUSPENDED</td><td><font color="#666">Scheduler is suspended. Use <code><a href="/Components/Camera/DJIMediaManager_FetchMediaTaskScheduler.html#djimediamanager_fetchmediataskscheduler_resume">resume</a></code> to resume the scheduler.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djifetchmediataskschedulerstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djimediamanager_djifetchmediatask"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJIMediaManager_DJIFetchMediaTask.html">FetchMediaTask</a></div></div>
