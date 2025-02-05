# EasingFunctions Library

A lightweight **Java** library that provides a collection of commonly used easing functions from [easings.net](https://easings.net) for animations and interpolations.

## Features

- Includes a variety of easing functions
- Provides an `EasingFunction` interface with a standard `apply(double t)` method for applying the easing function
- Supports interpolation between two values using the `interpolate(double a, double b, double t)` method
- Pure **Java** implementation with no dependencies

## Core Components

### `EasingFunction`

An interface representing an easing function. Provides methods for applying the easing function and interpolating values using it.

### `EasingFunctions`

An enumeration of all easing functions provided by the [easings.net](https://easings.net) website. This enumeration is implementing the `EasingFunction` interface.

## Installation

Clone and build:

```bash
git clone https://github.com/kaba4cow/easing-functions.git
cd easing-functions
mvn clean install
```

Add to your `pom.xml`:

```
xml<dependency>
    <groupId>com.kaba4cow</groupId>
    <artifactId>easing-functions</artifactId>
    <version>2.0.0</version>
</dependency>
```

Requirements: 

- **Java** version **8** or higher.

## Usage

### Applying an Easing Function

```java
double t = 0.5;
double eased = EasingFunctions.SINE_IN.apply(t);
```

### Interpolating Between Two Values

```java
double start = 127;
double end = 512.0;
double t = 0.5;
double interpolated = EasingFunctions.QUAD_IN_OUT.interpolate(start, end, t);
```

## License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.