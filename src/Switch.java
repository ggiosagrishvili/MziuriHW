public class Switch {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("ორშაბათი");
                break;
            case 2:
                System.out.println("სამშაბათი");
                break;
            case 3:
                System.out.println("ოთხშაბათი");
                break;
            case 4:
                System.out.println("ხუთშაბათი");
                break;
            case 5:
                System.out.println("პარასკევი");
                break;
            case 6:
                System.out.println("შაბათი");
                break;
            case 7:
                System.out.println("კვირა");
                break;
            default:
                System.out.println("არასწორი დღე");
        }
    }
}
