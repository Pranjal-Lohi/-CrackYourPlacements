public class BinaryLLToDigit {
    public int getDecimalValue(ListNode head) {
        ListNode mover = head;
        int num = 0;
        int size = 0;

        while(mover != null) {
            size++;
            mover = mover.next;
        }
        ListNode temp_node = head;
        for(int i=size-1; i>=0; i--) {
            num += (temp_node.val) * (int)Math.pow(2,i);
            temp_node = temp_node.next;
        }
        return num;
    }
}
