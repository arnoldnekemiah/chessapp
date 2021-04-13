/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.g.a.f.a
 *  a.g.a.f.b
 *  android.database.AbstractWindowedCursor
 *  android.database.Cursor
 *  android.database.CursorWindow
 *  android.database.MatrixCursor
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package a.f.l;

import a.f.g;
import a.g.a.c;
import a.g.a.e;
import a.g.a.f.b;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.MatrixCursor;
import android.os.Build;

public class a {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static Cursor a(g var0, e var1_1, boolean var2_2) {
        var0.a();
        var0.b();
        var3_3 = ((a.g.a.f.a)((b)var0.c).a()).a(var1_1);
        if (var2_2 == false) return var3_3;
        if (var3_3 instanceof AbstractWindowedCursor == false) return var3_3;
        var4_4 = (AbstractWindowedCursor)var3_3;
        var5_5 = var4_4.getCount();
        var6_6 = var4_4.hasWindow() != false ? var4_4.getWindow().getNumRows() : var5_5;
        if (Build.VERSION.SDK_INT >= 23) {
            if (var6_6 >= var5_5) return var3_3;
        }
        try {
            var7_7 = new MatrixCursor(var4_4.getColumnNames(), var4_4.getCount());
lbl13: // 2 sources:
            do {
                if (!var4_4.moveToNext()) ** break block15
                var9_8 = new Object[var4_4.getColumnCount()];
                var10_9 = 0;
                break;
            } while (true);
        }
        catch (Throwable var8_11) {
            var4_4.close();
            throw var8_11;
        }
        {
            
            var4_4.close();
            return var7_7;
        }
        do {
            if (var10_9 < var4_4.getColumnCount()) {
                var11_10 = var4_4.getType(var10_9);
                if (var11_10 != 0) {
                    if (var11_10 != 1) {
                        if (var11_10 != 2) {
                            if (var11_10 != 3) {
                                if (var11_10 != 4) throw new IllegalStateException();
                                var9_8[var10_9] = var4_4.getBlob(var10_9);
                            } else {
                                var9_8[var10_9] = var4_4.getString(var10_9);
                            }
                        } else {
                            var9_8[var10_9] = var4_4.getDouble(var10_9);
                        }
                    } else {
                        var9_8[var10_9] = var4_4.getLong(var10_9);
                    }
                } else {
                    var9_8[var10_9] = null;
                }
            } else {
                var7_7.addRow(var9_8);
                ** continue;
            }
            ++var10_9;
        } while (true);
    }
}

