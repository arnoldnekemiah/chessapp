/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.i6;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.o9;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;

public final class h6
implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ i6 e;

    public h6(i6 i62, boolean bl, Uri uri, String string, String string2) {
        this.e = i62;
        this.a = bl;
        this.b = uri;
        this.c = string;
        this.d = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        String string;
        Bundle bundle;
        Uri uri;
        i6 i62;
        boolean bl;
        Bundle bundle2;
        String string2;
        block17 : {
            block16 : {
                i62 = this.e;
                bl = this.a;
                uri = this.b;
                string = this.c;
                string2 = this.d;
                i62.a.g();
                try {
                    boolean bl2 = i62.a.a.g.c(null, u2.d0);
                    if (!bl2 && !i62.a.a.g.c(null, u2.f0) && !i62.a.a.g.c(null, u2.e0)) break block16;
                    g9 g92 = i62.a.a.p();
                    if (TextUtils.isEmpty((CharSequence)string2)) break block16;
                    if (!(string2.contains((CharSequence)"gclid") || string2.contains((CharSequence)"utm_campaign") || string2.contains((CharSequence)"utm_source") || string2.contains((CharSequence)"utm_medium"))) {
                        g92.a.a().m.a("Activity created with data 'referrer' without required params");
                        break block16;
                    }
                    String string3 = string2.length() != 0 ? "https://google.com/search?".concat(string2) : new String("https://google.com/search?");
                    bundle2 = g92.a(Uri.parse((String)string3));
                    if (bundle2 != null) {
                        bundle2.putString("_cis", "referrer");
                    }
                    break block17;
                }
                catch (Exception exception) {
                    i62.a.a.a().f.a("Throwable caught in handleReferrerForOnActivityCreated", (Object)exception);
                    return;
                }
            }
            bundle2 = null;
        }
        if (bl) {
            bundle = i62.a.a.p().a(uri);
            if (bundle != null) {
                bundle.putString("_cis", "intent");
                if (i62.a.a.g.c(null, u2.d0) && !bundle.containsKey("gclid") && bundle2 != null && bundle2.containsKey("gclid")) {
                    Object[] arrobject = new Object[]{bundle2.getString("gclid")};
                    bundle.putString("_cer", String.format((String)"gclid=%s", (Object[])arrobject));
                }
                i62.a.b(string, "_cmp", bundle);
                i62.a.n.a(string, bundle);
            }
        } else {
            bundle = null;
        }
        if (i62.a.a.g.c(null, u2.f0) && !i62.a.a.g.c(null, u2.e0) && bundle2 != null && bundle2.containsKey("gclid") && (bundle == null || !bundle.containsKey("gclid"))) {
            i62.a.a("_lgclid", bundle2.getString("gclid"));
        }
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return;
        }
        i62.a.a.a().m.a("Activity created with referrer", string2);
        boolean bl3 = i62.a.a.g.c(null, u2.e0);
        if (bl3) {
            if (bundle2 != null) {
                i62.a.b(string, "_cmp", bundle2);
                i62.a.n.a(string, bundle2);
            } else {
                i62.a.a.a().m.a("Referrer does not contain valid parameters", string2);
            }
            i62.a.a("_ldl", null);
            return;
        }
        if (string2.contains((CharSequence)"gclid") && (string2.contains((CharSequence)"utm_campaign") || string2.contains((CharSequence)"utm_source") || string2.contains((CharSequence)"utm_medium") || string2.contains((CharSequence)"utm_term") || string2.contains((CharSequence)"utm_content"))) {
            if (TextUtils.isEmpty((CharSequence)string2)) return;
            {
                i62.a.a("_ldl", string2);
                return;
            }
        } else {
            i62.a.a.a().m.a("Activity created with data 'referrer' without required params");
            return;
        }
    }
}

