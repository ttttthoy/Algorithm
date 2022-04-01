package chap04;

public class IntStackX {
    private int max;
    private int ptrA;
    private int ptrB;
    private int[] stk;

    public enum AorB {
        StackA, StackB
    };

    public IntStackX(int capacity) {
        ptrA = 0;
        ptrB = capacity - 1;
        max = capacity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(AorB sw, int x) throws OverflowIntStackX2Exception {
        if (ptrA >= ptrB + 1) // 스택이 가득 참
            throw new OverflowIntStackX2Exception();
        switch (sw) {
            case StackA:
                stk[ptrA++] = x;
                break;
            case StackB:
                stk[ptrB--] = x;
                break;
        }
        return x;
    }

    // 스택에서 데이터를 팝
    public int pop(AorB sw) throws EmptyIntStackX2Exception {
        int x = 0;
        switch (sw) {
            case StackA:
                if (ptrA <= 0)
                    throw new EmptyIntStackX2Exception();
                x = stk[--ptrA];
                break;
            case StackB:
                if (ptrB >= max - 1)
                    throw new EmptyIntStackX2Exception();
                x = stk[++ptrB];
                break;
        }
        return x;
    }

    // 스택에서 데이터를 피크
    public int peek(AorB sw) throws EmptyIntStackX2Exception {
        int x = 0;
        switch (sw) {
            case StackA:
                if (ptrA <= 0)
                    throw new EmptyIntStackX2Exception();
                x = stk[ptrA - 1];
                break;
            case StackB:
                if (ptrB >= max - 1)
                    throw new EmptyIntStackX2Exception();
                x = stk[ptrB + 1];
                break;
        }
        return x;
    }

}
