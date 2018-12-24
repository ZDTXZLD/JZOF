package List;
import java.util.Stack;
import java.util.Iterator;
/*
 * 实现一个栈以及最大值
 * */
public class ZYone {

   Stack<Integer> st=new Stack<Integer>();
    public void push(int node) {
        st.push(node);
    }
   public void pop() {
    	 st.pop();
    }
    
    public int top() {
    	return st.peek();
    }
    
    public int max() {
        int max=st.peek();
        int tmp=0;
        Iterator<Integer> iterator=st.iterator();
        while(iterator.hasNext()) {
        	tmp=iterator.next();
        	if(max<tmp) {
        		max=tmp;
        	}
        }
        return max;
    }
}
