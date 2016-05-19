/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode listA = headA;
        ListNode listB = headB;
        int lengthA = 0;
        int lengthB = 0;
        //�ñ������ҳ�A��B���ܳ���
        while(listA.next != null){
            lengthA++;
            listA = listA.next;
        }
        while(listB.next != null){
            lengthB++;
            listB = listB.next;
        }
        if(listA != listB){
            return null;
        }
        listA = headA;
        listB = headB;
        int gap = lengthA - lengthB;
        //�ϳ���list����gap���ȣ�Ȼ��һ���ߣ���һ�µ��Ǹ����������
        if(gap >= 0){
            for(int i = 0; i < gap; i++){
                listA = listA.next;
            }
        }else{
            for(int j = 0; j < 0-gap; j++){
                listB = listB.next;
            }
        }
        while(listA != listB){
            listA = listA.next;
            listB = listB.next;
        }
        return listA;
    }
}