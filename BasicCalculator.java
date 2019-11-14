public class BasicCalculator {
    int ptr = 0;
    public int calculate(String s) {
        int val = 0;
        int num = 0;
        int oper = 1;
        while (ptr < s.length()) {
            char ch = s.charAt(ptr++);
            if (ch == ' ') continue;
            if (ch >= '0' && ch <= '9') num = num*10 + (ch - '0');
            else {
                val = check(val, num, oper);
                num = 0;
                if (ch == '+') oper = 1;
                else if (ch == '-') oper = 2;
                else if (ch == '(') num = calculate(s);
                else return val;
            }
        }
        return check(val, num, oper);
    }
    private int check(int val, int num, int oper) {
        if (oper == 1) val += num;
        else if (oper == 2) val -= num;
        return val;
    }
}
