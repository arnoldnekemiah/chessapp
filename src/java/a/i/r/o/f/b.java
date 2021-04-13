/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.r.o.f.c
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package a.i.r.o.f;

import a.i.h;
import a.i.r.o.f.c;
import a.i.r.o.f.d;
import a.i.r.q.m.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class b
extends c<Boolean> {
    public static final String i = h.a("BatteryNotLowTracker");

    public b(Context context, a a3) {
        super(context, a3);
    }

    public Object a() {
        boolean bl;
        block5 : {
            block4 : {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                Intent intent = ((d)this).b.registerReceiver(null, intentFilter);
                if (intent == null) {
                    h.a().b(i, "getInitialState - null intent received", new Throwable[0]);
                    return null;
                }
                int n7 = intent.getIntExtra("plugged", 0);
                int n9 = intent.getIntExtra("status", -1);
                int n10 = intent.getIntExtra("level", -1);
                int n11 = intent.getIntExtra("scale", -1);
                float f3 = (float)n10 / (float)n11;
                if (n7 != 0 || n9 == 1) break block4;
                float f5 = f3 FCMPL 0.15f;
                bl = false;
                if (f5 <= 0) break block5;
            }
            bl = true;
        }
        return bl;
    }

    public void a(Context context, Intent intent) {
        Boolean bl;
        if (intent.getAction() == null) {
            return;
        }
        h h4 = h.a();
        String string = i;
        Object[] arrobject = new Object[]{intent.getAction()};
        h4.a(string, String.format((String)"Received %s", (Object[])arrobject), new Throwable[0]);
        String string2 = intent.getAction();
        int n7 = -1;
        int n9 = string2.hashCode();
        if (n9 != -1980154005) {
            if (n9 == 490310653 && string2.equals((Object)"android.intent.action.BATTERY_LOW")) {
                n7 = 1;
            }
        } else if (string2.equals((Object)"android.intent.action.BATTERY_OKAY")) {
            n7 = 0;
        }
        if (n7 != 0) {
            if (n7 != 1) {
                return;
            }
            bl = false;
        } else {
            bl = true;
        }
        ((d)((Object)this)).a(bl);
    }

    public IntentFilter d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }
}

