/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.LinkedList
 *  java.util.Locale
 */
package c.c.b.h;

import java.util.LinkedList;
import java.util.Locale;

public class c {
    public LinkedList<String> a = new LinkedList();
    public boolean b = false;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String a(int n10) {
        c c10 = this;
        synchronized (c10) {
            block9 : {
                boolean bl = this.b;
                if (bl) {
                    return null;
                }
                try {
                    if (this.a.isEmpty()) {
                        if (n10 > 0) {
                            this.wait((long)n10);
                        } else {
                            this.wait();
                        }
                    }
                    if (!this.a.isEmpty()) break block9;
                    if (!this.b) return "";
                    return null;
                }
                catch (InterruptedException interruptedException) {
                    return null;
                }
            }
            String string = (String)this.a.get(0);
            this.a.remove(0);
            return string;
        }
    }

    public final void a() {
        c c10 = this;
        synchronized (c10) {
            this.b = true;
            this.notify();
            return;
        }
    }

    public final void a(String string) {
        c c10 = this;
        synchronized (c10) {
            this.a.add((Object)string);
            this.notify();
            return;
        }
    }

    public final /* varargs */ void a(String string, Object ... arrobject) {
        c c10 = this;
        synchronized (c10) {
            this.a(String.format((Locale)Locale.US, (String)string, (Object[])arrobject));
            return;
        }
    }

    public final String b() {
        c c10 = this;
        synchronized (c10) {
            String string = this.a(-1);
            return string;
        }
    }

    public final void b(String string) {
        c c10 = this;
        synchronized (c10) {
            this.a(String.format((Locale)Locale.US, (String)string, (Object[])new Object[0]));
            return;
        }
    }
}

