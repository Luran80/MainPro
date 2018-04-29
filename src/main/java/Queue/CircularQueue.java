package Queue;

public class CircularQueue implements ICharQ {
    private char[] q;
    private int putloc, getloc;

    CircularQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }


    @Override
    public void put(char symbol) {
        if (putloc + 1 == getloc ||
                ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        if (putloc == q.length) putloc = 0; // перейти в начало массива
        q[putloc] = symbol;

    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        if (getloc == q.length) getloc = 0; // вернуться в начало очереди
        return q[getloc];


    }
}
