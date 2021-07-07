class example{
    static int sum(int a, int b){
        return a + b;
    }

    public int multiply(int a , int b){
        return a * b;
    }
    public static void main(String[] args) {
        System.out.println(example.sum(10, 20)); // access static member functions
        example ex = new example(); // accesing non static member functions
        System.out.println(ex.multiply(10, 20));
    }
}