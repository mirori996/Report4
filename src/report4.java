public class report4 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException e) {
            System.out.println("NullPointerExceptionが出てるよ");
            System.out.println(e.getMessage());
        }
    }
}

