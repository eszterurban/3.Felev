a=4*(((1/3)*2+(1/3)*(1/3)+(1/3)*1)^3)
b=4^2*(((1/3)*2^2+(1/3)*(1/3)^2+(1/3)*1^2)^3)-a^2

c=(nchoosek(85,0)*nchoosek(5,5)*(1800000000-350)+nchoosek(85,1)*nchoosek(5,4)*(1500000-350)+nchoosek(85,2)*nchoosek(5,3)*(17000-350)+nchoosek(85,3)*nchoosek(5,2)*(1400-350)+nchoosek(85,4)*nchoosek(5,1)*(-350)+nchoosek(85,5)*nchoosek(5,0)*(-350))/nchoosek(90,5)

h=1-normcdf(74/55)
i=normcdf((65+9)/55)-normcdf((-65+9)/55)
w=normcdf(-56/55)
k=i+w+h

g=83*0.06+84*0.07+85*0.1+86*0.54+87*0.1+88*0.07+89*0.06
f=(83-g)^2*0.06+(84-g)^2*0.07+(85-g)^2*0.1+(86-g)^2*0.54+(87-g)^2*0.1+(88-g)^2*0.07+(89-g)^2*0.06
j=1-(f/3^2)
l=1-(0.06*2)


e=(log(0.12)/8)*3
d=(1-exp(e))

s=normcdf(0.07/0.03)-normcdf(-0.07/0.03)