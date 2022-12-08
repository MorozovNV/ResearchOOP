package number3.oop;

public class Dog {
    public static int dogsCounter = 0;

    private int paws = 4;
    private int tail = 1;
    private String name = "����������� �����";
    private String breed = "���-��, �����";
    private Size size = Size.����������;
    //private final String[] bazaSize = {"�����","�������","��������"};

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {

      this.size = size;

        /*for (String s : bazaSize) {
            if (s.equals(size)) {
                this.size = size;
                return;
            }
        }System.out.println("����� ������ ���������� �� ��");
    */
    }

    public Dog(){
        dogsCounter++;
        System.out.println("��� ���� ����� � ������� " + "(" + dogsCounter + ")");
    }

    public void bite(){
        if (dogsCounter>=3) System.out.println("������ ��� �������� ����-����");
        else bark();
    }

    public void bark(){
        switch (this.size){
            case ����� -> System.out.println("���-���");
            case ������� -> System.out.println("���-���");
            case �������� -> System.out.println("����, ����");
            default -> System.out.println("������������� ����");
        }
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
