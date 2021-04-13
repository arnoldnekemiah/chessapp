/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.util.Log
 *  c.b.b.a.c.a
 *  c.b.b.a.e.d.vb
 *  com.google.android.gms.dynamite.DynamiteModule
 *  com.google.android.gms.dynamite.DynamiteModule$a
 *  com.google.android.gms.dynamite.DynamiteModule$b
 *  com.google.android.gms.internal.measurement.zzy
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.String
 */
package c.b.b.a.e.d;

import a.c.a.a;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import c.b.b.a.c.b;
import c.b.b.a.e.d.f0;
import c.b.b.a.e.d.vb;
import c.b.b.a.e.d.w;
import c.b.b.a.e.d.wb;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.measurement.zzy;

public final class g
extends w {
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ Bundle h;
    public final /* synthetic */ f0 i;

    public g(f0 f02, String string, String string2, Context context, Bundle bundle) {
        this.i = f02;
        this.e = string;
        this.f = string2;
        this.g = context;
        this.h = bundle;
        super(f02, true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public final void a() {
        block12 : {
            block11 : {
                block10 : {
                    try {
                        var2_1 = f0.b(this.e, this.f);
                        var3_2 = null;
                        if (var2_1) {
                            var4_3 = this.f;
                            var5_4 = this.e;
                            var6_5 = this.i.a;
                            var7_6 = var4_3;
                            var8_7 = var5_4;
                            var9_8 = var6_5;
                        } else {
                            var9_8 = null;
                            var8_7 = null;
                            var7_6 = null;
                        }
                        f0.a(this.g);
                        if (!f0.j.booleanValue() && var8_7 == null) break block10;
                        break block11;
                    }
                    catch (Exception var1_20) {
                        this.i.a(var1_20, true, false);
                        return;
                    }
                }
                var10_9 = false;
                break block12;
            }
            var10_9 = true;
        }
        var11_10 = this.i;
        var12_11 = this.g;
        if (var11_10 == null) throw null;
        if (!var10_9) ** GOTO lbl34
        try {
            block13 : {
                var21_12 = DynamiteModule.l;
                break block13;
lbl34: // 1 sources:
                var21_12 = DynamiteModule.j;
            }
            var3_2 = vb.asInterface((IBinder)DynamiteModule.a((Context)var12_11, (DynamiteModule.b)var21_12, (String)"com.google.android.gms.measurement.dynamite").a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        }
        catch (DynamiteModule.a var13_13) {
            var11_10.a((Exception)var13_13, true, false);
        }
        var11_10.h = var3_2;
        if (this.i.h == null) {
            Log.w((String)this.i.a, (String)"Failed to connect to measurement client.");
            return;
        }
        var14_14 = DynamiteModule.a((Context)this.g, (String)"com.google.android.gms.measurement.dynamite");
        var15_15 = DynamiteModule.a((Context)this.g, (String)"com.google.android.gms.measurement.dynamite", (boolean)false);
        if (var10_9) {
            var16_16 = Math.max((int)var14_14, (int)var15_15);
            var17_17 = var15_15 < var14_14;
            var18_18 = var17_17;
        } else {
            if (var14_14 > 0) {
                var15_15 = var14_14;
            }
            var16_16 = var15_15;
            var18_18 = var14_14 > 0;
        }
        var19_19 = new zzy(39000L, (long)var16_16, var18_18, var9_8, var8_7, var7_6, this.h, a.b(this.g));
        this.i.h.initialize(new b<Context>(this.g), var19_19, this.a);
    }
}

