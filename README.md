JavaC 1.7 + Operator Overloading
-------------------------------

This is patched version of [JavaC 1.7] for Operator Overloading support.
See examples at src/share/sample/\*.java

See also [java-oo], [lombok-oo].

How to build:

	ant -f make/build.xml

How to test:

	java -jar build/bootstrap/lib/javac.jar -d build sample/*.java
	java -cp build CmpTest # MathTest, etc

### patching Netbeans IDE ###

You can merge this patches to nb-javac (the javac fork for Netbeans IDE) and you will get Java operator overloading in Netbeans IDE natively:

	hg clone https://bitbucket.org/amelentev/javac-oo
	hg clone http://hg.netbeans.org/main-golden/ netbeans
	hg clone http://hg.netbeans.org/main/nb-javac/ netbeans/nb-javac
	hg diff -R javac-oo -r default:oo javac-oo/src/share/classes/ | patch -d netbeans/nb-javac/ -p1
	cd netbeans/

And build netbeans as usual: 

	ant -Dnbjdk.home=<your jdk6 home>

If you want just update nb-javac: 

	ant -f libs.javacimpl/build.xml

This will update your nbbuild/netbeans/java/modules/ext/javac-impl-nb-7.0-b07.jar

[java-oo]: http://bitbucket.org/amelentev/java-oo
[lombok-oo]: http://github.com/amelentev/lombok-oo
[javac 1.7]: http://hg.openjdk.java.net/jdk7/jdk7/langtools/
