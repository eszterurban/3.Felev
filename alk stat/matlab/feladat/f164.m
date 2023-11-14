data=[499 525 498 503 501 497 493 496 500 495];
[h,p] = ztest(data,500,3,'Alpha',0.05,'Tail','both')
alpha = 0.05;
x=-3:0.01:3;
plot(x,normpdf(x))
hold on
z_alpha_2 = norminv(1-alpha/2)
area(-z_alpha_2:0.01:z_alpha_2,normpdf(-z_alpha_2:0.01:z_alpha_2),'FaceColor','b')
hold off
u=((mean(data)-500)/3)*sqrt(length(data))