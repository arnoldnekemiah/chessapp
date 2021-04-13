/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri
 *  android.util.Log
 *  c.b.b.a.e.d.d3
 *  c.b.b.a.e.d.h3
 *  c.b.b.a.e.d.r3
 *  c.b.b.a.e.d.v2
 *  c.b.b.a.e.d.y2
 *  java.lang.CharSequence
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 *  java.util.concurrent.atomic.AtomicInteger
 *  java.util.concurrent.atomic.AtomicReference
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  javax.annotation.Nullable
 */
package c.b.b.a.e.d;

import a.c.a.a;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import c.b.b.a.e.d.d3;
import c.b.b.a.e.d.e3;
import c.b.b.a.e.d.f3;
import c.b.b.a.e.d.h3;
import c.b.b.a.e.d.o3;
import c.b.b.a.e.d.p3;
import c.b.b.a.e.d.r3;
import c.b.b.a.e.d.t2;
import c.b.b.a.e.d.v2;
import c.b.b.a.e.d.v3;
import c.b.b.a.e.d.x3;
import c.b.b.a.e.d.y2;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public abstract class q3<T> {
    public static final Object g = new Object();
    @Nullable
    public static volatile p3 h;
    public static final AtomicInteger i;
    public static final /* synthetic */ int j;
    public final o3 a;
    public final String b;
    public final T c;
    public volatile int d = -1;
    public volatile T e;
    public final boolean f;

    public static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    public /* synthetic */ q3(o3 o32, String string, Object object) {
        if (o32.b != null) {
            this.a = o32;
            this.b = string;
            this.c = object;
            this.f = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Deprecated
    public static void a(Context context) {
        Object object;
        Object object2 = object = g;
        synchronized (object2) {
            try {
                p3 p32 = h;
                Context context2 = context.getApplicationContext();
                if (context2 != null) {
                    context = context2;
                }
                if (p32 == null || ((v2)p32).a != context) {
                    y2.c();
                    r3.a();
                    d3.a();
                    h = new v2(context, (x3)a.a(new h3(context)));
                    i.incrementAndGet();
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public abstract T a(Object var1);

    public final String a() {
        return this.b;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final T b() {
        block14 : {
            if (!this.f) {
                if (this.b == null) throw new NullPointerException("flagName must not be null");
            }
            if (this.d >= (var1_1 = q3.i.get())) return this.e;
            var28_2 = this;
            // MONITORENTER : var28_2
            if (this.d >= var1_1) {
                // MONITOREXIT : var28_2
                return this.e;
            }
            var3_3 = q3.h;
            if (var3_3 == null) throw new IllegalStateException("Must call PhenotypeFlag.init() first");
            var5_4 = d3.a((Context)((v2)var3_3).a).b("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
            if (var5_4 == null || !t2.c.matcher((CharSequence)var5_4).matches()) break block14;
            if (Log.isLoggable((String)"PhenotypeFlag", (int)3)) {
                var25_5 = String.valueOf((Object)this.a());
                var26_6 = var25_5.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(var25_5) : new String("Bypass reading Phenotype values for flag: ");
                Log.d((String)"PhenotypeFlag", (String)var26_6);
            }
            ** GOTO lbl-1000
        }
        if (this.a.b != null) {
            var8_7 /* !! */  = f3.a(((v2)var3_3).a, this.a.b) != false ? y2.a((ContentResolver)((v2)var3_3).a.getContentResolver(), (Uri)this.a.b) : null;
        }
        var6_8 = ((v2)var3_3).a;
        var8_7 /* !! */  = r3.a((Context)var6_8, null);
        if (var8_7 /* !! */  != null && (var9_9 = var8_7 /* !! */ .a(this.a())) != null) {
            var10_10 = this.a(var9_9);
        } else lbl-1000: // 2 sources:
        {
            var10_10 = null;
        }
        if (var10_10 == null && (var10_10 = (var14_12 = (var12_11 = d3.a((Context)((v2)var3_3).a)).b(this.b)) != null ? this.a(var14_12) : null) == null) {
            var10_10 = this.c;
        }
        if ((var15_13 = (v3)((v2)var3_3).b.a()).a()) {
            var16_14 = (e3)var15_13.b();
            var17_15 = this.a.b;
            var18_16 = this.b;
            if (var16_14 == null) throw null;
            var19_17 = null;
            if (var17_15 != null) {
                var20_18 = var17_15.toString();
                var21_19 = (Map)var16_14.a.get((Object)var20_18);
                if (var21_19 == null) {
                    var19_17 = null;
                } else {
                    var22_20 = String.valueOf((Object)var18_16);
                    var23_21 = var22_20.length() != 0 ? "".concat(var22_20) : new String("");
                    var19_17 = (String)var21_19.get((Object)var23_21);
                }
            }
            var10_10 = var19_17 == null ? this.c : this.a(var19_17);
        }
        this.e = var10_10;
        this.d = var1_1;
        return this.e;
    }
}

