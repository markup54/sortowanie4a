import java.util.Scanner;

public class Sortowanie {
    public int[] tablica = new int[10];
    void wczytajTablice(){
        System.out.println("Podaj 10 elementów tablicy");
        Scanner klawiatura = new Scanner(System.in);
        for(int i = 0 ;i <tablica.length;i++){
            System.out.println("podaj element "+i);
            tablica[i] = klawiatura.nextInt();
        }
    }
    void wypiszTablice(){
        System.out.println("tablica:");
        for(int i =0 ; i<tablica.length;i++){
            System.out.print(tablica[i]+" ");
        }
    }
    private int szukajMaksa(int k){
        int indeksSzukany = k;
        int maks = tablica [ k];
        for (int i = k+1;i<tablica.length;i++){
            if(tablica[i]>maks){
                maks =tablica[i];
                indeksSzukany = i;
            }
        }
        return indeksSzukany;
    }
    public void sortujPrzezWybor(){
        for(int i=0;i<tablica.length;i++){
            int szukanyIndeks = szukajMaksa(i);
            int pomoc = tablica[szukanyIndeks];
            tablica[szukanyIndeks] = tablica[i];
            tablica[i]=pomoc;
        }
    }
}
