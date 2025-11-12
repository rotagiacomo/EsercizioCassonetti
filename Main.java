public class Main {
    public static void main(String[] args){
        Coordinate minime = new Coordinate(30, -20);
        Coordinate massime = new Coordinate(15,  50);
        Coordinate primoPunto = new Coordinate(20,0);
        Coordinate secondoPunto = new Coordinate(-10, 10);
        System.out.println(primoPunto.isInArea(minime, massime));
        System.out.println(secondoPunto.isInArea(minime, massime));
    }
}
