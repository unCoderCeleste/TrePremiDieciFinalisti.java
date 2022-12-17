/* Esercizio 2:
si hanno a disposizione tre premi identici da assegnare in un gruppo di dieci finalisti,
ai quali sono stati associati i numeri da 1 a 10.
Scrivere un programma che scelga in modo casuale i numeri dei tre finalisti che riceveranno un premio.
Si faccia attenzione a non ordinare lo stesso numero più volte.
Per esempio, l'estrazione dei finalisti 3, 6, 2 sarebbe valida,
ma quella di 3, 3, 11 no perché il finalista numero 3 compare due volte e
inoltre 11 non è un finalista */
public class TrePremiDieciFinalisti {
    public static void main(String[] args) {
        int primoFin, secFin, terzFin;

        System.out.println("TRE premi per DIECI finalisti\n");
        primoFin= (int) (Math.random()*10) +1;
        System.out.println("Un primo premio per il finalista: " +primoFin);

        do {secFin = (int) (Math.random()*10) + 1;}
        while(secFin==primoFin);
        System.out.println("Un secondo premio per il finalista: " +secFin);

        do{terzFin= (int) (Math.random()*10) +1;}
        while(terzFin==secFin || terzFin==primoFin);
        System.out.println("Un terzo premio per il finalista: " +terzFin);
        System.out.println();

        System.out.println("Usando la struttura DO WHILE:");
    int fin1, fin2, fin3;
    int contatore=0;
        do{
            fin1= (int) (Math.random() *10)+1;
            fin2= (int) (Math.random() *10)+1;
            fin3= (int) (Math.random() *10)+1;
            contatore++;
        }
        while((fin1==fin2) || (fin2==fin3) || (fin1==fin3));
         System.out.println("Premio per il finalista: " +fin1);
         System.out.println("Premio per il finalista: " +fin2);
         System.out.println("Premio per il finalista: " +fin3);
         System.out.println("(Dopo " +contatore+ " iterazioni)");
        }
}


