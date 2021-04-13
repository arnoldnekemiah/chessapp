/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 */
package a.e;

import a.e.b;
import a.e.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class d
extends b {
    public a.a.a.b.a<Object, a> a = new a.a.a.b.a();
    public b.b b;
    public final WeakReference<c> c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;
    public ArrayList<b.b> g = new ArrayList();

    public d(c c2) {
        this.c = new WeakReference((Object)c2);
        this.b = b.b.b;
    }

    public static b.b a(b.a a5) {
        block2 : {
            block3 : {
                block4 : {
                    int n4 = a5.ordinal();
                    if (n4 == 0) break block2;
                    if (n4 == 1) break block3;
                    if (n4 == 2) break block4;
                    if (n4 == 3) break block3;
                    if (n4 != 4) {
                        if (n4 == 5) {
                            return b.b.a;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected event value ");
                        stringBuilder.append((Object)a5);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    break block2;
                }
                return b.b.e;
            }
            return b.b.d;
        }
        return b.b.c;
    }

}

