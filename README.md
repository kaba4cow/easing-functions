# Easings Functions Library

A lightweight library providing a collection of easing functions from [easings.net](https://easings.net) commonly used in animations and interpolations. This library offers a clean and simple API to enhance animation workflows.

## Usage

The usage is very simple, just call `apply` function on the desired `Easing`:

```java
double y = Easing.SINE_IN_OUT.apply(x);
```

Or use the `interpolate` method to interpolate between values using a specific `Easing` function:

```java
double y = Easing.BACK_OUT.interpolate(8.0, 64.0, x);
```