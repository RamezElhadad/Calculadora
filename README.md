# Java Swing Calculator

A desktop calculator application developed in **Java using Swing**. This project demonstrates graphical user interface (GUI) development, event-driven programming, and basic arithmetic operations.

The calculator was created as a Java programming practice project to strengthen my understanding of object-oriented programming and user-interface development.

## Features

- **Graphical Interface:** Desktop calculator built using Java Swing.
- **Basic Arithmetic:** Addition, subtraction, multiplication, and division.
- **Interactive Buttons:** Number buttons (0–9) and arithmetic operators.
- **Clear Function:** Reset the calculator display.
- **Additional Controls:** Buttons for decimal input, positive/negative values, reciprocals, and square roots (see Known Limitations).

## Technologies Used

- **Java**
- **Java Swing**
- **Java AWT**
- **Event-Driven Programming**

## How It Works

The application uses Java Swing components such as `JFrame`, `JButton`, and `JTextField` to build an interactive calculator interface.

Button clicks are handled through `ActionListener` implementations. The program stores operands and the selected arithmetic operation, then displays the calculated result when the equals button is pressed.

## Known Limitations

This is an early programming project, and several features require improvement:

- Decimal calculations are not supported by the current integer-based arithmetic logic.
- The square-root button currently squares the entered number instead of calculating its square root.
- The positive/negative button uses an incorrect numeric conversion method.
- Division by zero and empty inputs are not handled gracefully.
- The clear button resets the display but does not fully reset the calculation state.

## Future Improvements

- Support decimal arithmetic using `double`.
- Correct square-root, reciprocal, and positive/negative operations.
- Add input validation and error handling.
- Improve calculator state management.
- Reduce repetitive button-handling code.
- Add automated tests for arithmetic operations.

## Author

**Ramez Elhadad**  
