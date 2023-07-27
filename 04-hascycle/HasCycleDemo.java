class HasCycleDemo {
    public static void main(String[] args) {
         ListNode head = createLinkedList(new int[]{1, 2, 3});
         head.next.next.next = head.next;
         boolean has =  hasCycle(head);
         System.out.println(has);
    }
    /* 
       作用: 判断链表是否有环
       方法: 采用 快慢指针的方法，如果慢指针有与快指针相等的情况则说明有环
     */
    public static boolean hasCycle(ListNode head) {

        if(head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast) {
            if(fast == null || fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        // 跳出循环说明慢指针追上了快指针则说明有环
        return true;

    }

    public static ListNode createLinkedList(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode cur = head;
        for (int i = 1; i < nums.length; i++) {
            cur.next = new ListNode(nums[i]);
            cur = cur.next;
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; };
    }
}

