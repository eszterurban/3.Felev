%x-t és alpha-t kell átírni
%2. feladat
x = [28 16 8
     8 61 20
     26 24 9] %elemek
%98 % akkor ez 0.98
alpha = 0.96
e = sum(x,2)*sum(x)/sum(x(:))
X2 = (x-e).^2./e
X2 = sum(X2(:)) %próbastatisztika értéke
df = prod(size(x)-[1 1])
p = 1-chi2cdf(X2,df)
h = double(p<=alpha) %döntés
chi2inv(alpha,4) %kritikus érték - HA A KRITIKUS nagyobb elfogadjuk