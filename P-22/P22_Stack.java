class Stack{
    String st[] = new String[50];
    int size;
    int top;
    int ctr;
    Stack() {
        top = -1;
        ctr = 0;
    }
    
    Stack(int cap) {
        size = cap;
    }
    // method for push
    void pushname(String n) {
        if (top == size - 1)
            System.out.println("Overflow");
        else {
            top++;
            st[top] = n;
            ctr++;
        }
    }
    //method for pop
    String popname() {
        String v;
        if (top == -1) {
            System.out.println("Underflow");
            return("");
        } else {
            v = st[top];
            top--;
            ctr--;
            return(v);
        }
    }
    
    void display() {
        if (top == -1)
            System.out.println("Underflow");
        else {
            for (int i = top; i > 0; i--)
                System.out.println(st[i]);
            System.out.println("Number of elements in the stack\t" + ctr);
        }
    }
}
