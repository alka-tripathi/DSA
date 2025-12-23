class Solution {
    public static int answer;

    public static void solution(int idx, int[] cookies, int[] children, int k) {

        if (idx == cookies.length) {
            int maxvalue = Integer.MIN_VALUE;
            for (int i = 0; i < k; i++) {
                maxvalue = Math.max(maxvalue, children[i]);
            }
            answer = Math.min(answer, maxvalue);
            return;
        }

        // assign cookies[idx] to each child
        for (int j = 0; j < k; j++) {
            children[j] += cookies[idx];

           
                solution(idx + 1, cookies, children, k);
            

            children[j] -= cookies[idx];

        }
    }

    public int distributeCookies(int[] cookies, int k) {
        answer = Integer.MAX_VALUE;

        // optimization
        Arrays.sort(cookies);
        reverse(cookies);

        int[] children = new int[k];
        solution(0, cookies, children, k);
        return answer;
    }

    private static void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}
