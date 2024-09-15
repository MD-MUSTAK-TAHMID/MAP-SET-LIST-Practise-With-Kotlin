fun main() {

//    **Scenario 1: Shopping List**

    val shoppingList = mutableListOf<String>()
//  =============================================================================
    shoppingList.add("Apples")
    shoppingList.add("Bread")
    shoppingList.add("Milk")
    shoppingList.add("Eggs")
//  =============================================================================
    shoppingList.remove("Bread")
//  =============================================================================
    println(message = "Shopping List: $shoppingList")


//    =============================================================================
//    =============================================================================
//    =============================================================================

//    **Scenario 2: Unique Usernames**


    val usernameSet = mutableSetOf<String>()
//  =============================================================================
    val newUsername = "john_doe"
    if (usernameSet.contains(newUsername)) {
        println("Username '$newUsername' is already taken. Please choose another.")
    } else {
        usernameSet.add(newUsername)
        println("Registration successful. Welcome, $newUsername!")
    }
//  =============================================================================
    val duplicateUsername = "john_doe"
    if (usernameSet.contains(duplicateUsername)) {
        println("Username '$duplicateUsername' is already taken. Please choose another.")
    } else {
        usernameSet.add(duplicateUsername)
        println("Registration successful. Welcome, $duplicateUsername!")
    }

//    =============================================================================
//    =============================================================================
//    =============================================================================

//    **Scenario 3: Student Grades**

    val studentGrades = mutableMapOf<String, Int>()
//  =============================================================================
    studentGrades["Alice"] = 90
    studentGrades["Bob"] = 85
    studentGrades["Charlie"] = 78
//  =============================================================================
    val studentName = "Bob"
    if (studentGrades.containsKey(studentName)) {
        val currentGrade = studentGrades[studentName]!!
        println("$studentName's current grade is $currentGrade")
        studentGrades[studentName] = 88
        println("$studentName's grade has been updated to ${studentGrades[studentName]}")
    } else {
        println("$studentName not found in the system.")
    }
//  =============================================================================
    val removedStudent = "Charlie"
    studentGrades.remove(removedStudent)
    println("$removedStudent has been removed from the system.")
//  =============================================================================
    println("Updated Student Grades: $studentGrades")
}
