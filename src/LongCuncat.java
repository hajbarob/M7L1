public class LongCuncat {

    public static void main(String[] args) {
        String a = "subh" + "shb" + "siuhbnskd" + "subh" + "shb" + "siuhbnskd" + "subh" + "shb" + "siuhbnskd";

        StringBuilder sb = new StringBuilder();
        String appended = sb.append("subh").append("shb").append("siuhbnskd").append("subh")
                .append("shb").append("siuhbnskd").append("subh").append("shb").append("siuhbnskd").toString();

        System.out.println(appended);
    }
}
