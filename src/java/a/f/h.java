/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package a.f;

import a.f.g;
import a.f.l.b;
import a.g.a.c;
import a.i.r.i;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class h
extends c.a {
    public a.f.a b;
    public final a c;
    public final String d;
    public final String e;

    public h(a.f.a a5, a a6, String string, String string2) {
        super(a6.a);
        this.b = a5;
        this.c = a6;
        this.d = string;
        this.e = string2;
    }

    public final void a(a.g.a.b b2) {
        a.g.a.f.a a5 = (a.g.a.f.a)b2;
        a5.a.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String string = this.d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        stringBuilder.append(string);
        stringBuilder.append("')");
        String string2 = stringBuilder.toString();
        a5.a.execSQL(string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(a.g.a.b b2, int n4, int n10) {
        int n11;
        block29 : {
            List list;
            block28 : {
                g.d d6;
                block30 : {
                    a.f.a a5 = this.b;
                    n11 = 1;
                    if (a5 == null) break block29;
                    d6 = a5.d;
                    if (d6 == null) throw null;
                    if (n4 != n10) break block30;
                    list = Collections.emptyList();
                    break block28;
                }
                boolean bl = n10 > n4;
                ArrayList arrayList = new ArrayList();
                int n12 = bl ? -1 : 1;
                int n13 = n4;
                while (bl ? n13 < n10 : n13 > n10) {
                    int n14;
                    block32 : {
                        block31 : {
                            boolean bl2;
                            block27 : {
                                int n15;
                                int n16;
                                a.b.g<a.f.k.a> g5 = d6.a.a(n13);
                                if (g5 == null) break block31;
                                if (g5.a) {
                                    g5.a();
                                }
                                int n17 = g5.d;
                                if (bl) {
                                    n15 = n17 - 1;
                                    n16 = -1;
                                } else {
                                    n16 = n17;
                                    n15 = 0;
                                }
                                while (n15 != n16) {
                                    if (g5.a) {
                                        g5.a();
                                    }
                                    n14 = g5.b[n15];
                                    boolean bl3 = bl ? n14 <= n10 && n14 > n13 : n14 >= n10 && n14 < n13;
                                    if (bl3) {
                                        if (g5.a) {
                                            g5.a();
                                        }
                                        arrayList.add(g5.c[n15]);
                                        bl2 = true;
                                        break block27;
                                    }
                                    n15 += n12;
                                }
                                n14 = n13;
                                bl2 = false;
                            }
                            if (bl2) break block32;
                        }
                        list = null;
                        break block28;
                    }
                    n13 = n14;
                }
                list = arrayList;
            }
            if (list != null) {
                if ((i)this.c == null) throw null;
                ArrayList arrayList = new ArrayList();
                a.g.a.f.a a6 = (a.g.a.f.a)b2;
                Cursor cursor = a6.a("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (cursor.moveToNext()) {
                    arrayList.add((Object)cursor.getString(0));
                }
                for (String string : arrayList) {
                    if (!string.startsWith("room_fts_content_sync_")) continue;
                    String string2 = c.a.b.a.a.a("DROP TRIGGER IF EXISTS ", string);
                    a6.a.execSQL(string2);
                }
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    ((a.f.k.a)iterator.next()).a(b2);
                }
                if ((i)this.c == null) throw null;
                HashMap hashMap = new HashMap(2);
                hashMap.put((Object)"work_spec_id", (Object)new b.a("work_spec_id", "TEXT", (boolean)n11, n11));
                hashMap.put((Object)"prerequisite_id", (Object)new b.a("prerequisite_id", "TEXT", (boolean)n11, 2));
                HashSet hashSet = new HashSet(2);
                Object[] arrobject = new String[n11];
                arrobject[0] = "work_spec_id";
                List list2 = Arrays.asList((Object[])arrobject);
                Object[] arrobject2 = new String[n11];
                arrobject2[0] = "id";
                b.b b3 = new b.b("WorkSpec", "CASCADE", "CASCADE", (List<String>)list2, (List<String>)Arrays.asList((Object[])arrobject2));
                hashSet.add((Object)b3);
                Object[] arrobject3 = new String[n11];
                arrobject3[0] = "prerequisite_id";
                List list3 = Arrays.asList((Object[])arrobject3);
                Object[] arrobject4 = new String[n11];
                arrobject4[0] = "id";
                b.b b5 = new b.b("WorkSpec", "CASCADE", "CASCADE", (List<String>)list3, (List<String>)Arrays.asList((Object[])arrobject4));
                hashSet.add((Object)b5);
                HashSet hashSet2 = new HashSet(2);
                Object[] arrobject5 = new String[n11];
                arrobject5[0] = "work_spec_id";
                hashSet2.add((Object)new b.d("index_Dependency_work_spec_id", false, (List<String>)Arrays.asList((Object[])arrobject5)));
                Object[] arrobject6 = new String[n11];
                arrobject6[0] = "prerequisite_id";
                hashSet2.add((Object)new b.d("index_Dependency_prerequisite_id", false, (List<String>)Arrays.asList((Object[])arrobject6)));
                b b7 = new b("Dependency", (Map<String, b.a>)hashMap, (Set<b.b>)hashSet, (Set<b.d>)hashSet2);
                b b10 = b.a(b2, "Dependency");
                if (b7.equals(b10)) {
                    HashMap hashMap2 = new HashMap(23);
                    hashMap2.put((Object)"id", (Object)new b.a("id", "TEXT", (boolean)n11, n11));
                    hashMap2.put((Object)"state", (Object)new b.a("state", "INTEGER", (boolean)n11, 0));
                    hashMap2.put((Object)"worker_class_name", (Object)new b.a("worker_class_name", "TEXT", (boolean)n11, 0));
                    hashMap2.put((Object)"input_merger_class_name", (Object)new b.a("input_merger_class_name", "TEXT", false, 0));
                    hashMap2.put((Object)"input", (Object)new b.a("input", "BLOB", (boolean)n11, 0));
                    hashMap2.put((Object)"output", (Object)new b.a("output", "BLOB", (boolean)n11, 0));
                    hashMap2.put((Object)"initial_delay", (Object)new b.a("initial_delay", "INTEGER", (boolean)n11, 0));
                    hashMap2.put((Object)"interval_duration", (Object)new b.a("interval_duration", "INTEGER", (boolean)n11, 0));
                    hashMap2.put((Object)"flex_duration", (Object)new b.a("flex_duration", "INTEGER", (boolean)n11, 0));
                    hashMap2.put((Object)"run_attempt_count", (Object)new b.a("run_attempt_count", "INTEGER", (boolean)n11, 0));
                    hashMap2.put((Object)"backoff_policy", (Object)new b.a("backoff_policy", "INTEGER", (boolean)n11, 0));
                    hashMap2.put((Object)"backoff_delay_duration", (Object)new b.a("backoff_delay_duration", "INTEGER", (boolean)n11, 0));
                    hashMap2.put((Object)"period_start_time", (Object)new b.a("period_start_time", "INTEGER", (boolean)n11, 0));
                    hashMap2.put((Object)"minimum_retention_duration", (Object)new b.a("minimum_retention_duration", "INTEGER", (boolean)n11, 0));
                    hashMap2.put((Object)"schedule_requested_at", (Object)new b.a("schedule_requested_at", "INTEGER", (boolean)n11, 0));
                    hashMap2.put((Object)"required_network_type", (Object)new b.a("required_network_type", "INTEGER", false, 0));
                    hashMap2.put((Object)"requires_charging", (Object)new b.a("requires_charging", "INTEGER", (boolean)n11, 0));
                    hashMap2.put((Object)"requires_device_idle", (Object)new b.a("requires_device_idle", "INTEGER", (boolean)n11, 0));
                    hashMap2.put((Object)"requires_battery_not_low", (Object)new b.a("requires_battery_not_low", "INTEGER", (boolean)n11, 0));
                    hashMap2.put((Object)"requires_storage_not_low", (Object)new b.a("requires_storage_not_low", "INTEGER", (boolean)n11, 0));
                    hashMap2.put((Object)"trigger_content_update_delay", (Object)new b.a("trigger_content_update_delay", "INTEGER", (boolean)n11, 0));
                    hashMap2.put((Object)"trigger_max_content_delay", (Object)new b.a("trigger_max_content_delay", "INTEGER", (boolean)n11, 0));
                    hashMap2.put((Object)"content_uri_triggers", (Object)new b.a("content_uri_triggers", "BLOB", false, 0));
                    HashSet hashSet3 = new HashSet(0);
                    HashSet hashSet4 = new HashSet(n11);
                    Object[] arrobject7 = new String[n11];
                    arrobject7[0] = "schedule_requested_at";
                    hashSet4.add((Object)new b.d("index_WorkSpec_schedule_requested_at", false, (List<String>)Arrays.asList((Object[])arrobject7)));
                    b b11 = new b("WorkSpec", (Map<String, b.a>)hashMap2, (Set<b.b>)hashSet3, (Set<b.d>)hashSet4);
                    b b12 = b.a(b2, "WorkSpec");
                    if (b11.equals(b12)) {
                        HashMap hashMap3 = new HashMap(2);
                        hashMap3.put((Object)"tag", (Object)new b.a("tag", "TEXT", (boolean)n11, n11));
                        hashMap3.put((Object)"work_spec_id", (Object)new b.a("work_spec_id", "TEXT", (boolean)n11, 2));
                        HashSet hashSet5 = new HashSet(n11);
                        Object[] arrobject8 = new String[n11];
                        arrobject8[0] = "work_spec_id";
                        List list4 = Arrays.asList((Object[])arrobject8);
                        Object[] arrobject9 = new String[n11];
                        arrobject9[0] = "id";
                        b.b b13 = new b.b("WorkSpec", "CASCADE", "CASCADE", (List<String>)list4, (List<String>)Arrays.asList((Object[])arrobject9));
                        hashSet5.add((Object)b13);
                        HashSet hashSet6 = new HashSet(n11);
                        Object[] arrobject10 = new String[n11];
                        arrobject10[0] = "work_spec_id";
                        hashSet6.add((Object)new b.d("index_WorkTag_work_spec_id", false, (List<String>)Arrays.asList((Object[])arrobject10)));
                        b b14 = new b("WorkTag", (Map<String, b.a>)hashMap3, (Set<b.b>)hashSet5, (Set<b.d>)hashSet6);
                        b b15 = b.a(b2, "WorkTag");
                        if (b14.equals(b15)) {
                            HashMap hashMap4 = new HashMap(2);
                            hashMap4.put((Object)"work_spec_id", (Object)new b.a("work_spec_id", "TEXT", (boolean)n11, n11));
                            hashMap4.put((Object)"system_id", (Object)new b.a("system_id", "INTEGER", (boolean)n11, 0));
                            HashSet hashSet7 = new HashSet(n11);
                            Object[] arrobject11 = new String[n11];
                            arrobject11[0] = "work_spec_id";
                            List list5 = Arrays.asList((Object[])arrobject11);
                            Object[] arrobject12 = new String[n11];
                            arrobject12[0] = "id";
                            b.b b16 = new b.b("WorkSpec", "CASCADE", "CASCADE", (List<String>)list5, (List<String>)Arrays.asList((Object[])arrobject12));
                            hashSet7.add((Object)b16);
                            b b17 = new b("SystemIdInfo", (Map<String, b.a>)hashMap4, (Set<b.b>)hashSet7, (Set<b.d>)new HashSet(0));
                            b b18 = b.a(b2, "SystemIdInfo");
                            if (b17.equals(b18)) {
                                HashMap hashMap5 = new HashMap(2);
                                hashMap5.put((Object)"name", (Object)new b.a("name", "TEXT", (boolean)n11, n11));
                                hashMap5.put((Object)"work_spec_id", (Object)new b.a("work_spec_id", "TEXT", (boolean)n11, 2));
                                HashSet hashSet8 = new HashSet(n11);
                                Object[] arrobject13 = new String[n11];
                                arrobject13[0] = "work_spec_id";
                                List list6 = Arrays.asList((Object[])arrobject13);
                                Object[] arrobject14 = new String[n11];
                                arrobject14[0] = "id";
                                b.b b19 = new b.b("WorkSpec", "CASCADE", "CASCADE", (List<String>)list6, (List<String>)Arrays.asList((Object[])arrobject14));
                                hashSet8.add((Object)b19);
                                HashSet hashSet9 = new HashSet(n11);
                                Object[] arrobject15 = new String[n11];
                                arrobject15[0] = "work_spec_id";
                                hashSet9.add((Object)new b.d("index_WorkName_work_spec_id", false, (List<String>)Arrays.asList((Object[])arrobject15)));
                                b b20 = new b("WorkName", (Map<String, b.a>)hashMap5, (Set<b.b>)hashSet8, (Set<b.d>)hashSet9);
                                b b21 = b.a(b2, "WorkName");
                                if (b20.equals(b21)) {
                                    if ((i)this.c == null) throw null;
                                    this.a(b2);
                                    return;
                                }
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
                                stringBuilder.append((Object)b20);
                                stringBuilder.append("\n Found:\n");
                                stringBuilder.append((Object)b21);
                                throw new IllegalStateException(stringBuilder.toString());
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
                            stringBuilder.append((Object)b17);
                            stringBuilder.append("\n Found:\n");
                            stringBuilder.append((Object)b18);
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
                        stringBuilder.append((Object)b14);
                        stringBuilder.append("\n Found:\n");
                        stringBuilder.append((Object)b15);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
                    stringBuilder.append((Object)b11);
                    stringBuilder.append("\n Found:\n");
                    stringBuilder.append((Object)b12);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
                stringBuilder.append((Object)b7);
                stringBuilder.append("\n Found:\n");
                stringBuilder.append((Object)b10);
                throw new IllegalStateException(stringBuilder.toString());
                finally {
                    cursor.close();
                }
            }
        }
        boolean bl = false;
        if (bl) return;
        a.f.a a7 = this.b;
        if (a7 != null) {
            int n18;
            boolean bl4 = n4 > n10;
            if (bl4 && a7.l) {
                n18 = 0;
            } else {
                Set<Integer> set;
                if (!a7.k || (set = a7.m) != null && set.contains((Object)n4)) {
                    n11 = 0;
                }
                n18 = n11;
            }
            if (n18 == 0) {
                if ((i)this.c == null) throw null;
                a.g.a.f.a a10 = (a.g.a.f.a)b2;
                a10.a.execSQL("DROP TABLE IF EXISTS `Dependency`");
                a10.a.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
                a10.a.execSQL("DROP TABLE IF EXISTS `WorkTag`");
                a10.a.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
                a10.a.execSQL("DROP TABLE IF EXISTS `WorkName`");
                this.c.a(b2);
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A migration from ");
        stringBuilder.append(n4);
        stringBuilder.append(" to ");
        stringBuilder.append(n10);
        stringBuilder.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        throw new IllegalStateException(stringBuilder.toString());
    }

}

