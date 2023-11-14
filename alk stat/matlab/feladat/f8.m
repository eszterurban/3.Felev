n=10^5;
x=randi([1 12],1,n)
p=length(x(x<8))/n
x_mean=mean(x)
x_var=var(x)
