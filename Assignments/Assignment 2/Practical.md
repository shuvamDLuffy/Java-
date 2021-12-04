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
