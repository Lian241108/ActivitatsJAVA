package STRING;

public class CanvideAaEString {

    public class FuncioCanviaAsPerEs {

        public static void main(String[] args) {
            String a = "RADAR";
            System.out.printf("%s canviant As per Es és %s.", a, canviarAxE(a));

        }

        public static String canviarAxE(String s){
            String a = "";
            for(int i = 0; i < s.length(); i++){
                if (s.charAt(i) == 'A'){
                    a = a + 'E';
                }
                else {
                    a = a + s.charAt(i);
                }
            }
            return  a;
        }
    }
}


