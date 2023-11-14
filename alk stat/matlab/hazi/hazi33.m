%Két kockával dobunk egyszerre. Mennyi a valószínűsége, 
% hogy két különböző értéket kapunk,
% ha legalább az egyik dobás hatos?
function p = sim()
    N  = 10^3;
    s = 0;
    k = 0;
    for i = 1:N
        p = randi(6,1,2);
        if p(1) == 6 || p(2) == 6
            s = s+1;
            if p(1) ~= p(2)
                k=k+1;
            end
        end
    end
    p = k/s;
end