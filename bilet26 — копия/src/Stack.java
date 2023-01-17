class Stack { //создаем класс стек добавляем поля и инициализируем их в конструкторе
    private int mSize;
    private int[] stackArray;
    private int top;

    public Stack(int m) { //- параметр ввода  с клавиатуры
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;
    }
//++топ - действие счетчик
    //  Топ++ счетчик действие

    public void addElement(int element) { //- метод добавления эллемента
        stackArray[++top] = element;
    }

    public int deleteElement() {
        return stackArray[top--];
    }

    public int readTop() { //- метод возвращает значение эллемента в позиции топ
        return stackArray[top];

    }

    public boolean isEmpty() { //- метод проверяет стек на пустоту
        return (top == -1);
    }

    public boolean isFull() { //-метод проверяет не переполнен ли массив и сохраняет стек
        return (top == mSize - 1);
    }


    public static void main(String[] args) { //- реализация удаление и вывод на экран
        Stack mStack = new Stack(10);

        mStack.addElement(79);
        mStack.addElement(59);
        mStack.addElement(35);
        mStack.addElement(24);

        mStack.deleteElement();

        System.out.print("Стек: ");
        while (!mStack.isEmpty()) {
            int value = mStack.deleteElement();//-метод удаления эллемента
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
