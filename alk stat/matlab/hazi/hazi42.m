%Két kockával dobunk egyszerre, mennyi a valószínűsége annak,
%hogy az összeg 7, feltéve ha az összeg páratlan
function p = dice_sim(N)
   N=10^3
   r1 = randi(6,1,N);
   r2 = randi(6,1,N);
   sums=r1+r2;
   freq_odd=sum(rem(sums,2) == 1)
   freq_7 = sum(sums==7); %a feltétel 0-t vagy 1-et ad vissza
   p= freq_7/freq_odd;
end