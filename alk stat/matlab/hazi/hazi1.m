function p = sim(N)
    N  = 10^3;
    r1=randi(6,1,N);
    r2=randi(6,1,N);
    sums=r1+r2;
    nyolc=sum(sums==8);
    p= nyolc/N;
end