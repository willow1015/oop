package oop;

public class App
{
    public static void main(String[] args) {
        Simulator simulator = Simulator.getInstance();
        Renderer renderer = Renderer.getInstance();

        Rectangle rect1 = new Rectangle.Builder(new Vector2d(0, 0))
            .setSize(new Vector2d(50, 50))
            .build();
        final Rectangle rect2 = new Rectangle.Builder(new Vector2d(150, 150))
            .setSize(new Vector2d(50, 50))
            .build();

        rect2.addOnClickListener(new OnClickListener(){
        
            @Override
            public void Onclick(Vector2d position) {
                rect2.position.add(new Vector2d(10, 10));
                
            }
        });

        final Circle circle1 = new Circle(new Vector2d(100, 100), 25);
        circle1.addOnClickListener(new OnClickListener(){
        
            @Override
            public void Onclick(Vector2d position) {
                circle1.setRadius(circle1.getRadius() + 10);                
            }
        });

        renderer.addRenderable(rect1);
        renderer.addRenderable(rect2);
        renderer.addRenderable(circle1);

        simulator.run();

        /*Shape a = new Circle(new Vector2d(50, 50), 50);
        ((Circle)a).setRadius(1); //형변환*/

    }



    
}
