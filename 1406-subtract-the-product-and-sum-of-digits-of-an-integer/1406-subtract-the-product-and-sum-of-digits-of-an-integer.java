class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int multi=1;
        while(n>0){
            sum=sum+(n%10);
            multi=multi*(n%10);
            n=n/10;
        }
        return multi-sum;
        }
    }
