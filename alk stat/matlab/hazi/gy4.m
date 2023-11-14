%Három kockával dobunk egyszerre. Mennyi a valószínűsége, 
%hogy a dobott számok összege 8,
%feltéve, hogy az összeg páros?
function p = sim()
    N  = 10^3;
    a=0;
    b=0;
    for i = 1:N
        r = randi(6,1,3);
        if (rem(sum(r),2)==0)
            a=a+1;
            if(sum(r)==8)
                b=b+1;
            end
        end
    end
    p=b/a;
end