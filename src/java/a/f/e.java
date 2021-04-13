/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.a.a.b.b$e
 *  a.b.a
 *  a.f.f$e
 *  a.g.a.a
 *  a.g.a.f.a
 *  a.g.a.f.b
 *  a.g.a.f.e
 *  android.annotation.SuppressLint
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.database.sqlite.SQLiteStatement
 *  android.util.Log
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.IdentityHashMap
 *  java.util.Iterator
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.locks.ReentrantReadWriteLock
 *  java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock
 */
package a.f;

import a.a.a.b.b;
import a.f.f;
import a.f.g;
import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class e {
    public static final String[] k = new String[]{"UPDATE", "DELETE", "INSERT"};
    public final a.b.a<String, Integer> a;
    public final String[] b;
    public Map<String, Set<String>> c;
    public final g d;
    public AtomicBoolean e = new AtomicBoolean(false);
    public volatile boolean f = false;
    public volatile a.g.a.f.e g;
    public b h;
    @SuppressLint(value={"RestrictedApi"})
    public final a.a.a.b.b<c, d> i = new a.a.a.b.b();
    public Runnable j = new Runnable(){

        public final Set<Integer> a() {
            a.b.c<Integer> c2 = new a.b.c<Integer>(0);
            g g2 = e.this.d;
            a.g.a.a a2 = new a.g.a.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;");
            g2.a();
            g2.b();
            Cursor cursor = ((a.g.a.f.a)((a.g.a.f.b)g2.c).a()).a((a.g.a.e)a2);
            try {
                while (cursor.moveToNext()) {
                    c2.add(cursor.getInt(0));
                }
            }
            catch (Throwable throwable) {
                cursor.close();
                throw throwable;
            }
            cursor.close();
            if (!c2.isEmpty()) {
                e.this.g.a();
            }
            return c2;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public void run() {
            block32 : {
                block36 : {
                    block34 : {
                        block33 : {
                            block35 : {
                                block31 : {
                                    block30 : {
                                        block29 : {
                                            var1_1 = e.this.d.h.readLock();
                                            var1_1.lock();
                                            var15_2 = e.this.a();
                                            if (var15_2) break block29;
                                            var1_1.unlock();
                                            return;
                                        }
                                        var16_3 = e.this.e.compareAndSet(true, false);
                                        if (var16_3) break block30;
                                        var1_1.unlock();
                                        return;
                                    }
                                    var17_4 = e.this.d.e();
                                    if (!var17_4) break block31;
                                    var1_1.unlock();
                                    return;
                                }
                                if (!e.this.d.f) ** GOTO lbl43
                                var18_5 = e.this.d.c;
                                var19_6 = (a.g.a.f.b)var18_5;
                                var20_7 = var19_6.a();
                                ((a.g.a.f.a)var20_7).a.beginTransaction();
                                var3_8 = this.a();
                                try {
                                    ((a.g.a.f.a)var20_7).a.setTransactionSuccessful();
                                }
                                catch (Throwable var21_11) {
                                    break block36;
                                }
                                try {
                                    try {
                                        ((a.g.a.f.a)var20_7).a.endTransaction();
                                        break block32;
                                    }
                                    catch (SQLiteException var2_13) {
                                        break block33;
                                    }
                                    catch (IllegalStateException var2_14) {
                                        break block33;
                                    }
lbl43: // 2 sources:
                                    var3_8 = this.a();
                                    break block32;
                                }
                                catch (Throwable var14_18) {
                                    break block34;
                                }
                                catch (SQLiteException var2_15) {
                                    break block35;
                                }
                                catch (IllegalStateException var2_16) {
                                    // empty catch block
                                }
                            }
                            var3_8 = null;
                        }
                        Log.e((String)"ROOM", (String)"Cannot run invalidation tracker. Is the db closed?", (Throwable)var2_17);
                        break block32;
                    }
                    var1_1.unlock();
                    throw var14_18;
                    catch (Throwable var21_12) {
                        var3_9 = null;
                    }
                }
                ((a.g.a.f.a)var20_7).a.endTransaction();
                throw var21_10;
            }
            var1_1.unlock();
            if (var3_8 == null) return;
            if (var3_8.isEmpty() != false) return;
            var22_20 = var5_19 = e.this.i;
            // MONITORENTER : var22_20
            var7_21 = e.this.i.iterator();
            block20 : do {
                if (!(var8_22 = var7_21).hasNext()) {
                    // MONITOREXIT : var22_20
                    return;
                }
                var9_23 = (d)((Map.Entry)var8_22.next()).getValue();
                var10_24 = var9_23.a.length;
                var11_25 = null;
                var12_26 = 0;
                do {
                    if (var12_26 < var10_24) {
                        if (var3_8.contains((Object)var9_23.a[var12_26])) {
                            if (var10_24 == 1) {
                                var11_25 = var9_23.d;
                            } else {
                                if (var11_25 == null) {
                                    var11_25 = new a.b.c<String>(var10_24);
                                }
                                var11_25.add((Object)var9_23.b[var12_26]);
                            }
                        }
                    } else {
                        if (var11_25 == null) continue block20;
                        var9_23.c.a(var11_25);
                        continue block20;
                    }
                    ++var12_26;
                } while (true);
                break;
            } while (true);
        }
    };

    public /* varargs */ e(g g2, Map<String, String> map, Map<String, Set<String>> map2, String ... arrstring) {
        this.d = g2;
        this.h = new b(arrstring.length);
        this.a = new a.b.a();
        this.c = map2;
        Collections.newSetFromMap((Map)new IdentityHashMap());
        int n2 = arrstring.length;
        this.b = new String[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = arrstring[i2].toLowerCase(Locale.US);
            this.a.put(string, i2);
            String string2 = (String)map.get((Object)arrstring[i2]);
            this.b[i2] = string2 != null ? string2.toLowerCase(Locale.US) : string;
        }
        for (Map.Entry entry : map.entrySet()) {
            String string = ((String)entry.getValue()).toLowerCase(Locale.US);
            if (!this.a.containsKey(string)) continue;
            String string3 = ((String)entry.getKey()).toLowerCase(Locale.US);
            a.b.a<String, Integer> a2 = this.a;
            a2.put(string3, (Integer)a2.get(string));
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @SuppressLint(value={"RestrictedApi"})
    public void a(c c2) {
        a.a.a.b.b<c, d> b2;
        String[] arrstring = c2.a;
        int n2 = 0;
        a.b.c<String> c3 = new a.b.c<String>(0);
        for (String string : arrstring) {
            String string2 = string.toLowerCase(Locale.US);
            if (this.c.containsKey((Object)string2)) {
                c3.addAll((Collection)this.c.get((Object)string2));
                continue;
            }
            c3.add(string);
        }
        String[] arrstring2 = c3.toArray(new String[c3.c]);
        int[] arrn = new int[arrstring2.length];
        int n3 = arrstring2.length;
        while (n2 < n3) {
            Integer n5 = (Integer)this.a.get(arrstring2[n2].toLowerCase(Locale.US));
            if (n5 == null) {
                StringBuilder stringBuilder = c.a.b.a.a.a("There is no table with name ");
                stringBuilder.append(arrstring2[n2]);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            arrn[n2] = n5;
            ++n2;
        }
        d d2 = new d(c2, arrn, arrstring2);
        a.a.a.b.b<c, d> b3 = b2 = this.i;
        // MONITORENTER : b3
        d d3 = this.i.b(c2, d2);
        // MONITOREXIT : b3
        if (d3 != null) return;
        {
            catch (Throwable throwable) {}
            {
                // MONITOREXIT : b3
                throw throwable;
            }
        }
        if (!this.h.a(arrn)) return;
        this.b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(a.g.a.b b2) {
        e e2 = this;
        synchronized (e2) {
            if (this.f) {
                Log.e((String)"ROOM", (String)"Invalidation tracker is initialized twice :/.");
                return;
            }
            ((a.g.a.f.a)b2).a.execSQL("PRAGMA temp_store = MEMORY;");
            ((a.g.a.f.a)b2).a.execSQL("PRAGMA recursive_triggers='ON';");
            ((a.g.a.f.a)b2).a.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            this.b(b2);
            this.g = new a.g.a.f.e(((a.g.a.f.a)b2).a.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
            this.f = true;
            return;
        }
    }

    public final void a(a.g.a.b b2, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
        stringBuilder.append(n2);
        stringBuilder.append(", 0)");
        String string = stringBuilder.toString();
        a.g.a.f.a a2 = (a.g.a.f.a)b2;
        a2.a.execSQL(string);
        String string2 = this.b[n2];
        StringBuilder stringBuilder2 = new StringBuilder();
        for (String string3 : k) {
            stringBuilder2.setLength(0);
            stringBuilder2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            stringBuilder2.append("`");
            stringBuilder2.append("room_table_modification_trigger_");
            stringBuilder2.append(string2);
            stringBuilder2.append("_");
            stringBuilder2.append(string3);
            stringBuilder2.append("`");
            stringBuilder2.append(" AFTER ");
            stringBuilder2.append(string3);
            stringBuilder2.append(" ON `");
            stringBuilder2.append(string2);
            stringBuilder2.append("` BEGIN UPDATE ");
            stringBuilder2.append("room_table_modification_log");
            stringBuilder2.append(" SET ");
            stringBuilder2.append("invalidated");
            stringBuilder2.append(" = 1");
            stringBuilder2.append(" WHERE ");
            stringBuilder2.append("table_id");
            stringBuilder2.append(" = ");
            stringBuilder2.append(n2);
            stringBuilder2.append(" AND ");
            stringBuilder2.append("invalidated");
            stringBuilder2.append(" = 0");
            stringBuilder2.append("; END");
            String string4 = stringBuilder2.toString();
            a2.a.execSQL(string4);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public /* varargs */ void a(String ... arrstring) {
        a.a.a.b.b<c, d> b2;
        a.a.a.b.b<c, d> b3 = b2 = this.i;
        synchronized (b3) {
            Iterator<Map.Entry<c, d>> iterator = this.i.iterator();
            do {
                b.e e2 = iterator;
                if (!e2.hasNext()) return;
                if ((f.e)((c)((Map.Entry)e2.next()).getKey()) == null) throw null;
                continue;
                break;
            } while (true);
        }
    }

    public boolean a() {
        if (!this.d.f()) {
            return false;
        }
        if (!this.f) {
            ((a.g.a.f.b)this.d.c).a();
        }
        if (!this.f) {
            Log.e((String)"ROOM", (String)"database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    public void b() {
        if (!this.d.f()) {
            return;
        }
        this.b(((a.g.a.f.b)this.d.c).a());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @SuppressLint(value={"RestrictedApi"})
    public void b(c c2) {
        a.a.a.b.b<c, d> b2;
        a.a.a.b.b<c, d> b3 = b2 = this.i;
        // MONITORENTER : b3
        d d2 = this.i.remove(c2);
        // MONITOREXIT : b3
        if (d2 == null) return;
        if (!this.h.b(d2.a)) return;
        this.b();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void b(a.g.a.b var1_1) {
        if (((a.g.a.f.a)var1_1).a.inTransaction()) {
            return;
        }
        block13 : do {
            block19 : {
                var4_2 = this.d.h.readLock();
                var4_2.lock();
                var6_3 = this.h.a();
                if (var6_3 != null) break block19;
                var4_2.unlock();
                return;
            }
            var7_4 = var6_3.length;
            ((a.g.a.f.a)var1_1).a.beginTransaction();
            var8_5 = 0;
            do {
                block20 : {
                    if (var8_5 >= var7_4) ** GOTO lbl28
                    var10_6 = var6_3[var8_5];
                    if (var10_6 != 1) {
                        if (var10_6 == 2) {
                            this.b(var1_1, var8_5);
                        }
                    } else {
                        this.a(var1_1, var8_5);
                    }
                    break block20;
lbl28: // 1 sources:
                    ((a.g.a.f.a)var1_1).a.setTransactionSuccessful();
                    ((a.g.a.f.a)var1_1).a.endTransaction();
                    this.h.b();
                    var4_2.unlock();
                    continue block13;
                    catch (Throwable var9_7) {
                        try {
                            ((a.g.a.f.a)var1_1).a.endTransaction();
                            throw var9_7;
                        }
                        catch (Throwable var5_8) {
                            try {
                                var4_2.unlock();
                                throw var5_8;
                            }
                            catch (SQLiteException var2_9) {
                            }
                            catch (IllegalStateException var2_10) {
                                // empty catch block
                            }
                        }
                    }
                    Log.e((String)"ROOM", (String)"Cannot run invalidation tracker. Is the db closed?", (Throwable)var2_11);
                    return;
                }
                ++var8_5;
            } while (true);
            break;
        } while (true);
    }

    public final void b(a.g.a.b b2, int n2) {
        String string = this.b[n2];
        StringBuilder stringBuilder = new StringBuilder();
        for (String string2 : k) {
            stringBuilder.setLength(0);
            stringBuilder.append("DROP TRIGGER IF EXISTS ");
            stringBuilder.append("`");
            stringBuilder.append("room_table_modification_trigger_");
            stringBuilder.append(string);
            stringBuilder.append("_");
            stringBuilder.append(string2);
            stringBuilder.append("`");
            String string3 = stringBuilder.toString();
            ((a.g.a.f.a)b2).a.execSQL(string3);
        }
    }

    public static class b {
        public final long[] a;
        public final boolean[] b;
        public final int[] c;
        public boolean d;
        public boolean e;

        public b(int n2) {
            long[] arrl = new long[n2];
            this.a = arrl;
            this.b = new boolean[n2];
            this.c = new int[n2];
            Arrays.fill((long[])arrl, (long)0L);
            Arrays.fill((boolean[])this.b, (boolean)false);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public /* varargs */ boolean a(int ... arrn) {
            b b2 = this;
            synchronized (b2) {
                int n2 = arrn.length;
                int n3 = 0;
                boolean bl = false;
                while (n3 < n2) {
                    int n5 = arrn[n3];
                    long l2 = this.a[n5];
                    this.a[n5] = 1L + l2;
                    if (l2 == 0L) {
                        this.d = true;
                        bl = true;
                    }
                    ++n3;
                }
                return bl;
            }
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public int[] a() {
            block11 : {
                block10 : {
                    var8_1 = this;
                    // MONITORENTER : var8_1
                    if (this.d) {
                        if (this.e) {
                            return null;
                        }
                    } else {
                        // MONITOREXIT : var8_1
                        return null;
                    }
                    var2_2 = this.a.length;
                    var3_3 = 0;
                    block4 : do {
                        var4_4 = 1;
                        if (var3_3 >= var2_2) break;
                        var5_5 = this.a[var3_3] > 0L;
                        if (var5_5 != this.b[var3_3]) {
                            var6_6 = this.c;
                            if (!var5_5) break block10;
                            break block11;
                        }
                        this.c[var3_3] = 0;
lbl21: // 2 sources:
                        do {
                            this.b[var3_3] = var5_5;
                            ++var3_3;
                            continue block4;
                            break;
                        } while (true);
                        break;
                    } while (true);
                    this.e = var4_4;
                    this.d = false;
                    var7_7 = this.c;
                    // MONITOREXIT : var8_1
                    return var7_7;
                }
                var4_4 = 2;
            }
            var6_6[var3_3] = var4_4;
            ** while (true)
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void b() {
            b b2 = this;
            synchronized (b2) {
                this.e = false;
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public /* varargs */ boolean b(int ... arrn) {
            b b2 = this;
            synchronized (b2) {
                int n2 = arrn.length;
                int n3 = 0;
                boolean bl = false;
                while (n3 < n2) {
                    int n5 = arrn[n3];
                    long l2 = this.a[n5];
                    this.a[n5] = l2 - 1L;
                    if (l2 == 1L) {
                        this.d = true;
                        bl = true;
                    }
                    ++n3;
                }
                return bl;
            }
        }
    }

    public static abstract class c {
        public final String[] a;

        public c(String[] arrstring) {
            this.a = (String[])Arrays.copyOf((Object[])arrstring, (int)arrstring.length);
        }

        public abstract void a(Set<String> var1);
    }

    public static class d {
        public final int[] a;
        public final String[] b;
        public final c c;
        public final Set<String> d;

        public d(c c2, int[] arrn, String[] arrstring) {
            Set set;
            this.c = c2;
            this.a = arrn;
            this.b = arrstring;
            if (arrn.length == 1) {
                a.b.c<String> c3 = new a.b.c<String>(0);
                c3.add(this.b[0]);
                set = Collections.unmodifiableSet(c3);
            } else {
                set = null;
            }
            this.d = set;
        }
    }

}

