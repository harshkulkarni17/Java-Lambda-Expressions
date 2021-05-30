interface Substraction
{
    void subs(int n1 , int n2);
}

class Calc
{
    public void minus(int num1 , int num2) {
    System.out.println("Substraction of " + num1 + " & " + num2 + " : " + (num1-num2));
    }
}

public class InstanceMethodRef {
    public static void main(String[] args) {
        
        //Object Construction of Calci
        Calc calc = new Calc();
        //Refering to non static method
        Substraction refer = calc::minus;
        refer.subs(23 , 24);
    }
}
