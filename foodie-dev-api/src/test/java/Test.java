public class Test {
    public static void main(String[] args) {
        String str1 = "上海市-闵行区/abcABC汇秀景苑一街坊 20 栋1402";
        String str2 = "上海市-闵行区/ABCabc汇秀景/*-苑一街坊 20 栋1402";
        char[] chars = str1.toCharArray();
        char[] chars1 = str2.toCharArray();
        String a = dispose(chars);
        String b = dispose(chars1);
        System.out.println(compare(a.toCharArray(), b.toCharArray()));
    }

    public static String dispose(char[] chars) {
        String a = "";
        for (int i = 0; i < chars.length; i++) {
            if (String.valueOf(chars[i]).matches("[\u4e00-\u9fa5]")) {   //汉字判断
                a += chars[i];
            } else if (Character.isDigit(chars[i])) {  // 数字判断
                a += chars[i];
            } else if (((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z'))) {  // 字母判断
                a += String.valueOf(chars[i]).toUpperCase();  // 转大写
            }
        }

        return new StringBuffer(a).reverse().toString();
    }
    public static boolean compare(char[] chars, char[] chars1) {
        if (chars.length < 15 || chars1.length < 15) {
            return false;
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(chars[i] +"---" + chars1[i]);
            if (!String.valueOf(chars[i]).equals(String.valueOf(chars1[i]))) {
                return false;
            }
        }
        return true;
    }
}
