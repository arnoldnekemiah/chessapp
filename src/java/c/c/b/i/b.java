/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.text.SpannableStringBuilder
 *  android.text.style.BackgroundColorSpan
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 */
package c.c.b.i;

import android.content.Context;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import c.c.b.c;
import c.c.b.e;
import c.c.b.f;
import c.c.b.h.b;
import c.c.b.i.b;
import c.c.b.i.d;
import c.c.b.i.e;
import c.c.b.i.f;
import c.c.b.i.g;
import c.c.b.i.h;
import c.c.b.i.i;
import c.c.b.i.j;
import c.c.b.i.k;
import c.c.b.i.l;
import c.c.b.i.m;
import c.c.b.i.n;
import c.c.b.i.o;
import com.jetstartgames.chess.MainActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class b {
    public c.c.b.h.b a = null;
    public i b = null;
    public c.c.b.g.a c = new c.c.b.g.a();
    public c.c.b.b d = new c.c.b.b();
    public d e = null;
    public f f = null;
    public c.c.b.c g;
    public c.c.b.d h;
    public c.c.b.e i;
    public String j = "";
    public int k = 1000;
    public c l;
    public boolean m = false;
    public final Handler n = new Handler();
    public int o = 1000;
    public f p;
    public int q;
    public int r;
    public volatile c.b s = null;

    public b(c.c.b.c c10, i i10, c.c.b.e e10) {
        this.g = c10;
        this.b = i10;
        this.h = new c.c.b.d(3);
        this.i = e10;
        this.l = new k(null){
            public int a = 0;
            public int b = 0;
            public f c = null;
            public String d = "";
            public long e = 0L;
            public int f = 0;
            public long g = 0L;
            public int h = 0;
            public boolean i = true;
            public String j = "";
            public ArrayList<f> k = null;
            public f l = null;
            public ArrayList<k.a> m = new ArrayList();
            public int n = -1;

            public final void a(int n10) {
                this.n = -1;
                this.l = null;
                this.m.clear();
                this.a = 0;
                this.j = "";
                this.k = null;
                this.b(n10);
            }

            public void a(int n10, j j10, f f10, int n11) {
                this.c = f10;
                this.d = l.a(j10, f10, false, b.this.c());
                this.b = n11;
                this.b(n10);
            }

            public void a(int n10, j j10, ArrayList<k.a> arrayList, f f10) {
                int n11;
                this.l = f10;
                this.n = n10;
                this.m = (ArrayList)arrayList.clone();
                Iterator iterator = arrayList.iterator();
                do {
                    f f11;
                    boolean bl = iterator.hasNext();
                    n11 = 1;
                    if (!bl) break;
                    k.a a10 = (k.a)iterator.next();
                    this.h = a10.c;
                    this.e = a10.d;
                    this.f = a10.e;
                    this.g = a10.f;
                    StringBuilder stringBuilder = new StringBuilder();
                    j j11 = new j(j10);
                    o o10 = new o();
                    if (f10 != null) {
                        String string = l.a(j11, f10, false, b.this.c());
                        Locale locale = Locale.US;
                        Object[] arrobject = new Object[n11];
                        arrobject[0] = string;
                        stringBuilder.append(String.format((Locale)locale, (String)" [%s]", (Object[])arrobject));
                        j11.a(f10, o10);
                    }
                    Iterator iterator2 = a10.j.iterator();
                    while (iterator2.hasNext() && (f11 = (f)iterator2.next()) != null && l.b(j11, f11)) {
                        String string = l.a(j11, f11, false, b.this.c());
                        Locale locale = Locale.US;
                        Object[] arrobject = new Object[n11];
                        arrobject[0] = string;
                        stringBuilder.append(String.format((Locale)locale, (String)" %s", (Object[])arrobject));
                        j11.a(f11, o10);
                    }
                    a10.k = stringBuilder.toString();
                } while (true);
                boolean bl = j10.b;
                if (f10 == null) {
                    n11 = 0;
                }
                this.i = bl ^ n11;
                this.b(n10);
            }

            public void a(int n10, String string, f f10, boolean bl) {
                c.c.b.c c10;
                Object object;
                if (bl) {
                    c10 = b.this.g;
                    object = new Runnable(this, n10, string, f10){
                        public final /* synthetic */ int a;
                        public final /* synthetic */ String b;
                        public final /* synthetic */ f c;
                        public final /* synthetic */ c d;
                        {
                            this.d = c10;
                            this.a = n10;
                            this.b = string;
                            this.c = f10;
                        }

                        public void run() {
                            this.d.b.this.g.c();
                            this.d.b.this.a(this.a, this.b);
                        }
                    };
                } else {
                    c10 = b.this.g;
                    object = new Runnable(this, n10, string, f10){
                        public final /* synthetic */ int a;
                        public final /* synthetic */ String b;
                        public final /* synthetic */ f c;
                        public final /* synthetic */ c d;
                        {
                            this.d = c10;
                            this.a = n10;
                            this.b = string;
                            this.c = f10;
                        }

                        public void run() {
                            this.d.b.this.g.c();
                            this.d.b.this.a(this.a, this.b, this.c);
                        }
                    };
                }
                c10.a((Runnable)object);
            }

            public final void b(int n10) {
                int n11 = 0;
                for (int i10 = 0; i10 < this.m.size(); ++i10) {
                    k.a a10 = (k.a)this.m.get(i10);
                    if (a10.a <= 0) continue;
                    Locale locale = Locale.US;
                    Object[] arrobject = new Object[]{a10.a};
                    String.format((Locale)locale, (String)"[%d] ", (Object[])arrobject);
                    boolean bl = !this.i && b.this.g.f();
                    if (a10.h || a10.i) {
                        bl ^ a10.h;
                    }
                    int n12 = bl ? -a10.b : a10.b;
                    if (a10.g) {
                        Locale locale2 = Locale.US;
                        Object[] arrobject2 = new Object[]{n12};
                        String.format((Locale)locale2, (String)"m%d", (Object[])arrobject2);
                        continue;
                    }
                    Locale locale3 = Locale.US;
                    Object[] arrobject3 = new Object[1];
                    double d10 = n12;
                    Double.isNaN((double)d10);
                    arrobject3[0] = d10 / 100.0;
                    String.format((Locale)locale3, (String)"%.2f", (Object[])arrobject3);
                }
                if (this.a > 0) {
                    String string;
                    int n13;
                    String string2;
                    long l10 = this.e;
                    String string3 = "M";
                    if (l10 > 100000000L) {
                        l10 /= 1000000L;
                        string = string3;
                    } else if (l10 > 100000L) {
                        l10 /= 1000L;
                        string = "k";
                    } else {
                        string = "";
                    }
                    int n14 = this.f;
                    if (n14 > 100000) {
                        n14 /= 1000;
                        string2 = "k";
                    } else {
                        string2 = "";
                    }
                    Locale locale = Locale.US;
                    Object[] arrobject = new Object[]{this.a};
                    String.format((Locale)locale, (String)"d:%d", (Object[])arrobject);
                    int n15 = this.b;
                    if (n15 > 0) {
                        Locale locale4 = Locale.US;
                        Object[] arrobject4 = new Object[]{n15, this.d};
                        String.format((Locale)locale4, (String)" %d:%s", (Object[])arrobject4);
                    }
                    if ((n13 = this.h) < 99995) {
                        Locale locale5 = Locale.US;
                        Object[] arrobject5 = new Object[1];
                        double d11 = n13;
                        Double.isNaN((double)d11);
                        arrobject5[0] = d11 / 1000.0;
                        String.format((Locale)locale5, (String)" t:%.2f", (Object[])arrobject5);
                    } else if (n13 < 999950) {
                        Locale locale6 = Locale.US;
                        Object[] arrobject6 = new Object[1];
                        double d12 = n13;
                        Double.isNaN((double)d12);
                        arrobject6[0] = d12 / 1000.0;
                        String.format((Locale)locale6, (String)" t:%.1f", (Object[])arrobject6);
                    } else {
                        Locale locale7 = Locale.US;
                        Object[] arrobject7 = new Object[]{(n13 + 500) / 1000};
                        String.format((Locale)locale7, (String)" t:%d", (Object[])arrobject7);
                    }
                    Locale locale8 = Locale.US;
                    Object[] arrobject8 = new Object[]{l10, string, n14, string2};
                    String.format((Locale)locale8, (String)" n:%d%s nps:%d%s", (Object[])arrobject8);
                    long l11 = this.g;
                    if (l11 > 0L) {
                        if (l11 > 100000000L) {
                            l11 /= 1000000L;
                        } else if (l11 > 100000L) {
                            l11 /= 1000L;
                            string3 = "k";
                        } else {
                            string3 = "";
                        }
                        Locale locale9 = Locale.US;
                        Object[] arrobject9 = new Object[]{l11, string3};
                        String.format((Locale)locale9, (String)" tb:%d%s", (Object[])arrobject9);
                    }
                }
                ArrayList arrayList = new ArrayList();
                while (n11 < this.m.size()) {
                    ArrayList<f> arrayList2;
                    if (this.l != null) {
                        arrayList2 = new ArrayList<f>();
                        arrayList2.add((Object)this.l);
                        Iterator iterator = ((k.a)this.m.get((int)n11)).j.iterator();
                        while (iterator.hasNext()) {
                            arrayList2.add((Object)((f)iterator.next()));
                        }
                    } else {
                        arrayList2 = ((k.a)this.m.get((int)n11)).j;
                    }
                    arrayList.add(arrayList2);
                    ++n11;
                }
                c.b b10 = new c.b();
                b10.a = n10;
                b.this.s = b10;
                b.this.g.a(new Runnable(this, b10){
                    public final /* synthetic */ c.b a;
                    public final /* synthetic */ c b;
                    {
                        this.b = c10;
                        this.a = b10;
                    }

                    public void run() {
                        this.b.b.this.a(this.a);
                    }
                });
            }
        };
        this.q = 0;
        this.r = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n10) {
        b b10 = this;
        synchronized (b10) {
            int n11;
            f f10 = this.p;
            if (f10 == null) {
                return;
            }
            boolean bl = this.e.b.n.b;
            int n12 = 3;
            if (n10 != 1) {
                n11 = 2;
                if (n10 != n11) {
                    if (n10 != n12) {
                        if (!bl) {
                            n11 = 8;
                        }
                    } else {
                        n11 = bl ? 5 : 11;
                    }
                } else {
                    n11 = bl ? 4 : 10;
                }
            } else {
                if (!bl) {
                    n12 = 9;
                }
                n11 = n12;
            }
            this.p.c = n11;
            f f11 = this.p;
            this.p = null;
            this.b(f11);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n10, String string) {
        b b10 = this;
        synchronized (b10) {
            f f10;
            int n11 = this.q;
            if (n11 != n10) {
                return;
            }
            this.q = 1 + this.q;
            d d10 = this.e;
            if (d10.a() != d.b.a) {
                f10 = null;
            } else {
                f f11 = l.a(string);
                f10 = f11 != null && !l.b(d10.b.n, f11) ? null : f11;
                if (f10 == null) {
                    f10 = l.a(d10.b.n, string);
                }
            }
            this.l.a(this.q);
            if (f10 != null && f10.a != f10.b) {
                this.g.b(f10.a);
                c.c.b.a.g0 = new ArrayList();
                this.g.a(f10.b);
                this.g.e();
            }
            return;
        }
    }

    public final void a(int n10, String string, f f10) {
        b b10 = this;
        synchronized (b10) {
            block4 : {
                int n11 = this.q;
                if (n11 == n10) break block4;
                return;
            }
            this.q = 1 + this.q;
            j j10 = new j(this.e.b.n);
            this.e.a(string);
            this.f = f10;
            this.n();
            this.l.a(this.q);
            this.l();
            this.d();
            f f11 = this.e.b();
            this.g.a(j10, f11, true);
            this.m();
            this.g.m();
            return;
        }
    }

    public final void a(c.c.b.b b10, boolean bl) {
        b b11 = this;
        synchronized (b11) {
            if (!this.d.equals(b10)) {
                this.d = b10;
                if (this.a != null) {
                    this.a.d = b10;
                }
                if (bl && this.e != null) {
                    this.a();
                    this.l();
                    this.m();
                }
            }
            return;
        }
    }

    public final void a(c.b b10) {
        b b11 = this;
        synchronized (b11) {
            if (b10.a == this.q && b10 == this.s) {
                this.g.a(b10);
            }
            return;
        }
    }

    public final void a(c.c.b.d d10) {
        b b10 = this;
        synchronized (b10) {
            if (!this.h.equals(d10)) {
                boolean bl = this.e.b.n.b ? d10.c() : d10.b();
                if (bl) {
                    this.q = 1 + this.q;
                }
                this.h = d10;
                if (!d10.c() || !this.h.b()) {
                    this.a(this.e);
                }
                this.n();
                this.a();
                this.l();
                this.g.g();
                this.m();
            }
            return;
        }
    }

    public final void a(c.c.b.d d10, n n10) {
        b b10 = this;
        synchronized (b10) {
            this.r = 1 + this.r;
            if (this.a()) {
                this.m();
            }
            this.h = d10;
            if (this.a == null) {
                c.c.b.h.b b11;
                this.a = b11 = new c.c.b.h.b(this.g.i(), this.l);
                c.c.b.g.a a10 = this.c;
                b11.c.a(a10);
                this.a.d = this.d;
            }
            this.a.a(this.q, this.j);
            this.q = 1 + this.q;
            this.e = new d(this.b, n10);
            this.a.j();
            this.a(this.e);
            this.n();
            return;
        }
    }

    public final void a(d d10) {
        if (d10 != null) {
            String string;
            c.c.b.h.b b10 = this.a;
            if (b10 != null) {
                string = b10.b();
                if (this.k < 1000) {
                    StringBuilder stringBuilder = c.a.b.a.a.a(string);
                    Locale locale = Locale.US;
                    Object[] arrobject = new Object[1];
                    double d11 = this.k;
                    Double.isNaN((double)d11);
                    Double.isNaN((double)d11);
                    arrobject[0] = d11 * 0.1;
                    stringBuilder.append(String.format((Locale)locale, (String)" (%.1f%%)", (Object[])arrobject));
                    string = stringBuilder.toString();
                }
            } else {
                string = "Computer";
            }
            String string2 = this.g.d();
            String string3 = this.h.c() ? string2 : string;
            if (this.h.b()) {
                string = string2;
            }
            e e10 = d10.b;
            e10.e = string3;
            e10.f = string;
            e10.e();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(e.c c10) {
        b b10 = this;
        synchronized (b10) {
            boolean bl;
            boolean bl2;
            if (c10 == null) {
                return;
            }
            d d10 = this.e;
            e e10 = d10.b;
            if (c10 == e10.m) {
                bl = false;
            } else {
                ArrayList<Integer> arrayList = c10.a();
                while (e10.m != e10.l) {
                    e10.c();
                }
                Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    e10.a((Integer)iterator.next(), true);
                }
                bl = true;
            }
            if (!bl) {
                bl2 = false;
            } else {
                d10.a = false;
                d10.a(true);
                bl2 = true;
            }
            if (!bl2) {
                return;
            }
            if (!this.b() && this.e.b() != null) {
                this.e.f();
                if (!this.b()) {
                    this.e.e();
                }
            }
            this.a();
            this.l();
            this.d();
            this.m();
            return;
        }
    }

    public final void a(String string, int n10) {
        b b10 = this;
        synchronized (b10) {
            if (true ^ string.equals((Object)this.j) || n10 != this.k) {
                this.j = string;
                this.k = n10;
                if (this.e != null) {
                    this.a();
                    this.l();
                    this.m();
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(boolean bl) {
        b b10 = this;
        synchronized (b10) {
            if (this.e == null) {
                bl = false;
            }
            if (bl) {
                this.e.b.d();
            }
            this.o();
            c c10 = this.l;
            int n10 = this.q;
            if (bl && n10 == c10.n) {
                j j10 = c10.b.this.e.b.n;
                f f10 = c10.c;
                if (f10 != null) {
                    c10.a(n10, j10, f10, c10.b);
                }
                c10.a(n10, j10, c10.m, c10.l);
            } else {
                c10.b(n10);
            }
            if (bl) {
                this.m();
            }
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void a(byte[] var1, int var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl95.1 : ALOAD : trying to set 1 previously set to 0
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

    public final boolean a() {
        this.g.c();
        this.f = null;
        this.q = 1 + this.q;
        c.c.b.h.b b10 = this.a;
        if (b10 == null) {
            return false;
        }
        if (b10.i()) {
            this.l.a(this.q);
            return true;
        }
        return false;
    }

    public final boolean a(f f10) {
        j j10 = this.e.b.n;
        ArrayList<f> arrayList = new g().a(j10);
        int n10 = f10.c;
        for (f f11 : arrayList) {
            if (f11.a != f10.a || f11.b != f10.b) continue;
            if (f11.c != 0 && n10 == 0) {
                this.p = f11;
                this.g.h();
                return false;
            }
            if (f11.c != n10) continue;
            String string = l.a(j10, f11, false, false, arrayList);
            this.e.a(string);
            return true;
        }
        this.g.a(f10);
        return false;
    }

    public final boolean a(String string) {
        if (!string.isEmpty()) {
            string = c.a.b.a.a.a(" ", string);
        }
        if (this.e.a() != d.b.a) {
            return true;
        }
        this.e.b("draw accept");
        if (this.e.a() != d.b.a) {
            return true;
        }
        d d10 = this.e;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("draw rep");
        stringBuilder.append(string);
        d10.b(stringBuilder.toString());
        if (this.e.a() != d.b.a) {
            return true;
        }
        d d11 = this.e;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("draw 50");
        stringBuilder2.append(string);
        d11.b(stringBuilder2.toString());
        return this.e.a() != d.b.a;
    }

    public final void b(f f10) {
        b b10 = this;
        synchronized (b10) {
            block10 : {
                boolean bl = this.b();
                if (bl) break block10;
                return;
            }
            try {
                j j10 = new j(this.e.b.n);
                if (this.e.a) {
                    Iterator iterator = new g().a(j10).iterator();
                    while (iterator.hasNext()) {
                        if (!((f)iterator.next()).equals(f10)) continue;
                        if (!this.a(l.a(f10))) break;
                        this.g();
                        this.m();
                        this.g.c(-1);
                        return;
                    }
                }
                if (this.a(f10)) {
                    if (f10.equals(this.f) && this.a.d() == b.d.c) {
                        this.a.a(this.q);
                        this.f = null;
                    } else {
                        this.a();
                        this.l();
                    }
                    this.g.a(j10, f10, true);
                    this.m();
                    this.g.b();
                } else {
                    this.g.c(-1);
                }
                return;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
        }
    }

    public final void b(String string) {
        b b10 = this;
        synchronized (b10) {
            d d10;
            d10 = new d(this.b, this.e.c.a);
            try {
                j j10 = l.c(string);
                d10.b.a(new j(j10));
                d10.a(false);
                this.a(d10);
            }
            catch (Exception exception) {}
            this.q = 1 + this.q;
            this.e = d10;
            i i10 = this.b;
            MainActivity.n0 n02 = (MainActivity.n0)i10;
            n02.a();
            this.n();
            this.a();
            this.a.j();
            this.l();
            this.g.c(-1);
            this.m();
            return;
        }
    }

    public final void b(boolean bl) {
        b b10 = this;
        synchronized (b10) {
            this.m = bl;
            this.n();
            return;
        }
    }

    public final boolean b() {
        b b10 = this;
        synchronized (b10) {
            block4 : {
                d d10 = this.e;
                if (d10 != null) break block4;
                return false;
            }
            c.c.b.d d11 = this.h;
            boolean bl = this.e.b.n.b ? d11.c() : d11.b();
            return bl;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(String string) {
        b b10 = this;
        synchronized (b10) {
            if (this.e != null) {
                if (this.k < 1000) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string);
                    Locale locale = Locale.US;
                    Object[] arrobject = new Object[1];
                    int n10 = this.k;
                    double d10 = n10;
                    Double.isNaN((double)d10);
                    Double.isNaN((double)d10);
                    double d11 = d10 * 0.1;
                    arrobject[0] = d11;
                    stringBuilder.append(String.format((Locale)locale, (String)" (%.1f%%)", (Object[])arrobject));
                    string = stringBuilder.toString();
                }
                String string2 = this.h.c() ? this.e.b.e : string;
                if (this.h.b()) {
                    string = this.e.b.f;
                }
                e e10 = this.e.b;
                e10.e = string2;
                e10.f = string;
                e10.e();
                this.o();
            }
            return;
        }
    }

    public final boolean c() {
        return this.i.a.e != 0;
    }

    public final void d() {
        int n10;
        int n11;
        int n12;
        f f10 = this.e.b();
        int n13 = -1;
        if (f10 == null || (n11 = f10.a) == (n12 = f10.b)) {
            n12 = -1;
        }
        this.g.c(n12);
        if (f10 != null && (n10 = f10.a) != f10.b) {
            n13 = n10;
        }
        this.g.d(n13);
    }

    public final void e() {
        b b10 = this;
        synchronized (b10) {
            this.h = new c.c.b.d(3);
            this.a();
            this.a.h();
            return;
        }
    }

    public final void f() {
        b b10 = this;
        synchronized (b10) {
            this.l();
            this.d();
            this.m();
            this.n();
            return;
        }
    }

    public final void g() {
        b b10 = this;
        synchronized (b10) {
            if (this.b() && this.a != null && this.a.d() == b.d.c && this.a()) {
                this.m();
            }
            return;
        }
    }

    public final void h() {
        b b10 = this;
        synchronized (b10) {
            this.a();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final byte[] i() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j() {
        b b10 = this;
        synchronized (b10) {
            if (this.e.b() != null) {
                this.a();
                boolean bl = this.k();
                this.l();
                this.d();
                if (bl) {
                    f f10;
                    j j10 = this.e.b.n;
                    d d10 = this.e;
                    boolean bl2 = d10.b.f().size() > 0;
                    if (bl2) {
                        d10.b.a(-1, true);
                        e e10 = d10.b;
                        f10 = e10.m.c;
                        e10.c();
                    } else {
                        f10 = null;
                    }
                    this.g.a(j10, f10, false);
                }
                this.m();
            }
            return;
        }
    }

    public final boolean k() {
        if (this.e.b() == null) {
            return false;
        }
        this.q = 1 + this.q;
        this.e.f();
        if (!this.b()) {
            if (this.e.b() != null) {
                this.e.f();
                if (!this.b()) {
                    this.e.e();
                    return true;
                }
            } else if (this.h.c() || this.h.b()) {
                this.e.e();
                return false;
            }
        }
        return true;
    }

    public final void l() {
        int n10 = c.c.b.a.f0;
        long l10 = n10;
        int n11 = this.o;
        if (n10 < n11 && MainActivity.q0 == 1) {
            l10 = n11;
        }
        boolean bl = this.e.b.a() == d.b.a;
        boolean bl2 = !this.b() && bl;
        if (!bl2) {
            this.a.i();
        }
        this.l.a(this.q);
        if (!this.a.b(this.q)) {
            if (bl2) {
                this.l.a(this.q);
                c c10 = this.l;
                int n12 = this.q;
                c10.j = "";
                c10.k = null;
                c10.b(n12);
                h<j, ArrayList<f>> h10 = this.e.c();
                j j10 = new j(this.e.b.n);
                long l11 = System.currentTimeMillis();
                int n13 = this.e.c.a(true, l11);
                int n14 = this.e.c.a(false, l11);
                int n15 = this.e.c.b(true);
                int n16 = this.e.c.b(false);
                boolean bl3 = j10.b;
                int n17 = (Integer)this.e.c.a((boolean)bl3).b;
                final b.c c11 = b.c.a(this.q, l11, (j)h10.a, (ArrayList<f>)((ArrayList)h10.b), j10, this.e.d(), n13, n14, n15, n16, n17, false, null, this.j, this.k, false);
                this.n.postDelayed(new Runnable(){

                    public void run() {
                        b.this.a.a(c11);
                    }
                }, l10);
                return;
            }
            new Thread(new Runnable(){

                public void run() {
                    b b10 = b.this;
                    b10.a.a(b10.q, b10.j);
                }
            }).start();
        }
    }

    public final void m() {
        d.b b10;
        c.a a10 = new c.a();
        a10.a = b10 = this.e.a();
        d.b b11 = d.b.a;
        int n10 = 6;
        if (b10 == b11) {
            int n11;
            j j10 = this.e.b.n;
            a10.b = j10.f;
            a10.d = j10.b;
            b.d d10 = b.d.a;
            c.c.b.h.b b12 = this.a;
            if (b12 != null) {
                d10 = b12.d();
            }
            if ((n11 = d10.ordinal()) != 1) {
                if (n11 != 2) {
                    if (n11 == 3) {
                        a10.g = true;
                    }
                } else {
                    a10.e = true;
                }
            } else {
                a10.f = true;
            }
        } else if (b10 == d.b.f || b10 == d.b.g) {
            d d11 = this.e;
            boolean bl = this.c();
            String string = d11.b.m.e;
            String string2 = string.startsWith("draw rep ") ? string.substring(9).trim() : "";
            if (string.startsWith("draw 50 ")) {
                string2 = string.substring(8).trim();
            }
            if (bl) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i10 = 0; i10 < string2.length(); ++i10) {
                    int n12;
                    char c10 = string2.charAt(i10);
                    if (c10 != 'B') {
                        if (c10 != 'K') {
                            if (c10 != 'N') {
                                switch (c10) {
                                    default: {
                                        n12 = 0;
                                        break;
                                    }
                                    case 'R': {
                                        n12 = 3;
                                        break;
                                    }
                                    case 'Q': {
                                        n12 = 2;
                                        break;
                                    }
                                    case 'P': {
                                        n12 = 6;
                                        break;
                                    }
                                }
                            } else {
                                n12 = 5;
                            }
                        } else {
                            n12 = 1;
                        }
                    } else {
                        n12 = 4;
                    }
                    if (n12 == 0) {
                        stringBuilder.append(string2.charAt(i10));
                        continue;
                    }
                    stringBuilder.append(l.b(n12));
                }
                string2 = stringBuilder.toString();
            }
            a10.c = string2;
        }
        this.g.a(a10);
        this.o();
        StringBuilder stringBuilder = new StringBuilder();
        e e10 = this.e.b;
        if (e10.m != e10.l) {
            e10.c();
            e e11 = this.e.b;
            j j11 = e11.n;
            ArrayList<f> arrayList = e11.f();
            for (int i11 = 0; i11 < arrayList.size(); ++i11) {
                if (i11 > 0) {
                    stringBuilder.append(' ');
                }
                if (i11 == this.e.b.m.k) {
                    stringBuilder.append(c.c.b.f.a);
                }
                stringBuilder.append(l.a(j11, (f)arrayList.get(i11), false, this.c()));
                if (i11 != this.e.b.m.k) continue;
                stringBuilder.append(c.c.b.f.b);
            }
            this.e.b.a(-1, true);
        }
        this.g.a(this.e.b.n, stringBuilder.toString(), this.e.b.f());
        this.p();
        c.c.b.c c11 = this.g;
        j j12 = this.e.b.n;
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();
        while (n10 >= 1) {
            int n13;
            int n14 = j12.a(n10);
            int n15 = n10 == 0 ? 0 : (a.c.a.a.f(n10) ? n10 + 6 : n10 - 6);
            for (n13 = n14 - j12.a((int)n15); n13 < 0; ++n13) {
                stringBuilder2.append((char)(-1 + (n10 + 9812)));
            }
            while (n13 > 0) {
                int n16 = n10 == 0 ? 0 : (a.c.a.a.f(n10) ? n10 + 6 : n10 - 6);
                stringBuilder3.append((char)(-1 + (n16 + 9812)));
                --n13;
            }
            --n10;
        }
        c11.a(new f.a((CharSequence)stringBuilder2, (CharSequence)stringBuilder3));
        this.g.j();
    }

    public final void n() {
        if (this.e != null) {
            boolean bl = !this.h.a() || this.b() && this.m;
            d d10 = this.e;
            if (bl != d10.d) {
                d10.d = bl;
                d10.a(false);
            }
            this.p();
            d.a a10 = this.g.k() ? d.a.c : (this.h.a() ? d.a.a : d.a.b);
            this.e.e = a10;
        }
    }

    public final void o() {
        e.c c10;
        block17 : {
            block18 : {
                e e10;
                i i10;
                String string;
                c.c.b.e e11;
                ArrayList arrayList;
                block19 : {
                    e.c c11;
                    if (this.e == null) {
                        return;
                    }
                    if (((MainActivity.n0)this.b).m) break block17;
                    e11 = new c.c.b.e();
                    e.a a10 = e11.c;
                    e.c c12 = this.i.a;
                    a10.a = c12.a;
                    a10.b = c12.b;
                    a10.c = c12.c;
                    a10.d = false;
                    a10.e = false;
                    a10.g = false;
                    a10.h = c12.e;
                    ((MainActivity.n0)this.b).a();
                    e10 = this.e.b;
                    i10 = this.b;
                    if (e10 == null) break block18;
                    arrayList = new ArrayList();
                    while ((c11 = e10.m) != e10.l) {
                        e10.c();
                        arrayList.add((Object)e10.m.l.indexOf((Object)c11));
                    }
                    while (e10.f().size() > 0) {
                        e10.a(0, false);
                    }
                    switch (e10.a().ordinal()) {
                        default: {
                            break;
                        }
                        case 3: 
                        case 4: 
                        case 5: 
                        case 6: 
                        case 7: 
                        case 8: {
                            string = "1/2-1/2";
                            break block19;
                        }
                        case 2: 
                        case 9: {
                            string = "0-1";
                            break block19;
                        }
                        case 1: 
                        case 10: {
                            string = "1-0";
                            break block19;
                        }
                    }
                    string = "*";
                }
                while (e10.m != e10.l) {
                    e10.c();
                }
                for (int i11 = arrayList.size() - 1; i11 >= 0; --i11) {
                    e10.a((Integer)arrayList.get(i11), false);
                }
                e10.a(i10, "Event", e10.a);
                e10.a(i10, "Site", e10.b);
                e10.a(i10, "Date", e10.c);
                e10.a(i10, "Round", e10.d);
                e10.a(i10, "White", e10.e);
                e10.a(i10, "Black", e10.f);
                e10.a(i10, "Result", string);
                String string2 = l.b(e10.g);
                if (!string2.equals((Object)"rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1")) {
                    e10.a(i10, "FEN", string2);
                    e10.a(i10, "SetUp", "1");
                }
                if (!e10.h.equals((Object)"?")) {
                    e10.a(i10, "TimeControl", e10.h);
                }
                if (!e10.i.equals((Object)"?")) {
                    e10.a(i10, "WhiteTimeControl", e10.i);
                }
                if (!e10.j.equals((Object)"?")) {
                    e10.a(i10, "BlackTimeControl", e10.j);
                }
                for (int i12 = 0; i12 < e10.k.size(); ++i12) {
                    e10.a(i10, ((e.d)e10.k.get((int)i12)).a, ((e.d)e10.k.get((int)i12)).b);
                }
                j j10 = e10.g;
                int n10 = j10.f;
                boolean bl = j10.b;
                e.c c13 = e10.l;
                e.b b10 = bl ? new e.b(n10 - 1, false) : new e.b(n10, true);
                e.c.a(i10, c13, b10, e11);
                MainActivity.n0 n02 = (MainActivity.n0)i10;
                n02.a(null, 9, string);
                n02.a(null, 11, null);
                break block17;
            }
            throw null;
        }
        i i13 = this.b;
        e.c c14 = this.e.b.m;
        MainActivity.n0 n03 = (MainActivity.n0)i13;
        n03.l.removeSpan((Object)n03.a);
        MainActivity.n0.b b11 = n03.e.get((Object)c14);
        if (b11 == null && c14 != null && (c10 = c14.j) != null) {
            b11 = n03.e.get((Object)c10);
        }
        if (b11 != null) {
            n03.l.setSpan((Object)n03.a, b11.a, b11.b, 33);
        }
        this.g.l();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void p() {
        b b10 = this;
        synchronized (b10) {
            long l10 = System.currentTimeMillis();
            int n10 = this.e.c.a(true, l10);
            int n11 = this.e.c.a(false, l10);
            boolean bl = this.e.c.a();
            int n12 = 0;
            if (bl) {
                int n13 = this.e.b.n.b ? n10 : n11;
                int n14 = n13 % 1000;
                if (n14 < 0) {
                    n14 += 1000;
                }
                n12 = n14 + 1;
            }
            this.g.a(n10, n11, n12);
            return;
        }
    }

}

