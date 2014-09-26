# Scala Access Modifiers

Because I need to know for certain.

## Questions

- protected on {classes, members}
- protected[this]
- protected[x]

## Answers

Modifier | Class | Instances | Package | Subclass | x | World
-------------------------------------------------
protected | Y | Y |N | Y | - | N
protected[this] | Y | N | N | Y | - | N
protected[x] | Y | Y | N | Y | Y | N
