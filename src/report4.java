public class report4 {
    public static void main(String[] args) {
        try {
            String str = "3．14";
            double value = Double.parseDouble(str);
        }catch(NullPointerException e) {
            System.out.println("NullPointerExceptionが出てるよ");
            System.out.println(e.getMessage());
        }
    }
}