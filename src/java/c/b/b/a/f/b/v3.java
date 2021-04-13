/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.net.Uri
 *  android.os.Bundle
 *  c.b.b.a.e.d.o9
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import c.b.b.a.b.i.a;
import c.b.b.a.e.d.j3;
import c.b.b.a.e.d.o9;
import c.b.b.a.e.d.p9;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.r3;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.u3;
import c.b.b.a.f.b.w3;
import c.b.b.a.f.b.y3;

public final class v3
implements Runnable {
    public final /* synthetic */ j3 a;
    public final /* synthetic */ ServiceConnection b;
    public final /* synthetic */ w3 c;

    public v3(w3 w32, j3 j32, ServiceConnection serviceConnection) {
        this.c = w32;
        this.a = j32;
        this.b = serviceConnection;
    }

    public final void run() {
        ServiceConnection serviceConnection;
        y3 y32;
        block5 : {
            f3 f32;
            String string;
            block7 : {
                block8 : {
                    long l10;
                    Bundle bundle;
                    block12 : {
                        block10 : {
                            long l11;
                            block11 : {
                                Bundle bundle2;
                                block9 : {
                                    block6 : {
                                        block4 : {
                                            w3 w32 = this.c;
                                            y32 = w32.b;
                                            String string2 = w32.a;
                                            j3 j32 = this.a;
                                            serviceConnection = this.b;
                                            y32.a.d().g();
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putString("package_name", string2);
                                            bundle2 = j32.d(bundle3);
                                            if (bundle2 != null) break block4;
                                            try {
                                                y32.a.a().f.a("Install Referrer Service returned a null response");
                                            }
                                            catch (Exception exception) {
                                                y32.a.a().f.a("Exception occurred while retrieving the Install Referrer", exception.getMessage());
                                            }
                                            bundle2 = null;
                                        }
                                        y32.a.d().g();
                                        if (bundle2 == null) break block5;
                                        l10 = 1000L * bundle2.getLong("install_begin_timestamp_seconds", 0L);
                                        if (l10 != 0L) break block6;
                                        f32 = y32.a.a().i;
                                        string = "Service response is missing Install Referrer install timestamp";
                                        break block7;
                                    }
                                    String string3 = bundle2.getString("install_referrer");
                                    if (string3 == null || string3.isEmpty()) break block8;
                                    y32.a.a().n.a("InstallReferrer API result", string3);
                                    g9 g92 = y32.a.p();
                                    String string4 = string3.length() != 0 ? "?".concat(string3) : new String("?");
                                    bundle = g92.a(Uri.parse((String)string4));
                                    if (bundle != null) break block9;
                                    f32 = y32.a.a().f;
                                    string = "No campaign params defined in Install Referrer result";
                                    break block7;
                                }
                                String string5 = bundle.getString("medium");
                                if (string5 == null || "(not set)".equalsIgnoreCase(string5) || "organic".equalsIgnoreCase(string5)) break block10;
                                l11 = 1000L * bundle2.getLong("referrer_click_timestamp_seconds", 0L);
                                if (l11 != 0L) break block11;
                                f32 = y32.a.a().f;
                                string = "Install Referrer is missing click timestamp for ad campaign";
                                break block7;
                            }
                            bundle.putLong("click_timestamp", l11);
                        }
                        if (l10 != y32.a.m().k.a()) break block12;
                        f32 = y32.a.a().n;
                        string = "Install Referrer campaign has already been logged";
                        break block7;
                    }
                    o9.b.b().a();
                    if (!y32.a.g.c(null, u2.s0) || y32.a.i()) {
                        y32.a.m().k.a(l10);
                        y32.a.a().n.a("Logging Install Referrer campaign from sdk with ", "referrer API");
                        bundle.putString("_cis", "referrer API");
                        y32.a.o().b("auto", "_cmp", bundle);
                    }
                    break block5;
                }
                f32 = y32.a.a().f;
                string = "No referrer defined in Install Referrer response";
            }
            f32.a(string);
        }
        a.a().a(y32.a.a, serviceConnection);
    }
}

