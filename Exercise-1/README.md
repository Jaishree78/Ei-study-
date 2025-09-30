1. Observer Pattern – Astronaut Task Conflict Notification 

Problem

Astronauts schedule tasks daily. If a new task conflicts with an existing one, multiple systems (like Alert System and Log System) must be notified immediately.

Solution

Observer Pattern:

ScheduleManager = Subject

AlertSystem, LogSystem = Observers

When a conflict is detected, all observers are notified automatically.

2. Strategy Pattern – Task Sorting / Payment Switching
   
Problem

Astronauts’ daily tasks may need sorting in different ways:

By time (for daily planning)

By priority (for emergencies)

By duration (for efficient scheduling)

Hardcoding one sort order would be rigid.

Solution

Strategy Pattern:

SortStrategy interface

SortByTime, SortByPriority, SortByDuration strategies

TaskSorter context dynamically applies chosen strategy

3. Singleton Pattern – Mission Control Center

Problem

There must be only one Mission Control Center.
If multiple instances exist, conflicting commands may be sent to the satellite.

Solution

Singleton Pattern (Bill Pugh Method):

MissionControl has a private constructor.

Inner static Holder class ensures lazy initialization + thread safety.

4. Factory Pattern – Creating Astronaut Roles
   
Problem

Astronaut roles (Pilot, Engineer, Scientist) must be created dynamically.
Using new everywhere would be repetitive and hard to maintain.

Solution

Factory Pattern:

Abstract class: Astronaut

Concrete classes: Pilot, Engineer, Scientist

Factory: AstronautFactory

5. Adapter Pattern – Legacy Task Integration
   
Problem

The old NASA system stores tasks as plain text strings.
The new system requires Task objects with methods.
They are incompatible.

Solution

Adapter Pattern:

LegacyTask = old format

Task = new format

LegacyTaskAdapter bridges old → new

6. Decorator Pattern – Adding Features to Tasks
   
Problem

We want to add reminders, logging, or notifications to tasks, but we don’t want to keep changing the Task class.

Solution

Decorator Pattern:

TaskComponent interface

BaseTask = core implementation

TaskDecorator = abstract wrapper

ReminderDecorator and LoggingDecorator add extra features dynamically