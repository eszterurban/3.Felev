adat=[499, 525, 498, 503, 501, 497, 493, 496, 500, 495];
ex=500;
d=3;
alpha=0.05;
atlag=mean(adat);
[h,p]=ztest(adat,ex,d,"Alpha",alpha,"Tail","both")
z_alpha_2=norminv(1-alpha/2)
u=((atlag-ex)/d)*sqrt(length(adat))