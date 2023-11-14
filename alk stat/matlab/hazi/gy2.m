function p = sim()
    N  = 10^3;
    r1=randi(6,1,N);
    r2=randi(6,1,N);
    kul= sum((r1==6 | r2==6) & r1~=r2);
    hat = sum(r1==6 | r2 == 6);
    p= kul/hat;
end