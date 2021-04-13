/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.util.Pair
 *  c.b.b.a.f.b.f
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.p3
 *  c.b.b.a.f.b.q3
 *  c.b.b.a.f.b.r3
 *  c.b.b.a.f.b.s3
 *  c.b.b.a.f.b.t2
 *  c.b.b.a.f.b.t3
 *  c.b.b.a.f.b.u2
 *  java.lang.Boolean
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  org.checkerframework.checker.nullness.qual.EnsuresNonNull
 *  org.checkerframework.checker.nullness.qual.EnsuresNonNull$List
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.d5;
import c.b.b.a.f.b.f;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.p3;
import c.b.b.a.f.b.q3;
import c.b.b.a.f.b.r3;
import c.b.b.a.f.b.s3;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.t3;
import c.b.b.a.f.b.u2;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class u3
extends d5 {
    public static final Pair<String, Long> C = new Pair((Object)"", (Object)0L);
    public final r3 A = new r3(this, "deferred_attribution_cache_timestamp", 0L);
    public final q3 B = new q3(this);
    public SharedPreferences c;
    public s3 d;
    public final r3 e = new r3(this, "last_upload", 0L);
    public final r3 f = new r3(this, "last_upload_attempt", 0L);
    public final r3 g = new r3(this, "backoff", 0L);
    public final r3 h = new r3(this, "last_delete_stale", 0L);
    public final r3 i = new r3(this, "midnight_offset", 0L);
    public final r3 j = new r3(this, "first_open_time", 0L);
    public final r3 k = new r3(this, "app_install_time", 0L);
    public final t3 l = new t3(this, "app_instance_id");
    public String m;
    public boolean n;
    public long o;
    public final r3 p = new r3(this, "session_timeout", 1800000L);
    public final p3 q = new p3(this, "start_new_session", true);
    public final t3 r = new t3(this, "non_personalized_ads");
    public final p3 s = new p3(this, "allow_remote_dynamite", false);
    public final r3 t = new r3(this, "last_pause_time", 0L);
    public boolean u;
    public final p3 v = new p3(this, "app_backgrounded", false);
    public final p3 w = new p3(this, "deep_link_retrieval_complete", false);
    public final r3 x = new r3(this, "deep_link_retrieval_attempts", 0L);
    public final t3 y = new t3(this, "firebase_feature_rollouts");
    public final t3 z = new t3(this, "deferred_attribution_cache");

    public u3(i4 i42) {
        super(i42);
    }

    public final void a(Boolean bl) {
        this.g();
        SharedPreferences.Editor editor = this.n().edit();
        if (bl != null) {
            editor.putBoolean("measurement_enabled", bl.booleanValue());
        } else {
            editor.remove("measurement_enabled");
        }
        editor.apply();
    }

    public final void a(boolean bl) {
        this.g();
        this.a.a().n.a("App measurement setting deferred collection", (Object)bl);
        SharedPreferences.Editor editor = this.n().edit();
        editor.putBoolean("deferred_analytics_collection", bl);
        editor.apply();
    }

    public final boolean a(int n7) {
        return f.a((int)n7, (int)this.n().getInt("consent_source", 100));
    }

    public final boolean a(long l6) {
        return l6 - this.p.a() > this.t.a();
    }

    @Override
    public final boolean h() {
        return true;
    }

    @EnsuresNonNull.List(value={@EnsuresNonNull(value={"this.preferences"}), @EnsuresNonNull(value={"this.monitoringSample"})})
    @Override
    public final void i() {
        SharedPreferences sharedPreferences;
        boolean bl;
        this.c = sharedPreferences = this.a.a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.u = bl = sharedPreferences.getBoolean("has_been_opened", false);
        if (!bl) {
            SharedPreferences.Editor editor = this.c.edit();
            editor.putBoolean("has_been_opened", true);
            editor.apply();
        }
        this.d = new s3(this, Math.max((long)0L, (long)((Long)u2.c.a(null))));
    }

    public final SharedPreferences n() {
        this.g();
        this.k();
        a.a(this.c);
        return this.c;
    }

    public final Boolean o() {
        this.g();
        if (this.n().contains("measurement_enabled")) {
            return this.n().getBoolean("measurement_enabled", true);
        }
        return null;
    }

    public final f p() {
        this.g();
        return f.a((String)this.n().getString("consent_settings", "G1"));
    }
}

