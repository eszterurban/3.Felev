%Két kockával dobunk egyszerre. Mennyi a valószínűsége, 
% hogy két különböző értéket kapunk,
% ha legalább az egyik dobás hatos?
function p = sim()
    N=10^3;
    a=0;
    b=0;
    for i=1:N
        r = randi(6,1,2);
        if (r(1)==6 || r(2)==6)
            a=a+1;
            if(r(1)~=r(2))
                b=b+1;
            end
        end
    end
    p = b/a;
end