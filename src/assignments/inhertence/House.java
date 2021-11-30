package assignments.inhertence;

public class House {
    public static void main(String[] args) {
        Home lights = new LivingRoom();
        lights.getNoofLights();
       lights=new Kitchen();
        lights.getNoofLights();
        lights= new BedRoom();
        lights.getNoofLights();
    }
}
