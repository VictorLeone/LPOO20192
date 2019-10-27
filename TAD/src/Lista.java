
public class Lista {

    ListNode first;
    ListNode last;
    int size = 0;

    public Lista() {
        first = null;
        last = first;
    }

    public void addNode(int value) {
        if (first == null) {
            first = new ListNode();
            last = first;
            ListNode NewList = new ListNode();
            NewList.setNodeValue(value);
            NewList.setNextNode(null);
            last.setNextNode(NewList);
            last = NewList;
            size++;
        } else {
            ListNode NewList = new ListNode();
            NewList.setNodeValue(value);
            NewList.setNextNode(null);
            last.setNextNode(NewList);
            last = NewList;
            size++;
        }
    }

    public void removeNode(int toDelete) {
        ListNode DeleteThis = first.getNextNode();
        ListNode HoldThis = first;
        while (DeleteThis != null) {
            if (DeleteThis.getNodeValue() == toDelete) {
                if (DeleteThis.getNextNode() == null) {
                    last = HoldThis;
                    last.setNextNode(null);
                    DeleteThis.setNextNode(null);
                    DeleteThis = null;
                    size--;
                } else {
                    HoldThis.setNextNode(DeleteThis.getNextNode());
                    DeleteThis.setNextNode(null);
                    DeleteThis = null;
                     size--;
                    break;
                }
                DeleteThis = DeleteThis.getNextNode();
                HoldThis = HoldThis.getNextNode();
            }
            System.gc();;
        }
    }

    public void printList() {
        ListNode ReadThrough = first.getNextNode();
        while (ReadThrough != null) {
            System.out.println(ReadThrough.getNodeValue());
            ReadThrough = ReadThrough.getNextNode();
        }
    }
}
