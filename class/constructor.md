
# Java Access Modifiers

Access modifiers in Java define the **visibility and scope** of classes, methods, variables, and constructors.

Java has **4 access modifiers**:

---

## 1. public
- Accessible **from anywhere**

```java
public int roll;
````

✔ Same class
✔ Same package
✔ Different package
✔ Subclass / Non-subclass

---

## 2. protected

* Accessible:

  * Within the **same package**
  * In **subclasses** (even in different packages)

```java
protected int marks;
```

❌ Not accessible to non-subclass in different package

---

## 3. default (no keyword)

* Used when **no modifier is specified**
* Accessible **only within the same package**

```java
int age; // default access
```

❌ Not accessible outside the package

---

## 4. private

* Accessible **only within the same class**

```java
private String password;
```

❌ Not accessible outside the class

---

## Accessibility Table

| Modifier  | Same Class | Same Package | Subclass (Different Package) | Other Classes |
| --------- | ---------- | ------------ | ---------------------------- | ------------- |
| public    | ✔          | ✔            | ✔                            | ✔             |
| protected | ✔          | ✔            | ✔                            | ❌             |
| default   | ✔          | ✔            | ❌                            | ❌             |
| private   | ✔          | ❌            | ❌                            | ❌             |

---

## One-line Exam Answers

* **public** → accessible everywhere
* **protected** → package + subclass
* **default** → package only
* **private** → class only

```

If you want:
- **Very short exam version**
- **MCQ-based questions**
- **Real-life example**
- **Java vs C++ access modifiers**

Just tell me 😊
```
