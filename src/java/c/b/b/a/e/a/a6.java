/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  c.b.b.a.e.a.qg
 *  com.google.android.gms.ads.formats.NativeAdOptions
 *  com.google.android.gms.ads.mediation.NativeMediationAdRequest
 *  com.google.android.gms.ads.nativead.NativeAdOptions
 *  com.google.android.gms.internal.ads.zzaeh
 *  java.lang.Boolean
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package c.b.b.a.e.a;

import android.location.Location;
import c.b.b.a.e.a.qg;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.internal.ads.zzaeh;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a6
implements NativeMediationAdRequest {
    public final Date a;
    public final int b;
    public final Set<String> c;
    public final boolean d;
    public final Location e;
    public final int f;
    public final zzaeh g;
    public final List<String> h;
    public final boolean i;
    public final Map<String, Boolean> j;

    /*
     * Enabled aggressive block sorting
     */
    public a6(Date date, int n7, Set<String> set, Location location, boolean bl, int n9, zzaeh zzaeh2, List<String> list, boolean bl2, int n10, String string) {
        this.a = date;
        this.b = n7;
        this.c = set;
        this.e = location;
        this.d = bl;
        this.f = n9;
        this.g = zzaeh2;
        this.i = bl2;
        this.h = new ArrayList();
        this.j = new HashMap();
        if (list != null) {
            for (String string2 : list) {
                if (string2.startsWith("custom:")) {
                    Boolean bl3;
                    String string3;
                    Map<String, Boolean> map;
                    String[] arrstring = string2.split(":", 3);
                    if (arrstring.length != 3) continue;
                    if ("true".equals((Object)arrstring[2])) {
                        map = this.j;
                        string3 = arrstring[1];
                        bl3 = true;
                    } else {
                        if (!"false".equals((Object)arrstring[2])) continue;
                        map = this.j;
                        string3 = arrstring[1];
                        bl3 = false;
                    }
                    map.put((Object)string3, (Object)bl3);
                    continue;
                }
                this.h.add((Object)string2);
            }
        }
    }

    public final float getAdVolume() {
        return qg.e().c();
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

    public final NativeAdOptions getNativeAdOptions() {
        return zzaeh.b((zzaeh)this.g);
    }

    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzaeh.a((zzaeh)this.g);
    }

    public final boolean isAdMuted() {
        return qg.e().d();
    }

    public final boolean isAppInstallAdRequested() {
        List<String> list = this.h;
        return list != null && (list.contains((Object)"2") || this.h.contains((Object)"6"));
    }

    public final boolean isContentAdRequested() {
        List<String> list = this.h;
        return list != null && (list.contains((Object)"1") || this.h.contains((Object)"6"));
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.i;
    }

    public final boolean isTesting() {
        return this.d;
    }

    public final boolean isUnifiedNativeAdRequested() {
        List<String> list = this.h;
        return list != null && list.contains((Object)"6");
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f;
    }

    public final boolean zzvl() {
        List<String> list = this.h;
        return list != null && list.contains((Object)"3");
    }

    public final Map<String, Boolean> zzvm() {
        return this.j;
    }
}

