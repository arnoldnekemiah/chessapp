/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.ff
 *  com.google.android.gms.ads.doubleclick.AppEventListener
 *  java.lang.String
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.ff;
import com.google.android.gms.ads.doubleclick.AppEventListener;

public final class kd
extends ff {
    public final AppEventListener a;

    public kd(AppEventListener appEventListener) {
        this.a = appEventListener;
    }

    public final void onAppEvent(String string, String string2) {
        this.a.onAppEvent(string, string2);
    }
}

