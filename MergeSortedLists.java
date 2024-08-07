public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode list1 = head1;
        ListNode list2 = head2;

        if(list1 == null && list2 == null) return null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode output = new ListNode(0, null);
        ListNode head = output;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                output.next = list1;
                output = output.next;
                list1 = list1.next;
            } else {
                output.next = list2;
                output = output.next;
                list2 = list2.next;
            }
        }
        if(list1 != null){
            output.next = list1;
        }
        if(list2 != null){
            output.next = list2;
        }
        return head.next;
    }
}