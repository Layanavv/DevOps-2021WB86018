echo "public class HelloBranchJava { public static void main(String[] args) { System.out.println(\"Version 1 - Java\"); } }" > HelloBranchJava.java
git add HelloBranchJava.java
git commit -m "Add HelloBranchJava version 1"

# Version 2
echo "// Version 2" >> HelloBranchJava.java
git commit -am "Update HelloBranchJava to version 2"
