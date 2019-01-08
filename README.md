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

## Go Farther

Time allowing, consider adding the following enhancements to your `CountedSet` type:

- Implement `contains` to test whether your set contains at least one of a given item.
- Implement `union` with another set, returning all members and their combined sums. For extra karma, implement a mutating version (change in place) and a non-mutating version (return a copy).
- Implement `intersection` and/or `subtraction` using the same logic. Intersection returns all members and counts appearing in both sets. Subtraction removes all counts found in the second set from the first.
- Implement `isDisjoint`, testing that there's no overlap between elements.
- Conform to `Equatable` and implement `==` to test if two counted sets are the same.

## References

- Swift Generics WWDC 2018: https://developer.apple.com/videos/play/wwdc2018/406/
- https://docs.swift.org/swift-book/LanguageGuide/Generics.html
- Search the web for: *swift generics*
