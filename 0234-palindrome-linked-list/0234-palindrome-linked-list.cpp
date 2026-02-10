/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        stack<int> stk;

        ListNode* p = head;

        while(p != nullptr){
            stk.push(p->val);
            p = p->next;
        }

        p = head;
        while(p != nullptr){
            if(p->val != stk.top()){
                return false;
            }

            stk.pop();
            p = p->next;
        }
        return true;
    }
};