//Overloading invece che upcasting
/*
class Note {
    private int value;
    private Note(int val){ value = val;}
    public static final Note
    MIDDLE_C = new Note(0),
    C_SHARP = new Note(1),
    B_FLAT = new Note(0);
}

class Instrument {
    public void play(Note n){
        System.out.println("Instrument.play()");
    }
}

class Wind extends Instrument{
    public void play(Note n){
        System.out.println("Wind.play()");  
    }
}

class Stringed extends Instrument{
    public void play(Note n){
        System.out.println("Stringed.play()");  
    } 
}

class Brass extends Instrument{
    public void play(Note n){
        System.out.println("Brass.play()");  
    }     
}

public class Music2{
    public static void tune(Wind i){
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Stringed i){
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Brass i){
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args){
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute); // no upcasting
        tune(violin); // no upcasting
        tune(frenchHorn); // no upcasting
    }
}*/