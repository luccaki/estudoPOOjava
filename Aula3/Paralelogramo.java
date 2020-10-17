public class Paralelogramo {
    public int Area;
    public String Tipo;
    public Paralelogramo(int tamanhoLadoA){
        Area = tamanhoLadoA * tamanhoLadoA;
        Tipo = "Paralelogramo quadrado";
    }
    public Paralelogramo(int tamanhoLadoA, int tamanhoLadoB){
        if(tamanhoLadoA != tamanhoLadoB){
            Area = tamanhoLadoA * tamanhoLadoB;
            Tipo = "Paralelogramo retangulo";
        }
        else{
            Area = tamanhoLadoA * tamanhoLadoB;
            Tipo = "Paralelogramo quadrado";
        }
    }
    public int getArea(){
        return Area;
    }
    public String getTipo(){
        return Tipo;
    }
}
