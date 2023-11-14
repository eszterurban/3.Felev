load accidents
x = hwydata(:,14); % Population of states
y = hwydata(:,4); % Accidents per state
a = corr(x,y) / std(x) * std(y);
b = mean(y) - mean(x)*a;
scatter(x,y)
hold on 
plot(x, x*a + b)
xlabel('Population of state')
ylabel('Fatal traffic accidents per state')
title('Linear regression relation between accidents & population')
grid on
