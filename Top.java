// 13707293
// robertjohnhill1@gmail.com

import java.util.ArrayList;
import java.util.Collections;


public class Top implements Sequence
{
    ArrayList<String> storage;

    private Top() {
        this.storage = new ArrayList<String>();
    }

    @Override
    public void push(String st) {
        Boolean lower = false;
        Boolean stSame = false;


        for (String i : this.storage){
            if (i == st){
                stSame = true;
            }
        }

        if (this.storage.size() < 3){

                if (stSame == false){
                    this.storage.add(st);
                }
        }

        else {

            for (String i : this.storage) {
                if (st.compareTo(i) < 0) {
                    lower = true;
                }
            }

            //finds highest value string to be replaced by the new lower string
            if (lower == true & stSame == false) {
                String moveOut = "";
                Boolean first = true;
                for (String i : this.storage) {
                    if (first == true) {
                        moveOut = i;
                        first = false;
                    } else {
                        if (i.compareTo(moveOut) >= 0) {
                            moveOut = i;
                        }
                    }
                }
                this.storage.remove(moveOut);
                this.storage.add(st);
            }
        }

        Collections.sort(this.storage);

    }

    @Override
    public ArrayList<String> getTopThree() {
        return this.storage;
    }

    @Override
    public void reset() {
        this.storage = new ArrayList<String>();

    }

    public static void main(String[] args) {

    }
}