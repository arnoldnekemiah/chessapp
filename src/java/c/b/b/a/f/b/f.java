/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.b.a.f.b;

import android.os.Bundle;

public final class f {
    public static final f c = new f(null, null);
    public final Boolean a;
    public final Boolean b;

    public f(Boolean bl, Boolean bl2) {
        this.a = bl;
        this.b = bl2;
    }

    public static final int a(Boolean bl) {
        if (bl == null) {
            return 0;
        }
        if (bl.booleanValue()) {
            return 1;
        }
        return 2;
    }

    public static f a(String string) {
        Boolean bl;
        Boolean bl2;
        block8 : {
            block0 : {
                Boolean bl3;
                Boolean bl4;
                block4 : {
                    Boolean bl5;
                    block7 : {
                        block5 : {
                            block6 : {
                                block3 : {
                                    block1 : {
                                        block2 : {
                                            bl2 = null;
                                            if (string == null) break block0;
                                            if (string.length() < 3) break block1;
                                            char c2 = string.charAt(2);
                                            if (c2 == '0') break block2;
                                            if (c2 != '1') break block1;
                                            bl3 = Boolean.TRUE;
                                            break block3;
                                        }
                                        bl3 = Boolean.FALSE;
                                        break block3;
                                    }
                                    bl3 = null;
                                }
                                int n2 = string.length();
                                bl4 = null;
                                if (n2 < 4) break block4;
                                char c9 = string.charAt(3);
                                if (c9 == '0') break block5;
                                if (c9 == '1') break block6;
                                bl4 = null;
                                break block4;
                            }
                            bl5 = Boolean.TRUE;
                            break block7;
                        }
                        bl5 = Boolean.FALSE;
                    }
                    bl4 = bl5;
                }
                bl = bl4;
                bl2 = bl3;
                break block8;
            }
            bl = null;
        }
        return new f(bl2, bl);
    }

    public static Boolean a(Boolean bl, Boolean bl2) {
        if (bl == null) {
            return bl2;
        }
        if (bl2 == null) {
            return bl;
        }
        boolean bl3 = bl;
        boolean bl4 = false;
        if (bl3) {
            boolean bl5 = bl2;
            bl4 = false;
            if (bl5) {
                bl4 = true;
            }
        }
        return bl4;
    }

    public static String a(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string != null && f.b(string) == null) {
            return string;
        }
        String string2 = bundle.getString("analytics_storage");
        if (string2 != null && f.b(string2) == null) {
            return string2;
        }
        return null;
    }

    public static boolean a(int n2, int n10) {
        return n2 <= n10;
    }

    public static f b(Bundle bundle) {
        if (bundle == null) {
            return c;
        }
        return new f(f.b(bundle.getString("ad_storage")), f.b(bundle.getString("analytics_storage")));
    }

    public static Boolean b(String string) {
        if (string == null) {
            return null;
        }
        if (string.equals((Object)"granted")) {
            return Boolean.TRUE;
        }
        if (string.equals((Object)"denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final String a() {
        StringBuilder stringBuilder = new StringBuilder("G1");
        Boolean bl = this.a;
        char c2 = '0';
        char c9 = bl == null ? (char)'-' : (bl != false ? (char)'1' : '0');
        stringBuilder.append(c9);
        Boolean bl2 = this.b;
        if (bl2 == null) {
            c2 = '-';
        } else if (bl2.booleanValue()) {
            c2 = '1';
        }
        stringBuilder.append(c2);
        return stringBuilder.toString();
    }

    public final boolean a(f f2) {
        Boolean bl = this.a;
        Boolean bl2 = Boolean.FALSE;
        boolean bl3 = true;
        if (bl != bl2 || f2.a == bl2) {
            Boolean bl4 = this.b;
            Boolean bl5 = Boolean.FALSE;
            if (bl4 == bl5) {
                if (f2.b != bl5) {
                    return bl3;
                }
                return false;
            }
            bl3 = false;
        }
        return bl3;
    }

    public final f b(f f2) {
        return new f(f.a(this.a, f2.a), f.a(this.b, f2.b));
    }

    public final boolean b() {
        Boolean bl = this.a;
        return bl == null || bl.booleanValue();
        {
        }
    }

    public final boolean c() {
        Boolean bl = this.b;
        return bl == null || bl.booleanValue();
        {
        }
    }

    public final boolean equals(Object object) {
        if (!(object instanceof f)) {
            return false;
        }
        f f2 = (f)object;
        return f.a(this.a) == f.a(f2.a) && f.a(this.b) == f.a(f2.b);
    }

    public final int hashCode() {
        return 31 * (527 + f.a(this.a)) + f.a(this.b);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConsentSettings: ");
        stringBuilder.append("adStorage=");
        Boolean bl = this.a;
        String string = "denied";
        if (bl == null) {
            stringBuilder.append("uninitialized");
        } else {
            String string2 = true != bl ? string : "granted";
            stringBuilder.append(string2);
        }
        stringBuilder.append(", analyticsStorage=");
        Boolean bl2 = this.b;
        if (bl2 == null) {
            stringBuilder.append("uninitialized");
        } else {
            if (bl2.booleanValue()) {
                string = "granted";
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}

