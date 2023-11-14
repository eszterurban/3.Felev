%Egy gabonaraktárban 40 kg-os kiszerelésben búzát csomagolnak.
%A havi minőségellenőrzés során azt is meg akarták vizsgálni, hogy 
% a raktárból kikerülő zsákokban tényleg 40kg búza van-e, ezért 
% lemértek nyolc darab véletlenül kiválasztott zsákot. 
% Eredményül a következőket kapták:
%38.3, 43.5, 38.4, 38.1, 43, 39.5, 39.6, 42.4.
%Hipotéziseit és az adatokra vonatkozó feltételeit pontosan 
% megfogalmazva döntsön 97%-os szinten, a zsákok átlagos töltőtömege
% tényleg 40 kg-e!
%(H0: m= 40, H1: m≠40)
%(Próbastatisztika értéke:t)
%(Elfogadási tartomány határai(kritikus értékek):[-t_alpha_2, t_alpha_2])
%(Döntés ( 0, ha elfogadjuk   ~   1, ha elvetjük): h)
data=[38.3, 43.5, 38.4, 38.1, 43, 39.5, 39.6, 42.4];
df = length(data)-1;
alpha = 0.03;
ex=40;
atlag=mean(data);
[h,p] = ttest(data,ex,'Alpha',alpha,'Tail','both')
t_alpha_2 = tinv(1-alpha/2, df)
sn=sqrt(var(data));
t=((atlag-ex)/sn)*sqrt(length(data))