public class Main {
    public static void main(String[] args) {
        Amazon b=new Amazon();
       System.out.println(b.totalsum(1000));
    }
}

class Amazon{
   gpay a=new gpay();

    public float totalsum(int amt){
        float totalsum=amt+(amt*a.getTxncharge());
        return totalsum;
    }

}
class gpay{
   private float txncharge=0.05f;
    public float getTxncharge(){
        return txncharge;
    }
    public void Set(float newcharge){
        if(newcharge<0.5f){
            System.out.println("Invalid charge");

        }else{
            txncharge=newcharge;
        }
    }
}