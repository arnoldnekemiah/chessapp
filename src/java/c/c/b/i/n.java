/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 */
package c.c.b.i;

import java.util.ArrayList;

public final class n {
    public ArrayList<a> a;
    public ArrayList<a> b;

    public n() {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = arrayList2 = new ArrayList();
        arrayList2.add((Object)new a(300000, 60, 0));
        this.b = arrayList = new ArrayList();
        arrayList.add((Object)new a(300000, 60, 0));
    }

    public static boolean a(ArrayList<a> arrayList, ArrayList<a> arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < arrayList.size(); ++i10) {
            a a10 = (a)arrayList.get(i10);
            a a11 = (a)arrayList2.get(i10);
            if (a10.a == a11.a && a10.b == a11.b) {
                if (a10.c == a11.c) continue;
                return false;
            }
            return false;
        }
        return true;
    }

    public ArrayList<a> a(boolean bl) {
        if (bl) {
            return this.a;
        }
        return this.b;
    }

    public final void a(int n10, int n11, int n12) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = arrayList2 = new ArrayList();
        arrayList2.add((Object)new a(n10, n11, n12));
        this.b = arrayList = new ArrayList();
        arrayList.add((Object)new a(n10, n11, n12));
    }

    public boolean equals(Object object) {
        if (!(object instanceof n)) {
            return false;
        }
        n n10 = (n)object;
        boolean bl = n.a(this.a, n10.a);
        boolean bl2 = false;
        if (bl) {
            boolean bl3 = n.a(this.b, n10.b);
            bl2 = false;
            if (bl3) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public static final class a {
        public int a;
        public int b;
        public int c;

        public a(int n10, int n11, int n12) {
            this.a = n10;
            this.b = n11;
            this.c = n12;
        }
    }

}

