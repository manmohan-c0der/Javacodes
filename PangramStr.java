public class PangramStr {
    public static void main(String []args){
        boolean flag=false;
        String str="The quick brown fox jumps over a lazy dog";
        str=str.replace(" ","");
        str=str.toUpperCase();
        char []arr=str.toCharArray();
        int []ar=new int[26];

        for(int i=0; i<arr.length; i++){
            ar[arr[i]-65]++;
        }

        for(int i=0; i<ar.length; i++){
            if(ar[i]==0){
                flag=true;
                break;
            }
        }
        
        if(flag==false){
            System.out.println("The String is Pangram ");
        }
        else{
            System.out.println("The String is not Pangram ");

        }
       

    }
    
}
