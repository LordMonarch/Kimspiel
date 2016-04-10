/**
 * Beinhaltet alles Textausgaben des Programmes die auf jeden 
 * Fall ausgefuehrt werden (keine Ausnahmentexte)
 * 
 * @author (Rainer Hofmann) 
 * @version (1)
 */
public class Ausgabe{
     /**
     * Zeigt die Spielanleitung an
     * 
     * 
     * 
     */
    public void rules(){
        System.out.println("Gedaechtnistraining fuer eine Person: \n" +
        "Es wird eine Zufallszahl mit zunaechst 2, dann 3 ... bis 10 Stellen angezeigt.\n"+
        "Der Spieler soll sich diese Zahl merken.\n" +
        "Dann wird die Zahl ausgeblendet und der Spieler aufgefordert die gemerkte Zahl einzugeben.\n" +
        "Ist die Eingabe falsch so wird das Spiel beendet.\n" +
        "Ist die Eingabe richtig so darf eine weitere Runde gespielt werden\n" +
        "oder das Spiel wird beendet."
        );
    }
     /**
     * Loescht die Konsoleneingabe indem
     * 100 Leerzeilen eingefuegt werden
     * 
     */
    public void clearScreen(){
        for(int i = 0; i >= 100; i++){
            System.out.println();
        }
    }
    /**
     * Gibt die Nachricht fuer den Gewinner aus
     * @param n die eingegebene Merkzahl
     */
    public void youWin(long n){
        System.out.println("Herzlichen Glueckwundsch " + zahlMitStellen(n) + " war die richtige Wahl.\n" + 
        "Damit hast du das Spiel Gewonnen. Lust auf noch eine Runde?\n" +
        "Druecke ENTER um eine neue Runde zu starten!\n" +
        "Gib irgendwas ein und druecke ENTER um das Spiel zu verlassen!"
        );
    }
    /**
     * Gibt die Nachricht fuer den Verlierer aus
     * @param n die eingegebene Merkzahl
     * @param eingabe die Zahl die zu erraten war 
     */
    public void youLose(long n,long eingabe){
        System.out.println("Schade " + zahlMitStellen(eingabe) + " war leider falsch.\n" +
        "Richtig gewesen waere: " + zahlMitStellen(n) + ".\n" +
        "Damit ist das Spiel vorbei viel Glueck beim naechsten mal!"
        );
    }
    /**
     * Gibt die Merkzahl mit ensprechender Stellenzahl aus
     * in der Form "Merkzahl mit (Stellenzahl) Stellen
     * @param n die eingegebene Merkzahl
     * @return einen String welcher die Merkzahl und die Stellenzahl enthaelt
     */
    public String zahlMitStellen(long n){
        long temp = n;
        for(int stelle = 1; true; stelle++){
            temp /= 10;
            if(temp == 0){return n + " mit (" + stelle + ") Stellen";}
        }
       
    }
}
