public class Singal{
	/*private static Singal s;
	private Singal(){}
	public static Singal getInstance(){
		if(s==null){
			Singal s=new Singal();//�ȼ���s= new Singal;
		}
		return s;//����ʽ
	}*/
	private static Singal s=new Singal();
	private Singal(){}
	public static Singal getInstance(){
		return s;//����ʽ
	}
} 
