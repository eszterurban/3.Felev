%Az Ezt idd teát 400 grammos dobozokban árulják. 
%A Fogyasztóvédelmi Felügyelőség lemérte hat véletlenszerűen kiválasztott 
% teásdoboz tömegét, melyekre az alábbi grammban kifejezett értékek adódtak
%200,204,194,201,197,203 
% (xfelülhúzás, S^*2ň, Me, Q1, Q3, F^*ň(200,5))
data = [200,204,194,201,197,203];
b = sort(data);

atlag = mean(b)

e=var(data)

kozep = median(b)

Q1 = b(1) + 0.75 * (b(2)-b(1))
q1=quantile(b,0.25)

Q3 = b(length(b)-1) + 0.25 * (b(length(b))-b(length(b)-1))
q3=quantile(b,0.75)

temp2 = 0;
sz = 200,5;
for j = 1:length(b)
    if sz <= b(j)
        temp2 = temp2 + 1;
    end
end
F = temp2 / length(b)