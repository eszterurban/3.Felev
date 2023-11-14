function p = sim(N)
    N = 10^3;
    r1=randi(6,1,N);
    r2=randi(6,1,N);
    ugyanaz=sum(r1==r2);
    p=ugyanaz/N;
end

