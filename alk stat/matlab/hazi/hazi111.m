%Egy teherautó rakománnyi 500 milliliteres üdítőitalból 10 
% palackot véletlenszerűen kiválasztva és lemérve azok űrtartalmát 
% az alábbi, milliliterben kifejezett értékeket kaptuk:
%499,502,505,509,500,507,491,480,492,505.
%Ismert, hogy a palackokba töltött üdítőital mennyisége normális 
% eloszlású 9 ml szórással. 91%-os döntési szintet használva vizsgálja
%gyártó azon állítását, hogy a palackokba átlagosan 500 milliliter 
% üdítőitalt töltöttek!
%(H0: m= 500, H1: m≠500)
%(Próbastatisztika értéke:u)
%(Elfogadási tartomány határai(kritikus értékek):[-z_alpha_2, z_alpha_2])
%(Döntés ( 0, ha elfogadjuk   ~   1, ha elvetjük): h)
data=[499,502,505,509,500,507,491,480,492,505];
ex=500;
szoras=9;
alpha = 0.09;
atlag=mean(data);
[h,p] = ztest(data,ex,szoras,'Alpha',alpha,'Tail','both')
z_alpha_2 = norminv(1-alpha/2)
u=((atlag-ex)/szoras)*sqrt(length(data))
