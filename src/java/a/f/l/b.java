/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.g.a.f.a
 *  android.database.Cursor
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Set
 *  java.util.TreeMap
 */
package a.f.l;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class b {
    public final String a;
    public final Map<String, a> b;
    public final Set<b> c;
    public final Set<d> d;

    public b(String string, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.a = string;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        Set set3 = set2 == null ? null : Collections.unmodifiableSet(set2);
        this.d = set3;
    }

    public static d a(a.g.a.b b2, String string, boolean bl) {
        Cursor cursor;
        block4 : {
            d d2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PRAGMA index_xinfo(`");
            stringBuilder.append(string);
            stringBuilder.append("`)");
            String string2 = stringBuilder.toString();
            cursor = ((a.g.a.f.a)b2).a(string2);
            int n2 = cursor.getColumnIndex("seqno");
            int n3 = cursor.getColumnIndex("cid");
            int n5 = cursor.getColumnIndex("name");
            if (n2 == -1 || n3 == -1 || n5 == -1) break block4;
            try {
                TreeMap treeMap = new TreeMap();
                while (cursor.moveToNext()) {
                    if (cursor.getInt(n3) < 0) continue;
                    int n7 = cursor.getInt(n2);
                    String string3 = cursor.getString(n5);
                    treeMap.put((Object)n7, (Object)string3);
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d2 = new d(string, bl, (List<String>)arrayList);
            }
            catch (Throwable throwable) {
                cursor.close();
                throw throwable;
            }
            cursor.close();
            return d2;
        }
        cursor.close();
        return null;
    }

    /*
     * Exception decompiling
     */
    public static b a(a.g.a.b var0, String var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 10[UNCONDITIONALDOLOOP]
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

    public static List<c> a(Cursor cursor) {
        int n2 = cursor.getColumnIndex("id");
        int n3 = cursor.getColumnIndex("seq");
        int n5 = cursor.getColumnIndex("from");
        int n7 = cursor.getColumnIndex("to");
        int n8 = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < n8; ++i2) {
            cursor.moveToPosition(i2);
            arrayList.add((Object)new c(cursor.getInt(n2), cursor.getInt(n3), cursor.getString(n5), cursor.getString(n7)));
        }
        Collections.sort((List)arrayList);
        return arrayList;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (b.class != object.getClass()) {
                return false;
            }
            b b2 = (b)object;
            String string = this.a;
            if (string != null ? !string.equals((Object)b2.a) : b2.a != null) {
                return false;
            }
            Map<String, a> map = this.b;
            if (map != null ? !map.equals(b2.b) : b2.b != null) {
                return false;
            }
            Set<b> set = this.c;
            if (set != null ? !set.equals(b2.c) : b2.c != null) {
                return false;
            }
            Set<d> set2 = this.d;
            if (set2 != null) {
                Set<d> set3 = b2.d;
                if (set3 == null) {
                    return true;
                }
                return set2.equals(set3);
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        String string = this.a;
        int n2 = string != null ? string.hashCode() : 0;
        int n3 = n2 * 31;
        Map<String, a> map = this.b;
        int n5 = map != null ? map.hashCode() : 0;
        int n7 = 31 * (n3 + n5);
        Set<b> set = this.c;
        int n8 = 0;
        if (set != null) {
            n8 = set.hashCode();
        }
        return n7 + n8;
    }

    public String toString() {
        StringBuilder stringBuilder = c.a.b.a.a.a("TableInfo{name='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append(", columns=");
        stringBuilder.append(this.b);
        stringBuilder.append(", foreignKeys=");
        stringBuilder.append(this.c);
        stringBuilder.append(", indices=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static class a {
        public final String a;
        public final String b;
        public final int c;
        public final boolean d;
        public final int e;

        public a(String string, String string2, boolean bl, int n2) {
            this.a = string;
            this.b = string2;
            this.d = bl;
            this.e = n2;
            int n3 = 5;
            if (string2 != null) {
                String string3 = string2.toUpperCase(Locale.US);
                if (string3.contains((CharSequence)"INT")) {
                    n3 = 3;
                } else if (!(string3.contains((CharSequence)"CHAR") || string3.contains((CharSequence)"CLOB") || string3.contains((CharSequence)"TEXT"))) {
                    if (!string3.contains((CharSequence)"BLOB")) {
                        n3 = !(string3.contains((CharSequence)"REAL") || string3.contains((CharSequence)"FLOA") || string3.contains((CharSequence)"DOUB")) ? 1 : 4;
                    }
                } else {
                    n3 = 2;
                }
            }
            this.c = n3;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                boolean bl;
                boolean bl2;
                if (a.class != object.getClass()) {
                    return false;
                }
                a a2 = (a)object;
                if (Build.VERSION.SDK_INT >= 20 ? this.e != a2.e : (bl = this.e > 0) != (bl2 = a2.e > 0)) {
                    return false;
                }
                if (!this.a.equals((Object)a2.a)) {
                    return false;
                }
                if (this.d != a2.d) {
                    return false;
                }
                return this.c == a2.c;
            }
            return false;
        }

        public int hashCode() {
            int n2 = 31 * (31 * this.a.hashCode() + this.c);
            int n3 = this.d ? 1231 : 1237;
            return 31 * (n2 + n3) + this.e;
        }

        public String toString() {
            StringBuilder stringBuilder = c.a.b.a.a.a("Column{name='");
            stringBuilder.append(this.a);
            stringBuilder.append('\'');
            stringBuilder.append(", type='");
            stringBuilder.append(this.b);
            stringBuilder.append('\'');
            stringBuilder.append(", affinity='");
            stringBuilder.append(this.c);
            stringBuilder.append('\'');
            stringBuilder.append(", notNull=");
            stringBuilder.append(this.d);
            stringBuilder.append(", primaryKeyPosition=");
            stringBuilder.append(this.e);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public static class b {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public b(String string, String string2, String string3, List<String> list, List<String> list2) {
            this.a = string;
            this.b = string2;
            this.c = string3;
            this.d = Collections.unmodifiableList(list);
            this.e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (b.class != object.getClass()) {
                    return false;
                }
                b b2 = (b)object;
                if (!this.a.equals((Object)b2.a)) {
                    return false;
                }
                if (!this.b.equals((Object)b2.b)) {
                    return false;
                }
                if (!this.c.equals((Object)b2.c)) {
                    return false;
                }
                if (!this.d.equals(b2.d)) {
                    return false;
                }
                return this.e.equals(b2.e);
            }
            return false;
        }

        public int hashCode() {
            return 31 * (31 * (31 * (31 * this.a.hashCode() + this.b.hashCode()) + this.c.hashCode()) + this.d.hashCode()) + this.e.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = c.a.b.a.a.a("ForeignKey{referenceTable='");
            stringBuilder.append(this.a);
            stringBuilder.append('\'');
            stringBuilder.append(", onDelete='");
            stringBuilder.append(this.b);
            stringBuilder.append('\'');
            stringBuilder.append(", onUpdate='");
            stringBuilder.append(this.c);
            stringBuilder.append('\'');
            stringBuilder.append(", columnNames=");
            stringBuilder.append(this.d);
            stringBuilder.append(", referenceColumnNames=");
            stringBuilder.append(this.e);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public static class c
    implements Comparable<c> {
        public final int a;
        public final int b;
        public final String c;
        public final String d;

        public c(int n2, int n3, String string, String string2) {
            this.a = n2;
            this.b = n3;
            this.c = string;
            this.d = string2;
        }

        public int compareTo(Object object) {
            c c2 = (c)object;
            int n2 = this.a - c2.a;
            if (n2 == 0) {
                n2 = this.b - c2.b;
            }
            return n2;
        }
    }

    public static class d {
        public final String a;
        public final boolean b;
        public final List<String> c;

        public d(String string, boolean bl, List<String> list) {
            this.a = string;
            this.b = bl;
            this.c = list;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (d.class != object.getClass()) {
                    return false;
                }
                d d2 = (d)object;
                if (this.b != d2.b) {
                    return false;
                }
                if (!this.c.equals(d2.c)) {
                    return false;
                }
                if (this.a.startsWith("index_")) {
                    return d2.a.startsWith("index_");
                }
                return this.a.equals((Object)d2.a);
            }
            return false;
        }

        public int hashCode() {
            int n2 = this.a.startsWith("index_") ? -1184239155 : this.a.hashCode();
            return 31 * (n2 * 31 + this.b) + this.c.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = c.a.b.a.a.a("Index{name='");
            stringBuilder.append(this.a);
            stringBuilder.append('\'');
            stringBuilder.append(", unique=");
            stringBuilder.append(this.b);
            stringBuilder.append(", columns=");
            stringBuilder.append(this.c);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

}

