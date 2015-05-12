class Employee
{
  String Name;
  byte age;
  int salary;
}
Employee e1=new Employee(name:'aa',age:46 as byte,salary:8000)
Employee e2=new Employee(name:'bb',age:37 as byte,salary:7000)
Employee e3=new Employee(name:'cc',age:26 as byte,salary:1800)
Employee e4=new Employee(name:'dd',age:38 as byte,salary:4200)
Employee e5=new Employee(name:'ee',age:24 as byte,salary:6000)
Employee e6=new Employee(name:'ff',age:32 as byte,salary:3000)
Employee e7=new Employee(name:'gg',age:31 as byte,salary:2500)
Employee e8=new Employee(name:'hh',age:35 as byte,salary:8600)
Employee e9=new Employee(name:'ii',age:25 as byte,salary:4800)
Employee e10=new Employee(name:'jj',age:23 as byte,salary:3500)

List l=[e1,e2,e3,e4,e5,e6,e7,e8,e9,e10]
List l2=l.findAll{Employee e->          
   e.salary<5000
}
l2.each    
{
   println it.name+" "+it.age+" "+it.salary
}