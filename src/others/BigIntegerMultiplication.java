package others;

/**
 * Created by dss886 on 2016/3/28.
 * From the online written test of Tencent.
 */
public class BigIntegerMultiplication {
    public String multiple(String a, String b) {
        if (a.length() <= 4 && b.length() <= 4) {
            return String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
        }
        StringBuilder l = new StringBuilder(a.length() > b.length() ? a : b);
        StringBuilder s = new StringBuilder(a.length() > b.length() ? b : a);
        for (int i = 0; i < Math.abs(a.length() - b.length()); i++) s.insert(0, 0);
        // Let AB x CD
        String A = l.substring(0, l.length() / 2);
        String B = l.substring(l.length() / 2, l.length());
        String C = s.substring(0, s.length() / 2);
        String D = s.substring(s.length() / 2, s.length());

        // count AC, AD+BC, BD
        String AC = multiple(A, C);
        String ADplusBC = add(multiple(A, D), multiple(B, C));
        String BD = multiple(B, D);

        // add them and deal with the carry.
        int maxAC = Math.max(A.length(), C.length());
        int maxBD = Math.max(B.length(), C.length());
        int maxABCD = Math.max(maxAC, maxBD);
        if (BD.length() > maxBD) {
            ADplusBC = add(ADplusBC, BD.substring(0, BD.length() - maxBD));
            BD = BD.substring(BD.length() - maxBD, BD.length());
        }
        if (ADplusBC.length() > maxABCD) {
            AC = add(AC, ADplusBC.substring(0, ADplusBC.length() - maxABCD));
            ADplusBC = ADplusBC.substring(ADplusBC.length() - maxABCD, ADplusBC.length());
        }

        return AC + ADplusBC + BD;
    }

    public String add(String a, String b) {
        if (a.length() < 10 && b.length() < 10) {
            return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
        }
        StringBuilder l = new StringBuilder(a.length() > b.length() ? a : b);
        StringBuilder s = new StringBuilder(a.length() > b.length() ? b : a);
        for (int i = 0; i < Math.abs(a.length() - b.length()); i++) {
            s.insert(0, 0);
        }
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = l.length() - 1; i >= 0; i--) {
            int r = Character.getNumericValue(l.charAt(i))
                    + Character.getNumericValue(s.charAt(i))
                    + carry;
            carry = r / 10;
            result.insert(0, r % 10);
        }
        return result.toString();
    }
}
