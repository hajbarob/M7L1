public class Main {
    public static void main(String[] args) {
        String s = "vova";
        String s1 = "vova";
        boolean b = s == s1;


        System.out.println("s.equals(s1) = " + s.equals(s1));
        System.out.println("s == s1 = ".toUpperCase() + b);


        String sum = "";

        long l1 = System.currentTimeMillis();

//        for (int i = 0; i < 200000; i++) {
//            sum = sum + i;
//        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200000; i++) {
            sb.append(i);
        }

        long l2 = System.currentTimeMillis();

        System.out.println(sb.toString());

        System.out.println(l2 - l1);
    }

}