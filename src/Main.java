import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Agency agency = new Agency();
        AgencyServiceImpl a = new AgencyServiceImpl();


        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("выбери дейстиве" +
                        "\n1.добавить агента" +
                        "\n2.вы вод всех агентов" +
                        "\n3.пере имена вать агента" +
                        "\n4.удалить агента" +
                        "\n5.выйти");
                int sample =scanner.nextInt();
                switch (sample){
                    case 1-> {
                        
                    }
                }
            }
        }
    }
}
