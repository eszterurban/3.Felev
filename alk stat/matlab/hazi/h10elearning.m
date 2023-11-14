adat=[395, 402, 390, 398, 393, 400];
rend=sort(adat);

atlag=mean(rend)

kozep=median(rend)

emp=var(adat)

q1=quantile(rend,0.25)
Q1=rend(1)+0.75*(rend(2)-rend(1))
q3=quantile(rend,0.75)
Q3=rend(5)+0.25*(rend(6)-rend(5))

sz=396.5
c=0;
for j=1:length(rend)
    if sz<=rend(j)
        c=c+1;
    end
end
f=c/length(rend)

kicsi=q1-1.5*(q3-q1)
nagy=q3+1.5*(q3-q1)