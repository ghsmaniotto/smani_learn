## HUB

- Limitations:
    - Don't save the devices connected to it.
    - It sends messages for all connected devices (except the sender) every time. It doesn't know who is connected to them.
    - Because of that, we can have security issues. All devices are receiving the same package, either those non-involved in conversation.

## Switch

- It's a HUB sucessor
- It saves the devices MAC addresses connected to each port using ADP protocol.
- Limitations:
    - If someone overflow the MAC addresses capacity for a port, it starts to behave like an hub (a way to solve it, it is to set a maximum of MAC addresses per port).

## Router

- Used to connect two networks
- It's necessary to configure the router ports to be at the same network of its connected devices (considering network mask). And in the devices is necessary to configure the default gateway IP to be the router port IP.
