List list = [1,2,3,4,5,6,7,8,9,10]
List list1=[]
List list2=[]
list.each {
    if(it%2 == 0) list1.add(it) 
       else list2.add(it)
}
println "Original numbers: " + list
println "Even numbers: " + list1
println "Odd numbers: " + list2
