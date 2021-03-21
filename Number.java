import java.util.*;
class Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t, tot;
        int a[],b[];
		int i,j,sum=0;
        t=sc.nextInt();
        
		for(i=1;i<=t;i++){
            a[i]=sc.nextInt();
            b[j]=sc.nextInt();
        }
		for(i=1;i<=t;i++){
			j=1;
			sum=a[i]+a[j];
			System.out.println(sum);
			j++;
		}
	    tot=sum;
	    System.out.println(tot);
    }
}
