%Három kockával dobunk egyszerre. Mennyi a valószínűsége, 
%hogy a dobott számok összege 8,
%feltéve, hogy az összeg páros?
function p = sim()
    N  = 10^3;
    s=0;
    k=0;
    for i=1:N
        p=randi(6,1,3);
        if rem(sum(p),2)==0
            s=s+1;
            if sum(p)==8
                k=k+1;
            end
        end
    end
    p=k/s;
end