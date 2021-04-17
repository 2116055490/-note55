package dadad;

/**
 * @author xujinwei
 * @date 2021/4/15 12:56
 */
public class dfg {
    public static void main(String[] args) {
        for(int i =1; i<=9;i++){
            for(int j =1; j<=i; j++){
                System.out.print(j+"*"+i+"="+i*j +"\t");
            }
            System.out.println();
        }
    }
}
