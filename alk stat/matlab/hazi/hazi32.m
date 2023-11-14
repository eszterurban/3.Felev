%Két kockával dobunk, valség hogy legalább egy 6-ost dobunk,
%ha a két dobás értéke különböző
function p = dice_sim2(N)
   N = 10^3;
   r1 = randi(6,1,N);
   r2 = randi(6,1,N);
   freq_diff=sum(r1 ~= r2);
   freq_diff_and_6=sum((r1 == 6 | r2==6) & r1~=r2)
   p=freq_diff_and_6/freq_diff;
end