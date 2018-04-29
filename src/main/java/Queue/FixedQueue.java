package Queue;

public class FixedQueue implements ICharQ{
    private char[] q;
    private int putloc, getloc;

    public FixedQueue(int size){
        q = new char[size + 1];
        putloc = getloc = 0;
    }



    @Override
    public void put(char symbol) {
        if(putloc == q.length-1){
            System.out.println("Очередь заполнена ");
            return;
        }
        putloc++;
        q[putloc] = symbol;
    }

    @Override
    public char get() {
        if(putloc == getloc) {
            System.out.println("Очередь пуста");
        }
        getloc++;
        return q[getloc];
    }
}
