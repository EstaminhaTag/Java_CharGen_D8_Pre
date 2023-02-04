import java.io.PrintWriter;

public class MasterKeys {
    public static void main(String[] args) throws Exception {
        String caracteres = "qwertyuiopçlkjhgfdsazxcvbnmQWERTYUIOPÇLKJHGFDSAZXCVBNM1234567890!#$%&/()=?»«'´`~^-_";
        String newWord = "aaaaaaaa";
        String finalWord ="aaaaaaaa";
        StringBuilder word = new StringBuilder(newWord);
        try (PrintWriter printer = new PrintWriter("trial.txt")) {
            for (int counter1 = 0; counter1 < caracteres.length(); counter1++){
                word.setCharAt(0, caracteres.charAt(counter1));
                for (int counter2 = 0; counter2 < caracteres.length(); counter2++){
                    word.setCharAt(1, caracteres.charAt(counter2));
                    for (int counter3 = 0; counter3 < caracteres.length(); counter3++){
                        word.setCharAt(2, caracteres.charAt(counter3));
                        for (int counter4 = 0; counter4 < caracteres.length(); counter4++){
                        word.setCharAt(3, caracteres.charAt(counter4));
                            for (int counter5 = 0; counter5 < caracteres.length(); counter5++){
                            word.setCharAt(4, caracteres.charAt(counter5));
                                for (int counter6 = 0; counter6 < caracteres.length(); counter6++){
                                word.setCharAt(5, caracteres.charAt(counter6));
                                    for (int counter7 = 0; counter7 < caracteres.length(); counter7++){
                                    word.setCharAt(6, caracteres.charAt(counter7));
                                        for (int counter8 = 0; counter8 < caracteres.length(); counter8++){
                                        word.setCharAt(7, caracteres.charAt(counter8));
                                        finalWord = word.toString();
                                        System.out.println(finalWord); 
                                        printer.println(finalWord);
                                        }
                                    }
                                }
                            }
                        }
                    }         
                }
            }
        }
    }
}
