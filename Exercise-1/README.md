📂 Design Patterns Implemented
1. 🛰️ Observer Pattern – Astronaut Task Conflict Notification

Problem:
Astronauts schedule tasks daily. If a new task conflicts with an existing one, multiple systems (like Alert System and Log System) must be notified immediately.

Solution:

Subject: ScheduleManager

Observers: AlertSystem, LogSystem

When a conflict is detected, all observers are notified automatically.

🔑 Decouples task scheduling from alerting & logging.

2. 🗂️ Strategy Pattern – Task Sorting / Payment Switching

Problem:
Astronaut tasks may need sorting in different ways:

By time (daily planning)

By priority (emergencies)

By duration (efficiency)

Hardcoding one sort order would be rigid.

Solution:

SortStrategy interface

Implementations: SortByTime, SortByPriority, SortByDuration

TaskSorter context applies the chosen strategy dynamically.

🔑 Allows switching sorting logic at runtime without modifying core code.

3. 🎯 Singleton Pattern – Mission Control Center

Problem:
There must be only one Mission Control Center.
Multiple instances could send conflicting commands to satellites.

Solution (Bill Pugh Singleton):

MissionControl has a private constructor.

Static inner Holder class ensures lazy initialization + thread safety.

🔑 Guarantees a single, globally accessible Mission Control instance.

4. 👩‍🚀 Factory Pattern – Creating Astronaut Roles

Problem:
Astronaut roles (Pilot, Engineer, Scientist) must be created dynamically.
Using new everywhere would be repetitive and hard to maintain.

Solution:

Abstract class: Astronaut

Concrete classes: Pilot, Engineer, Scientist

AstronautFactory creates roles based on input.

🔑 Centralizes and simplifies object creation for different astronaut roles.

5. 🔌 Adapter Pattern – Legacy Task Integration

Problem:
The old NASA system stores tasks as plain text strings.
The new system requires structured Task objects with methods.

Solution:

LegacyTask = old format (plain text)

Task = new structured format

LegacyTaskAdapter bridges the old system to the new one.

🔑 Enables backward compatibility while moving to modern systems.

6. ⏰ Decorator Pattern – Adding Features to Tasks

Problem:
We want to add reminders, logging, or notifications to tasks without modifying the core Task class.

Solution:

TaskComponent interface

BaseTask = core task implementation

TaskDecorator = abstract wrapper

ReminderDecorator, LoggingDecorator add features dynamically.

🔑 Extends functionality at runtime while following Open/Closed Principle.
