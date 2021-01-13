package sk.kosickaakademia.rodnecislo;

public class Task {
    public int suc(int a, int b){
        return a+b;
    }
    public boolean isPriceNumber(int m){
        if(m<=1)
            return false;
        for(int i=2;i<Math.sqrt(m);i++) {
            if (m % i == 0)
                return false;
        }
        return true;

    public boolean isRectangularTriangle=(int a, int b, int c){
            if (a + b < c || a + c < b || c + b < a || (a < 1 && b < 1 && c < 1))
                return false;
            else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
                return true;

            else
                return false;
        }
        public String reverse (String input){
            char[] result = new char[input.length];
            for(int i = 0; i < input.length(); ++i)
                result[input.length() - 1 - i] = input.charAt(i);
            return new String(result);

        }
    }
}
