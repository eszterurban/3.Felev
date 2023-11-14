load count.dat
x = count(:,1);
y = count(:,2);
pl = polyfit(x,y,1) % Linear
pq = polyfit(x,y,2) % Quadratic
scatter(x,y)
hold on
z = linspace(min(x),max(x),100);
plot(z, polyval(pl,z))
plot(z, polyval(pq,z))
