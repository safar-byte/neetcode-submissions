
class DynamicArray {
    int currentCapacity = 0;
    int[] array;
    int currentLength = 0;

    public DynamicArray(int capacity) {
        this.currentCapacity = capacity;
        if (this.currentCapacity > 0) {
            array = new int[this.currentCapacity];
        }
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if (getSize() == this.currentCapacity) {
            resize();
        }
        this.array[currentLength] = n;
        this.currentLength++;
    }

    public int popback() {
        this.currentLength--;
        int popedElement = this.array[this.currentLength];
        return popedElement;
    }

    private void resize() {
        this.currentCapacity = 2 * this.currentCapacity;
        int[] newArray = new int[this.currentCapacity];
        for(int i = 0 ; i < currentLength; i++){
            newArray[i] = array[i];
        }
        this.array = newArray;
    }

    public int getSize() {
        return this.currentLength;
    }

    public int getCapacity() {
        return this.currentCapacity;
    }
}
