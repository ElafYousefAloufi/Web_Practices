<!DOCTYPE html>
<html>
 <head>
  <title>LabActivity5</title>
 </head>
 <body>
 <?php 

 $num1 = 2;
 $num2 = 6;
 
echo '<h1>Exercise 2</h1>'; 
function isPrime($num){
	
	if ($num == 1)
   return 0;

   for ($i = 2; $i <= $num/2; $i++)
   {
      if ($num % $i == 0)
	    return 0;

   }
	  return 1;
   
}


function test($number){
	if (isPrime($number) == 1)
	echo '<p>The number ' . $number . ' is a prime number</p>'; 
else
      echo '<p>The number ' . $number . ' is not a prime number</p>'; 


}

test($num1);
test($num2);

 ?> 
 </body>
</html>
