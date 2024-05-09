![Logo](https://raw.githubusercontent.com/matinnasiri01/matinnasiri01/main/main-logo.png)

# Canvas ~> CustomProgressIndicator
This View is a custom progress indicator component built using Jetpack Compose for Android applications. This progress indicator offers a sleek and minimalistic design, resembling a white canvas, ideal for applications requiring a clean and modern UI aesthetic.

## Features

- **Dynamic Animation**: The indicator provides smooth animations that dynamically reflect changes in progress.
  
- **Customizable Appearance**: Developers can tailor the indicator's size, colors, and stroke widths to align with their application's design language.

- **Accessibility Support**: The indicator includes text representation of the progress percentage for improved accessibility.

## Usage

To integrate the `CustomProgressIndicator` into your project, follow these steps:

1. **Integration**: Copy the provided `CustomProgressIndicator` function along with its supporting `backgroundIndicator` and `foregroundIndicator` functions into your Composable code file.

2. **Invocation**: Call the `CustomProgressIndicator` function from within your Composable UI code, providing the desired parameters to customize its appearance and behavior. Example usage:

    ```kotlin
    @Composable
    fun MyScreen() {
        // CustomProgressIndicator with customized parameters
        CustomProgressIndicator(
            canvasSize = 300.dp,
            indicatorValue = 50,
            maxIndicatorValue = 100,
            // Customize colors, stroke widths, etc.
        )
    }
    ```

3. **Customization**: Adjust the parameters of the `CustomProgressIndicator` function to achieve the desired visual effects. Parameters include `canvasSize`, `indicatorValue`, `maxIndicatorValue`, `backgroundIndicatorColor`, `backgroundIndicatorStrokeWidth`, `foregroundColor`, and `foregroundIndicatorStrokeWidth`.

## Preview
<p align="center">
  <img src="/reass/test.gif" width="300" />
</p>

## Parameters

- `canvasSize`: Size of the progress indicator canvas.
- `indicatorValue`: Current value of the progress indicator.
- `maxIndicatorValue`: Maximum value that the progress indicator can reach.
- `backgroundIndicatorColor`: Color of the background indicator.
- `backgroundIndicatorStrokeWidth`: Width of the stroke for the background indicator.
- `foregroundColor`: Color of the foreground indicator.
- `foregroundIndicatorStrokeWidth`: Width of the stroke for the foreground indicator.

## How It Works
In these functions, `canvas` is utilized as a part of the Jetpack Compose library in Android. Here, `canvas` is used to display a custom progress indicator in the user interface.

The `CustomProgressIndicator` function defines and draws a custom progress indicator with the help of `canvas` and other Jetpack Compose tools. In this function, `canvas` is indirectly used via `drawBehind` to draw two concentric circles using the `backgroundIndicator` and `foregroundIndicator` functions. These two circles represent the background and foreground progress indicators, respectively.

The `backgroundIndicator` and `foregroundIndicator` functions also use `canvas` to draw the circles using the `drawArc` functions. These functions draw different parts of the circles with specified angles and thickness.

In general, `canvas` is used in these functions as a means to draw graphical shapes in the user interface.
