/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  androidx.work.impl.WorkDatabase
 *  androidx.work.impl.background.systemalarm.ConstraintProxy
 *  androidx.work.impl.background.systemalarm.SystemAlarmService
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package a.i.r.n.b;

import a.i.h;
import a.i.n;
import a.i.r.a;
import a.i.r.j;
import a.i.r.n.b.c;
import a.i.r.n.b.d;
import a.i.r.n.b.e;
import a.i.r.p.k;
import a.i.r.p.l;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class b
implements a {
    public static final String d = h.a("CommandHandler");
    public final Context a;
    public final Map<String, a> b;
    public final Object c;

    public b(Context context) {
        this.a = context;
        this.b = new HashMap();
        this.c = new Object();
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent a(Context context, String string) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", string);
        return intent;
    }

    public static Intent a(Context context, String string, boolean bl) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", string);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", bl);
        return intent;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    public static Intent b(Context context, String string) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", string);
        return intent;
    }

    public static Intent c(Context context, String string) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", string);
        return intent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Intent intent, int n4, e e6) {
        Object object;
        Bundle bundle = intent.getExtras();
        Object object2 = object = this.c;
        synchronized (object2) {
            String string = bundle.getString("KEY_WORKSPEC_ID");
            h.a().a(d, String.format((String)"Handing delay met for %s", (Object[])new Object[]{string}), new Throwable[0]);
            if (!this.b.containsKey((Object)string)) {
                d d6 = new d(this.a, n4, string, e6);
                this.b.put((Object)string, (Object)d6);
                d6.b();
            } else {
                h.a().a(d, String.format((String)"WorkSpec %s is already being handled for ACTION_DELAY_MET", (Object[])new Object[]{string}), new Throwable[0]);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(String string, boolean bl) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            a a5 = (a)this.b.remove((Object)string);
            if (a5 != null) {
                a5.a(string, bl);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a() {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            if (this.b.isEmpty()) return false;
            return true;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void b(Intent var1_1, int var2_2, e var3_3) {
        var4_4 = var1_1.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals((Object)var4_4)) {
            h.a().a(b.d, String.format((String)"Handling constraints changed %s", (Object[])new Object[]{var1_1}), new Throwable[0]);
            var47_5 = new c(this.a, var2_2, var3_3);
            var48_6 = ((l)var47_5.c.e.c.k()).c();
            ConstraintProxy.a((Context)var47_5.a, var48_6);
            var47_5.d.c(var48_6);
            var49_7 = (ArrayList)var48_6;
            var50_8 = new ArrayList(var49_7.size());
            var51_9 = System.currentTimeMillis();
            for (a.i.r.p.j var60_11 : var49_7) {
                var61_12 = var60_11.a;
                if (var51_9 < var60_11.a() || var60_11.b() && !var47_5.d.a(var61_12)) continue;
                var50_8.add((Object)var60_11);
            }
            var54_13 = var50_8.iterator();
            do {
                if (!var54_13.hasNext()) {
                    var47_5.d.a();
                    return;
                }
                var55_14 = ((a.i.r.p.j)var54_13.next()).a;
                var56_15 = b.a(var47_5.a, var55_14);
                h.a().a(c.e, String.format((String)"Creating a delay_met command for workSpec with id (%s)", (Object[])new Object[]{var55_14}), new Throwable[0]);
                var57_16 = var47_5.c;
                var58_17 = new Runnable(var57_16, var56_15, var47_5.b){
                    public final e a;
                    public final Intent b;
                    public final int c;
                    {
                        this.a = e6;
                        this.b = intent;
                        this.c = n4;
                    }

                    public void run() {
                        this.a.a(this.b, this.c);
                    }
                };
                var57_16.g.post(var58_17);
            } while (true);
        }
        if ("ACTION_RESCHEDULE".equals((Object)var4_4)) {
            var44_18 = h.a();
            var45_19 = b.d;
            var46_20 = new Object[]{var1_1, var2_2};
            var44_18.a(var45_19, String.format((String)"Handling reschedule %s, %s", (Object[])var46_20), new Throwable[0]);
            var3_3.e.b();
            return;
        }
        var5_21 = var1_1.getExtras();
        var6_22 = new String[]{"KEY_WORKSPEC_ID"};
        if (var5_21 != null && !var5_21.isEmpty()) {
            for (var43_23 = 0; var43_23 < 1; ++var43_23) {
                if (var5_21.get(var6_22[var43_23]) != null) {
                    continue;
                }
                ** break block23
            }
            var7_24 = true;
        } else lbl-1000: // 2 sources:
        {
            
            var7_24 = false;
        }
        if (!var7_24) {
            h.a().b(b.d, String.format((String)"Invalid request for %s, requires %s.", (Object[])new Object[]{var4_4, "KEY_WORKSPEC_ID"}), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals((Object)var4_4)) {
            var15_25 = var1_1.getExtras().getString("KEY_WORKSPEC_ID");
            h.a().a(b.d, String.format((String)"Handling schedule work for %s", (Object[])new Object[]{var15_25}), new Throwable[0]);
            var16_26 = var3_3.e.c;
            var16_26.c();
            var18_27 = var16_26.k();
            var19_28 = (l)var18_27;
            try {
                var20_29 = var19_28.d(var15_25);
                if (var20_29 == null) {
                    var37_30 = h.a();
                    var38_31 = b.d;
                    var39_32 = new StringBuilder();
                    var39_32.append("Skipping scheduling ");
                    var39_32.append(var15_25);
                    var39_32.append(" because it's no longer in the DB");
                    var37_30.d(var38_31, var39_32.toString(), new Throwable[0]);
                    return;
                }
                if (var20_29.b.d()) {
                    var31_33 = h.a();
                    var32_34 = b.d;
                    var33_35 = new StringBuilder();
                    var33_35.append("Skipping scheduling ");
                    var33_35.append(var15_25);
                    var33_35.append("because it is finished.");
                    var31_33.d(var32_34, var33_35.toString(), new Throwable[0]);
                    return;
                }
                var21_36 = var20_29.a();
                if (!var20_29.b()) {
                    var28_37 = h.a();
                    var29_38 = b.d;
                    var30_39 = new Object[]{var15_25, var21_36};
                    var28_37.a(var29_38, String.format((String)"Setting up Alarms for %s at %s", (Object[])var30_39), new Throwable[0]);
                    a.i.r.n.b.a.a(this.a, var3_3.e, var15_25, var21_36);
                } else {
                    var23_40 = h.a();
                    var24_41 = b.d;
                    var25_42 = new Object[]{var15_25, var21_36};
                    var23_40.a(var24_41, String.format((String)"Opportunistically setting an alarm for %s at %s", (Object[])var25_42), new Throwable[0]);
                    a.i.r.n.b.a.a(this.a, var3_3.e, var15_25, var21_36);
                    var26_43 = new /* invalid duplicate definition of identical inner class */;
                    var3_3.g.post(var26_43);
                }
                var16_26.g();
                return;
            }
            finally {
                var16_26.d();
            }
        }
        if ("ACTION_DELAY_MET".equals((Object)var4_4)) {
            this.a(var1_1, var2_2, var3_3);
            return;
        }
        if ("ACTION_STOP_WORK".equals((Object)var4_4)) {
            var14_45 = var1_1.getExtras().getString("KEY_WORKSPEC_ID");
            h.a().a(b.d, String.format((String)"Handing stopWork work for %s", (Object[])new Object[]{var14_45}), new Throwable[0]);
            var3_3.e.a(var14_45);
            a.i.r.n.b.a.a(this.a, var3_3.e, var14_45);
            var3_3.a(var14_45, false);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals((Object)var4_4)) {
            var8_46 = var1_1.getExtras();
            var9_47 = var8_46.getString("KEY_WORKSPEC_ID");
            var10_48 = var8_46.getBoolean("KEY_NEEDS_RESCHEDULE");
            var11_49 = h.a();
            var12_50 = b.d;
            var13_51 = new Object[]{var1_1, var2_2};
            var11_49.a(var12_50, String.format((String)"Handling onExecutionCompleted %s, %s", (Object[])var13_51), new Throwable[0]);
            this.a(var9_47, var10_48);
            return;
        }
        h.a().d(b.d, String.format((String)"Ignoring intent %s", (Object[])new Object[]{var1_1}), new Throwable[0]);
    }
}

