adat=[0.18, 0.57, 0.82, 0.55, 0.63, 0.12, 0.91, 0.31];
atlag=mean(adat)
szoras=std(adat)
ecdf(adat);
a=0;
b=1/(length(adat)-1);
for i= 1:length(adat)
    a=a+(adat(i)-atlag)^2;
end
empirikus=b*a
hold on
x = -0.1:0.01:1.1; 
plot(x,unifcdf(x),'r');