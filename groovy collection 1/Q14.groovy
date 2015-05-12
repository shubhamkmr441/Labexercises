List l=(1..100)
l.each({
   if(it%3==0)
   print " " + "Fizz"
   else  if(it%5==0)
   print " " + "Buzz"
   else if(it%15==0)
   print " " + "FizzBuzz"
   else
   print " "+it
}) 
