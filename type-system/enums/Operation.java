public enum Operation {
    Add,  // Addition
    Sub,  // Subtraction
    Mult, // Multiplication
    Div,  // Division
    ;

    public double apply(double a, double b){
        switch(this){
            case Add:
                return a+b;
            case Sub:
                return a-b;
            case Mult:
                return a * b;
            case Div:
                return a / b;
            default:
            throw new UnsupportedOperationException();
        }

    }

    public static void main(String[] args){
        System.out.println("This is enum!");
        System.out.println(Add.apply(3,2));
    }
}
