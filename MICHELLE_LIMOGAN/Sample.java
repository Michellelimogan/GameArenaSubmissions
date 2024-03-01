public class Sample
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(1000, 1000);
        Ball a = new Ball(250, 150, 100, "white");

        //ear1
        Ball b = new Ball(210, 120, 50, "white");
        Ball c = new Ball(210, 120, 25, "pink");

        //ear2
        Ball d = new Ball(292, 120, 50, "white");
        Ball e = new Ball(292, 120, 25, "pink");

        //eye1
        Ball f = new Ball(230, 140, 22, "black");
        Ball g = new Ball(228, 138, 5, "white");
        Ball h = new Ball(232, 143, 2, "white");

        //eye2
        Ball i = new Ball(270, 140, 22, "black");
        Ball j = new Ball(268, 138, 5, "white");
        Ball k = new Ball(272, 143, 2, "white");

        //nose
        Ball l = new Ball(250, 155, 10, "black");
        Ball m = new Ball(250.5, 155, 7, "pink");

       
        arena.addBall(b);
        arena.addBall(c);

        arena.addBall(d);
        arena.addBall(e);

        arena.addBall(a);

        arena.addBall(f);
        arena.addBall(g);
        arena.addBall(h);

        arena.addBall(i);
        arena.addBall(j);
        arena.addBall(k);

        arena.addBall(l);
        arena.addBall(m);

        Line n = new Line(700, 800, 700, 900, 2, "yellow");
        arena.addLine(n);

        Line o = new Line(700, 800, 800, 900, 2, "yellow");
        arena.addLine(o);




        while(true)
        {
            arena.pause();
        }
    }
}
