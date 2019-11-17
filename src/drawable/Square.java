package drawable;

public class Square implements Drawable {


    @Override
    public void draw() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
