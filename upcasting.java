// upcasting.

class Note {
    private int value;
    
    public Note(int val) { value = val; }
    

    
    public static final Note
        MIDDLE_C = new Note(0),
        C_SHARP = new Note(1),
        B_FLAT = new Note(2);
   
}

class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play()");
    }
}

class Wind extends Instrument {
    // Redefine interface method:
    public void play(Note n) {
        System.out.println("Wind.play()");
    }
}

public class upcasting {
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting as Wind extends Instrument
    }
}
    