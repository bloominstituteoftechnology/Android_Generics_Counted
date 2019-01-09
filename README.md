# Android Generics

Create a generic `CountedSet` struct. This will be a key value structure that stores the quantity of each occurrance of each key.

## Set up the project

You are welcome to use Android Studio, IntelliJ, or any other Java IDE. Use whatever tool best works for you.

## Goals

- Add insertion and removal (`insert` and `remove`) of one element at a time.
- Return `0` for any value that is not found.
- Add `count`, returning the number of unique elements in the counted set..

Your implementation should support the following interaction style:

```
CountedSet<String> set = new CountedSet<>();
System.out.println(set.count("test")); // 0
set.insert("test");
set.insert("test");
System.out.println(set.count("test")); // 2
set.remove("test");
set.remove("test");
System.out.println(set.count("test")); //0
```

## Test

1. Run the project and make sure everything works. Create a good suite of tests that check for boundary conditions and many different types.
2. If anything doesn't work the way the above example shows, go back and debug your issues.
3. As always, if you need help, follow the 20-minute rule, then ask your PM.

- 
