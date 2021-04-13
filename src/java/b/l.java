/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package b;

import b.c;
import b.g;
import b.j;

public class l {
    public static final int a(String string) {
        int n2 = -97 + string.charAt(0);
        int n3 = -49 + string.charAt(1);
        if (n2 >= 0 && n2 <= 7 && n3 >= 0 && n3 <= 7) {
            return j.d(n2, n3);
        }
        return -1;
    }

    public static final String a(int n2) {
        switch (n2) {
            default: {
                return "";
            }
            case 5: 
            case 11: {
                return "N";
            }
            case 4: 
            case 10: {
                return "B";
            }
            case 3: 
            case 9: {
                return "R";
            }
            case 2: 
            case 8: {
                return "Q";
            }
            case 1: 
            case 7: 
        }
        return "K";
    }

    public static final void a(j j2, int n2, int n3, int n5) {
        if (n3 >= 0) {
            if (n2 <= 7) {
                if (n5 != 6 && n5 != 12 || n3 != 0 && n3 != 7) {
                    j2.b(j.d(n2, n3), n5);
                    return;
                }
                throw new c("Pawn on first/last rank");
            }
            throw new c("Too many columns");
        }
        throw new c("Too many rows");
    }

    /*
     * Exception decompiling
     */
    public static final j b(String var0) {
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

    public static final String b(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = j.e(n2);
        int n5 = n2 >> 3;
        stringBuilder.append((char)(n3 + 97));
        stringBuilder.append((char)(n5 + 49));
        return stringBuilder.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final g c(String string) {
        int n2;
        int n3;
        int n5;
        int n7 = string.length();
        if (n7 < (n5 = 4)) return null;
        int n8 = string.length();
        if (n8 > (n3 = 5)) {
            return null;
        }
        int n9 = 2;
        int n10 = l.a(string.substring(0, n9));
        int n11 = l.a(string.substring(n9, n5));
        if (n10 < 0) return null;
        if (n11 < 0) {
            return null;
        }
        int n12 = string.length();
        boolean bl = true;
        if (n12 == n3) {
            n2 = string.charAt(n5);
            if (j.f(n11) != 7) {
                if (n11 >> 3 != 0) return null;
                bl = false;
            }
        } else {
            n2 = 32;
        }
        int n13 = 0;
        if (n2 == 32) return new g(n10, n11, n13);
        if (n2 != 98) {
            if (n2 != 110) {
                if (n2 != 113) {
                    if (n2 != 114) {
                        return null;
                    }
                    n13 = bl ? 3 : 9;
                    return new g(n10, n11, n13);
                } else {
                    if (!bl) {
                        n9 = 8;
                    }
                    n13 = n9;
                }
                return new g(n10, n11, n13);
            } else {
                if (!bl) {
                    n3 = 11;
                }
                n13 = n3;
            }
            return new g(n10, n11, n13);
        } else {
            if (!bl) {
                n5 = 10;
            }
            n13 = n5;
        }
        return new g(n10, n11, n13);
    }
}

