/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.qg
 *  com.google.android.gms.ads.initialization.InitializationStatus
 *  java.lang.Object
 *  java.util.HashMap
 *  java.util.Map
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.qg;
import c.b.b.a.e.a.ug;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

public final class vg
implements InitializationStatus {
    public final qg a;

    public vg(qg qg2) {
        this.a = qg2;
    }

    public final Map getAdapterStatusMap() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"com.google.android.gms.ads.MobileAds", (Object)new ug());
        return hashMap;
    }
}

