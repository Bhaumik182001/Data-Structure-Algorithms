class myStack {
    private int[] stack = new int[100];
    int pointer = 0;

    public void push(int x) {
        if(pointer < 100) stack[pointer++] = x;
    }

    public void pop() {
        if(pointer > 0) stack[--pointer] = 0;
    }

    public int peek() {
        if(pointer > 0 && pointer < 101) return stack[pointer - 1];
        else return pointer;
    }

    public int getSize() {
        return pointer;
    }

    public boolean isEmpty() {
        return pointer == 0;
    }
}
