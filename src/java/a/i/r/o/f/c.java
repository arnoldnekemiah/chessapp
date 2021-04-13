/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  java.lang.Class
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

public abstract class c<T>
extends d<T> {
    public static final String h = h.a("BrdcstRcvrCnstrntTrckr");
    public final BroadcastReceiver g = new BroadcastReceiver(this){
        public final /* synthetic */ c a;
        {
            this.a = c2;
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                this.a.a(context, intent);
            }
        }
    };

    public c(Context context, a.i.r.q.m.a a5) {
        super(context, a5);
    }

    public abstract void a(Context var1, Intent var2);

    @Override
    public void b() {
        h h4 = h.a();
        String string = h;
        Object[] arrobject = new Object[]{this.getClass().getSimpleName()};
        h4.a(string, String.format((String)"%s: registering receiver", (Object[])arrobject), new Throwable[0]);
        this.b.registerReceiver(this.g, this.d());
    }

    @Override
    public void c() {
        h h4 = h.a();
        String string = h;
        Object[] arrobject = new Object[]{this.getClass().getSimpleName()};
        h4.a(string, String.format((String)"%s: unregistering receiver", (Object[])arrobject), new Throwable[0]);
        this.b.unregisterReceiver(this.g);
    }

    public abstract IntentFilter d();
}

