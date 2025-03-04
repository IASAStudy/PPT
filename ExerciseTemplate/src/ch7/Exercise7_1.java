package ch7;

public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for(int i=0; i<deck.cards.length; i++){
            System.out.println(deck.cards[i]+", ");
        }
    }
}

class SutdaDeck {
    final int CARD_NUM =20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // Here 7-1
    }

    // Here 7-2
}

class SutdaCard{ // Here 7-14
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1,true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num+(isKwang ? "K":"");
    }
}