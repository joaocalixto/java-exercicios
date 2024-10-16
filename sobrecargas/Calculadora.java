package sobrecargas;

public class Calculadora {

    public int somar(int a, int b){
        return a + b;
    }

    public double somar(double a, double b){
        return a + b;
    }

    public int somar(int a, int b, int c){
        return a + b + c;
    }

    class Teste{
        // sobre carga de metodos
        public void main(String[] args){
            Calculadora calc = new Calculadora();
            System.out.println(calc.somar(1, 2));
            calc.somar(1.0, 2.0);
        }
    }
}
