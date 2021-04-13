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

public class f
extends c<Boolean> {
    public static final String i = h.a("StorageNotLowTracker");

    public f(Context context, a a3) {
        super(context, a3);
    }

    public Object a() {
        Context context = ((d)this).b;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        Intent intent = context.registerReceiver(null, intentFilter);
        if (intent != null && intent.getAction() != null) {
            String string = intent.getAction();
            int n7 = -1;
            int n9 = string.hashCode();
            if (n9 != -1181163412) {
                if (n9 == -730838620 && string.equals((Object)"android.intent.action.DEVICE_STORAGE_OK")) {
                    n7 = 0;
                }
            } else if (string.equals((Object)"android.intent.action.DEVICE_STORAGE_LOW")) {
                n7 = 1;
            }
            if (n7 != 0) {
                if (n7 != 1) {
                    return null;
                }
                return false;
            }
        }
        return true;
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
        if (n9 != -1181163412) {
            if (n9 == -730838620 && string2.equals((Object)"android.intent.action.DEVICE_STORAGE_OK")) {
                n7 = 0;
            }
        } else if (string2.equals((Object)"android.intent.action.DEVICE_STORAGE_LOW")) {
            n7 = 1;
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
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }
}

