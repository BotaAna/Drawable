public class Rectangle implements Drawable {

    int sideA;
    int sideB;

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
