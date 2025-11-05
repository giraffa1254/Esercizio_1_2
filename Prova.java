package prova;
import java.util.*;

public class Prova {
String nome;
String cognome;
int anni;
int biscotti_comprati;
double prezzo_biscotto=0.2;


public Prova(){}
public Prova(String nome, String cognome, int anni)
{
    this.nome=nome;
    this.cognome=cognome;
    this.anni=anni;
}

public void setBiscotti(int biscotti_comprati)
{
    this.biscotti_comprati=biscotti_comprati;
}
public int getBiscotti()
{
    return biscotti_comprati;
}
public double Somma(int biscotti_comprati)
{
    return biscotti_comprati+prezzo_biscotto;
}
    public void Stampa()
    {
        System.out.println("Nome "+nome+"\tCognome "+ cognome+"\t anni "+anni);
    }
    public static void main(String[] args) {
        Prova p1=new Prova();
        p1.nome="Ale";
        p1.cognome="Mela";
        p1.anni=43;
        p1.Stampa();
        
       Prova p2=new Prova("Zer","Savic",32);
        p2.Stampa();
        
        
    }
    
}

