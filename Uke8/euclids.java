class Euclids{
        public static void main(String[] args) {
    
            System.out.println(gcd(20, 30));
    
            System.out.println(gcdIterativ(20, 30));
        }
    
    static int gcd(int a,int b){
        
        if (a < b){
            int temp = a;
            a = b;
            b = temp;
        }
        int c = a % b;

        if (c == 0){
            return b;
        }

        else{
            return gcd(b,c);
        }
    }

    static int gcdIterativ(int a, int b){
        if (a < b){
            int temp = a;
            a = b;
            b = temp;
        }
        int c = a % b;

        while (c != 0){
            a = b;
            b = c;

            c = a % b;
        }
        return b;
    }

}

