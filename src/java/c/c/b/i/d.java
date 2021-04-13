/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.DataInputStream
 *  java.io.DataOutputStream
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.List
 */
package c.c.b.i;

import c.c.b.i.e;
import c.c.b.i.f;
import c.c.b.i.g;
import c.c.b.i.h;
import c.c.b.i.i;
import c.c.b.i.j;
import c.c.b.i.l;
import c.c.b.i.m;
import c.c.b.i.n;
import c.c.b.i.o;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.List;

public class d {
    public boolean a;
    public e b;
    public m c;
    public boolean d;
    public a e;
    public i f;

    public d(i i10, n n10) {
        m m10;
        this.f = i10;
        this.c = m10 = new m();
        m10.a = n10;
        this.d = false;
        this.b = new e(this.f);
        m m11 = this.c;
        m11.d = 1;
        m11.e = true;
        m11.f = 0;
        m11.g = 0L;
        this.a = false;
        this.a(true);
        e e10 = this.b;
        if (e10 != null) {
            if (n.a(n10.a, n10.b)) {
                e10.h = e10.a(n10.a);
                e10.i = "?";
                e10.j = "?";
                return;
            }
            e10.i = e10.a(n10.a);
            e10.j = e10.a(n10.b);
            e10.h = "?";
            return;
        }
        throw null;
    }

    public final b a() {
        return this.b.a();
    }

    public final void a(f f10, String string) {
        boolean bl;
        int n10;
        block23 : {
            if (f10.equals(new f(0, 0, 0))) {
                ArrayList<f> arrayList = this.b.f();
                for (int i10 = arrayList.size() - 1; i10 >= 0; --i10) {
                    if (!((f)arrayList.get(i10)).equals(f10)) continue;
                    this.b.a(i10);
                }
            }
            ArrayList<f> arrayList = this.b.f();
            int n11 = arrayList.size();
            if (this.e == a.c) {
                boolean bl2 = false;
                for (int i11 = n11 - 1; i11 >= 0; --i11) {
                    if (f10.equals(arrayList.get(i11))) continue;
                    this.b.a(i11);
                    bl2 = true;
                }
                if (bl2) {
                    arrayList = this.b.f();
                    n11 = arrayList.size();
                }
            }
            for (n10 = 0; n10 < n11; ++n10) {
                boolean bl3;
                if (!((f)arrayList.get(n10)).equals(f10)) continue;
                if (string.isEmpty()) {
                    this.b.a(n10, false);
                    bl3 = this.b.a() == b.a;
                    this.b.c();
                } else {
                    bl3 = true;
                }
                if (!bl3) continue;
                bl = true;
                break block23;
            }
            bl = false;
        }
        if (!bl) {
            String string2 = l.a(f10);
            e e10 = this.b;
            if (e.c.a(e10.m, e10.n)) {
                e10.e();
            }
            int n12 = e10.m.l.size();
            e.c c10 = new e.c(e10.m, string2, string, Integer.MIN_VALUE, 0, "", "");
            f f11 = l.a(string2);
            ArrayList<f> arrayList = null;
            if (f11 == null) {
                arrayList = g.e.a(e10.n);
                f11 = l.a(e10.n, string2, arrayList);
            }
            if (f11 == null) {
                n10 = -1;
            } else {
                if (arrayList == null) {
                    arrayList = g.e.a(e10.n);
                }
                c10.a = l.a(e10.n, f11, false, false, arrayList);
                c10.b = l.a(e10.n, f11, false, true, arrayList);
                c10.c = f11;
                c10.d = new o();
                e10.m.l.add((Object)c10);
                e10.e();
                n10 = n12;
            }
        }
        int n13 = this.e == a.b ? n10 : 0;
        e e11 = this.b;
        if (e.c.a(e11.m, e11.n)) {
            e11.e();
        }
        int n14 = e11.m.l.size();
        if (n10 >= 0 && n10 < n14 && n13 >= 0 && n13 < n14) {
            e.c c11 = (e.c)e11.m.l.get(n10);
            e11.m.l.remove(n10);
            e11.m.l.add(n13, (Object)c11);
            int n15 = e11.m.k;
            if (n10 == n15) {
                n15 = n13;
            } else {
                if (n10 < n15) {
                    --n15;
                }
                if (n13 <= n15) {
                    ++n15;
                }
            }
            e11.m.k = n15;
            e11.e();
        }
        this.b.a(n13, true);
        m m10 = this.c;
        long l10 = System.currentTimeMillis();
        boolean bl4 = true ^ this.d;
        m10.a(l10);
        ArrayList<n.a> arrayList = m10.a.a(m10.e);
        h<Integer, Integer> h10 = m10.a(m10.e);
        int n16 = (Integer)h10.a;
        int n17 = (Integer)h10.b;
        int n18 = m10.a(m10.e, l10);
        if (bl4) {
            n18 += ((n.a)arrayList.get((int)n16)).c;
            if (n17 == 1) {
                int n19 = n16 + 1;
                if (n19 < arrayList.size()) {
                    n16 = n19;
                }
                n18 += ((n.a)arrayList.get((int)n16)).a;
            }
        }
        m10.f = 0;
        this.b.m.f = n18;
        this.a(true);
        this.a = false;
    }

    public final void a(DataInputStream dataInputStream, int n10) {
        e e10 = this.b;
        if (e10 != null) {
            e.c c10;
            String string;
            e10.a = dataInputStream.readUTF();
            e10.b = dataInputStream.readUTF();
            e10.c = dataInputStream.readUTF();
            e10.d = dataInputStream.readUTF();
            e10.e = dataInputStream.readUTF();
            e10.f = dataInputStream.readUTF();
            e10.g = l.c(dataInputStream.readUTF());
            e10.n = new j(e10.g);
            e10.h = dataInputStream.readUTF();
            if (n10 >= 2) {
                e10.i = dataInputStream.readUTF();
                string = dataInputStream.readUTF();
            } else {
                e10.i = string = "?";
            }
            e10.j = string;
            int n11 = dataInputStream.readInt();
            e10.k.clear();
            for (int i10 = 0; i10 < n11; ++i10) {
                e.d d10 = new e.d(null);
                d10.a = dataInputStream.readUTF();
                d10.b = dataInputStream.readUTF();
                e10.k.add((Object)d10);
            }
            e10.l = c10 = new e.c();
            e.c.a(dataInputStream, c10);
            e10.m = e10.l;
            int n12 = dataInputStream.readInt();
            for (int i11 = 0; i11 < n12; ++i11) {
                e10.a(dataInputStream.readInt(), true);
            }
            e10.e();
            if (n10 >= 3) {
                n n13 = this.c.a;
                if (n13 != null) {
                    for (int i12 = 0; i12 < 2; ++i12) {
                        ArrayList arrayList = new ArrayList();
                        if (i12 == 0) {
                            n13.a = arrayList;
                        } else {
                            n13.b = arrayList;
                        }
                        int n14 = dataInputStream.readInt();
                        for (int i13 = 0; i13 < n14; ++i13) {
                            arrayList.add((Object)new n.a(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt()));
                        }
                    }
                } else {
                    throw null;
                }
            }
            this.a(true);
            return;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(DataOutputStream dataOutputStream) {
        d d10 = this;
        synchronized (d10) {
            this.b.a(dataOutputStream);
            n n10 = this.c.a;
            if (n10 == null) {
                throw null;
            }
            int n11 = 0;
            while (n11 < 2) {
                ArrayList<n.a> arrayList = n11 == 0 ? n10.a : n10.b;
                int n12 = arrayList.size();
                dataOutputStream.writeInt(n12);
                for (int i10 = 0; i10 < n12; ++i10) {
                    n.a a10 = (n.a)arrayList.get(i10);
                    dataOutputStream.writeInt(a10.a);
                    dataOutputStream.writeInt(a10.b);
                    dataOutputStream.writeInt(a10.c);
                }
                ++n11;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(String var1_1, boolean var2_2) {
        block14 : {
            block15 : {
                block13 : {
                    var3_3 = this.b.n;
                    if (var1_1.startsWith("rep") || var1_1.startsWith("50")) break block13;
                    if (!var1_1.startsWith("offer ")) {
                        if (var1_1.equals((Object)"accept") == false) return;
                        if (this.d() == false) return;
                        this.a(new f(0, 0, 0), "draw accept");
                        return;
                    }
                    this.a = true;
                    var7_4 = var1_1.substring(1 + var1_1.indexOf(" "));
                    if (l.a(var3_3, var7_4) == null) return;
                    break block14;
                }
                var4_5 = var1_1.startsWith("rep");
                var5_6 = var1_1.indexOf(" ");
                var6_7 = null;
                if (var5_6 >= 0) {
                    var7_4 = var1_1.substring(var5_6 + 1);
                    var27_8 = var7_4.length();
                    var6_7 = null;
                    if (var27_8 > 0) {
                        var6_7 = l.a(var3_3, var7_4);
                    }
                } else {
                    var7_4 = null;
                }
                if (!var4_5) break block15;
                var8_9 = new o();
                var9_10 = new j(this.b.n);
                if (var6_7 != null) {
                    var9_10.a(var6_7, var8_9);
                    var10_11 = 1;
                } else {
                    var10_11 = 0;
                }
                var11_12 = this.b.b();
                var12_13 = (List)var11_12.a;
                var13_14 = new j(this.b.g);
                if (var13_14.a(var9_10)) {
                    ++var10_11;
                }
                var14_15 = (Integer)var11_12.b;
                for (var15_16 = 0; var15_16 < var14_15; ++var15_16) {
                    var13_14.a(((e.c)var12_13.get((int)var15_16)).c, var8_9);
                    l.a(var13_14);
                    if (!var13_14.a(var9_10)) continue;
                    ++var10_11;
                }
                if (var10_11 < 3) ** GOTO lbl-1000
                ** GOTO lbl-1000
            }
            var25_18 = new j(var3_3);
            if (var6_7 != null) {
                var25_18.a(var6_7, new o());
            }
            if (var25_18.e >= 100) lbl-1000: // 2 sources:
            {
                var16_17 = true;
            } else lbl-1000: // 2 sources:
            {
                var16_17 = false;
            }
            if (var16_17) {
                var18_19 = var4_5 != false ? "draw rep" : "draw 50";
                if (var6_7 != null) {
                    var19_20 = new StringBuilder();
                    var19_20.append(var18_19);
                    var19_20.append(" ");
                    var19_20.append(l.a(var3_3, var6_7, false, false));
                    var18_19 = var19_20.toString();
                }
                this.a(new f(0, 0, 0), var18_19);
                return;
            }
            this.a = true;
            if (var6_7 == null) return;
            if (var2_2 == false) return;
        }
        this.a(var7_4);
    }

    /*
     * Exception decompiling
     */
    public final void a(boolean var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl97.1 : ALOAD_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
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

    public final boolean a(String string) {
        if (this.a() != b.a) {
            return false;
        }
        if (string.startsWith("draw ")) {
            this.a(string.substring(1 + string.indexOf(" ")), true);
            return true;
        }
        if (string.equals((Object)"resign")) {
            this.a(new f(0, 0, 0), "resign");
            return true;
        }
        f f10 = l.a(string);
        if (f10 != null && !l.b(this.b.n, f10)) {
            f10 = null;
        }
        if (f10 == null) {
            f10 = l.a(this.b.n, string);
        }
        if (f10 == null) {
            return false;
        }
        String string2 = this.a ? "draw offer" : "";
        this.a(f10, string2);
        return true;
    }

    public final f b() {
        return this.b.m.c;
    }

    public final void b(String string) {
        if (string.startsWith("draw ")) {
            this.a(string.substring(1 + string.indexOf(" ")), false);
        }
    }

    public final h<j, ArrayList<f>> c() {
        h<List<e.c>, Integer> h10 = this.b.b();
        List list = (List)h10.a;
        j j10 = new j(this.b.g);
        ArrayList arrayList = new ArrayList();
        j j11 = new j(j10);
        o o10 = new o();
        int n10 = (Integer)h10.b;
        for (int i10 = 0; i10 < n10; ++i10) {
            e.c c10 = (e.c)list.get(i10);
            arrayList.add((Object)c10.c);
            j11.a(c10.c, o10);
            if (j11.e != 0) continue;
            j10 = new j(j11);
            arrayList.clear();
        }
        return new h<j, ArrayList<f>>(j10, arrayList);
    }

    public final boolean d() {
        return this.b.m.e.equals((Object)"draw offer");
    }

    public final void e() {
        boolean bl = this.b.f().size() > 0;
        if (bl) {
            this.b.a(-1, true);
            this.a = false;
            this.a(true);
        }
    }

    public final void f() {
        e e10 = this.b;
        if (e10.m.c != null) {
            e10.c();
            this.a = false;
            this.a(true);
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a;
        public static final /* enum */ a b;
        public static final /* enum */ a c;
        public static final /* synthetic */ a[] d;

        public static {
            a a10;
            a = new a();
            b = new a();
            c = a10 = new a();
            a[] arra = new a[]{a, b, a10};
            d = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])d.clone();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a;
        public static final /* enum */ b b;
        public static final /* enum */ b c;
        public static final /* enum */ b d;
        public static final /* enum */ b e;
        public static final /* enum */ b f;
        public static final /* enum */ b g;
        public static final /* enum */ b h;
        public static final /* enum */ b i;
        public static final /* enum */ b j;
        public static final /* enum */ b k;
        public static final /* synthetic */ b[] l;

        public static {
            b b10;
            a = new b();
            b = new b();
            c = new b();
            d = new b();
            e = new b();
            f = new b();
            g = new b();
            h = new b();
            i = new b();
            j = new b();
            k = b10 = new b();
            b[] arrb = new b[]{a, b, c, d, e, f, g, h, i, j, b10};
            l = arrb;
        }

        public static b valueOf(String string) {
            return (b)Enum.valueOf(b.class, (String)string);
        }

        public static b[] values() {
            return (b[])l.clone();
        }
    }

}

