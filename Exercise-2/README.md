# 🚀 Exercise 2 – Satellite Command System

A **console-based simulation** of controlling a satellite in orbit.  
Implements **multiple design patterns**, follows **SOLID principles**, and demonstrates both a **simple mode** (as per PDF problem statement) and an **advanced mode** (extended for realism).

---

## 📌 Problem Statement
The system simulates controlling a satellite.

**Initial State:**
- Orientation: **North**
- Solar Panels: **Inactive**
- Data Collected: **0**

**Supported Commands:**
- `rotate <direction>` → change orientation (North, South, East, West)
- `activatePanels` → turn on solar panels
- `deactivatePanels` → turn off solar panels
- `collectData` → collect 10 units of data (only if panels active)
- `exit` → quit the program

---

## 🏗️ Architecture & Design Patterns
- **Command Pattern** → encapsulates each action as a command.
- **Factory Pattern** → creates commands dynamically from user input.
- **Observer Pattern** → telemetry monitors get notified of state updates.
- **Decorator Pattern** → adds retry logic to commands.
- **Singleton-style Config** → central flag to switch between modes.
- **SOLID Principles** → each class has a single responsibility, easy to extend.

---

