example_list = ["apple", "banana", "cherry"]
print(example_list)

example_list = ["apple", "banana", "cherry"]
print(example_list[1]) # Output: "banana"

example_list = ["apple", "banana", "cherry"]
print(example_list[-1]) # Output: "cherry"

example_list = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(example_list[2:5]) # Output: ["cherry", "orange", "kiwi"]

example_list = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(example_list[:2]) # Output: ["apple", "banana"]

example_list = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(example_list[5:]) # Output: ["melon", "mango"]

example_list = ["apple", "banana", "cherry"]
example_list[1] = "blackcurrant"
print(example_list)

example_list = ["apple", "banana", "cherry"]
for item in example_list:
    print(item)

    example_list = ["apple", "banana", "cherry"]
print(len(example_list)) # Output: 3

example_list = ["apple", "banana", "cherry"]
example_list.append("orange")
print(example_list) # Output: ["apple", "banana", "cherry", "orange"]

example_list = ["apple", "banana", "cherry"]
example_list.insert(1, "orange")
print(example_list) # Output: ["apple", "orange", "banana", "cherry"]

example_list = ["apple", "banana", "cherry"]
example_list.remove("banana")
print(example_list) # Output: ["apple", "cherry"]

example_list = ["apple", "banana", "cherry"]
example_list.pop()
print(example_list) # Output: ["apple", "banana"]

example_list = ["apple", "banana", "cherry"]
example_list.pop()
print(example_list) # Output: ["apple", "banana"]

list1 = ["a", "b" , "c"]
list2 = [1, 2, 3]

list3 = list1 + list2
print(list3) # Output: ["a", "b", "c", 1, 2, 3]

example_list = list(("apple", "banana", "cherry")) # note the double round-brackets
print(example_list) # Output: ["apple", "banana", "cherry"] 