import java.util.*;
class temp{
	public static void main(String[] args){
	double sum=0;
		for(int i=1;i<100000;i++)
			sum=sum+i;
	System.out.printf("%f",sum);
	}
}
>>> odd = [if value%2 != 0 for value in range(1,11)]
SyntaxError: invalid syntax
>>> 
>>> 
>>> odd = [value if value%2 != 0 for value in range(1,11)]
SyntaxError: invalid syntax
>>> odd = [if for value in range(1,11) value%2 != 0 ]
SyntaxError: invalid syntax
>>> odd = [value for value in range(1,11) if value%2 != 0]
>>> odd
[1, 3, 5, 7, 9]
>>> 
>>> odd = [value for value in range(1,25) if value%2 != 0]
>>> odd
[1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23]
>>> threes = [value**3 for value in range(1,31)]
>>> threes
[1, 8, 27, 64, 125, 216, 343, 512, 729, 1000, 1331, 1728, 2197, 2744, 3375, 4096, 4913, 5832, 6859, 8000, 9261, 10648, 12167, 13824, 15625, 17576, 19683, 21952, 24389, 27000]
>>> threes = [value**3 for value in range(1,10)]
>>> threes
[1, 8, 27, 64, 125, 216, 343, 512, 729]
>>> [value**3 for value in range(1,5)]
[1, 8, 27, 64]
>>> range(1,20)
range(1, 20)
>>> list(range(1,20))
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
>>> list(range(1,20,2))
[1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
>>> list(range(1,25,2))
[1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23]
>>> odd
[1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23]
>>> list(range(1,25,2)**3)
Traceback (most recent call last):
  File "<pyshell#30>", line 1, in <module>
    list(range(1,25,2)**3)
TypeError: unsupported operand type(s) for ** or pow(): 'range' and 'int'
>>> a=[]
>>> a.append(value**3 for value in range(1,25,2))
>>> a
[<generator object <genexpr> at 0x03834958>]
>>> a=[]
>>> a
[]
>>> a=[value**3 for value in range(1,25,2)]
>>> a
[1, 27, 125, 343, 729, 1331, 2197, 3375, 4913, 6859, 9261, 12167]
>>> a=[value**3 for value in range(1,25)]
>>> [value**3 for value in range(1,25)]
[1, 8, 27, 64, 125, 216, 343, 512, 729, 1000, 1331, 1728, 2197, 2744, 3375, 4096, 4913, 5832, 6859, 8000, 9261, 10648, 12167, 13824]
>>> 