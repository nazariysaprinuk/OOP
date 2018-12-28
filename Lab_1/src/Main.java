public class Main {
    public static void main(String[] args) {
                int[] array = {11, 22, 1, 11, 3, 33, 11, 11, 11, 11, 11, 3};
                System.out.println(uniqueCount(array));
            }

            static int uniqueCount(int[] array) {
                int res = 0;
                int count = 0;
                int countUniq = 0;
                for (int i = 0; i < array.length; i++) {
                    countUniq++;
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[j] == array[i]) {
                            count++;
                            break;
                        }
                    }
                }
                return res = countUniq - count;
            }
        }

