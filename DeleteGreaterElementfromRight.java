public class DeleteGreaterElementfromRight {
    Node compute(Node temp)
    {
        // your code here
        if(temp.next == null) return temp;
        Node connect = compute(temp.next);
        if(temp.data >= connect.data) {
            temp.next = connect;
            return temp;
        }
        return connect;
    }
}