class Person {
    String name
    int age
    String address
}
Person p =new Person(name:"SHUBHAM", age:24, address:"Noida")
println "Using dot operator: "
println (p.name + " " + p.age + " " + p.address)
println "Using get function: "
println (p.getName() + " " + p.getAge() + " " + p.getAddress())

