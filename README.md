Quiz #2 – List Transformation with Index Mapping

##Package
"oop.q2"

##Description
This Java program demonstrates how to transform two predefined lists into a third list based on index mapping logic.

List1: A list of integers representing offset values.
List2: A list of strings that contains the data pool.
List3: A result list where each element is chosen from List2 based on the index `i + list1[i]`.

The result is only added if the calculated index is valid (within bounds).

##Logic
For each index `i` in `list1`, compute:

```java
list3.add(list2.get(list1.get(i) + i));
