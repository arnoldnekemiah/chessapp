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

public final class e4
implements AdapterStatus {
    public final AdapterStatus.State a;
    public final String b;
    public final int c;

    public e4(AdapterStatus.State state, String string, int n10) {
        this.a = state;
        this.b = string;
        this.c = n10;
    }

    public final String getDescription() {
        return this.b;
    }

    public final AdapterStatus.State getInitializationState() {
        return this.a;
    }

    public final int getLatency() {
        return this.c;
    }
}

