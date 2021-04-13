/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  com.google.android.gms.ads.mediation.MediationAdRequest
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Date
 *  java.util.Set
 */
package c.b.b.a.e.a;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

public final class s5
implements MediationAdRequest {
    public final Date a;
    public final int b;
    public final Set<String> c;
    public final boolean d;
    public final Location e;
    public final int f;
    public final boolean g;

    public s5(Date date, int n10, Set<String> set, Location location, boolean bl, int n11, boolean bl2, int n12, String string) {
        this.a = date;
        this.b = n10;
        this.c = set;
        this.e = location;
        this.d = bl;
        this.f = n11;
        this.g = bl2;
    }

    @Deprecated
    public final Date getBirthday() {
        return this.a;
    }

    @Deprecated
    public final int getGender() {
        return this.b;
    }

    public final Set<String> getKeywords() {
        return this.c;
    }

    public final Location getLocation() {
        return this.e;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.g;
    }

    public final boolean isTesting() {
        return this.d;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f;
    }
}

