tic
s=0;
k=0;
for i=1:1000000
    p=randi(6,1,2);
    if rem(sum(p),2)==1
        s=s+1;
        if sum(p)==7
            k=k+1;
        end
    end
end
disp('Az olyan esetek száma, ahol az összeg páratlan:')
s
disp('Az olyan esetek száma, ahol az összeg hét:')
k
k/s
toc