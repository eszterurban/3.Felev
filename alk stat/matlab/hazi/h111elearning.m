adat=[499, 502, 505, 509, 500, 507, 491, 480, 492, 505];
ex=500;
atlag=mean(adat);
dx=9;
alpha=0.09;
[h,p]=ztest(adat,ex,dx,'Alpha',alpha,'Tail','both')
z_alpha_2 = norminv(1-(alpha/2))
u=((atlag-ex)/dx)*sqrt(length(adat))