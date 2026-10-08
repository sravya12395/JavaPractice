package oops;

//interface can extend other interface
public interface Vehicle extends RoadTransport {

    int wheeler = 2;

    void changeGear(int a);
    void speedUp(int a);
    void speedDown(int a);
    void display();
}
