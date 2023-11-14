%1.feladat
%93 % akkor ez 0.93 - ezt kell átírni és freq-et
chi2inv(0.93,5) %kritikus érték és ha kritikus érték nagyobb mint a próbastatisztika akkor elfogadjuk
die = 1:6;
freq = [168,138,150,139,159,146];
%150 az átlag
atlag=mean(freq);
expected = repmat(atlag, 1,6);
[h,p,stats] = chi2gof(die,"Expected",expected,"Frequency",freq)