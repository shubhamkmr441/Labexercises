List list1=[11,12,13,14]
List list2=[13,14,15]
println list1
println list2
List list3 = list1.intersect(list2)
if(list3)
{
println "common elements are: " + list3
}
else
print "List are Disjoint"
