class LinkedList {
    ArrayList<Integer> arr;

    public LinkedList() {
        arr = new ArrayList<Integer>();
    }

    public int get(int index) {
        int value = -1;
        if(arr.size() > index )
        {
            value = arr.get(index);
        }
        return value;
    }

    public void insertHead(int val) {
       arr.add(0,val);
    }

    public void insertTail(int val) {
        arr.add(val);
    }

    public boolean remove(int index) {
        boolean removed = false;
        if(arr.size()  > index )
        {
            removed = true;
            arr.remove(index);
        }
        return removed;
    }

    public ArrayList<Integer> getValues() {
        return arr;
    }
}
