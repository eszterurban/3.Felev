function p = sim(N)
    N = 10^3;
    s=0;
    k=0;
    r1=randi(6,1,N);
    r2=randi(6,1,N);
    if r1==6 | r2==6
        k=k+1;
        if r1 ~= r2
            s=s+1;
        end
    end
    p=s/k;
end