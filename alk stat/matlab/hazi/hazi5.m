%Várható érték 3kocka amig nem 1es utolsó is beleszámolódik
function m = sim()
    N  = 10^3;
    s=0;
    for i=1:N
        while true
            s=s+1;
            if rand()<1/6 || rand()<1/6 || rand()<1/6 
                break;
            end
        end
    end

    m =  s/N   ;
end