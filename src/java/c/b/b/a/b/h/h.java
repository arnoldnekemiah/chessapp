/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 */
package c.b.b.a.b.h;

import c.a.b.a.a;
import c.b.b.a.b.h.y;
import java.util.ArrayList;
import java.util.List;

public final class h {
    public final List<String> a;
    public final Object b;

    public /* synthetic */ h(Object object, y y2) {
        a.c.a.a.a(object);
        this.b = object;
        this.a = new ArrayList();
    }

    public final h a(String string, Object object) {
        List<String> list = this.a;
        a.c.a.a.a(string);
        String string2 = string;
        String string3 = String.valueOf((Object)object);
        StringBuilder stringBuilder = new StringBuilder(a.a(string2, 1) + string3.length());
        stringBuilder.append(string2);
        stringBuilder.append("=");
        stringBuilder.append(string3);
        list.add((Object)stringBuilder.toString());
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(this.b.getClass().getSimpleName());
        stringBuilder.append('{');
        int n2 = this.a.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append((String)this.a.get(i2));
            if (i2 >= n2 - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

