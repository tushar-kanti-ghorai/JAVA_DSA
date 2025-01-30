public class test {
    public static void main(String[] args){
        int[] results = mul(2);
        for(int result:results){
            System.out.println(result);
        }
    }
    static int[] mul(int n){
        int[] results=new int[11];
        for(int i =0;i<=10;i++) {
            results[i]= n * i;

        }
        return results;

    }
}
