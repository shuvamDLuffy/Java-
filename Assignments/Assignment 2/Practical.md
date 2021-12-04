IN java GarbageCollector(gC) program is run sidebyside while run any program which delete the objects which are not being used durig that process.
IN JAVA,you can write applications safely and quickly as you do not have to bother about memory allocation and deallocation.Java has built-in support
for automated Garvage Collection. The garvage Collector is a process that runs in the background and tracks objects in the memory that are not used by any other part of your program.
It will reclaim the space used by these unreferenced objects.
Now that we have fair understanding of Java garbage collection, let’s summarize by answering some of the questions we started the blog with:

Is garbage collection good or bad? Definitely good. But, as the adage goes, too much of anything is a bad thing. So, you need to make sure Java heap memory is properly configured and managed so GC activity is optimized.
When is GC needed? It is needed when there are unreferenced objects to be cleared out. Since it is not a manual activity, the JVM will automatically take care of this for you. From all the information above, you would have understood why GC is needed and when. So, that answers this question.
How to tune garbage collection? There are two common ways to do this:
Keep the number of objects passed to the old generation area to a minimum
Configure the major (or full) GC time to be low
Some critical JVM parameters to configure for right-sizing the JVM’s memory are -Xms, -Xmx, and -NewRatio (ratio of new generation and old generation size)

How to know when GC is not operating as expected? JVM monitoring is key. Make sure to track vital JVM metrics and be alerted when GC activity is deviating from the norm.

In java, garbage means unreferenced objects.

Garbage Collection is process of reclaiming the runtime unused memory automatically. In other words, it is a way to destroy the unused objects.

To do so, we were using free() function in C language and delete() in C++. But, in java it is performed automatically. So, java provides better memory management.

Advantage of Garbage Collection
It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.
How can an object be unreferenced?
There are many ways:

By nulling the reference
By assigning a reference to another
By anonymous object etc.

By assigning a reference to another
By anonymous object etc.
Java Garbage Collection Scenario
1) By nulling a reference:
Employee e=new Employee();  
e=null;  
2) By assigning a reference to another:
Employee e1=new Employee();  
Employee e2=new Employee();  
e1=e2;//now the first object referred by e1 is available for garbage collection  
3) By anonymous object:
new Employee();  
finalize() method
The finalize() method is invoked each time before the object is garbage collected. This method can be used to perform cleanup processing. This method is defined in Object class as:

protected void finalize(){}  
Note: The Garbage collector of JVM collects only those objects that are created by new keyword. So if you have created any object without new, you can use finalize method to perform cleanup processing (destroying remaining objects).
gc() method
The gc() method is used to invoke the garbage collector to perform cleanup processing. The gc() is found in System and Runtime classes.

public static void gc(){}  
Note: Garbage collection is performed by a daemon thread called Garbage Collector(GC). This thread calls the finalize() method before object is garbage collected.
Simple Example of garbage collection in java
public class TestGarbage1{  
 public void finalize(){System.out.println("object is garbage collected");}  
 public static void main(String args[]){  
  TestGarbage1 s1=new TestGarbage1();  
  TestGarbage1 s2=new TestGarbage1();  
  s1=null;  
  s2=null;  
  System.gc();  
 }  
}  
