public class MyLinkedList<T> {
   private int numNodes;
   private Node first;
   private class Node{
      private final T value;
      private Node next;
      public Node(T value){
         this.value=value;
      }
      public T getValue() {
         return value;
      }
   }

   private void addElement(int index, T value) {
      if (first==null){
         first=new Node(value);
      }else{
         Node temp=first;
         for (int i = 0; i < index-1; i++) {
            temp=temp.next;
         }
         Node holder=temp.next;
         temp.next=new Node(value);
         temp.next.next=holder;
      }
      numNodes++;
   }
   public void add(int index, T value){
      addElement(index, value);
   }
   public void addLast(T value) {
      addElement(numNodes, value);
   }
   public void addFirst(T value) {
      Node temp=new Node(value);
      temp.next=first;
      first=temp;
   }
   public int getNumNodes() {
      return numNodes;
   }
   public T getNode(int i) {
      if(first==null)return null;
      Node temp=first;
      for (int j = 0; j < i; j++) {
         temp=temp.next;
      }
      return temp.getValue();
   }
   public void printList(){
      Node temp=first;
      for (int i = 0; i < numNodes; i++) {
         System.out.println(temp.getValue());
         temp=temp.next;
      }
   }
}