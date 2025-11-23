# 🧩 Adapter Pattern  
### *Making incompatible interfaces work together*

## ⭐ 1. Overview

The **Adapter Pattern** is a structural design pattern used when you need to make **two incompatible interfaces** work together. It acts as a *translator* between an existing system and a new component that does not match the expected interface.

It allows you to integrate new or third-party classes **without modifying their internal code**.

---

## ⭐ 2. The Problem It Solves

Often in software systems:

- You have existing components that expect a specific interface.
- You introduce a new component that uses a different interface.
- These components cannot communicate directly.
- You cannot modify the existing system nor the new component.

This creates an incompatibility issue.

The Adapter Pattern solves this by providing a middle layer that **converts method calls from one interface to another**, making both sides compatible.

---

## ⭐ 3. When to Use the Adapter Pattern

Use the Adapter Pattern when:

- You want to use an existing class whose interface doesn’t match what you need.
- You need to integrate legacy code with new systems.
- You work with third-party libraries that cannot be changed.
- You want to avoid rewriting or breaking existing code.
- You want to follow the *Open/Closed Principle* (open for extension, closed for modification).

---

## ⭐ 4. How the Adapter Works

The adapter:

1. **Implements the interface** expected by the client (the existing system).
2. **Holds a reference** to the object with the incompatible interface.
3. **Translates** the client’s request into something the new component understands.
4. **Forwards the request** to the adapted component.

It essentially makes the new object appear as if it belongs to the system.
