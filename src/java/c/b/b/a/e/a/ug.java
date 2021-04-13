/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.ads.initialization.AdapterStatus
 *  com.google.android.gms.ads.initialization.AdapterStatus$State
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import com.google.android.gms.ads.initialization.AdapterStatus;

public final class ug
implements AdapterStatus {
    public final String getDescription() {
        return "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.";
    }

    public final AdapterStatus.State getInitializationState() {
        return AdapterStatus.State.READY;
    }

    public final int getLatency() {
        return 0;
    }
}

