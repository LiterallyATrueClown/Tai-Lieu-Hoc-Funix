// import các thư viện cần thiết vào
import java.util.Scanner;
import java.util.Random;

public class LuckyNumber {
    // Khai báo biến
    private static int totalGames = 0;
    private static int totalGuesses = 0;
    private static int bestGame = Integer.MAX_VALUE;

    // Khai báo maximum là hằng số
    private static final int maximum = 100;

    public static void main(String[] args) {
        play();
        report();
    }

    // Hàm thực hiện trò chơi
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String answer;

        do {
            totalGames++;
            // Dùng hàm random() để sinh ra số ngẫu nhiên theo giá trị maximum
            int luckyNumber = random.nextInt(maximum + 1);
            int x = 0;
            boolean guessedCorrectly = false;

            System.out.println("Trò chơi Đoán Số May Mắn");
            System.out.println("Hãy đoán số từ 0 đến " + maximum);

            do {
                System.out.print("Nhập số dự đoán của bạn: ");
                int guess = scanner.nextInt();
                x++;
                // Kiểm tra độ chênh để đưa ra thông báo phù hợp cho người chơi
                if (guess > luckyNumber) {
                    System.out.println("Số may mắn nhỏ hơn số dự đoán của bạn.");
                } else if (guess < luckyNumber) {
                    System.out.println("Số may mắn lớn hơn số dự đoán của bạn.");
                } else {
                    // Dùng lệnh if để kiểm tra xem số người dùng nhập vào có trùng với số lucky hay không
                    System.out.println("Chúc mừng! Bạn đã đoán đúng số may mắn sau " + x + " lần đoán.");
                    guessedCorrectly = true;
                }
            } while (!guessedCorrectly);

            totalGuesses += x;
            bestGame = Math.min(bestGame, x);
            // Hỏi xem người chơi có muốn tiếp tuc không
            System.out.print("Bạn có muốn tiếp tục chơi không? (y/n): ");
            answer = scanner.next().toLowerCase();
        } while (answer.equals("y") || answer.equals("yes"));

        scanner.close();
    }

    // Hàm hiển thị báo cáo thông tin
    public static void report() {
        System.out.println("Kết quả tổng quát của trò chơi");
        System.out.println("Tổng số lần chơi: " + totalGames);
        System.out.println("Tổng số lần dự đoán: " + totalGuesses);
        System.out.println("Số lần dự đoán trung bình mỗi lượt: " + (double) totalGuesses / totalGames);
        System.out.println("Trò chơi hay nhất: " + bestGame + " lần dự đoán");
    }
}
