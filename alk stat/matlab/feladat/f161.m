adat=[196, 202, 198, 197, 190];
atlag=mean(adat)
szoras=std(adat)
rendezett=sort(adat);
a=0;
b=1/(length(adat)-1);
for i=1:length(adat)
    a=a+(adat(i)-atlag)^2;
end
empirikus=b*a
