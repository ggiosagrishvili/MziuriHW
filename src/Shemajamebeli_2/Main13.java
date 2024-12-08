package Shemajamebeli_2;

    interface misalmeba{
        void sayhello();
        void saybye();
    }

    interface modzraoba{
        void jump();
        void run();
    }

    class Human implements misalmeba , modzraoba {

        @Override
        public void sayhello(){
            System.out.println("gamarjoba");
        }

        @Override
        public void saybye(){
            System.out.println("naxcamdis");
        }

        @Override
        public void jump() {
            System.out.println("xtunva");

        }

        @Override
        public void run() {
            System.out.println("sirbili");

        }
    }



public class Main13 {
    public static void main(String[] args) {
        Human human = new Human();
        human.jump();
        human.run();
        human.saybye();
        human.sayhello();
    }
}