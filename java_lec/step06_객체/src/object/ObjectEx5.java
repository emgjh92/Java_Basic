package object;
/*
 * 클래스명:Sales
 * -item:String
 * -qty:int
 * -cost:int
 * +getter & setter
 * 
 * +toString():String ==> 출력 문장 만들기
 * +getPrice():int ==> 수량 * 단가를 리턴
 * 
 * --결과
 * 품목 : apple
 * 수량 : 5
 * 단가 : 1200
 * 금액 : 6000원
 * 
 * apple 1200원 짜리  5개 구입하려면 6000원이 필요함 
 */
class Sales{
	private String item;
	private int qty;
	private int cost;
	
	public void setItem(String item) {
		this.item = item;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String getItem() {
		return item;
	}
	public int getQty() {
		return qty;
	}
	public int getCost() {
		return cost;
	}
	public int getPrice() {
		return qty*cost;
	}

	public String toString() {
		 return "품목 : "+item+"\n" + 
				"수량 : "+qty+"\n" + 
				"단가 : "+cost+"\n" + 
				"금액 : "+getPrice()+"원";
	}

}
public class ObjectEx5 {
	
	public static void main(String[] args) {
		Sales sa=new Sales();
		sa.setItem("apple");
		sa.setQty(5);
		sa.setCost(1200);
		
		System.out.println(sa.toString());
		System.out.println(sa.getItem()+" "+sa.getCost()+"원 짜리  "+sa.getQty()+"개를 구입하려면  "+sa.getPrice()+"원이 필요함" );	
	}	
}
