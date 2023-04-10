public class Work2Task0 {
    public static void main(String[] args) {
        String stones = "aaaAbbbB";
        String jewels = "aB";
        int count_jewels =  jewels.length();
        int count_stones =  stones.length();
        int summ;
        char с;
        String temp="";
        for (int i=0; i<count_jewels; i++) {
            с = jewels.charAt(i);
            summ = 0;
            for (int j=0; j<stones.length(); j++) {
                if (с == stones.charAt(j)) summ++;
            }
            temp=temp+String.valueOf(с)+summ;
        }
        System.out.println(temp);
    }
}
