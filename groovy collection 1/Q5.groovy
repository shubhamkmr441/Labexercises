List list1=(1..10)
println list1
list1.collect{
    if(it%2!=0)
  list1.remove(it)
}
print list1;