-keepattributes Exceptions,InnerClasses,*Annotation*,Signature,EnclosingMethod

-dontoptimize
-dontpreverify
-dontwarn okio.**
-dontwarn org.bouncycastle.**
-dontwarn dji.**
-dontwarn com.dji.**
-dontwarn sun.**
-dontwarn java.**
-dontwarn com.amap.api.**
-dontwarn com.here.**
-dontwarn com.mapbox.**
-dontwarn okhttp3.**
-dontwarn retrofit2.**

-keepclassmembers enum * {
    public static <methods>;
}

-keepnames class * implements java.io.Serializable
-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    !static !transient <fields>;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}
-keep class * extends android.os.Parcelable {
    public static final android.os.Parcelable$Creator *;
}

-keep,allowshrinking class * extends dji.publics.DJIUI.** {
    public <methods>;
}

-keep class net.sqlcipher.** { *; }

-keep class net.sqlcipher.database.* { *; }

-keep class dji.** { *; }

-keep class com.dji.** { *; }

-keep class com.google.** { *; }

-keep class org.bouncycastle.** { *; }

-keep,allowshrinking class org.** { *; }

-keep class com.squareup.wire.** { *; }

-keep class sun.misc.Unsafe { *; }

-keep class com.secneo.** { *; }

-keep class org.greenrobot.eventbus.**{*;}

-keep class it.sauronsoftware.ftp4j.**{*;}

-keepclasseswithmembers,allowshrinking class * {
    native <methods>;
}

-keep class * implements com.google.gson.TypeAdapterFactory
-keep class * implements com.google.gson.JsonSerializer
-keep class * implements com.google.gson.JsonDeserializer

-keep class androidx.appcompat.widget.SearchView { *; }

-keepclassmembers class * extends android.app.Service
-keepclassmembers public class * extends android.view.View {
    void set*(***);
    *** get*();
}
-keepclassmembers class * extends android.app.Activity {
    public void *(android.view.View);
}
-keep class androidx.** { *; }
-keep class android.media.** { *; }
-keep class okio.** { *; }
-keep class com.lmax.disruptor.** { *; }
-keep class com.qx.wz.dj.rtcm.* { *; }

-dontwarn com.mapbox.services.android.location.LostLocationEngine
-dontwarn com.mapbox.services.android.location.MockLocationEngine
-keepclassmembers class * implements android.arch.lifecycle.LifecycleObserver {
    <init>(...);
}
# ViewModel's empty constructor is considered to be unused by proguard
-keepclassmembers class * extends android.arch.lifecycle.ViewModel {
    <init>(...);
}
# keep Lifecycle State and Event enums values
-keepclassmembers class android.arch.lifecycle.Lifecycle$State { *; }
-keepclassmembers class android.arch.lifecycle.Lifecycle$Event { *; }
# keep methods annotated with @OnLifecycleEvent even if they seem to be unused
# (Mostly for LiveData.LifecycleBoundObserver.onStateChange(), but who knows)
-keepclassmembers class * {
    @android.arch.lifecycle.OnLifecycleEvent *;
}

-keepclassmembers class * implements android.arch.lifecycle.LifecycleObserver {
    <init>(...);
}

-keep class * implements android.arch.lifecycle.LifecycleObserver {
    <init>(...);
}
-keepclassmembers class android.arch.** { *; }
-keep class android.arch.** { *; }
-dontwarn android.arch.**

-keep class org.apache.commons.** {*;}


#<------------ utmiss config start------------>
-keep class dji.sdk.utmiss.** { *; }
-keep class utmisslib.** { *; }
#<------------ utmiss config end------------>