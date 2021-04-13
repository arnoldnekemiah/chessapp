/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.r.o.f.c
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package a.i.r.o.f;

import a.i.h;
import a.i.r.o.f.c;
import a.i.r.o.f.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

public class a
extends c<Boolean> {
    public static final String i = h.a("BatteryChrgTracker");

    public a(Context context, a.i.r.q.m.a a3) {
        super(context, a3);
    }

    public Object a() {
        boolean bl;
        block7 : {
            block6 : {
                Intent intent;
                block5 : {
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                    intent = ((d)this).b.registerReceiver(null, intentFilter);
                    if (intent == null) {
                        h.a().b(i, "getInitialState - null intent received", new Throwable[0]);
                        return null;
                    }
                    if (Build.VERSION.SDK_INT < 23) break block5;
                    int n7 = intent.getIntExtra("status", -1);
                    if (n7 == 2) break block6;
                    bl = false;
                    if (n7 != 5) break block7;
                    break block6;
                }
                int n9 = intent.getIntExtra("plugged", 0);
                bl = false;
                if (n9 == 0) break block7;
            }
            bl = true;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(Context var1_1, Intent var2_2) {
        block11 : {
            block9 : {
                block10 : {
                    var3_3 = var2_2.getAction();
                    if (var3_3 == null) {
                        return;
                    }
                    h.a().a(a.i, String.format((String)"Received %s", (Object[])new Object[]{var3_3}), new Throwable[0]);
                    var4_4 = -1;
                    switch (var3_3.hashCode()) {
                        default: {
                            break;
                        }
                        case 1019184907: {
                            if (!var3_3.equals((Object)"android.intent.action.ACTION_POWER_CONNECTED")) break;
                            var4_4 = 2;
                            break;
                        }
                        case 948344062: {
                            if (!var3_3.equals((Object)"android.os.action.CHARGING")) break;
                            var4_4 = 0;
                            break;
                        }
                        case -54942926: {
                            if (!var3_3.equals((Object)"android.os.action.DISCHARGING")) break;
                            var4_4 = 1;
                            break;
                        }
                        case -1886648615: {
                            if (!var3_3.equals((Object)"android.intent.action.ACTION_POWER_DISCONNECTED")) break;
                            var4_4 = 3;
                        }
                    }
                    if (var4_4 == 0) break block9;
                    if (var4_4 == 1) break block10;
                    if (var4_4 != 2) {
                        if (var4_4 != 3) {
                            return;
                        } else {
                            ** GOTO lbl30
                        }
                    }
                    break block9;
                }
                var5_5 = false;
                break block11;
            }
            var5_5 = true;
        }
        this.a(var5_5);
    }

    public IntentFilter d() {
        String string;
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            string = "android.os.action.DISCHARGING";
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            string = "android.intent.action.ACTION_POWER_DISCONNECTED";
        }
        intentFilter.addAction(string);
        return intentFilter;
    }
}

