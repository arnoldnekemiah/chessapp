/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.c.b.h.c
 *  c.c.b.h.g.c
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.Locale
 */
package c.c.b.h.g;

import b.g;
import b.j;
import c.c.b.h.e;
import c.c.b.h.g.c;
import java.util.ArrayList;
import java.util.Locale;

public class b
extends e {
    public j c = null;
    public ArrayList<g> d = new ArrayList();
    public c e;
    public boolean f = false;
    public c.c.b.h.c g = new c.c.b.h.c();
    public c.c.b.h.c h = new c.c.b.h.c();
    public Thread i;

    @Override
    public boolean a(String string) {
        String string2 = string.toLowerCase(Locale.US);
        if (!super.a(string2)) {
            return false;
        }
        return !string2.equals((Object)"strength");
    }

    public final void b(String string) {
        b b6 = this;
        synchronized (b6) {
            this.g.a(string);
            return;
        }
    }
}

