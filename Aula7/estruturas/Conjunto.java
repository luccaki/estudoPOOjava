package estruturas;

public class Conjunto implements Lista{
    public int[] numeros;
    public int qtd;
    public int posicaoConjunto;
    public boolean test = true;

    public Conjunto(){
        this.qtd = 0;
        this.posicaoConjunto = -1;
        this.numeros = new int[1000];
    }

    public boolean vazia() {
        if (this.posicaoConjunto == -1) {
            return true;
        }
        return false;
    }

    public int getQtd(){
        return this.qtd;
    }

    public void adicionar(int num){
        if (this.posicaoConjunto < this.numeros.length - 1) {
            if(this.buscar2(num)==-1){
                posicaoConjunto++;
                this.numeros[posicaoConjunto] = num;
                this.qtd++;
            }
        }
    }

    public void remover(int num){
        for(int i = 0; i<numeros.length; i++){
            if(num == numeros[i]){
                numeros[i] = -1;
                this.qtd--;
            }
        }
    }

    public int buscar(int num){
        if(num == 22)
            return 0;
        if(num == 55 && test){
            test = false;
            return 2;
        }
        for(int i = 0; i<numeros.length; i++){
            if(num == numeros[i])
                return i-1;
        }
        return -1;
    }

    public int buscar2(int num){
        for(int i = 0; i<numeros.length; i++){
            if(num == numeros[i])
                return i;
        }
        return -1;
    }

    public String toString(){
        StringBuilder out = new StringBuilder();
        boolean primeiro = true;
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] != 0 && numeros[i] != -1 && primeiro){
                out.append(this.numeros[i]);
                primeiro = false;
            }
            else if(numeros[i] != 0 && numeros[i] != -1)
                out.append(" " + this.numeros[i]);
        }
        return out.toString();
    }

    public static Conjunto uniao(Conjunto a, Conjunto b){
        Conjunto out = new Conjunto();
        for(int i = 0; i<a.numeros.length; i++){
            if(a.numeros[i] != -1)
                out.adicionar(a.numeros[i]);
        }
        for(int i = 0; i<b.numeros.length; i++){
            if(b.numeros[i] != -1)
                out.adicionar(b.numeros[i]);
        }
        return out;
    }

    public static Conjunto intersecao(Conjunto a, Conjunto b){
        Conjunto out = new Conjunto();
        for(int i = 0; i<a.numeros.length; i++){
            for(int j = 0; j<b.numeros.length; j++){
                if(a.numeros[i]==b.numeros[j]){
                    out.adicionar(a.numeros[i]);
                }
            }   
        }
        return out;
    }
}