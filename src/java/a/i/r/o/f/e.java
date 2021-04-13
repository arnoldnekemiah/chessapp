/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.ConnectivityManager
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.Network
 *  android.net.NetworkCapabilities
 *  android.net.NetworkInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package a.i.r.o.f;

import a.i.h;
import a.i.r.o.f.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

public class e
extends d<a.i.r.o.b> {
    public static final String j = h.a("NetworkStateTracker");
    public final ConnectivityManager g;
    public b h;
    public a i;

    public e(Context context, a.i.r.q.m.a a5) {
        super(context, a5);
        this.g = (ConnectivityManager)this.b.getSystemService("connectivity");
        if (e.e()) {
            this.h = new ConnectivityManager.NetworkCallback(){

                public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    h.a().a(e.j, String.format((String)"Network capabilities changed: %s", (Object[])new Object[]{networkCapabilities}), new Throwable[0]);
                    e e6 = e.this;
                    e6.a(e6.d());
                }

                public void onLost(Network network) {
                    h.a().a(e.j, "Network connection lost", new Throwable[0]);
                    e e6 = e.this;
                    e6.a(e6.d());
                }
            };
            return;
        }
        this.i = new BroadcastReceiver(){

            public void onReceive(Context context, Intent intent) {
                if (intent != null) {
                    if (intent.getAction() == null) {
                        return;
                    }
                    if (intent.getAction().equals((Object)"android.net.conn.CONNECTIVITY_CHANGE")) {
                        h.a().a(e.j, "Network broadcast received", new Throwable[0]);
                        e e6 = e.this;
                        e6.a(e6.d());
                    }
                }
            }
        };
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override
    public Object a() {
        return this.d();
    }

    @Override
    public void b() {
        if (e.e()) {
            h.a().a(j, "Registering network callback", new Throwable[0]);
            this.g.registerDefaultNetworkCallback((ConnectivityManager.NetworkCallback)this.h);
            return;
        }
        h.a().a(j, "Registering broadcast receiver", new Throwable[0]);
        this.b.registerReceiver((BroadcastReceiver)this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override
    public void c() {
        if (e.e()) {
            try {
                h.a().a(j, "Unregistering network callback", new Throwable[0]);
                this.g.unregisterNetworkCallback((ConnectivityManager.NetworkCallback)this.h);
                return;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                h.a().b(j, "Received exception while unregistering network callback", illegalArgumentException);
                return;
            }
        }
        h.a().a(j, "Unregistering broadcast receiver", new Throwable[0]);
        this.b.unregisterReceiver((BroadcastReceiver)this.i);
    }

    public a.i.r.o.b d() {
        Network network;
        NetworkCapabilities networkCapabilities;
        NetworkInfo networkInfo = this.g.getActiveNetworkInfo();
        boolean bl = true;
        boolean bl2 = networkInfo != null && networkInfo.isConnected();
        boolean bl3 = Build.VERSION.SDK_INT >= 23 && (networkCapabilities = this.g.getNetworkCapabilities(network = this.g.getActiveNetwork())) != null && networkCapabilities.hasCapability(16);
        boolean bl4 = this.g.isActiveNetworkMetered();
        if (networkInfo == null || networkInfo.isRoaming()) {
            bl = false;
        }
        return new a.i.r.o.b(bl2, bl3, bl4, bl);
    }

}

