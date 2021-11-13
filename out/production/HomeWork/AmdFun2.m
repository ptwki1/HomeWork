function [ y ] = AmdFun2( a1, a2, x1, x2 )

y = exp(a1 .*x1+a2 .*x2) + (a1 .* x1 + a2 .* x2) .^ 2 - 2;
  
  
  
  
  
  
end