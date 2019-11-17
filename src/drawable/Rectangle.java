package drawable;

public class Rectangle implements Drawable {

    int sideA = 5;
    int sideB = 10;

    @Override
    public void draw() {
        for (int i = 0; i < sideA; i++){
            for (int j = 0; j < sideB; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
