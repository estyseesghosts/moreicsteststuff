# Exercises 6.5

#1 - 
---
`p == q` will only return `true` if p is an alias of q, or vice versa.

#2 - 
---
![](https://i.imgur.com/enpwIbd.jpg)
![](https://i.imgur.com/e6QWMaV.jpg)
#3 - 
---
a: 
> ```java
> Circle c2 = c1;
> ```

b: 
> ```java
> Circle c3 = new Circle(c1);
> ```

c: 
>![](https://i.imgur.com/o4BGJdt.jpg)

d: 
> `c1 == c2` will be `true`, because c2 points to the same object as c1

e:
> `c1 == c3` is `false` because they point to different objects

f: 

> ```java
> public boolean equals (Circle other)
> {
>   return this.xCoordinate == other.xCoordinate && this.yCoordinate == other.yCoordinate && this.radius == other.radius;
> }
> ```

g:
> ```java
> public String toString ()
> {
> 	return "Centre: (" + this.xCoordinate + ", " + this.yCoordinate + ") Radius: " + this.radius;
> }
> ```

#4 -
---

```java
public class Witch {
    public static void main (String[] args)
    {
        Child a = new Child(178, 80.5);
        Child b = new Child(177, 80.0);
        Child c = new Child(180, 81);
        Child d = new Child(165, 74);

        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(c)); // true
        System.out.println(b.equals(c)); // false
        System.out.println(c.equals(b)); // false
        System.out.println(d.equals(b)); // false
    }
}

class Child {
    private double mass;
    private int height;

    public Child (int height, double mass)
    {
        this.height = height;
        this.mass = mass;
    }

    public Child ()
    {
        this(0, 0);
    }

    public Child (Child other)
    {
        this(other.height, other.mass);
    }

    public boolean equals (Child other)
    {
        return (other.height-2 <= this.height) && (this.height <= other.height+2) && (other.mass-0.5 <= this.mass) && (this.mass <= other.mass+0.5);
    }
}
```

#5 - 
---
```java
public boolean equals (Fraction other)
{
    return (this.num/this.den) == (other.num/other.den);
}
```

