package DataStructureAndAlgorithms.LinkedList;

public class interviewsQuestions {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

    }

    public static class LinkedList {
        ListNode reverse(ListNode head) {
            if (head.next == null) return head;
            ListNode node = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return node;
        }

        ListNode removeDuplicate(ListNode head){
            if(head == null) return head;
            ListNode temp = head;
            while(temp != null && temp.next != null){
                if(temp.val != temp.next.val){
                    temp = temp.next;
                } else{
                    temp.next = temp.next.next;
                }
            }
            return head;
        }

        ListNode reverseIterative(ListNode head) {
            ListNode prev = null, after = null, current = head;
            while (current != null) {
                after = current.next;
                current.next = prev;
                prev = current;
                current = after;
            }
            return prev;
        }

            boolean isPalindrome(ListNode head) {
            ListNode fast = head, slow = head;
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            ListNode temp = reverseIterative(slow.next);
            slow.next = temp;
            ListNode p1 = head;
            ListNode p2 = slow.next;
            while (p2 != null) {
                if (p1.val != p2.val) return false;
                p1 = p1.next;
                p2 = p2.next;
            }
            return true;
        }

        void print(ListNode a) {
            if (a == null) return;
            System.out.println(a.val);
            print(a.next);
            return;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(20);
        ListNode e = new ListNode(10);
        //ListNode f = new ListNode(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // e.next = f;
        System.out.println(ll.isPalindrome(a));
    }
}
