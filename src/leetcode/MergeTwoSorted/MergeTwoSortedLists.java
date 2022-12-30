package leetcode.MergeTwoSorted;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		int[] l1 = {1,2,4};
		int[] l2 = {1,3,4};
		ListNode listNode1 = createListNode(l1);
		ListNode listNode2 = createListNode(l2);
		
		
		ListNode merge = mergeTwoLists(listNode1, listNode2);
		while(merge != null) {
			System.out.println(merge.val);
			merge = merge.next;
		}
	}
	
	public static ListNode insert(ListNode list, int val) {
		ListNode newNode = new ListNode(val);
		
		ListNode last = list;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		return list;
		
	}
	public static ListNode createListNode(int[] list) {
		ListNode listNode = new ListNode(list[0]);
		for (int i = 1; i < list.length; i++) {
			insert(listNode, list[i]);
		}
		return listNode;
	}
	
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    	ListNode mergeList;
        if (list1 == null) {
        	return list2;
        }
        if (list2 == null) {
        	return list1;
        }
        if (list1.val < list2.val) {
        	mergeList = list1;
        	mergeList.next = mergeTwoLists(list1.next, list2);
        } else {
        	mergeList = list2;
        	mergeList.next = mergeTwoLists(list1, list2.next);
        }
        return mergeList;
    }
}
