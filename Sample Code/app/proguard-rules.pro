-keepattributes Exceptions,InnerClasses,*Annotation*,Signature,EnclosingMethod

-dontwarn okio.**
-dontwarn org.bouncycastle.**
-dontwarn dji.**
-dontwarn com.dji.**
-dontwarn sun.**
-dontwarn java.**

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

-keepclasseswithmembers,allowshrinking class * {
    native <methods>;
}

-keep class * implements com.google.gson.TypeAdapterFactory
-keep class * implements com.google.gson.JsonSerializer
-keep class * implements com.google.gson.JsonDeserializer

-keep class android.support.v7.widget.SearchView { *; }

-keepclassmembers class * extends android.app.Service
-keepclassmembers public class * extends android.view.View {
    void set*(***);
    *** get*();
}
-keepclassmembers class * extends android.app.Activity {
    public void *(android.view.View);
}
-keep class android.support.** { *; }
-keep class android.media.** { *; }
-keep class okio.** { *; }
-keep class com.lmax.disruptor.** {
    *;
}

-dontwarn com.mapbox.services.android.location.LostLocationEngine
-dontwarn com.mapbox.services.android.location.MockLocationEngine