![Kappa logo](logo.png)

[![](https://github.com/fiji/Kappa/actions/workflows/build-main.yml/badge.svg)](https://github.com/fiji/Kappa/actions/workflows/build-main.yml)
[![Binder](https://mybinder.org/badge.svg)](https://mybinder.org/v2/gh/fiji/Kappa/master?urlpath=lab/tree/Analysis/Notebooks)

# Kappa

`Kappa` is **A Fiji plugin for Curvature Analysis**.

It allows a user to measure curvature in images in a convenient way. You can trace an initial shape with a B-Spline curve in just a few clicks and then fit that curve to image data with a minimization algorithm. It’s fast and robust.

![Kappa Screenshot](screenshot.png)

See also the [ImageJ Wiki page](https://imagej.net/Kappa).

## Publication

Analysis done for the paper is available and can be reproduced from this older. See [`Analysis`](./Analysis).

You can fire a remote Jupyter notebook server and reproduce the analysis using Binder: <https://mybinder.org/v2/gh/fiji/Kappa/master?urlpath=lab/tree/Analysis/Notebooks.>

## Installation

`Kappa` is included with Fiji. Just open your image,
then start the plugin with `Plugins ► Analyze ► Kappa - Curvature Analysis`.

## Documentation

See documentation in the [docs/ folder](./docs/).

## Authors

`Kappa` has been created originally by [Kevan Lu](http://www.kevan.lu/) and further developed by [Hadrien Mary](mailto:hadrien.mary@gmail.com).

This work started in 2013 in the [Gary Brouhard laboratory](http://brouhardlab.mcgill.ca/) at the University of McGill.

## License

MIT license. See [LICENSE.txt](LICENSE.txt)
