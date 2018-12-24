package Sort;

public class BubbleSort {

	private static void Bubble(int[] list) {
         boolean needNextPass=true;
		for(int k=1;k<list.length&&needNextPass;k++) {
			needNextPass=false;
			for(int i=0;i<list.length-k;i++) {
				if(list[i]>list[i+1]) {
					int temp=list[i];
					list[i]=list[i+1];
					list[i+1]=temp;
					 needNextPass=true;
				}
			}
		}
	}
	public static void main(String[] args) {
		int list[]= {12,652,23,30,32,6,10,26,-23,-12,356,56};
		Bubble(list);
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}		
	}
	}