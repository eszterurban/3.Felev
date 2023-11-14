n = 10^7;
s = 0;
 for i=1:n
    while true
        s=s+1;
        if rand()<1/6 | rand()<1/6
            break;
        end
    end
end
 s/n
36/11