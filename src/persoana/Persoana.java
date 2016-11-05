package persoana;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Created by user on 11/4/2016.
 */
public class Persoana {
    private String nume;
    private long telefon;
    private int varsta;
//    private long CNP;
    public void AgendaNume(String nume){
        this.nume=nume;

    }
    public String DaNume(){
        return nume;

    }
    public void AgendaTelefon(Long telefon){

        this.telefon=telefon;
    }
    public Long DaTelefon(){
        return telefon;
    }
    public void AgendaVarsta(int varsta){
        if(varsta>0){
        this.varsta=varsta;
    }}
    public int DaVarsta(){
        return varsta;
    }
    public String toString(){
        return nume+ " "+ telefon + " " + varsta;
    }
//        Persoana(long CNP){
//            this.CNP=CNP;
//        }


}
