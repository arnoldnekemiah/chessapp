/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.DataInputStream
 *  java.io.DataOutputStream
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Collections
 *  java.util.GregorianCalendar
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 */
package c.c.b.i;

import c.c.b.e;
import c.c.b.i.d;
import c.c.b.i.f;
import c.c.b.i.g;
import c.c.b.i.h;
import c.c.b.i.i;
import c.c.b.i.j;
import c.c.b.i.l;
import c.c.b.i.n;
import c.c.b.i.o;
import com.jetstartgames.chess.MainActivity;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class e {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public j g;
    public String h;
    public String i;
    public String j;
    public List<d> k;
    public c l;
    public c m;
    public j n;
    public final i o;

    public e(i i10) {
        this.o = i10;
        try {
            this.a(l.c("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1"));
        }
        catch (c.c.b.i.a a10) {}
    }

    public final int a(boolean bl, int n10) {
        c c10 = this.m;
        boolean bl2 = this.n.b;
        int n11 = Integer.MIN_VALUE;
        do {
            if (bl2 != bl && (n11 = c10.f) != Integer.MIN_VALUE || (c10 = c10.j) == null) {
                if (n11 == Integer.MIN_VALUE) {
                    return n10;
                }
                return n11;
            }
            bl2 ^= true;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final d.b a() {
        block17 : {
            block16 : {
                block15 : {
                    block14 : {
                        block13 : {
                            block12 : {
                                block11 : {
                                    block10 : {
                                        var1_1 = this.n;
                                        var2_2 = this.m.e;
                                        if (var2_2.equals((Object)"resign")) {
                                            if (var1_1.b == false) return d.b.j;
                                            return d.b.k;
                                        }
                                        if (new g().a(var1_1).size() == 0) {
                                            var16_3 = g.b(var1_1);
                                            var17_4 = var1_1.b;
                                            if (var16_3) {
                                                if (var17_4 == false) return d.b.b;
                                                return d.b.c;
                                            }
                                            if (var17_4 == false) return d.b.e;
                                            return d.b.d;
                                        }
                                        if (var1_1.a(2) <= 0) break block10;
                                        var3_5 = false;
                                        ** GOTO lbl62
                                    }
                                    if (var1_1.a(3) <= 0) break block11;
                                    var3_5 = false;
                                    ** GOTO lbl62
                                }
                                if (var1_1.a(6) <= 0) break block12;
                                var3_5 = false;
                                ** GOTO lbl62
                            }
                            if (var1_1.a(8) <= 0) break block13;
                            var3_5 = false;
                            ** GOTO lbl62
                        }
                        if (var1_1.a(9) <= 0) break block14;
                        var3_5 = false;
                        ** GOTO lbl62
                    }
                    if (var1_1.a(12) <= 0) break block15;
                    var3_5 = false;
                    ** GOTO lbl62
                }
                var4_6 = var1_1.a(4);
                var5_7 = var1_1.a(5);
                var6_8 = var1_1.a(10);
                var7_9 = var1_1.a(11);
                if (var7_9 + (var6_8 + (var4_6 + var5_7)) <= 1) break block16;
                var8_10 = var5_7 + var7_9;
                var3_5 = false;
                if (var8_10 != 0) ** GOTO lbl62
                var9_11 = 0;
                var10_12 = false;
                var11_13 = false;
                break block17;
            }
lbl51: // 3 sources:
            do {
                var3_5 = true;
                ** GOTO lbl62
                break;
            } while (true);
        }
        do {
            block19 : {
                block18 : {
                    if (var9_11 >= 8) break block18;
                    break block19;
                }
                if (!var10_12) ** GOTO lbl51
                var3_5 = false;
                if (!var11_13) ** continue;
lbl62: // 9 sources:
                if (var3_5) {
                    return d.b.h;
                }
                if (var2_2.startsWith("draw accept")) {
                    return d.b.i;
                }
                if (var2_2.startsWith("draw rep")) {
                    return d.b.f;
                }
                if (var2_2.startsWith("draw 50") == false) return d.b.a;
                return d.b.g;
            }
            for (var12_14 = 0; var12_14 < 8; ++var12_14) {
                var13_15 = var9_11 + var12_14 * 8;
                var14_16 = var1_1.a[var13_15];
                if (var14_16 != 10 && var14_16 != 4) continue;
                var15_17 = (var9_11 & 1) == (var12_14 & 1);
                if (var15_17) {
                    var10_12 = true;
                    continue;
                }
                var11_13 = true;
            }
            ++var9_11;
        } while (true);
    }

    public final String a(ArrayList<n.a> arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        int n10 = arrayList.size();
        for (int i10 = 0; i10 < n10; ++i10) {
            if (i10 > 0) {
                stringBuilder.append(':');
            }
            n.a a10 = (n.a)arrayList.get(i10);
            int n11 = a10.b;
            if (n11 > 0) {
                stringBuilder.append(n11);
                stringBuilder.append('/');
            }
            stringBuilder.append(a10.a / 1000);
            int n12 = a10.a % 1000;
            if (n12 > 0) {
                stringBuilder.append('.');
                Locale locale = Locale.US;
                Object[] arrobject = new Object[]{n12};
                stringBuilder.append(String.format((Locale)locale, (String)"%03d", (Object[])arrobject));
            }
            if (a10.c <= 0) continue;
            stringBuilder.append('+');
            stringBuilder.append(a10.c / 1000);
            int n13 = a10.c % 1000;
            if (n13 <= 0) continue;
            stringBuilder.append('.');
            Locale locale = Locale.US;
            Object[] arrobject = new Object[]{n13};
            stringBuilder.append(String.format((Locale)locale, (String)"%03d", (Object[])arrobject));
        }
        return stringBuilder.toString();
    }

    public final void a(int n10) {
        if (this.m.a(this.n, null)) {
            this.e();
        }
        int n11 = this.m.l.size();
        if (n10 >= 0) {
            if (n10 >= n11) {
                return;
            }
            this.m.l.remove(n10);
            c c10 = this.m;
            int n12 = c10.k;
            if (n10 == n12) {
                c10.k = 0;
            } else if (n10 < n12) {
                c10.k = n12 - 1;
            }
            this.e();
        }
    }

    public final void a(int n10, boolean bl) {
        int n11;
        if (this.m.a(this.n, null)) {
            this.e();
        }
        if (n10 < 0) {
            n10 = this.m.k;
        }
        if (n10 >= (n11 = this.m.l.size())) {
            n10 = 0;
        }
        if (bl) {
            this.m.k = n10;
        }
        if (n11 > 0) {
            c c10;
            this.m = c10 = (c)this.m.l.get(n10);
            this.n.a(c10.c, c10.d);
            l.a(this.n);
        }
    }

    public final void a(i i10, String string, String string2) {
        MainActivity.n0 n02 = (MainActivity.n0)i10;
        n02.a(null, 4, null);
        n02.a(null, 9, string);
        n02.a(null, 0, string2);
        n02.a(null, 5, null);
    }

    public final void a(j j10) {
        c c10;
        this.a = "?";
        this.b = "?";
        Calendar calendar = GregorianCalendar.getInstance();
        int n10 = calendar.get(1);
        int n11 = 1 + calendar.get(2);
        int n12 = calendar.get(5);
        Locale locale = Locale.US;
        Object[] arrobject = new Object[]{n10, n11, n12};
        this.c = String.format((Locale)locale, (String)"%04d.%02d.%02d", (Object[])arrobject);
        this.d = "?";
        this.e = "?";
        this.f = "?";
        this.g = j10;
        this.h = "?";
        this.i = "?";
        this.j = "?";
        this.k = new ArrayList();
        this.l = c10 = new c();
        this.m = c10;
        this.n = new j(this.g);
        this.e();
    }

    public final void a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeUTF(this.a);
        dataOutputStream.writeUTF(this.b);
        dataOutputStream.writeUTF(this.c);
        dataOutputStream.writeUTF(this.d);
        dataOutputStream.writeUTF(this.e);
        dataOutputStream.writeUTF(this.f);
        dataOutputStream.writeUTF(l.b(this.g));
        dataOutputStream.writeUTF(this.h);
        dataOutputStream.writeUTF(this.i);
        dataOutputStream.writeUTF(this.j);
        int n10 = this.k.size();
        dataOutputStream.writeInt(n10);
        int n11 = 0;
        for (int i10 = 0; i10 < n10; ++i10) {
            dataOutputStream.writeUTF(((d)this.k.get((int)i10)).a);
            dataOutputStream.writeUTF(((d)this.k.get((int)i10)).b);
        }
        c.a(dataOutputStream, this.l);
        ArrayList<Integer> arrayList = this.m.a();
        int n12 = arrayList.size();
        dataOutputStream.writeInt(n12);
        while (n11 < n12) {
            dataOutputStream.writeInt(((Integer)arrayList.get(n11)).intValue());
            ++n11;
        }
    }

    public final h<List<c>, Integer> b() {
        ArrayList arrayList = new ArrayList();
        c c10 = this.m;
        while (c10 != this.l) {
            arrayList.add((Object)c10);
            c10 = c10.j;
        }
        Collections.reverse((List)arrayList);
        int n10 = arrayList.size();
        c c11 = this.m;
        j j10 = new j(this.n);
        o o10 = new o();
        boolean bl = false;
        do {
            if (c11.a(j10, null)) {
                bl = true;
            }
            if (c11.k >= c11.l.size()) {
                if (bl) {
                    this.e();
                }
                return new h<ArrayList, Integer>(arrayList, n10);
            }
            c11 = (c)c11.l.get(c11.k);
            arrayList.add((Object)c11);
            j10.a(c11.c, o10);
        } while (true);
    }

    public final void c() {
        c c10 = this.m;
        if (c10.j != null) {
            this.n.b(c10.c, c10.d);
            this.m = this.m.j;
        }
    }

    public final void d() {
        c c10;
        ArrayList arrayList = new ArrayList();
        while ((c10 = this.m) != this.l) {
            this.c();
            arrayList.add((Object)this.m.l.indexOf((Object)c10));
        }
        ArrayList arrayList2 = new ArrayList();
        Integer n10 = 0;
        block1 : do {
            arrayList2.add((Object)n10);
            while (!arrayList2.isEmpty()) {
                int n11 = arrayList2.size() - 1;
                int n12 = (Integer)arrayList2.get(n11);
                if (n12 == 0) {
                    ArrayList<f> arrayList3 = g.e.a(this.n);
                    this.m.a(this.n, arrayList3);
                    int n13 = this.m.l.size();
                    for (int i10 = 0; i10 < n13; ++i10) {
                        c c11 = (c)this.m.l.get(i10);
                        c11.b = l.a(this.n, c11.c, false, true, arrayList3);
                    }
                }
                if (n12 < this.m.l.size()) {
                    this.a(n12, false);
                    continue block1;
                }
                arrayList2.remove(n11);
                int n14 = n11 - 1;
                if (n14 < 0) continue;
                arrayList2.set(n14, (Object)(1 + (Integer)arrayList2.get(n14)));
                this.c();
            }
            break;
        } while (true);
        for (int i11 = arrayList.size() - 1; i11 >= 0; --i11) {
            this.a((Integer)arrayList.get(i11), false);
        }
    }

    public final void e() {
        i i10 = this.o;
        if (i10 != null) {
            ((MainActivity.n0)i10).a();
        }
    }

    public final ArrayList<f> f() {
        if (this.m.a(this.n, null)) {
            this.e();
        }
        ArrayList arrayList = new ArrayList();
        Iterator iterator = this.m.l.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)((c)iterator.next()).c);
        }
        return arrayList;
    }

    public static final class b {
        public final int a;
        public final boolean b;

        public b(int n10, boolean bl) {
            this.a = n10;
            this.b = bl;
        }

        public final b a() {
            if (this.b) {
                return new b(this.a, false);
            }
            return new b(1 + this.a, true);
        }
    }

    public static class c {
        public String a;
        public String b;
        public f c;
        public o d;
        public String e;
        public int f;
        public int g;
        public String h;
        public String i;
        public c j;
        public int k;
        public List<c> l;

        public c() {
            this.a = "";
            this.b = "";
            this.c = null;
            this.d = null;
            this.e = "";
            this.f = Integer.MIN_VALUE;
            this.j = null;
            this.l = new ArrayList();
            this.k = 0;
            this.g = 0;
            this.h = "";
            this.i = "";
        }

        public c(c c10, String string, String string2, int n10, int n11, String string3, String string4) {
            this.a = string;
            this.b = string;
            this.c = null;
            this.d = null;
            this.e = string2;
            this.f = n10;
            this.j = c10;
            this.l = new ArrayList();
            this.k = 0;
            this.g = n11;
            this.h = string3;
            this.i = string4;
        }

        public static final void a(i i10, c c10, b b10, c.c.b.e e10) {
            boolean bl = c10.a(i10, b10, true, e10);
            int n10;
            while ((n10 = c10.l.size()) != 0) {
                b b11 = b10.a();
                bl = ((c)c10.l.get(0)).a(i10, b11, bl, e10);
                if (e10.c.a) {
                    for (int i11 = 1; i11 < n10; ++i11) {
                        MainActivity.n0 n02 = (MainActivity.n0)i10;
                        n02.a(c10, 6, null);
                        c.a(n02, (c)c10.l.get(i11), b11, e10);
                        n02.a(c10, 7, null);
                        bl = true;
                    }
                }
                c10 = (c)c10.l.get(0);
                b10 = b10.a();
            }
            return;
        }

        public static final void a(DataInputStream dataInputStream, c c10) {
            do {
                String string;
                c10.a = string = dataInputStream.readUTF();
                c10.b = string;
                byte by = dataInputStream.readByte();
                if (by >= 0) {
                    c10.c = new f(by, dataInputStream.readByte(), dataInputStream.readByte());
                    c10.d = new o();
                }
                c10.e = dataInputStream.readUTF();
                c10.f = dataInputStream.readInt();
                c10.g = dataInputStream.readInt();
                c10.h = dataInputStream.readUTF();
                c10.i = dataInputStream.readUTF();
                c10.k = dataInputStream.readInt();
                int n10 = dataInputStream.readInt();
                if (n10 == 0) {
                    return;
                }
                for (int i10 = 1; i10 < n10; ++i10) {
                    c c11 = new c();
                    c11.j = c10;
                    c.a(dataInputStream, c11);
                    c10.l.add((Object)c11);
                }
                c c12 = new c();
                c12.j = c10;
                c10.l.add(0, (Object)c12);
                c10 = c12;
            } while (true);
        }

        public static final void a(DataOutputStream dataOutputStream, c c10) {
            do {
                int n10;
                dataOutputStream.writeUTF(c10.a);
                f f10 = c10.c;
                if (f10 != null) {
                    dataOutputStream.writeByte(f10.a);
                    dataOutputStream.writeByte(c10.c.b);
                    n10 = c10.c.c;
                } else {
                    n10 = -1;
                }
                dataOutputStream.writeByte(n10);
                dataOutputStream.writeUTF(c10.e);
                dataOutputStream.writeInt(c10.f);
                dataOutputStream.writeInt(c10.g);
                dataOutputStream.writeUTF(c10.h);
                dataOutputStream.writeUTF(c10.i);
                dataOutputStream.writeInt(c10.k);
                int n11 = c10.l.size();
                dataOutputStream.writeInt(n11);
                if (n11 == 0) {
                    return;
                }
                for (int i10 = 1; i10 < n11; ++i10) {
                    c.a(dataOutputStream, (c)c10.l.get(i10));
                }
                c10 = (c)c10.l.get(0);
            } while (true);
        }

        public final ArrayList<Integer> a() {
            c c10;
            ArrayList arrayList = new ArrayList(64);
            c c11 = this;
            while ((c10 = c11.j) != null) {
                int n10;
                block4 : {
                    for (n10 = 0; n10 < c10.l.size(); ++n10) {
                        if (c10.l.get(n10) != c11) {
                            continue;
                        }
                        break block4;
                    }
                    n10 = -1;
                }
                if (n10 != -1) {
                    arrayList.add((Object)n10);
                    c11 = c11.j;
                    continue;
                }
                throw new RuntimeException();
            }
            Collections.reverse((List)arrayList);
            return arrayList;
        }

        public final void a(i i10, String string, String string2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[%");
            stringBuilder.append(string);
            stringBuilder.append(" ");
            stringBuilder.append(string2);
            stringBuilder.append("]");
            String string3 = stringBuilder.toString();
            ((MainActivity.n0)i10).a(this, 10, string3);
        }

        public final boolean a(i i10, b b10, boolean bl, c.c.b.e e10) {
            int n10;
            boolean bl2;
            int n11;
            if (this.h.length() > 0 && e10.c.b) {
                String string = this.h;
                ((MainActivity.n0)i10).a(this, 10, string);
                bl = true;
            }
            if (this.a.length() > 0 && !(bl2 = this.a.equals((Object)"--") && this.e.length() > 0 && !e10.c.d)) {
                String string;
                if (b10.b) {
                    String string2 = Integer.valueOf((int)b10.a).toString();
                    MainActivity.n0 n02 = (MainActivity.n0)i10;
                    n02.a(this, 1, string2);
                    n02.a(this, 2, null);
                } else if (bl) {
                    String string3 = Integer.valueOf((int)b10.a).toString();
                    MainActivity.n0 n03 = (MainActivity.n0)i10;
                    n03.a(this, 1, string3);
                    for (int i11 = 0; i11 < 3; ++i11) {
                        n03.a(this, 2, null);
                    }
                }
                e.a a10 = e10.c;
                if (a10.h == 0) {
                    f f10;
                    string = this.a;
                    if (a10.f && (f10 = this.c) != null && f10.c != 0) {
                        char c10;
                        int n12;
                        for (n12 = string.length() - 1; n12 > 0 && ((c10 = string.charAt(n12)) == '#' || c10 == '+'); --n12) {
                        }
                        if (n12 > 0 && l.a(true, string.charAt(n12)) != -1) {
                            --n12;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        int n13 = n12 + 1;
                        stringBuilder.append(string.substring(0, n13));
                        stringBuilder.append('=');
                        stringBuilder.append(string.substring(n13, string.length()));
                        string = stringBuilder.toString();
                    }
                } else {
                    string = this.b;
                }
                ((MainActivity.n0)i10).a(this, 9, string);
                bl = false;
            }
            if ((n11 = this.g) > 0 && e10.c.c) {
                String string = Integer.valueOf((int)n11).toString();
                ((MainActivity.n0)i10).a(this, 8, string);
                if (e10.c.g) {
                    bl = true;
                }
            }
            if (this.i.length() > 0 && e10.c.b) {
                String string = this.i;
                ((MainActivity.n0)i10).a(this, 10, string);
                bl = true;
            }
            if (this.e.length() > 0 && e10.c.d) {
                this.a(i10, "playeraction", this.e);
                bl = true;
            }
            if ((n10 = this.f) != Integer.MIN_VALUE && e10.c.e) {
                double d10 = n10 + 999;
                Double.isNaN((double)d10);
                Double.isNaN((double)d10);
                int n14 = (int)Math.floor((double)(d10 / 1000.0));
                boolean bl3 = false;
                if (n14 < 0) {
                    n14 = -n14;
                    bl3 = true;
                }
                int n15 = n14 / 60;
                int n16 = n14 - n15 * 60;
                int n17 = n15 / 60;
                int n18 = n15 - n17 * 60;
                StringBuilder stringBuilder = new StringBuilder();
                if (bl3) {
                    stringBuilder.append('-');
                }
                if (n17 < 10) {
                    stringBuilder.append('0');
                }
                stringBuilder.append(n17);
                stringBuilder.append(':');
                if (n18 < 10) {
                    stringBuilder.append('0');
                }
                stringBuilder.append(n18);
                stringBuilder.append(':');
                if (n16 < 10) {
                    stringBuilder.append('0');
                }
                stringBuilder.append(n16);
                this.a(i10, "clk", stringBuilder.toString());
                return true;
            }
            return bl;
        }

        public final boolean a(j j10, ArrayList<f> arrayList) {
            Iterator iterator = this.l.iterator();
            boolean bl = false;
            while (iterator.hasNext()) {
                f f10;
                c c10 = (c)iterator.next();
                if (c10.c != null) continue;
                if (arrayList == null) {
                    arrayList = g.e.a(j10);
                }
                if ((f10 = l.a(j10, c10.a, arrayList)) != null) {
                    c10.a = l.a(j10, f10, false, false, arrayList);
                    c10.b = l.a(j10, f10, false, true, arrayList);
                    c10.c = f10;
                    c10.d = new o();
                    continue;
                }
                bl = true;
            }
            if (bl) {
                ArrayList arrayList2 = new ArrayList();
                for (c c11 : this.l) {
                    if (c11.c == null) continue;
                    arrayList2.add((Object)c11);
                }
                this.l = arrayList2;
            }
            return bl;
        }
    }

    public static final class d {
        public String a;
        public String b;

        public d() {
        }

        public /* synthetic */ d(a a10) {
        }
    }

}

