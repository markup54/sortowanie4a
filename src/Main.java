import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ArrayList<Integer> wylosowane = wylosowanieListy();
        System.out.println(wylosowane);
        ArrayList<Integer> posortowane = sortowanieBabelkowe(wylosowane);
        System.out.println(posortowane);
    }
    public static ArrayList<Integer> wylosowanieListy(){
        ArrayList<Integer> wylosowana = new ArrayList<>();
        for (int i=0;i<10;i++){
            wylosowana.add((int)(Math.random()*100+1));
        }
        return wylosowana;
    }
    public static ArrayList<Integer> sortowanieBabelkowe (ArrayList<Integer> lista){
        boolean zamiana = true;
        while(zamiana){
            zamiana = false;
            for(int i=0;i<lista.size()-1;i++){
                if(lista.get(i)> lista.get(i+1)){
                    int pomoc = lista.get(i);
                    lista.set(i, lista.get(i+1));
                    lista.set(i+1,pomoc);
                    zamiana =true;
                }
            }
        }
        return lista;
    }

}