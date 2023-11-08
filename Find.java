interface Calculator{
    double add(double num1, double num2);
}

class Find implements Calculator {
    public double add(double num1, double num2){
         return num1 + num2;
    }
}
class Multiplication extends Find{
    public int multiply(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        Find F = new Find();
        Multiplication M = new Multiplication();
       double answer1 = F.add(5,3);
       int answer2 = M.multiply(10,5);

       System.out.println("Addition of two numbers is: " + answer1);
       System.out.println("Multiplication of two numbers is: " + answer2);
    }
}



