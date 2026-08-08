package collection.array;

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        //[1,2,0,0,0]
        System.out.println(Arrays.toString(arr));

        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newValue = 3;
        addFirst(newValue, arr);

        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        int index = 2;
        int value = 4;
        addIndex(arr, value, index);
        System.out.println(Arrays.toString(arr));

        System.out.println("배열의 마지막위치에 5추가 O(n)");
        addLast(5, arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void addFirst(int value, int[] arr) {
        //[0]을 바꾸고 0은 1로 1은 2로 그럼,,i+1 = i 고 i는 0부터 4까지
        for(int i = 0; i < arr.length - 1; i++) {
            arr[i + 1] = arr[i];
        }
        arr[0] = value;
    }

    public static void addLast(int value, int[] arr) {
        arr[arr.length - 1] = value;
    }

    private static void addIndex(int[] arr, int newValue, int index) {
        while(true) {
            if (index >= arr.length) {
                System.out.println("다시 입력하세요");
            } else {
                break;
            }
        }

        //3번째칸에 넣고싶으면 [2]를 바꿔야됨.
        for(int i = index - 1; i < arr.length - 1; i++) {
            arr[i + 1] = arr[i];
        }
        arr[index - 1] = newValue;
    }

}
