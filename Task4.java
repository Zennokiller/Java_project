public class Task4 {
    public static void main(String[] args) {
        String equation = "2? + ?5 = 69";
        int index1 = 0; //для символа =
        int index2 = 0; //для символа +
        // ищем индекс символа = и +
        for (int i = 0; i < equation.length(); i++) {
            char c = equation.charAt(i);
            if (c == '=') {
                index1 = i;
            }
            if (c == '+') {
                index2 = i;
            } 
        }
        // вычленяем число после =
        String stringE = "";
        for (int i = index1+1; i < equation.length(); i++) {
            char c = equation.charAt(i);
            if (c != ' ')  {
                stringE = stringE+c;
            } 
        }
        int numE = Integer.parseInt(stringE);

        // вычленяем число до +
        String stringQ = "";
        for (int i = 0; i < index2; i++) {
            char c = equation.charAt(i);
            if (c != ' ')  {
                stringQ = stringQ+c;
            } 
        }

        // вычленяем число после +
        String stringW = "";
        for (int i = index2+1; i < index1; i++) {
            char c = equation.charAt(i);
            if (c != ' ')  {
                stringW = stringW+c;
            } 
        }

        int numQ = 0;
        char c = stringQ.charAt(0);
        if (Character.isDigit(c)) {
            numQ=Character.getNumericValue(c)*10;           
        }
        else {
            c = stringQ.charAt(1);
            numQ=Character.getNumericValue(c);
        }

        int numW = 0;
        c = stringW.charAt(0);
        if (Character.isDigit(c)) {
            numW=Character.getNumericValue(c)*10;           
        }
        else {
            c = stringW.charAt(1);
            numW=Character.getNumericValue(c);
        }

        System.out.println(equation);
        // System.out.println(numQ);
        // System.out.println(numW);
        // System.out.println(numE-(numW+numQ));
        Boolean flag = false;
        for (int i = 0; i < 9; i++) {
            if (numQ+i+numW==numE) {
                System.out.println(numQ+i+"+"+numW+"="+numE);
                flag=true;
            }
            for (int j = 0; j < (numE-(numW+numQ)); j++) {
                if (numQ+i+numW+j==numE && (numW+j)%10==numW) {
                    System.out.println(numQ+i+"+"+(numW+j)+"="+numE);
                    flag=true;
                }
            }
        }
        if (flag==false){
            System.out.println("Корней нет");
        }
    }
}
