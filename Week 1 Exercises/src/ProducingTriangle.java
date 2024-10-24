public class ProducingTriangle {
    public static void main(String[] args){
        int num = 1;
        for(int i = 1; i < 5; i++){
            String s = "";
            for(int j = 1; j <= 4; j++){
                if(i + j <= 4){
                    s += " ";
                }else{
                    s += i + " ";
                }
            }
            System.out.println(s);
        }
    }
}
//   1
//  2 2
// 3 3 3
//4 4 4 4
