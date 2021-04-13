/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  c.b.b.a.b.j.c
 *  c.b.b.a.e.d.ea
 *  c.b.b.a.f.b.a9
 *  c.b.b.a.f.b.e9
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.g
 *  c.b.b.a.f.b.h
 *  c.b.b.a.f.b.n
 *  c.b.b.a.f.b.o8
 *  c.b.b.a.f.b.r3
 *  c.b.b.a.f.b.t2
 *  c.b.b.a.f.b.u2
 *  c.b.b.a.f.b.x4
 *  c.b.b.a.f.b.z8
 *  com.google.android.gms.measurement.internal.zzaa
 *  com.google.android.gms.measurement.internal.zzas
 *  com.google.android.gms.measurement.internal.zzkg
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.e.d.ea;
import c.b.b.a.e.d.o1;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.c3;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.c9;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.e9;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.g;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.n;
import c.b.b.a.f.b.o8;
import c.b.b.a.f.b.r3;
import c.b.b.a.f.b.r8;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.u3;
import c.b.b.a.f.b.x4;
import c.b.b.a.f.b.z8;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzkg;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class i
extends r8 {
    public static final String[] f = new String[]{"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] g = new String[]{"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] h = new String[]{"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    public static final String[] i = new String[]{"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] j = new String[]{"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] k = new String[]{"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] l = new String[]{"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] m = new String[]{"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public final h d;
    public final o8 e;

    public i(a9 a92) {
        super(a92);
        this.e = new o8(this.a.n);
        this.d = new h(this, this.a.a);
    }

    public static final void a(ContentValues contentValues, String string, Object object) {
        a.c("value");
        a.a(object);
        if (object instanceof String) {
            contentValues.put("value", (String)object);
            return;
        }
        if (object instanceof Long) {
            contentValues.put("value", (Long)object);
            return;
        }
        if (object instanceof Double) {
            contentValues.put("value", (Double)object);
            return;
        }
        throw new IllegalArgumentException("Invalid value type");
    }

    public final long a(String string) {
        a.c(string);
        return this.a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{string}, 0L);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final long a(String string, String[] arrstring) {
        Cursor cursor;
        Throwable throwable22222;
        block6 : {
            block5 : {
                SQLiteDatabase sQLiteDatabase = this.o();
                cursor = null;
                cursor = sQLiteDatabase.rawQuery(string, arrstring);
                if (!cursor.moveToFirst()) break block5;
                long l6 = cursor.getLong(0);
                cursor.close();
                return l6;
            }
            try {
                throw new SQLiteException("Database returned empty set");
            }
            catch (Throwable throwable22222) {
                break block6;
            }
            catch (SQLiteException sQLiteException) {
                this.a.a().f.a("Database error", (Object)string, (Object)sQLiteException);
                throw sQLiteException;
            }
        }
        if (cursor == null) throw throwable22222;
        cursor.close();
        throw throwable22222;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final long a(String string, String[] arrstring, long l6) {
        Throwable throwable2222;
        Cursor cursor;
        block4 : {
            SQLiteDatabase sQLiteDatabase = this.o();
            cursor = null;
            cursor = sQLiteDatabase.rawQuery(string, arrstring);
            if (!cursor.moveToFirst()) break block4;
            long l7 = cursor.getLong(0);
            cursor.close();
            return l7;
        }
        cursor.close();
        return l6;
        {
            catch (Throwable throwable2222) {
            }
            catch (SQLiteException sQLiteException) {}
            {
                this.a.a().f.a("Database error", (Object)string, (Object)sQLiteException);
                throw sQLiteException;
            }
        }
        if (cursor == null) throw throwable2222;
        cursor.close();
        throw throwable2222;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final g a(long l6, String string, long l7, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        Cursor cursor;
        void var16_15;
        block15 : {
            SQLiteDatabase sQLiteDatabase;
            g g4;
            String[] arrstring;
            block14 : {
                a.c(string);
                this.g();
                this.h();
                arrstring = new String[]{string};
                g4 = new g();
                sQLiteDatabase = this.o();
                cursor = sQLiteDatabase.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{string}, null, null, null);
                if (cursor.moveToFirst()) break block14;
                this.a.a().i.a("Not updating daily counts, app is not known. appId", h3.a(string));
                cursor.close();
                return g4;
            }
            try {
                if (cursor.getLong(0) == l6) {
                    g4.b = cursor.getLong(1);
                    g4.a = cursor.getLong(2);
                    g4.c = cursor.getLong(3);
                    g4.d = cursor.getLong(4);
                    g4.e = cursor.getLong(5);
                }
                if (bl) {
                    g4.b = l7 + g4.b;
                }
                if (bl2) {
                    g4.a = l7 + g4.a;
                }
                if (bl3) {
                    g4.c = l7 + g4.c;
                }
                if (bl4) {
                    g4.d = l7 + g4.d;
                }
                if (bl5) {
                    g4.e = l7 + g4.e;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf((long)l6));
                contentValues.put("daily_public_events_count", Long.valueOf((long)g4.a));
                contentValues.put("daily_events_count", Long.valueOf((long)g4.b));
                contentValues.put("daily_conversions_count", Long.valueOf((long)g4.c));
                contentValues.put("daily_error_events_count", Long.valueOf((long)g4.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf((long)g4.e));
                sQLiteDatabase.update("apps", contentValues, "app_id=?", arrstring);
            }
            catch (Throwable throwable) {
                break block15;
            }
            catch (SQLiteException sQLiteException) {}
            cursor.close();
            return g4;
            catch (Throwable throwable) {
                cursor = null;
                break block15;
            }
            catch (SQLiteException sQLiteException) {
                cursor = null;
            }
            {
                void var14_18;
                this.a.a().f.a("Error updating daily counts. appId", h3.a(string), (Object)var14_18);
                if (cursor == null) return g4;
            }
            cursor.close();
            return g4;
        }
        if (cursor == null) throw var16_15;
        cursor.close();
        throw var16_15;
    }

    public final g a(long l6, String string, boolean bl, boolean bl2) {
        return this.a(l6, string, 1L, false, false, bl, false, bl2);
    }

    public final Object a(Cursor cursor, int n7) {
        int n9 = cursor.getType(n7);
        if (n9 != 0) {
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 3) {
                        if (n9 != 4) {
                            this.a.a().f.a("Loaded invalid unknown value type, ignoring it", (Object)n9);
                            return null;
                        }
                        this.a.a().f.a("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(n7);
                }
                return cursor.getDouble(n7);
            }
            return cursor.getLong(n7);
        }
        this.a.a().f.a("Loaded invalid null value from database");
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final List<e9> a(String string, String string2, String string3) {
        void var7_25;
        Cursor cursor;
        block23 : {
            List list;
            String string4;
            block25 : {
                Cursor cursor2;
                ArrayList arrayList;
                block24 : {
                    StringBuilder stringBuilder;
                    ArrayList arrayList2;
                    block20 : {
                        block19 : {
                            block21 : {
                                block22 : {
                                    a.c(string);
                                    this.g();
                                    this.h();
                                    arrayList = new ArrayList();
                                    try {
                                        arrayList2 = new ArrayList(3);
                                        try {
                                            arrayList2.add((Object)string);
                                            stringBuilder = new StringBuilder("app_id=?");
                                            boolean bl = TextUtils.isEmpty((CharSequence)string2);
                                            if (bl) break block19;
                                            string4 = string2;
                                        }
                                        catch (SQLiteException sQLiteException) {
                                            break block22;
                                        }
                                        try {
                                            arrayList2.add((Object)string4);
                                            stringBuilder.append(" and origin=?");
                                            break block20;
                                        }
                                        catch (SQLiteException sQLiteException) {
                                            break block21;
                                        }
                                    }
                                    catch (Throwable throwable) {
                                        cursor = null;
                                        break block23;
                                    }
                                    catch (SQLiteException sQLiteException) {
                                        // empty catch block
                                    }
                                }
                                string4 = string2;
                            }
                            cursor = null;
                            break block25;
                        }
                        string4 = string2;
                    }
                    if (!TextUtils.isEmpty((CharSequence)string3)) {
                        arrayList2.add((Object)String.valueOf((Object)string3).concat("*"));
                        stringBuilder.append(" and name glob ?");
                    }
                    String[] arrstring = (String[])arrayList2.toArray((Object[])new String[arrayList2.size()]);
                    SQLiteDatabase sQLiteDatabase = this.o();
                    String[] arrstring2 = new String[]{"name", "set_timestamp", "value", "origin"};
                    String string5 = stringBuilder.toString();
                    cursor2 = sQLiteDatabase.query("user_attributes", arrstring2, string5, arrstring, null, null, "rowid", "1001");
                    boolean bl = cursor2.moveToFirst();
                    if (bl) break block24;
                    cursor2.close();
                    return arrayList;
                }
                try {
                    boolean bl;
                    do {
                        int n7;
                        if ((n7 = arrayList.size()) >= 1000) {
                            f3 f32 = this.a.a().f;
                            f32.a("Read more than the max allowed user properties, ignoring excess", (Object)1000);
                            break;
                        }
                        String string6 = cursor2.getString(0);
                        long l6 = cursor2.getLong(1);
                        Object object = this.a(cursor2, 2);
                        string4 = cursor2.getString(3);
                        if (object == null) {
                            this.a.a().f.a("(2)Read invalid user property value, ignoring it", h3.a(string), (Object)string4, (Object)string3);
                        } else {
                            e9 e92 = new e9(string, string4, string6, l6, object);
                            arrayList.add((Object)e92);
                        }
                        bl = cursor2.moveToNext();
                    } while (bl);
                }
                catch (Throwable throwable) {
                    cursor = cursor2;
                    break block23;
                }
                catch (SQLiteException sQLiteException) {
                    cursor = cursor2;
                }
                cursor2.close();
                return arrayList;
            }
            try {
                void var9_31;
                this.a.a().f.a("(2)Error querying user properties", h3.a(string), (Object)string4, (Object)var9_31);
                list = Collections.emptyList();
                if (cursor == null) return list;
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            cursor.close();
            return list;
        }
        if (cursor == null) throw var7_25;
        cursor.close();
        throw var7_25;
    }

    public final void a(n n7) {
        a.a(n7);
        this.g();
        this.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", n7.a);
        contentValues.put("name", n7.b);
        contentValues.put("lifetime_count", Long.valueOf((long)n7.c));
        contentValues.put("current_bundle_count", Long.valueOf((long)n7.d));
        contentValues.put("last_fire_timestamp", Long.valueOf((long)n7.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf((long)n7.g));
        contentValues.put("last_bundled_day", n7.h);
        contentValues.put("last_sampled_complex_event_id", n7.i);
        contentValues.put("last_sampling_rate", n7.j);
        contentValues.put("current_session_count", Long.valueOf((long)n7.e));
        Boolean bl = n7.k;
        Long l6 = bl != null && bl != false ? Long.valueOf((long)1L) : null;
        contentValues.put("last_exempt_from_sampling", l6);
        try {
            if (this.o().insertWithOnConflict("events", null, contentValues, 5) == -1L) {
                this.a.a().f.a("Failed to insert/update event aggregates (got -1). appId", h3.a(n7.a));
            }
            return;
        }
        catch (SQLiteException sQLiteException) {
            this.a.a().f.a("Error storing event aggregates. appId", h3.a(n7.a), (Object)sQLiteException);
            return;
        }
    }

    public final void a(x4 x42) {
        a.a(x42);
        this.g();
        this.h();
        String string = x42.m();
        a.a(string);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", string);
        contentValues.put("app_instance_id", x42.n());
        contentValues.put("gmp_app_id", x42.o());
        contentValues.put("resettable_device_id_hash", x42.r());
        contentValues.put("last_bundle_index", Long.valueOf((long)x42.d()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf((long)x42.t()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf((long)x42.u()));
        contentValues.put("app_version", x42.v());
        contentValues.put("app_store", x42.x());
        contentValues.put("gmp_version", Long.valueOf((long)x42.y()));
        contentValues.put("dev_cert_hash", Long.valueOf((long)x42.a()));
        contentValues.put("measurement_enabled", Boolean.valueOf((boolean)x42.c()));
        x42.a.d().g();
        contentValues.put("day", Long.valueOf((long)x42.w));
        x42.a.d().g();
        contentValues.put("daily_public_events_count", Long.valueOf((long)x42.x));
        x42.a.d().g();
        contentValues.put("daily_events_count", Long.valueOf((long)x42.y));
        x42.a.d().g();
        contentValues.put("daily_conversions_count", Long.valueOf((long)x42.z));
        x42.a.d().g();
        contentValues.put("config_fetched_time", Long.valueOf((long)x42.E));
        x42.a.d().g();
        contentValues.put("failed_config_fetch_time", Long.valueOf((long)x42.F));
        contentValues.put("app_version_int", Long.valueOf((long)x42.w()));
        contentValues.put("firebase_instance_id", x42.s());
        x42.a.d().g();
        contentValues.put("daily_error_events_count", Long.valueOf((long)x42.A));
        x42.a.d().g();
        contentValues.put("daily_realtime_events_count", Long.valueOf((long)x42.B));
        x42.a.d().g();
        contentValues.put("health_monitor_sample", x42.C);
        contentValues.put("android_id", Long.valueOf((long)x42.i()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf((boolean)x42.j()));
        contentValues.put("admob_app_id", x42.p());
        contentValues.put("dynamite_version", Long.valueOf((long)x42.b()));
        List list = x42.l();
        if (list != null) {
            if (list.size() == 0) {
                this.a.a().i.a("Safelisted events should not be an empty list. appId", (Object)string);
            } else {
                contentValues.put("safelisted_events", TextUtils.join((CharSequence)",", (Iterable)list));
            }
        }
        ea.c();
        if (this.a.g.c(string, (t2<Boolean>)u2.i0)) {
            contentValues.put("ga_app_id", x42.q());
        }
        try {
            SQLiteDatabase sQLiteDatabase = this.o();
            if ((long)sQLiteDatabase.update("apps", contentValues, "app_id = ?", new String[]{string}) == 0L && sQLiteDatabase.insertWithOnConflict("apps", null, contentValues, 5) == -1L) {
                this.a.a().f.a("Failed to insert/update app (got -1). appId", h3.a(string));
            }
            return;
        }
        catch (SQLiteException sQLiteException) {
            this.a.a().f.a("Error storing app. appId", h3.a(string), (Object)sQLiteException);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void a(String var1_1, long var2_2, long var4_3, z8 var6_4) {
        block35 : {
            block34 : {
                block36 : {
                    block32 : {
                        block33 : {
                            a.a(var6_4);
                            this.g();
                            this.h();
                            var8_5 = null;
                            var13_6 = this.o();
                            var14_7 = TextUtils.isEmpty(null);
                            var15_8 = "";
                            if (!var14_7) break block32;
                            var46_9 = var4_3 != -1L ? new String[]{String.valueOf((long)var4_3), String.valueOf((long)var2_2)} : new String[]{String.valueOf((long)var2_2)};
                            if (var4_3 != -1L) {
                                var15_8 = "rowid <= ? and ";
                            }
                            var47_10 = new StringBuilder(148 + var15_8.length());
                            var47_10.append("select app_id, metadata_fingerprint from raw_events where ");
                            var47_10.append(var15_8);
                            var47_10.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                            var10_11 = var13_6.rawQuery(var47_10.toString(), var46_9);
                            var51_12 = var10_11.moveToFirst();
                            if (var51_12) break block33;
                            var10_11.close();
                            return;
                        }
                        var8_5 = var10_11.getString(0);
                        var22_13 = var10_11.getString(1);
                        var10_11.close();
                    }
                    if (var4_3 == -1L) ** GOTO lbl34
                    var16_20 = new String[]{null, String.valueOf((long)var4_3)};
                    break block36;
lbl34: // 1 sources:
                    var16_20 = new String[]{null};
                }
                if (var4_3 != -1L) {
                    var15_8 = " and rowid <= ?";
                }
                var17_21 = new StringBuilder(84 + var15_8.length());
                var17_21.append("select metadata_fingerprint from raw_events where app_id = ?");
                var17_21.append(var15_8);
                var17_21.append(" order by rowid limit 1;");
                var10_11 = var13_6.rawQuery(var17_21.toString(), var16_20);
                var21_22 = var10_11.moveToFirst();
                if (var21_22) break block34;
                var10_11.close();
                return;
            }
            var22_13 = var10_11.getString(0);
            var10_11.close();
            catch (Throwable var11_46) {
                var12_48 = null;
                break block35;
            }
            catch (SQLiteException var9_19) {
                var10_11 = null;
                ** GOTO lbl59
            }
            {
                catch (SQLiteException var9_14) {}
lbl59: // 2 sources:
                try {
                    this.a.a().f.a("Data loss. Error selecting raw event. appId", h3.a(var8_5), (Object)var9_17);
                    if (var10_11 == null) return;
                }
                catch (Throwable var11_47) {}
                var10_11.close();
                return;
            }
            finally {
                var23_23 = var10_11;
            }
        }
        if (var12_48 == null) throw var11_44;
        var12_48.close();
        throw var11_44;
    }

    public final void a(List<Long> list) {
        this.g();
        this.h();
        a.a(list);
        if (list.size() != 0) {
            if (!this.k()) {
                return;
            }
            String string = TextUtils.join((CharSequence)",", list);
            String string2 = c.a.b.a.a.a(new StringBuilder(2 + String.valueOf((Object)string).length()), "(", string, ")");
            if (this.a(c.a.b.a.a.a(new StringBuilder(80 + String.valueOf((Object)string2).length()), "SELECT COUNT(1) FROM queue WHERE rowid IN ", string2, " AND retry_count =  2147483647 LIMIT 1"), null) > 0L) {
                this.a.a().i.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabase = this.o();
                StringBuilder stringBuilder = new StringBuilder(127 + String.valueOf((Object)string2).length());
                stringBuilder.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                stringBuilder.append(string2);
                stringBuilder.append(" AND (retry_count IS NULL OR retry_count < ");
                stringBuilder.append(Integer.MAX_VALUE);
                stringBuilder.append(")");
                sQLiteDatabase.execSQL(stringBuilder.toString());
                return;
            }
            catch (SQLiteException sQLiteException) {
                this.a.a().f.a("Error incrementing retry count. error", (Object)sQLiteException);
                return;
            }
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public final boolean a(e9 e92) {
        a.a(e92);
        this.g();
        this.h();
        if (this.e(e92.a, e92.c) == null) {
            if (g9.i(e92.c)) {
                String[] arrstring = new String[]{e92.a};
                if (this.a("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", arrstring) >= (long)this.a.g.a(e92.a, (t2<Integer>)u2.G, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals((Object)e92.c)) {
                String[] arrstring = new String[]{e92.a, e92.b};
                long l6 = this.a("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", arrstring);
                if (l6 >= 25L) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", e92.a);
        contentValues.put("origin", e92.b);
        contentValues.put("name", e92.c);
        contentValues.put("set_timestamp", Long.valueOf((long)e92.d));
        i.a(contentValues, "value", e92.e);
        try {
            if (this.o().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1L) {
                this.a.a().f.a("Failed to insert/update user property (got -1). appId", h3.a(e92.a));
                return true;
            }
        }
        catch (SQLiteException sQLiteException) {
            this.a.a().f.a("Error storing user property. appId", h3.a(e92.a), (Object)sQLiteException);
        }
        return true;
    }

    public final boolean a(zzaa zzaa2) {
        a.a(zzaa2);
        this.g();
        this.h();
        String string = zzaa2.a;
        a.a(string);
        if (this.e(string, zzaa2.c.b) == null) {
            long l6 = this.a("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{string});
            if (l6 >= 1000L) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", string);
        contentValues.put("origin", zzaa2.b);
        contentValues.put("name", zzaa2.c.b);
        Object object = zzaa2.c.a();
        a.a(object);
        i.a(contentValues, "value", object);
        contentValues.put("active", Boolean.valueOf((boolean)zzaa2.e));
        contentValues.put("trigger_event_name", zzaa2.f);
        contentValues.put("trigger_timeout", Long.valueOf((long)zzaa2.h));
        contentValues.put("timed_out_event", this.a.p().a((Parcelable)zzaa2.g));
        contentValues.put("creation_timestamp", Long.valueOf((long)zzaa2.d));
        contentValues.put("triggered_event", this.a.p().a((Parcelable)zzaa2.i));
        contentValues.put("triggered_timestamp", Long.valueOf((long)zzaa2.c.c));
        contentValues.put("time_to_live", Long.valueOf((long)zzaa2.j));
        contentValues.put("expired_event", this.a.p().a((Parcelable)zzaa2.k));
        try {
            if (this.o().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1L) {
                this.a.a().f.a("Failed to insert/update conditional user property (got -1)", h3.a(string));
                return true;
            }
        }
        catch (SQLiteException sQLiteException) {
            this.a.a().f.a("Error storing conditional user property", h3.a(string), (Object)sQLiteException);
        }
        return true;
    }

    public final boolean a(String string, Long l6, long l7, o1 o12) {
        this.g();
        this.h();
        a.a(o12);
        a.c(string);
        a.a(l6);
        byte[] arrby = o12.f();
        this.a.a().n.a("Saving complex main event, appId, data size", (Object)this.a.q().a(string), (Object)arrby.length);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", string);
        contentValues.put("event_id", l6);
        contentValues.put("children_to_process", Long.valueOf((long)l7));
        contentValues.put("main_event", arrby);
        try {
            if (this.o().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1L) {
                this.a.a().f.a("Failed to insert complex main event (got -1). appId", h3.a(string));
                return false;
            }
            return true;
        }
        catch (SQLiteException sQLiteException) {
            this.a.a().f.a("Error storing complex main event. appId", h3.a(string), (Object)sQLiteException);
            return false;
        }
    }

    /*
     * Exception decompiling
     */
    public final long b(String var1_1, String var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 8[SIMPLE_IF_TAKEN]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public final Bundle b(String var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 7[CATCHBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public final List<zzaa> b(String string, String string2, String string3) {
        a.c(string);
        this.g();
        this.h();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((Object)string);
        StringBuilder stringBuilder = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            arrayList.add((Object)string2);
            stringBuilder.append(" and origin=?");
        }
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            arrayList.add((Object)String.valueOf((Object)string3).concat("*"));
            stringBuilder.append(" and name glob ?");
        }
        String[] arrstring = (String[])arrayList.toArray((Object[])new String[arrayList.size()]);
        return this.b(stringBuilder.toString(), arrstring);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final List<zzaa> b(String string, String[] arrstring) {
        block14 : {
            block15 : {
                block16 : {
                    this.g();
                    this.h();
                    arrayList = new ArrayList();
                    sQLiteDatabase = this.o();
                    arrstring2 = new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                    n7 = 4;
                    cursor = sQLiteDatabase.query("conditional_properties", arrstring2, string, arrstring, null, null, "rowid", "1001");
                    try {
                        ** if (cursor.moveToFirst()) goto lbl-1000
                    }
                    catch (Throwable throwable) {
                        cursor2 = cursor;
                        break block15;
                    }
                    catch (SQLiteException sQLiteException) {
                        cursor2 = cursor;
                        break block16;
                    }
lbl-1000: // 1 sources:
                    {
                        cursor.close();
                        return arrayList;
                    }
lbl-1000: // 1 sources:
                    {
                        break block14;
                    }
                    catch (Throwable throwable) {
                        cursor2 = null;
                        break block15;
                    }
                    catch (SQLiteException sQLiteException) {
                        cursor2 = null;
                    }
                }
                try {
                    this.a.a().f.a("Error querying conditional user property value", (Object)var4_33);
                    list = Collections.emptyList();
                    if (cursor2 == null) return list;
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
                cursor2.close();
                return list;
            }
            if (cursor2 == null) throw var6_29;
            cursor2.close();
            throw var6_29;
        }
        do {
            block19 : {
                block18 : {
                    block17 : {
                        if ((n9 = arrayList.size()) < 1000) break block17;
                        f32 = this.a.a().f;
                        f32.a("Read more than the max allowed conditional properties, ignoring extra", (Object)1000);
                        break block18;
                    }
                    string2 = cursor.getString(0);
                    string3 = cursor.getString(1);
                    string4 = cursor.getString(2);
                    object = this.a(cursor, 3);
                    bl = cursor.getInt(n7) != 0;
                    string5 = cursor.getString(5);
                    l6 = cursor.getLong(6);
                    zzas2 = (zzas)this.b.r().a(cursor.getBlob(7), zzas.CREATOR);
                    l7 = cursor.getLong(8);
                    zzas3 = (zzas)this.b.r().a(cursor.getBlob(9), zzas.CREATOR);
                    l10 = cursor.getLong(10);
                    l11 = cursor.getLong(11);
                    zzas4 = (zzas)this.b.r().a(cursor.getBlob(12), zzas.CREATOR);
                    zzkg2 = new zzkg(string4, l10, object, string3);
                    zzaa2 = new zzaa(string2, string3, zzkg2, l7, bl, string5, zzas2, l6, zzas3, l11, zzas4);
                    arrayList.add((Object)zzaa2);
                    bl2 = cursor.moveToNext();
                    if (bl2) break block19;
                }
                cursor.close();
                return arrayList;
            }
            n7 = 4;
        } while (true);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final n c(String string, String string2) {
        Cursor cursor;
        void var8_28;
        block19 : {
            Cursor cursor2;
            block20 : {
                Cursor cursor3;
                block18 : {
                    block17 : {
                        n n7;
                        block21 : {
                            Long l14;
                            Long l12;
                            long l6;
                            long l10;
                            long l13;
                            Cursor cursor4;
                            long l15;
                            Long l7;
                            long l11;
                            Boolean bl;
                            block16 : {
                                block15 : {
                                    block14 : {
                                        a.c(string);
                                        a.c(string2);
                                        this.g();
                                        this.h();
                                        ArrayList arrayList = new ArrayList((Collection)Arrays.asList((Object[])new String[]{"lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"}));
                                        cursor4 = this.o().query("events", (String[])arrayList.toArray((Object[])new String[0]), "app_id=? and name=?", new String[]{string, string2}, null, null, null);
                                        boolean bl2 = cursor4.moveToFirst();
                                        if (bl2) break block14;
                                        cursor4.close();
                                        return null;
                                    }
                                    try {
                                        l15 = cursor4.getLong(0);
                                        l6 = cursor4.getLong(1);
                                        l11 = cursor4.getLong(2);
                                        boolean bl3 = cursor4.isNull(3);
                                        l10 = 0L;
                                        l13 = bl3 ? l10 : cursor4.getLong(3);
                                        l12 = cursor4.isNull(4) ? null : Long.valueOf((long)cursor4.getLong(4));
                                        l7 = cursor4.isNull(5) ? null : Long.valueOf((long)cursor4.getLong(5));
                                        l14 = cursor4.isNull(6) ? null : Long.valueOf((long)cursor4.getLong(6));
                                        if (cursor4.isNull(7)) break block15;
                                        long l16 = cursor4.getLong(7) LCMP 1L;
                                        boolean bl4 = false;
                                        if (l16 == false) {
                                            bl4 = true;
                                        }
                                        bl = bl4;
                                        break block16;
                                    }
                                    catch (Throwable throwable) {
                                        cursor3 = cursor4;
                                        break block17;
                                    }
                                    catch (SQLiteException sQLiteException) {
                                        cursor3 = cursor4;
                                        break block18;
                                    }
                                    catch (Throwable throwable) {
                                        cursor = null;
                                        break block19;
                                    }
                                    catch (SQLiteException sQLiteException) {
                                        cursor2 = null;
                                        break block20;
                                    }
                                }
                                bl = null;
                            }
                            if (!cursor4.isNull(8)) {
                                l10 = cursor4.getLong(8);
                            }
                            long l17 = l10;
                            cursor3 = cursor4;
                            long l18 = l13;
                            Long l19 = l12;
                            Long l20 = l7;
                            Long l21 = l14;
                            Boolean bl5 = bl;
                            try {
                                n7 = new n(string, string2, l15, l6, l17, l11, l18, l19, l20, l21, bl5);
                                if (!cursor3.moveToNext()) break block21;
                                this.a.a().f.a("Got multiple records for event aggregates, expected one. appId", h3.a(string));
                            }
                            catch (Throwable throwable) {
                            }
                            catch (SQLiteException sQLiteException) {
                                break block18;
                            }
                        }
                        cursor3.close();
                        return n7;
                    }
                    cursor = cursor3;
                    break block19;
                }
                cursor2 = cursor3;
            }
            try {
                void var6_33;
                this.a.a().f.a("Error querying events. appId", h3.a(string), (Object)this.a.q().a(string2), (Object)var6_33);
                if (cursor2 == null) return null;
            }
            catch (Throwable throwable) {
                cursor = cursor2;
            }
            cursor2.close();
            return null;
        }
        if (cursor == null) throw var8_28;
        cursor.close();
        throw var8_28;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final List<e9> c(String var1_1) {
        block8 : {
            a.c(var1_1);
            this.g();
            this.h();
            var3_2 = new ArrayList();
            var4_3 = null;
            try {
                var8_4 = this.o();
                var9_5 = new String[]{"name", "origin", "set_timestamp", "value"};
                var10_6 = new String[]{var1_1};
                var4_3 = var8_4.query("user_attributes", var9_5, "app_id=?", var10_6, null, null, "rowid", "1000");
                if (!var4_3.moveToFirst()) break block8;
                do {
                    var12_7 = var4_3.getString(0);
                    var13_8 = var4_3.getString(1);
                    if (var13_8 == null) {
                        var13_8 = "";
                    }
                    var14_9 = var13_8;
                    var15_10 = var4_3.getLong(2);
                    var17_11 = this.a(var4_3, 3);
                    if (var17_11 == null) {
                        this.a.a().f.a("Read invalid user property value, ignoring it. appId", h3.a(var1_1));
                        continue;
                    }
                    var19_13 = new e9(var1_1, var14_9, var12_7, var15_10, var17_11);
                    var3_2.add((Object)var19_13);
                } while (var18_12 = var4_3.moveToNext());
            }
            catch (SQLiteException var5_14) {
                ** continue;
            }
            var4_3.close();
            return var3_2;
        }
        var4_3.close();
        return var3_2;
lbl31: // 1 sources:
        do {
            try {
                this.a.a().f.a("Error querying user properties. appId", h3.a(var1_1), (Object)var5_14);
                var6_15 = Collections.emptyList();
                if (var4_3 == null) return var6_15;
            }
            catch (Throwable var7_16) {}
            var4_3.close();
            return var6_15;
            if (var4_3 == null) throw var7_16;
            var4_3.close();
            throw var7_16;
            break;
        } while (true);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final x4 d(String string) {
        x4 x42;
        boolean bl;
        Cursor cursor;
        boolean bl2;
        block18 : {
            block15 : {
                block14 : {
                    void var5_36;
                    Cursor cursor2;
                    block17 : {
                        block16 : {
                            block13 : {
                                a.c(string);
                                this.g();
                                this.h();
                                SQLiteDatabase sQLiteDatabase = this.o();
                                String[] arrstring = new String[28];
                                arrstring[0] = "app_instance_id";
                                bl = true;
                                arrstring[bl] = "gmp_app_id";
                                arrstring[2] = "resettable_device_id_hash";
                                arrstring[3] = "last_bundle_index";
                                arrstring[4] = "last_bundle_start_timestamp";
                                arrstring[5] = "last_bundle_end_timestamp";
                                arrstring[6] = "app_version";
                                arrstring[7] = "app_store";
                                arrstring[8] = "gmp_version";
                                arrstring[9] = "dev_cert_hash";
                                arrstring[10] = "measurement_enabled";
                                arrstring[11] = "day";
                                arrstring[12] = "daily_public_events_count";
                                arrstring[13] = "daily_events_count";
                                arrstring[14] = "daily_conversions_count";
                                arrstring[15] = "config_fetched_time";
                                arrstring[16] = "failed_config_fetch_time";
                                arrstring[17] = "app_version_int";
                                arrstring[18] = "firebase_instance_id";
                                arrstring[19] = "daily_error_events_count";
                                arrstring[20] = "daily_realtime_events_count";
                                arrstring[21] = "health_monitor_sample";
                                arrstring[22] = "android_id";
                                arrstring[23] = "adid_reporting_enabled";
                                arrstring[24] = "admob_app_id";
                                arrstring[25] = "dynamite_version";
                                arrstring[26] = "safelisted_events";
                                arrstring[27] = "ga_app_id";
                                String[] arrstring2 = new String[bl];
                                arrstring2[0] = string;
                                cursor = sQLiteDatabase.query("apps", arrstring, "app_id=?", arrstring2, null, null, null);
                                boolean bl3 = cursor.moveToFirst();
                                if (bl3) break block13;
                                cursor.close();
                                return null;
                            }
                            try {
                                x42 = new x4(this.b.j, string);
                                x42.b(cursor.getString(0));
                                x42.c(cursor.getString((int)bl));
                                x42.f(cursor.getString(2));
                                x42.d(cursor.getLong(3));
                                x42.h(cursor.getLong(4));
                                x42.i(cursor.getLong(5));
                                x42.h(cursor.getString(6));
                                x42.i(cursor.getString(7));
                                x42.a(cursor.getLong(8));
                                x42.b(cursor.getLong(9));
                                if (!cursor.isNull(10) && cursor.getInt(10) == 0) break block14;
                                break block15;
                            }
                            catch (SQLiteException sQLiteException) {
                                break block16;
                            }
                            catch (Throwable throwable) {
                                cursor2 = null;
                                break block17;
                            }
                            catch (SQLiteException sQLiteException) {
                                cursor = null;
                            }
                        }
                        try {
                            void var3_33;
                            this.a.a().f.a("Error querying app. appId", h3.a(string), (Object)var3_33);
                            if (cursor == null) return null;
                        }
                        catch (Throwable throwable) {
                            cursor2 = cursor;
                        }
                        cursor.close();
                        return null;
                    }
                    if (cursor2 == null) throw var5_36;
                    cursor2.close();
                    throw var5_36;
                }
                bl2 = false;
                break block18;
            }
            bl2 = true;
        }
        x42.a(bl2);
        long l6 = cursor.getLong(11);
        x42.a.d().g();
        boolean bl4 = x42.D;
        boolean bl5 = x42.w != l6;
        x42.D = bl4 | bl5;
        x42.w = l6;
        long l7 = cursor.getLong(12);
        x42.a.d().g();
        boolean bl6 = x42.D;
        boolean bl7 = x42.x != l7;
        x42.D = bl6 | bl7;
        x42.x = l7;
        long l10 = cursor.getLong(13);
        x42.a.d().g();
        boolean bl8 = x42.D;
        boolean bl9 = x42.y != l10;
        x42.D = bl8 | bl9;
        x42.y = l10;
        long l11 = cursor.getLong(14);
        x42.a.d().g();
        boolean bl10 = x42.D;
        boolean bl11 = x42.z != l11;
        x42.D = bl10 | bl11;
        x42.z = l11;
        x42.e(cursor.getLong(15));
        x42.f(cursor.getLong(16));
        long l12 = cursor.isNull(17) ? Integer.MIN_VALUE : (long)cursor.getInt(17);
        x42.j(l12);
        x42.g(cursor.getString(18));
        long l13 = cursor.getLong(19);
        x42.a.d().g();
        boolean bl12 = x42.D;
        boolean bl13 = x42.A != l13;
        x42.D = bl12 | bl13;
        x42.A = l13;
        long l14 = cursor.getLong(20);
        x42.a.d().g();
        boolean bl14 = x42.D;
        boolean bl15 = x42.B != l14;
        x42.D = bl14 | bl15;
        x42.B = l14;
        x42.a(cursor.getString(21));
        if (!this.a.g.c(null, (t2<Boolean>)u2.v0)) {
            long l15 = cursor.isNull(22) ? 0L : cursor.getLong(22);
            x42.g(l15);
        }
        if (!cursor.isNull(23) && cursor.getInt(23) == 0) {
            bl = false;
        }
        x42.b(bl);
        x42.d(cursor.getString(24));
        long l16 = cursor.isNull(25) ? 0L : cursor.getLong(25);
        x42.c(l16);
        if (!cursor.isNull(26)) {
            x42.a(Arrays.asList((Object[])cursor.getString(26).split(",", -1)));
        }
        ea.c();
        if (this.a.g.c(string, (t2<Boolean>)u2.i0)) {
            x42.e(cursor.getString(27));
        }
        x42.a.d().g();
        x42.D = false;
        if (cursor.moveToNext()) {
            this.a.a().f.a("Got multiple records for app, expected one. appId", h3.a(string));
        }
        cursor.close();
        return x42;
    }

    public final void d(String string, String string2) {
        a.c(string);
        a.c(string2);
        this.g();
        this.h();
        try {
            this.o().delete("user_attributes", "app_id=? and name=?", new String[]{string, string2});
            return;
        }
        catch (SQLiteException sQLiteException) {
            this.a.a().f.a("Error deleting user property. appId", h3.a(string), (Object)this.a.q().c(string2), (Object)sQLiteException);
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final e9 e(String string, String string2) {
        Cursor cursor;
        void var7_14;
        block13 : {
            Cursor cursor2;
            block12 : {
                e9 e92;
                block11 : {
                    Object object;
                    long l6;
                    block10 : {
                        block9 : {
                            a.c(string);
                            a.c(string2);
                            this.g();
                            this.h();
                            cursor2 = this.o().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{string, string2}, null, null, null);
                            boolean bl = cursor2.moveToFirst();
                            if (bl) break block9;
                            cursor2.close();
                            return null;
                        }
                        l6 = cursor2.getLong(0);
                        object = this.a(cursor2, 1);
                        if (object != null) break block10;
                        cursor2.close();
                        return null;
                    }
                    try {
                        String string3 = cursor2.getString(2);
                        e92 = new e9(string, string3, string2, l6, object);
                        if (!cursor2.moveToNext()) break block11;
                        this.a.a().f.a("Got multiple records for user property, expected one. appId", h3.a(string));
                    }
                    catch (SQLiteException sQLiteException) {
                        break block12;
                    }
                }
                cursor2.close();
                return e92;
                catch (Throwable throwable) {
                    cursor = null;
                    break block13;
                }
                catch (SQLiteException sQLiteException) {
                    cursor2 = null;
                }
            }
            try {
                void var5_11;
                this.a.a().f.a("Error querying user property. appId", h3.a(string), (Object)this.a.q().c(string2), (Object)var5_11);
                if (cursor2 == null) return null;
            }
            catch (Throwable throwable) {
                cursor = cursor2;
            }
            cursor2.close();
            return null;
        }
        if (cursor == null) throw var7_14;
        cursor.close();
        throw var7_14;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final zzaa f(String string, String string2) {
        void var7_23;
        Cursor cursor;
        block11 : {
            Cursor cursor2;
            block10 : {
                zzaa zzaa2;
                block9 : {
                    block8 : {
                        a.c(string);
                        a.c(string2);
                        this.g();
                        this.h();
                        cursor2 = this.o().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{string, string2}, null, null, null);
                        boolean bl = cursor2.moveToFirst();
                        if (bl) break block8;
                        cursor2.close();
                        return null;
                    }
                    try {
                        String string3 = cursor2.getString(0);
                        Object object = this.a(cursor2, 1);
                        boolean bl = cursor2.getInt(2) != 0;
                        String string4 = cursor2.getString(3);
                        long l6 = cursor2.getLong(4);
                        zzas zzas2 = (zzas)this.b.r().a(cursor2.getBlob(5), zzas.CREATOR);
                        long l7 = cursor2.getLong(6);
                        zzas zzas3 = (zzas)this.b.r().a(cursor2.getBlob(7), zzas.CREATOR);
                        long l10 = cursor2.getLong(8);
                        long l11 = cursor2.getLong(9);
                        zzas zzas4 = (zzas)this.b.r().a(cursor2.getBlob(10), zzas.CREATOR);
                        zzkg zzkg2 = new zzkg(string2, l10, object, string3);
                        zzaa2 = new zzaa(string, string3, zzkg2, l7, bl, string4, zzas2, l6, zzas3, l11, zzas4);
                        if (!cursor2.moveToNext()) break block9;
                        this.a.a().f.a("Got multiple records for conditional property, expected one", h3.a(string), (Object)this.a.q().c(string2));
                    }
                    catch (SQLiteException sQLiteException) {
                        break block10;
                    }
                }
                cursor2.close();
                return zzaa2;
                catch (Throwable throwable) {
                    cursor = null;
                    break block11;
                }
                catch (SQLiteException sQLiteException) {
                    cursor2 = null;
                }
            }
            try {
                void var5_20;
                this.a.a().f.a("Error querying conditional property", h3.a(string), (Object)this.a.q().c(string2), (Object)var5_20);
                if (cursor2 == null) return null;
            }
            catch (Throwable throwable) {
                cursor = cursor2;
            }
            cursor2.close();
            return null;
        }
        if (cursor == null) throw var7_23;
        cursor.close();
        throw var7_23;
    }

    public final int g(String string, String string2) {
        a.c(string);
        a.c(string2);
        this.g();
        this.h();
        try {
            int n7 = this.o().delete("conditional_properties", "app_id=? and name=?", new String[]{string, string2});
            return n7;
        }
        catch (SQLiteException sQLiteException) {
            this.a.a().f.a("Error deleting conditional property", h3.a(string), (Object)this.a.q().c(string2), (Object)sQLiteException);
            return 0;
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    public final boolean k() {
        i4 i42 = this.a;
        Context context = i42.a;
        return context.getDatabasePath("google_app_measurement.db").exists();
    }

    public final void l() {
        this.h();
        this.o().beginTransaction();
    }

    public final void m() {
        this.h();
        this.o().setTransactionSuccessful();
    }

    public final void n() {
        this.h();
        this.o().endTransaction();
    }

    public final SQLiteDatabase o() {
        this.g();
        try {
            SQLiteDatabase sQLiteDatabase = this.d.getWritableDatabase();
            return sQLiteDatabase;
        }
        catch (SQLiteException sQLiteException) {
            this.a.a().i.a("Error opening database", (Object)sQLiteException);
            throw sQLiteException;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final String p() {
        Cursor cursor;
        Throwable throwable;
        block9 : {
            Cursor cursor2;
            SQLiteException sQLiteException;
            block8 : {
                block7 : {
                    String string;
                    SQLiteDatabase sQLiteDatabase = this.o();
                    cursor2 = sQLiteDatabase.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                    try {
                        if (!cursor2.moveToFirst()) break block7;
                        string = cursor2.getString(0);
                    }
                    catch (SQLiteException sQLiteException2) {
                        break block8;
                    }
                    cursor2.close();
                    return string;
                }
                cursor2.close();
                return null;
                catch (Throwable throwable2) {
                    cursor = null;
                    break block9;
                }
                catch (SQLiteException sQLiteException3) {
                    sQLiteException = sQLiteException3;
                    cursor2 = null;
                }
            }
            try {
                this.a.a().f.a("Database error getting next bundle app id", (Object)sQLiteException);
                if (cursor2 == null) return null;
            }
            catch (Throwable throwable3) {
                cursor = cursor2;
                throwable = throwable3;
            }
            cursor2.close();
            return null;
        }
        if (cursor == null) throw throwable;
        cursor.close();
        throw throwable;
    }

    public final void q() {
        this.g();
        this.h();
        if (this.k()) {
            long l6 = this.a.m().h.a();
            if ((c)this.a.n != null) {
                long l7 = SystemClock.elapsedRealtime();
                long l10 = Math.abs((long)(l7 - l6));
                if (l10 > (Long)u2.y.a(null)) {
                    this.a.m().h.a(l7);
                    this.g();
                    this.h();
                    if (!this.k()) {
                        return;
                    }
                    SQLiteDatabase sQLiteDatabase = this.o();
                    String[] arrstring = new String[2];
                    if ((c)this.a.n != null) {
                        arrstring[0] = String.valueOf((long)System.currentTimeMillis());
                        arrstring[1] = String.valueOf((long)e.p());
                        int n7 = sQLiteDatabase.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", arrstring);
                        if (n7 > 0) {
                            this.a.a().n.a("Deleted stale rows. rowsDeleted", (Object)n7);
                            return;
                        }
                    } else {
                        throw null;
                    }
                }
                return;
            }
            throw null;
        }
    }
}

