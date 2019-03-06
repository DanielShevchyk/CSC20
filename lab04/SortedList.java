/*
Lab 04
Daniel Shevchyk
CSC 20 
*/
public class SortedList {
	SortedList() {
		System.out.println("Daniel Shevchyk Class");
	}
	private DLNode Head, Tail;

	public void insert(double n){
   DLNode cur = Head;
	DLNode prv = null;
	while(cur!=null && cur.data<=n) { prv = cur;  cur = cur.Next;}
   DLNode tmp = new DLNode(); tmp.data = n;
	if (prv!=null) prv.Next = tmp; else Head = tmp;
	tmp.Prev = prv;
	tmp.Next = cur;
	if (cur!=null) cur.Prev = tmp; else Tail = tmp;

	}

	public void listAscending() {
   DLNode cur = Head;
   int counter = 0;
	while(cur!=null) {System.out.printf("%f",cur.data); cur = cur.Next;
   counter++;
   if(counter==5){ System.out.println();
   counter=0;
   }
   }
   
	}
	public void listDescending() {
   DLNode cur = Tail;
   int counter = 0;
	while(cur!=null) {System.out.printf("%f",cur.data); cur = cur.Prev;
   counter++;
   if(counter==5) {System.out.println();
   counter=0;
   }
	}

}
}
