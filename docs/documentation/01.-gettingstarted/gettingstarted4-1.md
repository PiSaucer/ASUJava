---
description: >-
  Compute the area and circumference of a circle and the area of a triangle.
  Also, compute a Fahrenheit to Celsius temperature conversion table.
---

# Getting Started4

**Description:** Simple Java exercise. Compute the area and circumference of a circle and the area of a triangle. Also, compute a Fahrenheit to Celsius temperature conversion table. Finally, use another for loop to print out list a of ASCII characters using their decimal code.

**Create** a new Netbeans Project, name it GettingStarted4

**Netbeans** &gt; new &gt; project &gt; java application &gt; GettingStarted4

## Type in code:

```java
package asu.gettingstarted4;

public class GettingStarted4 {

    public static void main(String[] args) {
        //area of a circle;
        double radius = 10;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("area = " + area);

        //circumference of a circle
        double c = 2 * Math.PI * radius;
        System.out.println("c = " + c);

        //area of a triangle
        double base = 10;
        double height = 3;
        area = 0.5 * base * height;
        System.out.println("area of triangle = " + area);

        //f to c;
        double f;
        for(f = 0.0; f <= 212; f = f +1){
            double celsius = 5.0/9.0 * (f - 32);
            System.out.println("f = " + (int)f + " c = " + (int)celsius);
        }

        for(int i = 4000; i < 4128; i++){
            System.out.println((char)i);
        }
    }
}
```

## Sample output:

```text
area = 314.1592653589793
c = 62.83185307179586
area of triangle = 15.0
f = 0 c = -17
f = 1 c = -17
f = 2 c = -16
f = 3 c = -16
f = 4 c = -15
f = 5 c = -15
f = 6 c = -14
f = 7 c = -13
f = 8 c = -13
f = 9 c = -12
f = 10 c = -12
f = 11 c = -11
f = 12 c = -11
f = 13 c = -10
f = 14 c = -10
f = 15 c = -9
f = 16 c = -8
f = 17 c = -8
f = 18 c = -7
f = 19 c = -7
f = 20 c = -6
f = 21 c = -6
f = 22 c = -5
f = 23 c = -5
f = 24 c = -4
f = 25 c = -3
f = 26 c = -3
f = 27 c = -2
f = 28 c = -2
f = 29 c = -1
f = 30 c = -1
f = 31 c = 0
f = 32 c = 0
f = 33 c = 0
f = 34 c = 1
f = 35 c = 1
f = 36 c = 2
f = 37 c = 2
f = 38 c = 3
f = 39 c = 3
f = 40 c = 4
f = 41 c = 5
f = 42 c = 5
f = 43 c = 6
f = 44 c = 6
f = 45 c = 7
f = 46 c = 7
f = 47 c = 8
f = 48 c = 8
f = 49 c = 9
f = 50 c = 10
f = 51 c = 10
f = 52 c = 11
f = 53 c = 11
f = 54 c = 12
f = 55 c = 12
f = 56 c = 13
f = 57 c = 13
f = 58 c = 14
f = 59 c = 15
f = 60 c = 15
f = 61 c = 16
f = 62 c = 16
f = 63 c = 17
f = 64 c = 17
f = 65 c = 18
f = 66 c = 18
f = 67 c = 19
f = 68 c = 20
f = 69 c = 20
f = 70 c = 21
f = 71 c = 21
f = 72 c = 22
f = 73 c = 22
f = 74 c = 23
f = 75 c = 23
f = 76 c = 24
f = 77 c = 25
f = 78 c = 25
f = 79 c = 26
f = 80 c = 26
f = 81 c = 27
f = 82 c = 27
f = 83 c = 28
f = 84 c = 28
f = 85 c = 29
f = 86 c = 30
f = 87 c = 30
f = 88 c = 31
f = 89 c = 31
f = 90 c = 32
f = 91 c = 32
f = 92 c = 33
f = 93 c = 33
f = 94 c = 34
f = 95 c = 35
f = 96 c = 35
f = 97 c = 36
f = 98 c = 36
f = 99 c = 37
f = 100 c = 37
f = 101 c = 38
f = 102 c = 38
f = 103 c = 39
f = 104 c = 40
f = 105 c = 40
f = 106 c = 41
f = 107 c = 41
f = 108 c = 42
f = 109 c = 42
f = 110 c = 43
f = 111 c = 43
f = 112 c = 44
f = 113 c = 45
f = 114 c = 45
f = 115 c = 46
f = 116 c = 46
f = 117 c = 47
f = 118 c = 47
f = 119 c = 48
f = 120 c = 48
f = 121 c = 49
f = 122 c = 50
f = 123 c = 50
f = 124 c = 51
f = 125 c = 51
f = 126 c = 52
f = 127 c = 52
f = 128 c = 53
f = 129 c = 53
f = 130 c = 54
f = 131 c = 55
f = 132 c = 55
f = 133 c = 56
f = 134 c = 56
f = 135 c = 57
f = 136 c = 57
f = 137 c = 58
f = 138 c = 58
f = 139 c = 59
f = 140 c = 60
f = 141 c = 60
f = 142 c = 61
f = 143 c = 61
f = 144 c = 62
f = 145 c = 62
f = 146 c = 63
f = 147 c = 63
f = 148 c = 64
f = 149 c = 65
f = 150 c = 65
f = 151 c = 66
f = 152 c = 66
f = 153 c = 67
f = 154 c = 67
f = 155 c = 68
f = 156 c = 68
f = 157 c = 69
f = 158 c = 70
f = 159 c = 70
f = 160 c = 71
f = 161 c = 71
f = 162 c = 72
f = 163 c = 72
f = 164 c = 73
f = 165 c = 73
f = 166 c = 74
f = 167 c = 75
f = 168 c = 75
f = 169 c = 76
f = 170 c = 76
f = 171 c = 77
f = 172 c = 77
f = 173 c = 78
f = 174 c = 78
f = 175 c = 79
f = 176 c = 80
f = 177 c = 80
f = 178 c = 81
f = 179 c = 81
f = 180 c = 82
f = 181 c = 82
f = 182 c = 83
f = 183 c = 83
f = 184 c = 84
f = 185 c = 85
f = 186 c = 85
f = 187 c = 86
f = 188 c = 86
f = 189 c = 87
f = 190 c = 87
f = 191 c = 88
f = 192 c = 88
f = 193 c = 89
f = 194 c = 90
f = 195 c = 90
f = 196 c = 91
f = 197 c = 91
f = 198 c = 92
f = 199 c = 92
f = 200 c = 93
f = 201 c = 93
f = 202 c = 94
f = 203 c = 95
f = 204 c = 95
f = 205 c = 96
f = 206 c = 96
f = 207 c = 97
f = 208 c = 97
f = 209 c = 98
f = 210 c = 98
f = 211 c = 99
f = 212 c = 100
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
?
```

