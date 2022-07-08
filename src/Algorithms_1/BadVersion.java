package Algorithms_1;

public class BadVersion {
    public int firstBadVersion(int n) {
        long mid = n>>1;
        long start =0 ;
        long end = n;

        while (start!=end){
            if(isBadVersion((int)mid)&&!isBadVersion((int)mid-1)){
                return (int)mid;
            }
            if(!isBadVersion((int)mid)&&isBadVersion((int)mid+1)) {
                return (int)mid+1;
            }
            if(isBadVersion((int)mid)&&isBadVersion((int)mid-1)){
                end = mid;
                mid = (start+end)>>1;
            }
            if(!isBadVersion((int)mid)&&!isBadVersion((int)mid+1)){
                start = mid;
                mid = (start+end)>>1;
            }
        }
        return -1;

    }
    Boolean isBadVersion(long num){
        return num>=2;
    }
    public static void main(String[] args){
      BadVersion BV = new BadVersion();
      System.out.println(BV.firstBadVersion(5));

    }
}
