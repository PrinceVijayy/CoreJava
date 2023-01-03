package programs;

public class _01_romanToInt {
    public int romanToInt(String s) {

        char[] arr = s.toCharArray();
        int[] arr2 = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            int val = 0;
            if (arr[i] == 'I' && i < arr.length - 1 && arr[i + 1] == 'V') {
                val = 4;
                arr2[i] = val;
                i++;
                continue;
            }
            if (arr[i] == 'I' && i < arr.length - 1 && arr[i + 1] == 'X') {
                val = 9;
                arr2[i] = val;
                i++;
                continue;
            }
            if (arr[i] == 'X' && i < arr.length - 1 && arr[i + 1] == 'L') {
                val = 40;
                arr2[i] = val;
                i++;
                continue;
            }
            if (arr[i] == 'X' && i < arr.length - 1 && arr[i + 1] == 'C') {
                val = 90;
                arr2[i] = val;
                i++;
                continue;
            }
            if (arr[i] == 'C' && i < arr.length - 1 && arr[i + 1] == 'D') {
                val = 400;
                arr2[i] = val;
                i++;
                continue;
            }
            if (arr[i] == 'C' && i < arr.length - 1 && arr[i + 1] == 'M') {
                val = 900;
                arr2[i] = val;
                i++;
                continue;
            } else {
                val = switch (arr[i]) {
                    case 'I' -> 1;
                    case 'V' -> 5;
                    case 'X' -> 10;
                    case 'L' -> 50;
                    case 'C' -> 100;
                    case 'D' -> 500;
                    case 'M' -> 1000;
                    default -> val;
                };
            }
            arr2[i] = val;
        }
        int sum = 0;
        for (int i : arr2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        _01_romanToInt obj = new _01_romanToInt();
        System.out.println(obj.romanToInt("MCMXCIV"));
    }

}
