import java.util.LinkedList;
import java.util.List;

public class ArrayList {
    private LinkedList<Integer> list;

    public ArrayList() {
        list = new LinkedList<Integer>();
    }

    public void add(Integer o) {
        list.add(o);
    }

    public Object get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public void print(){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.print();
    }
}
