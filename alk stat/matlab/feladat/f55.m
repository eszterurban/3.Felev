s=0;
k=0;
for i=1:1000000
    p=randi(6,1,2);
    if p(1)==6 | p(2)==6
            k=k+1;
        if p(1)~=p(2)
                s=s+1;
        end
    end
end
disp('Az olyan esetek száma, ahol a dobott számok különbözőek:')
s
disp('Az olyan esetek száma, ahol dobunk legalább egy hatost:')
k
s/k
