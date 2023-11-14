adat=[60.2, 63.4, 58.8, 63.6, 64.7, 62.5, 66.0, 59.1, 65.1, 62.0];
ex=60;
hossz=length(adat)-1;
alpha=0.05;
atlag=mean(adat);
[h,p]=ttest(adat,ex,"Alpha",alpha,"Tail","both")
t_alpha_2= tinv(1-alpha/2,hossz)
a=0;
b=1/hossz;
for i= 1:length(adat)
    a=a+(adat(i)-atlag)^2;
end
empirikus=a*b
sn=sqrt(empirikus)
t=((atlag-ex)/sn)*sqrt(length(adat))