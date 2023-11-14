data=[60.2, 63.4, 58.8, 63.6, 64.7, 62.5, 66.0, 59.1, 65.1, 62.0];
[h,p] = ttest(data,60,'Alpha',0.05,'Tail','both')
df = 10-1;
alpha = 0.05;
x=-3:0.01:3;
plot(x,tpdf(x,df))
hold on
t_alpha_2 = tinv(1-alpha/2, df)
area(-t_alpha_2:0.01:t_alpha_2,tpdf(-t_alpha_2:0.01:t_alpha_2,df),'FaceColor','g')
hold off 
temp = 0;
emp1 = 1/df;
for i = 1:length(data)
    temp = temp + (data(i)-atlag)^2;
end
empirikus = emp1 * temp;
sn=sqrt(empirikus);
t=((atlag-ex)/sn)*sqrt(length(data))
