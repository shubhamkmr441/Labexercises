String str="this is a simple string to check"
def n='s'
def count=0;
str.each{
    if(it==n)
    count++
}
println "number of Occurences of ${n}= ${count}"

