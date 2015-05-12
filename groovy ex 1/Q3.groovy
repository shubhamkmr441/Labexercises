class Person {
    String name
    int age
    String address
    String company_name
    String emp_id
    @Override
    String toString() {
         return String.format("${name} is a man aged ${age} who lives at ${address}.\
He works for ${company_name} with employee id ${emp_id} and draws \$\$\$\$\$\$\$ lots of money !!!!.")
    }
}
Person person =new Person(name:"Sachin", age:24, address:"Delhi", company_name:"Intelligrape", emp_id:12)
println person
