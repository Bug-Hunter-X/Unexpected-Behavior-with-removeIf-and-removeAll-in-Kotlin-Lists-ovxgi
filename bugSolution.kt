fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 } 
    list.removeAll(evenNumbers)
    println(list) // Output: [1, 3, 5]

    //Alternative approach using removeIf (although removeAll is generally preferred for explicitness):
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val list2Copy = mutableListOf<Int>()
    list2.forEach{ if(it % 2 != 0) list2Copy.add(it)}
    list2.clear()
    list2.addAll(list2Copy)
    println(list2) // Output: [1, 3, 5]
} 