load carsmall
X = [Weight, Horsepower, Acceleration];
mdl = fitlm(X,MPG)
mdl.Coefficients
