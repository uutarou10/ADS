
public class BinarySearch {

    // 最初に呼ばれる関数
    public static void main(String[] args) {
        int n = 100;		// 配列のサイズ
        int[] D = new int[n];	// 配列の生成
        // 配列の初期化 (値を格納)
        for (int i = 0; i < n; i++) {
            D[i] = 2 * i;
        }

        // 探索
        int x, r;
        r = binarySearch(D, n, 99);
        System.out.println("binarySearch(99) = " + r);
        r = binarySearch(D, n, 100);
        System.out.println("binarySearch(100) = " + r);
        r = binarySearch(D, n, 101);
        System.out.println("binarySearch(101) = " + r);
        r = binarySearch(D, n, 102);
        System.out.println("binarySearch(102) = " + r);
    }

    // サイズ n の配列 D において値 x を「二分探索」で探す。
    // 見つかったらそのインデックスを返す。なかったら -1 を返す。
    public static int binarySearch(int[] D, int n, int x) {
        // !!#
        // サイズ n の配列 D に対して、値 x を「二分探索」するアルゴリズムを実装せよ。
        // ただし、値が見つかったら、そのインデックスを返す。なかったら -1 を返す。
        int left = 0;
        int right = n - 1;
        int mid = (right + left) / 2;

        while (left < right) {
            if (D[mid] == x) {
                return mid;
            } else if (D[mid] < x) {
                //探索範囲を右側に
                left = mid + 1;
            } else {
                //探索範囲を左側に
                right = mid - 1;
            }
            mid = (right + left) / 2;
        }

        if (D[mid] == x) {
            return mid;
        } else {
            return -1;
        }
    }
}
