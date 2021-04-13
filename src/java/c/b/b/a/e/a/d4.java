/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.ads.initialization.AdapterStatus
 *  com.google.android.gms.ads.initialization.InitializationStatus
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c.b.b.a.e.a;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.Map;

public final class d4
implements InitializationStatus {
    public final Map<String, AdapterStatus> a;

    public d4(Map<String, AdapterStatus> map) {
        this.a = map;
    }

    public final Map<String, AdapterStatus> getAdapterStatusMap() {
        return this.a;
    }
}

