package two.pointers;

public class ReverseWordsInAStringIII {
    public void reverseString(char[] s, int l, int r) {
        int left = l;
        int right = r - 1;
        while (left <= right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            right--;
            left++;
        }
    }


    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 0;
        while (left < chars.length) {
            while (right < chars.length && chars[right] != ' ') {
                right++;
            }
            reverseString(chars, left, right);
            right += 1;
            left = right;
        }
        return String.valueOf(chars);
    }
}
