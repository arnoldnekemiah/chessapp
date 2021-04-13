/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IInterface
 *  c.b.b.a.c.a
 *  c.b.b.a.e.d.bc
 *  com.google.android.gms.internal.measurement.zzy
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c.b.b.a.e.d;

import android.os.Bundle;
import android.os.IInterface;
import c.b.b.a.c.a;
import c.b.b.a.e.d.bc;
import c.b.b.a.e.d.dc;
import c.b.b.a.e.d.zb;
import com.google.android.gms.internal.measurement.zzy;
import java.util.Map;

public interface wb
extends IInterface {
    public void beginAdUnitExposure(String var1, long var2);

    public void clearConditionalUserProperty(String var1, String var2, Bundle var3);

    public void clearMeasurementEnabled(long var1);

    public void endAdUnitExposure(String var1, long var2);

    public void generateEventId(zb var1);

    public void getAppInstanceId(zb var1);

    public void getCachedAppInstanceId(zb var1);

    public void getConditionalUserProperties(String var1, String var2, zb var3);

    public void getCurrentScreenClass(zb var1);

    public void getCurrentScreenName(zb var1);

    public void getGmpAppId(zb var1);

    public void getMaxUserProperties(String var1, zb var2);

    public void getTestFlag(zb var1, int var2);

    public void getUserProperties(String var1, String var2, boolean var3, zb var4);

    public void initForTests(Map var1);

    public void initialize(a var1, zzy var2, long var3);

    public void isDataCollectionEnabled(zb var1);

    public void logEvent(String var1, String var2, Bundle var3, boolean var4, boolean var5, long var6);

    public void logEventAndBundle(String var1, String var2, Bundle var3, zb var4, long var5);

    public void logHealthData(int var1, String var2, a var3, a var4, a var5);

    public void onActivityCreated(a var1, Bundle var2, long var3);

    public void onActivityDestroyed(a var1, long var2);

    public void onActivityPaused(a var1, long var2);

    public void onActivityResumed(a var1, long var2);

    public void onActivitySaveInstanceState(a var1, zb var2, long var3);

    public void onActivityStarted(a var1, long var2);

    public void onActivityStopped(a var1, long var2);

    public void performAction(Bundle var1, zb var2, long var3);

    public void registerOnMeasurementEventListener(bc var1);

    public void resetAnalyticsData(long var1);

    public void setConditionalUserProperty(Bundle var1, long var2);

    public void setConsent(Bundle var1, long var2);

    public void setConsentThirdParty(Bundle var1, long var2);

    public void setCurrentScreen(a var1, String var2, String var3, long var4);

    public void setDataCollectionEnabled(boolean var1);

    public void setDefaultEventParameters(Bundle var1);

    public void setEventInterceptor(bc var1);

    public void setInstanceIdProvider(dc var1);

    public void setMeasurementEnabled(boolean var1, long var2);

    public void setMinimumSessionDuration(long var1);

    public void setSessionTimeoutDuration(long var1);

    public void setUserId(String var1, long var2);

    public void setUserProperty(String var1, String var2, a var3, boolean var4, long var5);

    public void unregisterOnMeasurementEventListener(bc var1);
}

