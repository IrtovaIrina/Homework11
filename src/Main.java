public class Main {
    public static void main(String[] args) {
        checkLeapYear(2004);
        checkPhoneVersion(1,2023);
        trackDeliveryTime(456);
    }
    public static void checkLeapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + "  год — високосный год");
        }
        else{
            System.out.println(year + " год — невисокосный год");
        }

    }
    public static void checkPhoneVersion(int clientOS,int clientDeviceYear){
        if (clientOS == 0){
            if (clientDeviceYear < 2023)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else{
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        else if (clientOS == 1){
            if (clientDeviceYear < 2023)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else{
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

    }
    public static void trackDeliveryTime(int deliveryDistance){
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + 1);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней: " + 2);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: " + 3);
        }
        else{
            System.out.println("Доставка невозможна");
        }
    }

}