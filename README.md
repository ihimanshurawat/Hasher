# Hasher
A Simple, Light Weight and Easy to Use Hashing Library.
You can Easily Hash using MD5, SHA-1, SHA-256, SHA-384, or SHA-512 with ease.
! This Library is Written in Kotlin !

# How to Use
In Java
```
//Make Hasher Object
Hasher ob = new Hasher();
//Call hash() method using the object
ob.hash(value,HashType);
```
Example
```
~~ob.hash("Hello",HashType.SHA_1);~~
This has been replaced with New Format 

New Format 
ob.hash("Hello",HashType.SHA_1);

```
It will return a SHA-1 Encoded String 

In Kotlin

```
val ob:Hasher = Hasher()
```
and use
```
~~ob.hash(value, HashType.SHA_512)~~
The above code has been updated to
ob.hash(value,HashType.SHA_512)
```

# Download
At Root build.gradle
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
At the Project build.gradle
```
implementation 'com.github.1AboveAll:Hasher:1.1'
```
  
  
