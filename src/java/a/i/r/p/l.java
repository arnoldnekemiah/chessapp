/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteProgram
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package a.i.r.p;

import a.i.n;
import a.i.r.p.j;
import a.i.r.p.k;
import a.i.r.p.l;
import android.database.Cursor;
import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class l
implements k {
    public final a.f.g a;
    public final a.f.b b;
    public final a.f.j c;
    public final a.f.j d;
    public final a.f.j e;
    public final a.f.j f;
    public final a.f.j g;
    public final a.f.j h;
    public final a.f.j i;

    public l(a.f.g g5) {
        this.a = g5;
        this.b = new a.f.b<j>(this, g5){

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            public void a(a.g.a.f.e var1_1, Object var2_2) {
                block35 : {
                    block36 : {
                        block44 : {
                            block37 : {
                                block43 : {
                                    block42 : {
                                        block38 : {
                                            block39 : {
                                                block40 : {
                                                    block41 : {
                                                        var3_3 = (j)var2_2;
                                                        var4_4 = var3_3.a;
                                                        var5_5 = 1;
                                                        if (var4_4 == null) {
                                                            var1_1.a.bindNull(var5_5);
                                                        } else {
                                                            var1_1.a.bindString(var5_5, var4_4);
                                                        }
                                                        var6_6 = a.c.a.a.a(var3_3.b);
                                                        var1_1.a.bindLong(2, var6_6);
                                                        var8_7 = var3_3.c;
                                                        if (var8_7 == null) {
                                                            var1_1.a.bindNull(3);
                                                        } else {
                                                            var1_1.a.bindString(3, var8_7);
                                                        }
                                                        var9_8 = var3_3.d;
                                                        var10_9 = 4;
                                                        if (var9_8 == null) {
                                                            var1_1.a.bindNull(var10_9);
                                                        } else {
                                                            var1_1.a.bindString(var10_9, var9_8);
                                                        }
                                                        var11_10 = a.i.e.a(var3_3.e);
                                                        if (var11_10 == null) {
                                                            var1_1.a.bindNull(5);
                                                        } else {
                                                            var1_1.a.bindBlob(5, var11_10);
                                                        }
                                                        var12_11 = a.i.e.a(var3_3.f);
                                                        if (var12_11 == null) {
                                                            var1_1.a.bindNull(6);
                                                        } else {
                                                            var1_1.a.bindBlob(6, var12_11);
                                                        }
                                                        var13_12 = var3_3.g;
                                                        var1_1.a.bindLong(7, var13_12);
                                                        var15_13 = var3_3.h;
                                                        var1_1.a.bindLong(8, var15_13);
                                                        var17_14 = var3_3.i;
                                                        var1_1.a.bindLong(9, var17_14);
                                                        var19_15 = var3_3.k;
                                                        var1_1.a.bindLong(10, var19_15);
                                                        var21_16 = var3_3.l;
                                                        var22_17 = var21_16.ordinal();
                                                        if (var22_17 != 0) {
                                                            if (var22_17 != var5_5) {
                                                                var71_19 = new StringBuilder();
                                                                var71_19.append("Could not convert ");
                                                                var71_19.append((Object)var21_16);
                                                                var71_19.append(" to int");
                                                                throw new java.lang.IllegalArgumentException(var71_19.toString());
                                                            }
                                                            var23_18 = 1;
                                                        } else {
                                                            var23_18 = 0;
                                                        }
                                                        var24_20 = var23_18;
                                                        var1_1.a.bindLong(11, var24_20);
                                                        var26_21 = var3_3.m;
                                                        var1_1.a.bindLong(12, var26_21);
                                                        var28_22 = var3_3.n;
                                                        var1_1.a.bindLong(13, var28_22);
                                                        var30_23 = var3_3.o;
                                                        var1_1.a.bindLong(14, var30_23);
                                                        var32_24 = var3_3.p;
                                                        var1_1.a.bindLong(15, var32_24);
                                                        var34_25 = var3_3.j;
                                                        if (var34_25 == null) {
                                                            var1_1.a.bindNull(16);
                                                            var1_1.a.bindNull(17);
                                                            var1_1.a.bindNull(18);
                                                            var1_1.a.bindNull(19);
                                                            var1_1.a.bindNull(20);
                                                            var1_1.a.bindNull(21);
                                                            var1_1.a.bindNull(22);
                                                            var1_1.a.bindNull(23);
                                                            return;
                                                        }
                                                        var35_26 = var34_25.a;
                                                        var36_27 = var35_26.ordinal();
                                                        if (var36_27 == 0) break block38;
                                                        if (var36_27 == var5_5) break block39;
                                                        if (var36_27 == 2) break block40;
                                                        if (var36_27 == 3) break block41;
                                                        if (var36_27 != var10_9) {
                                                            var67_28 = new StringBuilder();
                                                            var67_28.append("Could not convert ");
                                                            var67_28.append((Object)var35_26);
                                                            var67_28.append(" to int");
                                                            throw new java.lang.IllegalArgumentException(var67_28.toString());
                                                        }
                                                        break block42;
                                                    }
                                                    var5_5 = 3;
                                                    break block39;
                                                }
                                                var5_5 = 2;
                                            }
                                            var10_9 = var5_5;
                                            break block42;
                                        }
                                        var10_9 = 0;
                                    }
                                    var37_29 = var10_9;
                                    var1_1.a.bindLong(16, var37_29);
                                    var39_30 = (long)var34_25.b;
                                    var1_1.a.bindLong(17, var39_30);
                                    var41_31 = (long)var34_25.c;
                                    var1_1.a.bindLong(18, var41_31);
                                    var43_32 = (long)var34_25.d;
                                    var1_1.a.bindLong(19, var43_32);
                                    var45_33 = (long)var34_25.e;
                                    var1_1.a.bindLong(20, var45_33);
                                    var47_34 = var34_25.f;
                                    var1_1.a.bindLong(21, var47_34);
                                    var49_35 = var34_25.g;
                                    var1_1.a.bindLong(22, var49_35);
                                    var51_36 = var34_25.h;
                                    var52_37 = var51_36.a();
                                    var53_38 = null;
                                    if (var52_37 != 0) break block43;
                                    var54_39 = null;
                                    break block44;
                                }
                                var55_40 = new java.io.ByteArrayOutputStream();
                                var56_41 = new java.io.ObjectOutputStream((java.io.OutputStream)var55_40);
                                var56_41.writeInt(var51_36.a());
                                for (a.i.d$a var66_43 : var51_36.a) {
                                    var56_41.writeUTF(var66_43.a.toString());
                                    var56_41.writeBoolean(var66_43.b);
                                }
                                var56_41.close();
                                catch (Throwable var64_44) {
                                    var61_45 = var64_44;
                                    break block35;
                                }
                                catch (java.io.IOException var57_46) {
                                    var53_38 = var56_41;
                                    ** GOTO lbl-1000
                                }
                                catch (Throwable var60_49) {
                                    break block36;
                                }
                                catch (java.io.IOException var57_47) {
                                    // empty catch block
                                }
lbl-1000: // 2 sources:
                                {
                                    var57_48.printStackTrace();
                                    ** if (var53_38 == null) goto lbl-1000
                                }
lbl-1000: // 1 sources:
                                {
                                    var53_38.close();
                                }
lbl-1000: // 2 sources:
                                {
                                    break block37;
                                }
                                catch (java.io.IOException var59_50) {
                                    var59_50.printStackTrace();
                                }
                            }
                            try {
                                var55_40.close();
                            }
                            catch (java.io.IOException var58_51) {
                                var58_51.printStackTrace();
                            }
                            var54_39 = var55_40.toByteArray();
                        }
                        if (var54_39 == null) {
                            var1_1.a.bindNull(23);
                            return;
                        }
                        var1_1.a.bindBlob(23, var54_39);
                        return;
                    }
                    var61_45 = var60_49;
                    var56_41 = var53_38;
                }
                if (var56_41 != null) {
                    try {
                        var56_41.close();
                    }
                    catch (java.io.IOException var63_52) {
                        var63_52.printStackTrace();
                    }
                }
                try {
                    var55_40.close();
                    throw var61_45;
                }
                catch (java.io.IOException var62_53) {
                    var62_53.printStackTrace();
                }
                throw var61_45;
            }

            public String b() {
                return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.c = new a.f.j(this, g5){

            @Override
            public String b() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.d = new a.f.j(this, g5){

            @Override
            public String b() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.e = new a.f.j(this, g5){

            @Override
            public String b() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.f = new a.f.j(this, g5){

            @Override
            public String b() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.g = new a.f.j(this, g5){

            @Override
            public String b() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.h = new a.f.j(this, g5){

            @Override
            public String b() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.i = new a.f.j(this, g5){

            @Override
            public String b() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        new a.f.j(this, g5){

            @Override
            public String b() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }

    public /* varargs */ int a(n n10, String ... arrstring) {
        int n11;
        this.a.b();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UPDATE workspec SET state=");
        stringBuilder.append("?");
        stringBuilder.append(" WHERE id IN (");
        int n12 = arrstring.length;
        int n13 = 0;
        for (int i10 = 0; i10 < n12; ++i10) {
            stringBuilder.append("?");
            if (i10 >= n12 - 1) continue;
            stringBuilder.append(",");
        }
        stringBuilder.append(")");
        String string = stringBuilder.toString();
        a.g.a.f.e e6 = this.a.a(string);
        long l8 = a.c.a.a.a(n10);
        e6.a.bindLong(1, l8);
        int n14 = 2;
        int n15 = arrstring.length;
        while (n13 < n15) {
            String string2 = arrstring[n13];
            if (string2 == null) {
                e6.a.bindNull(n14);
            } else {
                e6.a.bindString(n14, string2);
            }
            ++n14;
            ++n13;
        }
        this.a.c();
        try {
            n11 = e6.a();
            this.a.g();
        }
        catch (Throwable throwable) {
            this.a.d();
            throw throwable;
        }
        this.a.d();
        return n11;
    }

    public int a(String string, long l8) {
        int n10;
        this.a.b();
        a.g.a.f.e e6 = this.h.a();
        e6.a.bindLong(1, l8);
        if (string == null) {
            e6.a.bindNull(2);
        } else {
            e6.a.bindString(2, string);
        }
        this.a.c();
        try {
            n10 = e6.a();
            this.a.g();
        }
        catch (Throwable throwable) {
            this.a.d();
            a.f.j j2 = this.h;
            if (e6 == j2.c) {
                j2.a.set(false);
            }
            throw throwable;
        }
        this.a.d();
        a.f.j j5 = this.h;
        if (e6 == j5.c) {
            j5.a.set(false);
        }
        return n10;
    }

    public n a(String string) {
        n n10;
        a.f.i i10 = a.f.i.a("SELECT state FROM workspec WHERE id=?", 1);
        if (string == null) {
            i10.bindNull(1);
        } else {
            i10.bindString(1, string);
        }
        this.a.b();
        Cursor cursor = a.f.l.a.a(this.a, i10, false);
        try {
            n10 = cursor.moveToFirst() ? a.c.a.a.c(cursor.getInt(0)) : null;
        }
        catch (Throwable throwable) {
            cursor.close();
            i10.b();
            throw throwable;
        }
        cursor.close();
        i10.b();
        return n10;
    }

    public List<String> a() {
        ArrayList arrayList;
        a.f.i i10 = a.f.i.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.a.b();
        Cursor cursor = a.f.l.a.a(this.a, i10, false);
        try {
            arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                arrayList.add((Object)cursor.getString(0));
            }
        }
        catch (Throwable throwable) {
            cursor.close();
            i10.b();
            throw throwable;
        }
        cursor.close();
        i10.b();
        return arrayList;
    }

    public List<j> a(int n10) {
        a.f.i i10 = a.f.i.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        i10.bindLong(1, n10);
        this.a.b();
        Cursor cursor = a.f.l.a.a(this.a, i10, false);
        try {
            int n11 = a.c.a.a.a(cursor, "id");
            int n12 = a.c.a.a.a(cursor, "state");
            int n13 = a.c.a.a.a(cursor, "worker_class_name");
            int n14 = a.c.a.a.a(cursor, "input_merger_class_name");
            int n15 = a.c.a.a.a(cursor, "input");
            int n16 = a.c.a.a.a(cursor, "output");
            int n17 = a.c.a.a.a(cursor, "initial_delay");
            int n18 = a.c.a.a.a(cursor, "interval_duration");
            int n19 = a.c.a.a.a(cursor, "flex_duration");
            int n20 = a.c.a.a.a(cursor, "run_attempt_count");
            int n21 = a.c.a.a.a(cursor, "backoff_policy");
            int n22 = a.c.a.a.a(cursor, "backoff_delay_duration");
            int n23 = a.c.a.a.a(cursor, "period_start_time");
            int n24 = a.c.a.a.a(cursor, "minimum_retention_duration");
            return n24;
        }
        finally {
            a.f.i i11 = i10;
        }
    }

    public void a(String string, a.i.e e6) {
        this.a.b();
        a.g.a.f.e e10 = this.d.a();
        byte[] arrby = a.i.e.a(e6);
        if (arrby == null) {
            e10.a.bindNull(1);
        } else {
            e10.a.bindBlob(1, arrby);
        }
        if (string == null) {
            e10.a.bindNull(2);
        } else {
            e10.a.bindString(2, string);
        }
        this.a.c();
        try {
            e10.a();
            this.a.g();
        }
        catch (Throwable throwable) {
            this.a.d();
            this.d.a(e10);
            throw throwable;
        }
        this.a.d();
        a.f.j j2 = this.d;
        if (e10 == j2.c) {
            j2.a.set(false);
        }
    }

    public List<j> b() {
        a.f.i i10 = a.f.i.a("SELECT * FROM workspec WHERE state=1", 0);
        this.a.b();
        Cursor cursor = a.f.l.a.a(this.a, i10, false);
        try {
            int n10 = a.c.a.a.a(cursor, "id");
            int n11 = a.c.a.a.a(cursor, "state");
            int n12 = a.c.a.a.a(cursor, "worker_class_name");
            int n13 = a.c.a.a.a(cursor, "input_merger_class_name");
            int n14 = a.c.a.a.a(cursor, "input");
            int n15 = a.c.a.a.a(cursor, "output");
            int n16 = a.c.a.a.a(cursor, "initial_delay");
            int n17 = a.c.a.a.a(cursor, "interval_duration");
            int n18 = a.c.a.a.a(cursor, "flex_duration");
            int n19 = a.c.a.a.a(cursor, "run_attempt_count");
            int n20 = a.c.a.a.a(cursor, "backoff_policy");
            int n21 = a.c.a.a.a(cursor, "backoff_delay_duration");
            int n22 = a.c.a.a.a(cursor, "period_start_time");
            int n23 = a.c.a.a.a(cursor, "minimum_retention_duration");
            return n23;
        }
        finally {
            a.f.i i11 = i10;
        }
    }

    public List<String> b(String string) {
        ArrayList arrayList;
        a.f.i i10 = a.f.i.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (string == null) {
            i10.bindNull(1);
        } else {
            i10.bindString(1, string);
        }
        this.a.b();
        Cursor cursor = a.f.l.a.a(this.a, i10, false);
        try {
            arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                arrayList.add((Object)cursor.getString(0));
            }
        }
        catch (Throwable throwable) {
            cursor.close();
            i10.b();
            throw throwable;
        }
        cursor.close();
        i10.b();
        return arrayList;
    }

    public void b(String string, long l8) {
        this.a.b();
        a.g.a.f.e e6 = this.e.a();
        e6.a.bindLong(1, l8);
        if (string == null) {
            e6.a.bindNull(2);
        } else {
            e6.a.bindString(2, string);
        }
        this.a.c();
        try {
            e6.a();
            this.a.g();
        }
        catch (Throwable throwable) {
            this.a.d();
            a.f.j j2 = this.e;
            if (e6 == j2.c) {
                j2.a.set(false);
            }
            throw throwable;
        }
        this.a.d();
        a.f.j j5 = this.e;
        if (e6 == j5.c) {
            j5.a.set(false);
        }
    }

    public List<j> c() {
        a.f.i i10 = a.f.i.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.b();
        Cursor cursor = a.f.l.a.a(this.a, i10, false);
        try {
            int n10 = a.c.a.a.a(cursor, "id");
            int n11 = a.c.a.a.a(cursor, "state");
            int n12 = a.c.a.a.a(cursor, "worker_class_name");
            int n13 = a.c.a.a.a(cursor, "input_merger_class_name");
            int n14 = a.c.a.a.a(cursor, "input");
            int n15 = a.c.a.a.a(cursor, "output");
            int n16 = a.c.a.a.a(cursor, "initial_delay");
            int n17 = a.c.a.a.a(cursor, "interval_duration");
            int n18 = a.c.a.a.a(cursor, "flex_duration");
            int n19 = a.c.a.a.a(cursor, "run_attempt_count");
            int n20 = a.c.a.a.a(cursor, "backoff_policy");
            int n21 = a.c.a.a.a(cursor, "backoff_delay_duration");
            int n22 = a.c.a.a.a(cursor, "period_start_time");
            int n23 = a.c.a.a.a(cursor, "minimum_retention_duration");
            return n23;
        }
        finally {
            a.f.i i11 = i10;
        }
    }

    public List<String> c(String string) {
        ArrayList arrayList;
        a.f.i i10 = a.f.i.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (string == null) {
            i10.bindNull(1);
        } else {
            i10.bindString(1, string);
        }
        this.a.b();
        Cursor cursor = a.f.l.a.a(this.a, i10, false);
        try {
            arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                arrayList.add((Object)cursor.getString(0));
            }
        }
        catch (Throwable throwable) {
            cursor.close();
            i10.b();
            throw throwable;
        }
        cursor.close();
        i10.b();
        return arrayList;
    }

    public j d(String string) {
        a.f.i i10 = a.f.i.a("SELECT * FROM workspec WHERE id=?", 1);
        if (string == null) {
            i10.bindNull(1);
        } else {
            i10.bindString(1, string);
        }
        this.a.b();
        Cursor cursor = a.f.l.a.a(this.a, i10, false);
        try {
            int n10 = a.c.a.a.a(cursor, "id");
            int n11 = a.c.a.a.a(cursor, "state");
            int n12 = a.c.a.a.a(cursor, "worker_class_name");
            int n13 = a.c.a.a.a(cursor, "input_merger_class_name");
            int n14 = a.c.a.a.a(cursor, "input");
            int n15 = a.c.a.a.a(cursor, "output");
            int n16 = a.c.a.a.a(cursor, "initial_delay");
            int n17 = a.c.a.a.a(cursor, "interval_duration");
            int n18 = a.c.a.a.a(cursor, "flex_duration");
            int n19 = a.c.a.a.a(cursor, "run_attempt_count");
            int n20 = a.c.a.a.a(cursor, "backoff_policy");
            int n21 = a.c.a.a.a(cursor, "backoff_delay_duration");
            int n22 = a.c.a.a.a(cursor, "period_start_time");
            int n23 = a.c.a.a.a(cursor, "minimum_retention_duration");
            return n23;
        }
        finally {
            a.f.i i11 = i10;
        }
    }

    public int e(String string) {
        int n10;
        this.a.b();
        a.g.a.f.e e6 = this.f.a();
        if (string == null) {
            e6.a.bindNull(1);
        } else {
            e6.a.bindString(1, string);
        }
        this.a.c();
        try {
            n10 = e6.a();
            this.a.g();
        }
        catch (Throwable throwable) {
            this.a.d();
            this.f.a(e6);
            throw throwable;
        }
        this.a.d();
        a.f.j j2 = this.f;
        if (e6 == j2.c) {
            j2.a.set(false);
        }
        return n10;
    }

    public int f(String string) {
        int n10;
        this.a.b();
        a.g.a.f.e e6 = this.g.a();
        if (string == null) {
            e6.a.bindNull(1);
        } else {
            e6.a.bindString(1, string);
        }
        this.a.c();
        try {
            n10 = e6.a();
            this.a.g();
        }
        catch (Throwable throwable) {
            this.a.d();
            this.g.a(e6);
            throw throwable;
        }
        this.a.d();
        a.f.j j2 = this.g;
        if (e6 == j2.c) {
            j2.a.set(false);
        }
        return n10;
    }

}

