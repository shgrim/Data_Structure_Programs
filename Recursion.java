package Programs;

//A Function That Calls Itself.

public class Recursion {
    public static void main(String[] args) {
        int n=1;
        prints(n);
    }
    static void prints(int n)
    {
        if(n>5) {
            return;
        }
        System.out.println(n);
        //this is last function call
        //it is called as tail recursion
        prints(n+1);
    }
}
/* For recursion see:
   * If you can break down larger problems into smaller problems.
   * Write the recurrence relation.
   * Draw recursive tree or other recurrence method.
   * About the tree:
   *     See the flow of function,how they are getting in stack.
   *     Identify and focus on left tree calls and right tree calls.
   *     Draw the tree and pointer again and again using paper and pen
   *     Use debugger to see the flow.
   * See how values are returned at each step.
   * See where two function call will come out. In the end you will come out of main function.
 */

/*
   *Variables: 1.Arguments 2.Return Type 3.Body of the function
 */

/*
  Types of recurrence relation:
  Linear relation:like fibonacci number
  Divide and conquer recurrence relation:Like Binary search
 */