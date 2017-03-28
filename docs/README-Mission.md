# Missions

Missions are an important part of DJI SDK and no drone automation workflow can be complete without them. 

After listening to developer feedback on existing missions interface as well as taking into consideration the future roadmap, in SDK 4.0, DJI has decided to rewrite the mission system. *Robustness, fault tolerance, improved state feedback and future readiness* are some of the goals for the rewrite.

## Mission Interface Changes

- **Mission Manager Removed**: The old mission manager tried to provide a unified and a simplified set of interfaces (eg. `prepare`, `start`, `stop`, `pause`, etc) for all missions. But each mission is unique and is increasingly becoming feature rich. The mission manager interface did not meet all the needs of the missions and has therefore been removed.

- **Introducing Mission Operators**: A mission operator is a singleton object that specializes on a single mission. It is implemented using a finite state machine (FSM) and many of the states are exposed through public API for the developers to get a better picture on the state of the running mission. Mission operator also offers a listener mechanism to get notified on state changes. 

- **Timeline**: Timeline is the replacement of Custom Mission. The Timeline can schedule and execute missions and actions in sequential order.

- **New Mission Control**: Mission control is a simple singleton object that acts as a conduit to mission operators and the mission Timeline. You can access the mission operators as properties of mission control. In the future, expect mission control to provide more advanced features.

## Mission Operators

SDK 4.0 introduces the mission operator. It is a singleton object that specializes in the configuration and execution of a single type of mission. Each type provides it’s own operator. Each operator uses a finite state machine (FSM) to manage and report the mission lifecycle. Using the listener mechanism your mission handling code can subscribe and react to state updates. You can access each available operator as a property of Mission Control.

Many of the operators provide interfaces for starting, pausing, resuming, and stopping a mission. Where needed they expose hooks to add custom parameters. Operators provide the means to upload and download the mission plan from the product for certain types of missions.

## Timeline Missions

The mission control timeline is a new mechanism for executing completely customized mission workflows using the SDK, replacing `DJICustomMission` and `DJICustomMissionStep` A timeline consists of elements and can be started, paused, resumed, and stopped like any other type of mission. The SDK comes with a set of pre-built timeline elements, one for each of the now deprecated custom mission steps. 

The timeline also supports mission triggers which can add dynamic behavior to timeline execution. At this time no prebuilt triggers are included in the SDK.

## Waypoint Mission Overview

You can create and execute a waypoint mission using the waypoint mission operator by following these steps.

- First create an instance of `WaypointMission` using the builder interface, adding your waypoints, actions and change any custom settings as before. After `WaypointMission` is constructed with the builder, it is immutable so as to distinguish between a waypoint mission that is actively being created and modified, and the in progress immutable waypoint mission that is returned by the mission operator.
- Run `checkParameters` to make sure the internal state of the mission plan is valid.
- Load the mission into the operator for validation by calling `loadMission`
- Upload the mission  to the product by calling `uploadMission`
- After the upload completes, start the mission by calling `startMission`

## Next Steps
You can read more about [Mission Operators](./API_Reference/Components/WaypointMission/DJIWaypointMission_DJIWaypointMissionOperator.html) and [Mission Control](./API_Reference/Components/MissionControl/DJIMissionControl.html) in their class documentation. You can also take a look at the sample app to learn how to use the new missions interfaces.