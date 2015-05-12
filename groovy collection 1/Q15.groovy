class Stack
{
  List l=[];
  int top=-1
  void push(String x)
  {
    top++;
    l.add(x);
    println  x + " pushed"
  }
  void pop()
  {
   if(top>=0)
   {
    println l[top]+" popped"
    l.pop()
    top--
    }
  }
  void top()
  {
     if(top>=0)
     {
     println l.last()
       }
      else 
      println "list is empty" 
  }
}
Stack obj=new Stack();
obj.push("aaa")
obj.push("bbb")
obj.push("ccc");
obj.pop();
obj.top();
obj.pop();
obj.top();
obj.pop();
obj.top();


