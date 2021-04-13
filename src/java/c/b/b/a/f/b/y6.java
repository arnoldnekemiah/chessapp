/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.os.SystemClock
 *  c.b.b.a.b.j.c
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.f7
 *  c.b.b.a.f.b.l8
 *  c.b.b.a.f.b.q6
 *  c.b.b.a.f.b.r6
 *  c.b.b.a.f.b.s6
 *  c.b.b.a.f.b.t2
 *  c.b.b.a.f.b.t6
 *  c.b.b.a.f.b.u2
 *  c.b.b.a.f.b.u6
 *  c.b.b.a.f.b.v6
 *  c.b.b.a.f.b.x6
 *  c.b.b.a.f.b.y0
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.f7;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.l8;
import c.b.b.a.f.b.n8;
import c.b.b.a.f.b.q6;
import c.b.b.a.f.b.r6;
import c.b.b.a.f.b.s6;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.t6;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.u6;
import c.b.b.a.f.b.v6;
import c.b.b.a.f.b.x3;
import c.b.b.a.f.b.x6;
import c.b.b.a.f.b.y0;
import c.b.b.a.f.b.y7;
import c.b.b.a.f.b.z1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class y6
extends x3 {
    public volatile q6 c;
    public q6 d;
    public q6 e;
    public final Map<Activity, q6> f = new ConcurrentHashMap();
    public Activity g;
    public volatile boolean h;
    public volatile q6 i;
    public q6 j;
    public boolean k;
    public final Object l = new Object();
    public String m;

    public y6(i4 i42) {
        super(i42);
    }

    public static void a(q6 q62, Bundle bundle, boolean bl) {
        if (q62 != null) {
            if (bundle.containsKey("_sc") && !bl) {
                bl = false;
            } else {
                String string = q62.a;
                if (string != null) {
                    bundle.putString("_sn", string);
                } else {
                    bundle.remove("_sn");
                }
                String string2 = q62.b;
                if (string2 != null) {
                    bundle.putString("_sc", string2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", q62.c);
                return;
            }
        }
        if (q62 == null && bl) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final q6 a(Activity activity) {
        a.a(activity);
        q6 q62 = (q6)this.f.get((Object)activity);
        if (q62 == null) {
            q6 q63 = new q6(null, this.a(activity.getClass(), "Activity"), this.a.p().o());
            this.f.put((Object)activity, (Object)q63);
            q62 = q63;
        }
        if (!this.a.g.c(null, (t2<Boolean>)u2.u0)) {
            return q62;
        }
        if (this.i != null) {
            return this.i;
        }
        return q62;
    }

    public final q6 a(boolean bl) {
        this.h();
        this.g();
        if (this.a.g.c(null, (t2<Boolean>)u2.u0) && bl) {
            q6 q62 = this.e;
            if (q62 != null) {
                return q62;
            }
            return this.j;
        }
        return this.e;
    }

    public final String a(Class<?> class_, String string) {
        String string2 = class_.getCanonicalName();
        if (string2 == null) {
            return "Activity";
        }
        String[] arrstring = string2.split("\\.");
        int n7 = arrstring.length;
        String string3 = n7 > 0 ? arrstring[n7 - 1] : "";
        int n9 = string3.length();
        if (n9 > 100) {
            string3 = string3.substring(0, 100);
        }
        return string3;
    }

    public final void a(Activity activity, Bundle bundle) {
        if (!this.a.g.n()) {
            return;
        }
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("com.google.app_measurement.screen_service");
        if (bundle2 == null) {
            return;
        }
        q6 q62 = new q6(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id"));
        this.f.put((Object)activity, (Object)q62);
    }

    public final void a(Activity activity, q6 q62, boolean bl) {
        q6 q63;
        q6 q64 = this.c == null ? this.d : this.c;
        q6 q65 = q64;
        if (q62.b == null) {
            q6 q66;
            String string = activity != null ? this.a(activity.getClass(), "Activity") : null;
            q63 = q66 = new q6(q62.a, string, q62.c, q62.e, q62.f);
        } else {
            q63 = q62;
        }
        this.d = this.c;
        this.c = q63;
        if ((c)this.a.n != null) {
            long l6 = SystemClock.elapsedRealtime();
            f4 f42 = this.a.d();
            s6 s62 = new s6(this, q63, q65, l6, bl);
            f42.a((Runnable)s62);
            return;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(Bundle bundle, long l6) {
        String string;
        String string2;
        q6 q62;
        block12 : {
            String string3;
            block11 : {
                int n7;
                int n9;
                String string4;
                Object object;
                if (!this.a.g.c(null, (t2<Boolean>)u2.u0)) {
                    this.a.a().k.a("Manual screen reporting is disabled.");
                    return;
                }
                Object object2 = object = this.l;
                // MONITORENTER : object2
                if (!this.k) {
                    this.a.a().k.a("Cannot log screen view event when the app is in the background.");
                    // MONITOREXIT : object2
                    return;
                }
                string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || (n7 = string.length()) > 100)) {
                    this.a.a().k.a("Invalid screen name length for screen view. Length", (Object)string.length());
                    // MONITOREXIT : object2
                    return;
                }
                string3 = bundle.getString("screen_class");
                if (string3 != null && (string3.length() <= 0 || (n9 = string3.length()) > 100)) {
                    this.a.a().k.a("Invalid screen class length for screen view. Length", (Object)string3.length());
                    // MONITOREXIT : object2
                    return;
                }
                if (string3 == null) {
                    Activity activity = this.g;
                    string4 = activity != null ? this.a(activity.getClass(), "Activity") : "Activity";
                }
                break block11;
                string2 = string4;
                break block12;
            }
            string2 = string3;
        }
        q6 q63 = this.c;
        if (this.h && q63 != null) {
            this.h = false;
            boolean bl = g9.d(q63.b, string2);
            boolean bl2 = g9.d(q63.a, string);
            if (bl && bl2) {
                this.a.a().k.a("Ignoring call to log screen view event with duplicate parameters.");
                // MONITOREXIT : object2
                return;
            }
        }
        // MONITOREXIT : object2
        f3 f32 = this.a.a().n;
        String string5 = string == null ? "null" : string;
        String string6 = string2 == null ? "null" : string2;
        f32.a("Logging screen view with name, class", (Object)string5, (Object)string6);
        q6 q64 = this.c == null ? this.d : this.c;
        q6 q65 = q64;
        this.c = q62 = new q6(string, string2, this.a.p().o(), true, l6);
        this.d = q65;
        this.i = q62;
        if ((c)this.a.n == null) throw null;
        long l10 = SystemClock.elapsedRealtime();
        f4 f42 = this.a.d();
        r6 r62 = new r6(this, bundle, q62, q65, l10);
        f42.a((Runnable)r62);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(q6 var1_1, q6 var2_2, long var3_3, boolean var5_4, Bundle var6_5) {
        block16 : {
            this.g();
            var7_6 = var5_4 != false && this.e != null;
            if (var7_6) {
                this.a(this.e, true, var3_3);
            }
            if (var2_2 != null && var2_2.c == var1_1.c && g9.d(var2_2.b, var1_1.b) && g9.d(var2_2.a, var1_1.a)) break block16;
            var8_7 = new Bundle();
            if (this.a.g.c(null, (t2<Boolean>)u2.u0)) {
                if (var6_5 != null) {
                    var8_7 = new Bundle(var6_5);
                } else {
                    var8_7();
                }
            }
            var9_8 = var8_7;
            y6.a(var1_1, var9_8, true);
            if (var2_2 != null) {
                var28_9 = var2_2.a;
                if (var28_9 != null) {
                    var9_8.putString("_pn", var28_9);
                }
                if ((var29_10 = var2_2.b) != null) {
                    var9_8.putString("_pc", var29_10);
                }
                var9_8.putLong("_pi", var2_2.c);
            }
            if (var7_6) {
                var25_11 = this.a.n().e;
                var26_12 = var3_3 - var25_11.b;
                var25_11.b = var3_3;
                if (var26_12 > 0L) {
                    this.a.p().a(var9_8, var26_12);
                }
            }
            if (!this.a.g.c(null, (t2<Boolean>)u2.u0)) ** GOTO lbl-1000
            if (!this.a.g.n()) {
                var9_8.putLong("_mst", 1L);
            }
            if (var1_1.e) {
                var10_13 = "app";
            } else lbl-1000: // 2 sources:
            {
                var10_13 = "auto";
            }
            var11_14 = var10_13;
            if (this.a.g.c(null, (t2<Boolean>)u2.u0)) {
                if ((c)this.a.n == null) throw null;
                var20_15 = System.currentTimeMillis();
                if (var1_1.e && (var23_16 = var1_1.f) != 0L) {
                    var20_15 = var23_16;
                }
                var22_17 = this.a.o();
                var17_18 = var20_15;
                var16_19 = var22_17;
            } else {
                var12_20 = this.a.o();
                var12_20.g();
                if ((c)var12_20.a.n == null) throw null;
                var14_21 = System.currentTimeMillis();
                var16_19 = var12_20;
                var17_18 = var14_21;
            }
            var16_19.a(var11_14, "_vs", var17_18, var9_8);
        }
        this.e = var1_1;
        if (this.a.g.c(null, (t2<Boolean>)u2.u0) && var1_1.e) {
            this.j = var1_1;
        }
        var19_22 = this.a.v();
        var19_22.g();
        var19_22.h();
        var19_22.a((Runnable)new f7(var19_22, var1_1));
    }

    public final void a(q6 q62, boolean bl, long l6) {
        z1 z12 = this.a.g();
        if ((c)this.a.n != null) {
            z12.a(SystemClock.elapsedRealtime());
            boolean bl2 = q62 != null && q62.d;
            if (this.a.n().e.a(bl2, bl, l6) && q62 != null) {
                q62.d = false;
            }
            return;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string, q6 q62) {
        this.g();
        y6 y62 = this;
        synchronized (y62) {
            String string2 = this.m;
            if (string2 == null || string2.equals((Object)string) || q62 != null) {
                this.m = string;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Activity var1_1) {
        block10 : {
            if (!this.a.g.c(null, (t2<Boolean>)u2.u0)) break block10;
            var9_3 = var5_2 = this.l;
            synchronized (var9_3) {
                this.k = true;
                if (var1_1 == this.g) break block10;
                var10_5 = var7_4 = this.l;
                ** synchronized (var10_5)
lbl-1000: // 1 sources:
                {
                    this.g = var1_1;
                    this.h = false;
                }
                if (!this.a.g.c(null, (t2<Boolean>)u2.t0) || !this.a.g.n()) break block10;
                this.i = null;
                this.a.d().a((Runnable)new x6(this));
            }
        }
        if (this.a.g.c(null, (t2<Boolean>)u2.t0) && !this.a.g.n()) {
            this.c = this.i;
            this.a.d().a((Runnable)new t6(this));
            return;
        }
        this.a(var1_1, this.a(var1_1), false);
        var2_7 = this.a.g();
        if ((c)var2_7.a.n != null) {
            var3_8 = SystemClock.elapsedRealtime();
            var2_7.a.d().a((Runnable)new y0(var2_7, var3_8));
            return;
        }
        throw null;
        {
            catch (Throwable var6_6) {}
            throw var6_6;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(Activity activity) {
        if (this.a.g.c(null, (t2<Boolean>)u2.u0)) {
            Object object;
            Object object2 = object = this.l;
            synchronized (object2) {
                this.k = false;
                this.h = true;
            }
        }
        if ((c)this.a.n == null) {
            throw null;
        }
        long l6 = SystemClock.elapsedRealtime();
        if (this.a.g.c(null, (t2<Boolean>)u2.t0) && !this.a.g.n()) {
            this.c = null;
            this.a.d().a((Runnable)new u6(this, l6));
            return;
        }
        q6 q62 = this.a(activity);
        this.d = this.c;
        this.c = null;
        this.a.d().a((Runnable)new v6(this, q62, l6));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void d(Activity activity) {
        Object object;
        Object object2 = object = this.l;
        // MONITORENTER : object2
        if (activity == this.g) {
            this.g = null;
        }
        // MONITOREXIT : object2
        if (!this.a.g.n()) {
            return;
        }
        this.f.remove((Object)activity);
    }

    @Override
    public final boolean j() {
        return false;
    }
}

