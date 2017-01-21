By Apichaya Tiwcharoensakul

The problem of Case one is method testPersonEquals will check only 'name' of
each object and this case it has different name so it will return false which
is correct. And method testObjectEquals will check the address in the memory of
each object which is different so it will return false which is correct answer too.

Case two is similar to Case one, but in Case two it has the same name but
different address in the memory so it will return true and then false while the correct answer should be all true.

In Case three, Person(a) will called a method equals in class Person which check only 'name' of each object. Person(a)'s name is "Cat" also like Student(c), so it will return true while the correct answer should be false because (a) and (c)
are form different class which can't be comparable. Case c.equals(a) is same as
a.equals(c).
