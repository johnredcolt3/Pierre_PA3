import java.security.SecureRandom;
import java.util.Scanner;
public class Math {
    public static void main(String args[]) {
        SecureRandom rand = new SecureRandom();
        Scanner in = new Scanner(System.in);
        for (; ; ) {
            int level = 0;
            int type = 0;
            double[] num = new double[10];
            double[] mult = new double[10];
            double rand1;
            double rand2;
            int z = 0; //Counter for percent right
            System.out.println("Enter type of arithmetic (1-5): ");
            type = in.nextInt();
            System.out.println("Enter difficulty level (1-4): ");
            level = in.nextInt();
            switch (level) {
                case 1: {
                    rand1 = rand.nextInt(10);
                    rand2 = rand.nextInt(10);
                    for (int x = 0; x < 10; x++) {
                        rand1 = rand.nextInt(10);
                        rand2 = rand.nextInt(10);
                        switch (type) {
                            case 1: { //addition
                                mult[x] = rand1 + rand2;
                                System.out.println("How much is " + rand1 + " plus " + rand2 + " ?");
                                num[x] = in.nextDouble();
                                break;
                            }
                            case 2: { //multiply
                                mult[x] = rand1 * rand2;
                                System.out.println("How much is " + rand1 + " times " + rand2 + " ?");
                                num[x] = in.nextDouble();
                                break;

                            }
                            case 3: { //subtraction
                                mult[x] = rand1 - rand2;
                                System.out.println("How much is " + rand1 + " minus " + rand2 + " ?");
                                num[x] = in.nextDouble();
                                break;

                            }
                            case 4: { //Division
                                mult[x] = rand1 / rand2;
                                System.out.println("How much is " + rand1 + " divided by " + rand2 + " ?");
                                num[x] = in.nextDouble();
                                break;
                            }
                            case 5: { //random
                                int rand5 = rand.nextInt(3) + 1;
                                switch (rand5) {
                                    case 1: {
                                        System.out.println("How much is " + rand1 + " plus " + rand2 + " ?");
                                        num[x] = in.nextDouble();
                                        break;

                                    }
                                    case 2: { //multiply
                                        mult[x] = rand1 * rand2;
                                        System.out.println("How much is " + rand1 + " times " + rand2 + " ?");
                                        num[x] = in.nextDouble();
                                        break;

                                    }
                                    case 3: { //subtraction
                                        mult[x] = rand1 - rand2;
                                        System.out.println("How much is " + rand1 + " minus " + rand2 + " ?");
                                        num[x] = in.nextDouble();
                                        break;

                                    }
                                    case 4: { //Division
                                        mult[x] = rand1 / rand2;
                                        System.out.println("How much is " + rand1 + " divided by " + rand2 + " ?");
                                        num[x] = in.nextDouble();
                                        break;

                                    }

                                }
                                break;
                            }
                        }
                    }
                    for (int y = 0; y < 10; y++) {
                        if (num[y] == mult[y]) {
                            z++;
                        }
                    }

                    if (z < 7.5) {
                        System.out.println("Please ask you teacher for extra help");
                    } else
                        System.out.println("Congratulations, you are ready to go to the next level!");
                    break;
                }

                case 2: {
                    rand1 = rand.nextInt(100);
                    rand2 = rand.nextInt(100);
                    for (int x = 0; x < 10; x++) {
                        rand1 = rand.nextInt(100);
                        rand2 = rand.nextInt(100);
                        switch (type) {
                            case 1: { //addition
                                mult[x] = rand1 + rand2;
                                System.out.println("How much is " + rand1 + " plus " + rand2 + " ?");
                                num[x] = in.nextDouble();
                                break;
                            }
                            case 2: { //multiply
                                mult[x] = rand1 * rand2;
                                System.out.println("How much is " + rand1 + " times " + rand2 + " ?");
                                num[x] = in.nextDouble();
                                break;

                            }
                            case 3: { //subtraction
                                mult[x] = rand1 - rand2;
                                System.out.println("How much is " + rand1 + " minus " + rand2 + " ?");
                                num[x] = in.nextDouble();
                                break;

                            }
                            case 4: { //Division
                                mult[x] = rand1 / rand2;
                                System.out.println("How much is " + rand1 + " divided by " + rand2 + " ?");
                                num[x] = in.nextDouble();
                                break;
                            }
                            case 5: { //random
                                int rand5 = rand.nextInt(3) + 1;
                                switch (rand5) {
                                    case 1: {
                                        System.out.println("How much is " + rand1 + " plus " + rand2 + " ?");
                                        num[x] = in.nextDouble();
                                        break;

                                    }
                                    case 2: { //multiply
                                        mult[x] = rand1 * rand2;
                                        System.out.println("How much is " + rand1 + " times " + rand2 + " ?");
                                        num[x] = in.nextDouble();
                                        break;

                                    }
                                    case 3: { //subtraction
                                        mult[x] = rand1 - rand2;
                                        System.out.println("How much is " + rand1 + " minus " + rand2 + " ?");
                                        num[x] = in.nextDouble();
                                        break;

                                    }
                                    case 4: { //Division
                                        mult[x] = rand1 / rand2;
                                        System.out.println("How much is " + rand1 + " divided by " + rand2 + " ?");
                                        num[x] = in.nextDouble();
                                        break;

                                    }

                                }
                                break;
                            }
                        }
                    }
                    for (int y = 0; y < 10; y++) {
                        if (num[y] == mult[y]) {
                            z++;
                        }
                    }

                    if (z < 7.5) {
                        System.out.println("Please ask you teacher for extra help");
                    } else
                        System.out.println("Congratulations, you are ready to go to the next level!");
                    break;
                }
                case 3: {
                    rand1 = rand.nextInt(1000);
                    rand2 = rand.nextInt(1000);
                    for (int x = 0; x < 10; x++) {
                        rand1 = rand.nextInt(1000);
                        rand2 = rand.nextInt(1000);
                        switch (type) {
                            case 1: { //addition
                                mult[x] = rand1 + rand2;
                                System.out.println("How much is " + rand1 + " plus " + rand2 + " ?");
                                num[x] = in.nextDouble();
                                break;
                            }
                            case 2: { //multiply
                                mult[x] = rand1 * rand2;
                                System.out.println("How much is " + rand1 + " times " + rand2 + " ?");
                                num[x] = in.nextDouble();
                                break;

                            }
                            case 3: { //subtraction
                                mult[x] = rand1 - rand2;
                                System.out.println("How much is " + rand1 + " minus " + rand2 + " ?");
                                num[x] = in.nextDouble();
                                break;

                            }
                            case 4: { //Division
                                mult[x] = rand1 / rand2;
                                System.out.println("How much is " + rand1 + " divided by " + rand2 + " ?");
                                num[x] = in.nextDouble();
                                break;
                            }
                            case 5: { //random
                                int rand5 = rand.nextInt(3) + 1;
                                switch (rand5) {
                                    case 1: {
                                        System.out.println("How much is " + rand1 + " plus " + rand2 + " ?");
                                        num[x] = in.nextDouble();
                                        break;

                                    }
                                    case 2: { //multiply
                                        mult[x] = rand1 * rand2;
                                        System.out.println("How much is " + rand1 + " times " + rand2 + " ?");
                                        num[x] = in.nextDouble();
                                        break;

                                    }
                                    case 3: { //subtraction
                                        mult[x] = rand1 - rand2;
                                        System.out.println("How much is " + rand1 + " minus " + rand2 + " ?");
                                        num[x] = in.nextDouble();
                                        break;

                                    }
                                    case 4: { //Division
                                        mult[x] = rand1 / rand2;
                                        System.out.println("How much is " + rand1 + " divided by " + rand2 + " ?");
                                        num[x] = in.nextDouble();
                                        break;

                                    }

                                }
                                break;
                            }
                        }
                    }
                    for (int y = 0; y < 10; y++) {
                        if (num[y] == mult[y]) {
                            z++;
                        }
                    }

                    if (z < 7.5) {
                        System.out.println("Please ask you teacher for extra help");
                    } else
                        System.out.println("Congratulations, you are ready to go to the next level!");
                    break;
                }
                case 4: {
                    rand1 = rand.nextInt(10000);
                    rand2 = rand.nextInt(10000);
                    for (int x = 0; x < 10; x++) {
                        rand1 = rand.nextInt(10000);
                        rand2 = rand.nextInt(10000);
                        switch (type) {
                            case 1: { //addition
                                mult[x] = rand1 + rand2;
                                System.out.println("How much is " + rand1 + " plus " + rand2 + " ?");
                                num[x] = in.nextDouble();
                                break;
                            }
                            case 2: { //multiply
                                mult[x] = rand1 * rand2;
                                System.out.println("How much is " + rand1 + " times " + rand2 + " ?");
                                num[x] = in.nextDouble();
                                break;

                            }
                            case 3: { //subtraction
                                mult[x] = rand1 - rand2;
                                System.out.println("How much is " + rand1 + " minus " + rand2 + " ?");
                                num[x] = in.nextDouble();
                                break;

                            }
                            case 4: { //Division
                                mult[x] = rand1 / rand2;
                                System.out.println("How much is " + rand1 + " divided by " + rand2 + " ?");
                                num[x] = in.nextDouble();
                                break;
                            }
                            case 5: { //random
                                int rand5 = rand.nextInt(3) + 1;
                                switch (rand5) {
                                    case 1: {
                                        System.out.println("How much is " + rand1 + " plus " + rand2 + " ?");
                                        num[x] = in.nextDouble();
                                        break;

                                    }
                                    case 2: { //multiply
                                        mult[x] = rand1 * rand2;
                                        System.out.println("How much is " + rand1 + " times " + rand2 + " ?");
                                        num[x] = in.nextDouble();
                                        break;

                                    }
                                    case 3: { //subtraction
                                        mult[x] = rand1 - rand2;
                                        System.out.println("How much is " + rand1 + " minus " + rand2 + " ?");
                                        num[x] = in.nextDouble();
                                        break;

                                    }
                                    case 4: { //Division
                                        mult[x] = rand1 / rand2;
                                        System.out.println("How much is " + rand1 + " divided by " + rand2 + " ?");
                                        num[x] = in.nextDouble();
                                        break;

                                    }

                                }
                                break;
                            }
                        }
                    }
                    for (int y = 0; y < 10; y++) {
                        if (num[y] == mult[y]) {
                            z++;
                        }
                    }

                    if (z < 7.5) {
                        System.out.println("Please ask you teacher for extra help");
                    } else
                        System.out.println("Congratulations, you are ready to go to the next level!");
                    break;
                }

            }
        }
    }
}