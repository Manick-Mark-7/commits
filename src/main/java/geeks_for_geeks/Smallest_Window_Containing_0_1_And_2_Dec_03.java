package geeks_for_geeks;

public class Smallest_Window_Containing_0_1_And_2_Dec_03 {
    public int smallestSubstring(String S) {
        int[] freq = new int[3];
        int i=0,n=S.length(),count=0,ans=n+1;

        for(int j=0;j<n;j++)
        {
            char ch1 = S.charAt(j);
            freq[ch1-'0']++;

            if(freq[ch1-'0']==1)
            {
                count++;
            }

            while(i<j && count==3)
            {
                ans = Math.min(j-i+1,ans);
                char ch2 = S.charAt(i++);
                freq[ch2-'0']--;

                if(freq[ch2-'0']==0)
                {
                    count--;
                }
            }
        }

        return ans==n+1?-1:ans;
    }
}
