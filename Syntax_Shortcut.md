# ARRAY
- Add Element (End)
```
arr[size] = value;  => TC: O(1) | SC: O(1)
```
- Remove Element (Index)
```
arr[index] = arr[index + 1];  => TC: O(n) | SC: O(1)
```
- Size / Length
```
arr.length;  => TC: O(1) | SC: O(1)
```
- Is Empty
```
arr.length == 0;  => TC: O(1) | SC: O(1)
```
- Access Element
```
arr[index];  => TC: O(1) | SC: O(1)
```
- Sort Array (Ascending)
```
Arrays.sort(arr);  =>TC: O(n log n) | SC: O(log n)
```
- Sort Array (Descending)
```
Arrays.sort(arr, Collections.reverseOrder());  => TC: O(n log n) | SC: O(log n)
```
#
# FUNCTIONS / METHODS
- Function Definition (No Return, No Parameter)
```
void fun() { }  => TC: O(1) | SC: O(1)
```
- Function Call
```
fun();  => TC: O(1) | SC: O(1)
```
- Function with Parameter
```
void fun(int x) { }  => TC: O(1) | SC: O(1)
```
- Function Call with Argument
```
fun(10);  => TC: O(1) | SC: O(1)
```
- Function with Return Type
```
int fun() { return value; }  => TC: O(1) | SC: O(1)
```
- Function Call with Return
```
int ans = fun();  => TC: O(1) | SC: O(1)
```
- Function with Multiple Parameters
```
int sum(int a, int b) { return a + b; }  => TC: O(1) | SC: O(1)
```
- Pass by Value (Java)
```
fun(x);  // copy of value passed  => TC: O(1) | SC: O(1)
```
- Recursive Function
```
fun(n-1);  => TC: Depends on recursion | SC: O(recursion depth)
```
- Base Case (Recursion)
```
if(n == 0) return;  => TC: O(1) | SC: O(1)
```
- Method Overloading
```
fun(int a)
fun(int a, int b)  => TC: O(1) | SC: O(1)
```
- Static Method
```
static void fun() { }  => TC: O(1) | SC: O(1)
```
- Call Static Method
```
ClassName.fun();  => TC: O(1) | SC: O(1)
```
- Non-Static Method
```
void fun() { }  => TC: O(1) | SC: O(1)
```
- Call Non-Static Method
```
obj.fun();  => TC: O(1) | SC: O(1)
```
- Return Statement
```
return value;  => TC: O(1) | SC: O(1)
```
- Void Return
```
return;  => TC: O(1) | SC: O(1)
```
- Main Function
```
public static void main(String[] args)  => TC: O(1) | SC: O(1)
```
#
# ARRAYLIST
- Create ArrayList
```
ArrayList<Integer> list = new ArrayList<>();  => TC: O(1) | SC: O(n)
```
- Add Element (End)
```
list.add(value);  => TC: O(1) amortized | SC: O(1)
```
- Add Element (Index)
```
list.add(index, value);  => TC: O(n) | SC: O(1)
```
- Remove Element (Index)
```
list.remove(index);  => TC: O(n) | SC: O(1)
```
- Remove Element (Value)
```
list.remove(Integer.valueOf(value));  => TC: O(n) | SC: O(1)
```
- Get Element
```
list.get(index);  => TC: O(1) | SC: O(1)
```
- Set / Update Element
```
list.set(index, value);  => TC: O(1) | SC: O(1)
```
- Size
```
list.size();  => TC: O(1) | SC: O(1)
```
- Is Empty
```
list.isEmpty();  => TC: O(1) | SC: O(1)
```
- Contains Element
```
list.contains(value);  => TC: O(n) | SC: O(1)
```
- Clear ArrayList
```
list.clear();  => TC: O(n) | SC: O(1)
```
- Sort (Ascending)
```
Collections.sort(list);  => TC: O(n log n) | SC: O(log n)
```
- Sort (Descending)
```
Collections.sort(list, Collections.reverseOrder());  => TC: O(n log n) | SC: O(log n)
```
- Convert ArrayList to Array
```
list.toArray();  => TC: O(n) | SC: O(n)
```
#
# STACK
- Create Stack
```
Stack st = new Stack();  => TC: O(1) | SC: O(n)
```
- Create Stack (Generic)
```
Stack<Integer> st = new Stack<>();  => TC: O(1) | SC: O(n)
```
- Push Element
```
st.push(value);  => TC: O(1) | SC: O(1)
```
- Pop Element
```
st.pop();  => TC: O(1) | SC: O(1)
```
- Peek / Top Element
```
st.peek(); => TC: O(1) | SC: O(1)
```
- Size
```
st.size(); => TC: O(1) | SC: O(1)
```
- Is Empty
```
st.isEmpty();  => TC: O(1) | SC: O(1)
It returns true or false.
```
- Search Element
```
st.search(value); => TC: O(n) | SC: O(1)
```
- Clear Stack
```
st.clear(); => TC: O(n) | SC: O(1)
resets the stack
```
#
# QUEUE
## 1. Lenear Queue
- Create Queue (LinkedList)
```
Queue<Integer> q = new LinkedList<>();  => TC: O(1) | SC: O(n)
```
- Add / Enqueue
```
q.add(value);  => TC: O(1) | SC: O(1)
```
- Offer (Safe Add)
```
q.offer(value);  => TC: O(1) | SC: O(1)
```
- Remove / Dequeue
```
q.remove();  => TC: O(1) | SC: O(1)
```
- Poll (Safe Remove)
```
q.poll();  => TC: O(1) | SC: O(1)
```
- Peek / Front
```
q.peek();  => TC: O(1) | SC: O(1)
```
- Size
```
q.size();  => TC: O(1) | SC: O(1)
```
- Is Empty
```
q.isEmpty();  => TC: O(1) | SC: O(1)
```
## 2. DEQUE (DOUBLE ENDED QUEUE)
- Create Deque
```
Deque<Integer> dq = new ArrayDeque<>();  => TC: O(1) | SC: O(n)
```
- Add First
```
dq.addFirst(value);  => TC: O(1) | SC: O(1)
```
- Add Last
```
dq.addLast(value);  => TC: O(1) | SC: O(1)
```
- Remove First
```
dq.removeFirst();  => TC: O(1) | SC: O(1)
```
- Remove Last
```
dq.removeLast();  => TC: O(1) | SC: O(1)
```
- Peek First
```
dq.peekFirst();  => TC: O(1) | SC: O(1)
```
- Peek Last
```
dq.peekLast();  => TC: O(1) | SC: O(1)
```
## 3. PRIORITY QUEUE
- Create Min Heap
```
PriorityQueue<Integer> pq = new PriorityQueue<>();  => TC: O(1) | SC: O(n)
Always children <= parent 
```
- Create Max Heap
```
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  => TC: O(1) | SC: O(n)
Always children >= parent 
```
- Add Element
```
pq.add(value);  => TC: O(log n) | SC: O(1)
```
- Remove Top
```
pq.poll();  => TC: O(log n) | SC: O(1)
```
- Peek Top
```
pq.peek();  => TC: O(1) | SC: O(1)
```
- Size
```
pq.size();  => TC: O(1) | SC: O(1)
```
- Is Empty
```
pq.isEmpty();  => TC: O(1) | SC: O(1)
```
## 4. CIRCULAR QUEUE (ARRAY)
- Create Circular Queue
```
int[] cq = new int[n];  => TC: O(1) | SC: O(n)
```
- Enqueue
```
rear = (rear + 1) % n;  => TC: O(1) | SC: O(1)
```
- Dequeue
```
front = (front + 1) % n;  => TC: O(1) | SC: O(1)
```
- Is Full
```
(rear + 1) % n == front;  => TC: O(1) | SC: O(1)
```
- Is Empty
```
front == -1;  => TC: O(1) | SC: O(1)
```
#
# Linked List
## 1. SINGLY LINKED LIST
- Create Node
```
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}  => TC: O(1) | SC: O(1)
```
- Add at Beginning
```
newNode.next = head;  => TC: O(1) | SC: O(1)
```
- Add at End
```
tail.next = newNode;  => TC: O(1) | SC: O(1)
```
- Delete First
```
head = head.next;  => TC: O(1) | SC: O(1)
```
- Access Element
```
curr = curr.next;  => TC: O(n) | SC: O(1)
```
## 2. DOUBLY LINKED LIST
- Create Node
```
class DNode {
    int data;
    DNode prev, next;
    DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}  => TC: O(1) | SC: O(1)
```
- Add at Beginning
```
newNode.next = head;
head.prev = newNode;  => TC: O(1) | SC: O(1)
```
- Delete Last
```
tail = tail.prev;
tail.next = null;  => TC: O(1) | SC: O(1)
```
## 3. CIRCULAR SINGLY LINKED LIST
- Create Node
```
class CNode {
    int data;
    CNode next;
    CNode(int data) {
        this.data = data;
        this.next = this;
    }
}  => TC: O(1) | SC: O(1)
```
- Insert Node
```
tail.next = newNode;
newNode.next = head;  => TC: O(1) | SC: O(1)
```
- Delete Node
```
head = head.next;
tail.next = head;  => TC: O(1) | SC: O(1)
```
## 4. CIRCULAR DOUBLY LINKED LIST
- Create Node
```
class CDNode {
    int data;
    CDNode prev, next;
    CDNode(int data) {
        this.data = data;
        this.prev = this;
        this.next = this;
    }
}  => TC: O(1) | SC: O(1)
```
- Insert Node
```
newNode.next = head;
newNode.prev = tail;  => TC: O(1) | SC: O(1)
```
- Delete Node
```
head = head.next;
head.prev = tail;  => TC: O(1) | SC: O(1)
```
## 5. LINKED LIST USING JCF
- Create LinkedList
```
LinkedList<Integer> ll = new LinkedList<>();  => TC: O(1) | SC: O(n)
```
- Add First
```
ll.addFirst(value);  => TC: O(1) | SC: O(1)
```
- Add Last
```
ll.addLast(value);  => TC: O(1) | SC: O(1)
```
- Remove First
```
ll.removeFirst();  => TC: O(1) | SC: O(1)
```
- Remove Last
```
ll.removeLast();  => TC: O(1) | SC: O(1)
```
- Get Element
```
ll.get(index);  => TC: O(n) | SC: O(1)
```
- Set Element
```
ll.set(index, value);  => TC: O(n) | SC: O(1)
```
- Size
```
ll.size();  => TC: O(1) | SC: O(1)
```
- Is Empty
```
ll.isEmpty();  => TC: O(1) | SC: O(1)
```
- Clear
```
ll.clear();  => TC: O(n) | SC: O(1)
```
#
# DIVIDE & CONQUER

- Definition
```
Divide problem into subproblems → solve recursively → combine result
T(n) = aT(n/b) + f(n)
```

### BINARY SEARCH (DIVIDE & CONQUER)
```
- Divide Step
mid = (low + high) / 2;  => TC: O(1) | SC: O(1)

- Recursive Search
search left or right half  => TC: O(log n) | SC: O(log n)

- Overall Complexity
Binary Search  => TC: O(log n) | SC: O(1) (iterative)
Binary Search  => TC: O(log n) | SC: O(log n) (recursive)
```
### MERGE SORT
```
- Divide
split array into two halves  => TC: O(log n) | SC: O(log n)

- Conquer (Merge)
merge two sorted arrays  => TC: O(n) | SC: O(n)

- Overall
Merge Sort  => TC: O(n log n) | SC: O(n)
```
### QUICK SORT
```
- Divide (Partition)
choose pivot & partition array  => TC: O(n) | SC: O(1)

- Best Case
balanced partition  => TC: O(n log n) | SC: O(log n)

- Worst Case
already sorted array  => TC: O(n^2) | SC: O(log n)
```
### MAXIMUM & MINIMUM IN ARRAY
```
- Divide
split array into two halves

- Conquer
compare max & min of both halves

- Overall
Find Max & Min  => TC: O(n) | SC: O(log n)
```
### POWER (x^n) USING DIVIDE & CONQUER
```
- Divide
power(x, n/2)

- Conquer
result = half * half

- Overall
Power Calculation  => TC: O(log n) | SC: O(log n)
```
### MASTER THEOREM (IMPORTANT)
```
- General Form
T(n) = aT(n/b) + f(n)

- Case 1
f(n) < n^(log_b a)  => TC: O(n^(log_b a))

- Case 2
f(n) = n^(log_b a)  => TC: O(n^(log_b a) * log n)

- Case 3
f(n) > n^(log_b a)  => TC: O(f(n))
```
#
