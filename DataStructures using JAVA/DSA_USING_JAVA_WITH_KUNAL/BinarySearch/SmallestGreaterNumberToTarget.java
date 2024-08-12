//leetcode 744 - easy
public class SmallestGreaterNumberToTarget {
    public static void main(String[] args) {
        char[] letters = {'c','d','j'};
        char target = 'a';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters,char target){
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
