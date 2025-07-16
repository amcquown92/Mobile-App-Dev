# Collections Notes
## Summary
+ Arrays store ordered data of the same type, and have a fixed size.
+ Arrays are used to implement many of the other collection types.
+ Lists are a resizable, ordered collection.
+ Sets are unordered collections and cannot contain duplicates.
+ Maps work similarly to sets and store pairs of keys and values of the specified type.
## List and MutableList
The difference between list and MutableList:
MutableList extends List with more methods like add and remove, removeAt, contains.

### Add can insert:
``` kotlin
solarSystem.add(3,"Theia")
```

## Sets
Sets are possible because of hashCodes, a semi-unique identifier. Sets are an array of Lists

## Maps
Collection of keys and values (like dictionary in Python?)
<img width="1354" height="148" alt="affc23a0e1f2b223_1440" src="https://github.com/user-attachments/assets/ac374917-a21f-4e9f-b798-97952308fcd8" />
<img width="890" height="552" alt="2ed99c3391c74ec4_1440" src="https://github.com/user-attachments/assets/b18caa0f-0bbb-4a7b-b920-70838e74abb3" />
### Example code
``` kotlin
fun main() {
val solarSystem = mutableMapOf(
    "Mercury" to 0,
    "Venus" to 0,
    "Earth" to 1,
    "Mars" to 2,
    "Jupiter" to 79,
    "Saturn" to 82,
    "Uranus" to 27,
    "Neptune" to 14
)
println(solarSystem.size)
solarSystem["Pluto"] = 5
println(solarSystem.size)
println(solarSystem.get("Theia"))
solarSystem.remove("Pluto")
println(solarSystem.size)
solarSystem["Jupiter"] = 78
println(solarSystem["Jupiter"])
}
```
[Learn More](https://developer.android.com/codelabs/basic-android-kotlin-compose-collections?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-collections#6)
