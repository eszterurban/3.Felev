function p = sim(N)
    s=0;
    k=0;
    N  = 10^3;
    r1=randi(6,1,N);
    r2=randi(6,1,N);
    r3=randi(6,1,N);
    sums = r1+r2+r3;
    if rem(sums,2)==0
        s=s+1;
        if sums==8
            k=k+1;
        end
    end
    s
    k
    p=k/s;
end