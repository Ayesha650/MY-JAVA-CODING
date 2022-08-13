class One{

    void Add(int a, int b){
        System.out.println("Addition ");
        return a+b;
    }
}

class Two extends One{

void Sub(){
    System.out.println("Subtraction ");
    return a-b;
}

void Mul(){
    System.out.println("Multiplication ");
    return a*b;
}

void Div(){
    System.out.println("Division ");
    return a/b;
}
}
class Main{
    public static void main(String[] args){
        One a = new Two();
        a.Add(2,2);
        a.Mul(2,6);
    }
}