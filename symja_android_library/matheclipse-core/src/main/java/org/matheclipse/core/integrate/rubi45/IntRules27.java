package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules27 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus(A_,Times(B_DEFAULT,Power(x_,r_DEFAULT))),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,j_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Times(p,q)),Plus(ASymbol,Times(BSymbol,Power(x,Plus(n,Negate(q))))),Power(Plus(a,Times(b,Power(x,Plus(n,Negate(q)))),Times(c,Power(x,Times(C2,Plus(n,Negate(q)))))),p)),x),And(And(And(And(FreeQ(List(a,b,c,ASymbol,BSymbol,n,q),x),ZeroQ(Plus(r,Negate(Plus(n,Negate(q)))))),ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q)))))),IntegerQ(p)),PosQ(Plus(n,Negate(q)))))),
ISetDelayed(Int(Times(Plus(A_,Times(B_DEFAULT,Power(x_,j_DEFAULT))),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,r_DEFAULT))),CN1D2)),x_Symbol),
    Condition(Times(Power(x,Times(C1D2,q)),Sqrt(Plus(a,Times(b,Power(x,Plus(n,Negate(q)))),Times(c,Power(x,Times(C2,Plus(n,Negate(q))))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),CN1D2),Int(Times(Plus(ASymbol,Times(BSymbol,Power(x,Plus(n,Negate(q))))),Power(Times(Power(x,Times(C1D2,q)),Sqrt(Plus(a,Times(b,Power(x,Plus(n,Negate(q)))),Times(c,Power(x,Times(C2,Plus(n,Negate(q)))))))),-1)),x)),And(And(And(And(And(FreeQ(List(a,b,c,ASymbol,BSymbol,n,q),x),ZeroQ(Plus(j,Negate(Plus(n,Negate(q)))))),ZeroQ(Plus(r,Negate(Plus(Times(C2,n),Negate(q)))))),PosQ(Plus(n,Negate(q)))),ZeroQ(Plus(n,Negate(C3)))),ZeroQ(Plus(q,Negate(C2)))))),
ISetDelayed(Int(Times(Plus(A_,Times(B_DEFAULT,Power(x_,r_DEFAULT))),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,j_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Times(x,Plus(Times(b,BSymbol,Plus(n,Negate(q)),p),Times(ASymbol,c,Plus(Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),Times(BSymbol,c,Plus(Times(p,Plus(Times(C2,n),Negate(q))),C1),Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),p),Power(Times(c,Plus(Times(p,Plus(Times(C2,n),Negate(q))),C1),Plus(Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),-1)),Times(Plus(n,Negate(q)),p,Power(Times(c,Plus(Times(p,Plus(Times(C2,n),Negate(q))),C1),Plus(Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),-1),Int(Times(Power(x,q),Plus(Times(C2,a,ASymbol,c,Plus(Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),Times(CN1,a,b,BSymbol,Plus(Times(p,q),C1)),Times(Plus(Times(C2,a,BSymbol,c,Plus(Times(p,Plus(Times(C2,n),Negate(q))),C1)),Times(ASymbol,b,c,Plus(Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),Times(CN1,Sqr(b),BSymbol,Plus(Times(p,q),Times(Plus(n,Negate(q)),p),C1))),Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,Negate(C1)))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,ASymbol,BSymbol,n,q),x),ZeroQ(Plus(r,Negate(Plus(n,Negate(q)))))),ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q)))))),Not(IntegerQ(p))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),RationalQ(p)),Greater(p,C0)),NonzeroQ(Plus(Times(p,Plus(Times(C2,n),Negate(q))),C1))),NonzeroQ(Plus(Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1))))),
ISetDelayed(Int(Times(Plus(A_,Times(B_DEFAULT,Power(x_,r_DEFAULT))),Power(Plus(Times(c_DEFAULT,Power(x_,j_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT))),p_)),x_Symbol),
    Condition(Module(List(Set(n,Plus(q,r))),Condition(Plus(Times(x,Plus(Times(ASymbol,Plus(Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),Times(BSymbol,Plus(Times(p,Plus(Times(C2,n),Negate(q))),C1),Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),p),Power(Times(Plus(Times(p,Plus(Times(C2,n),Negate(q))),C1),Plus(Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),-1)),Times(Plus(n,Negate(q)),p,Power(Times(Plus(Times(p,Plus(Times(C2,n),Negate(q))),C1),Plus(Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),-1),Int(Times(Power(x,q),Plus(Times(C2,a,ASymbol,Plus(Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),Times(C2,a,BSymbol,Plus(Times(p,Plus(Times(C2,n),Negate(q))),C1),Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,Negate(C1)))),x))),And(And(ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q))))),NonzeroQ(Plus(Times(p,Plus(Times(C2,n),Negate(q))),C1))),NonzeroQ(Plus(Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1))))),And(And(And(FreeQ(List(a,c,ASymbol,BSymbol,q),x),Not(IntegerQ(p))),RationalQ(p)),Greater(p,C0)))),
ISetDelayed(Int(Times(Plus(A_,Times(B_DEFAULT,Power(x_,r_DEFAULT))),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,j_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,Plus(Negate(q),C1)),Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(CN1,C2,a,ASymbol,c),Times(Plus(Times(ASymbol,b),Times(CN1,C2,a,BSymbol)),c,Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,C1)),Power(Times(a,Plus(n,Negate(q)),Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),Times(Power(Times(a,Plus(n,Negate(q)),Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1),Int(Times(Power(x,Negate(q)),Plus(Times(ASymbol,Sqr(b),Plus(Times(p,q),Times(Plus(n,Negate(q)),Plus(p,C1)),C1)),Times(CN1,a,b,BSymbol,Plus(Times(p,q),C1)),Times(CN1,C2,a,ASymbol,c,Plus(Times(p,q),Times(C2,Plus(n,Negate(q)),Plus(p,C1)),C1)),Times(Plus(Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C3)),C1),Plus(Times(ASymbol,b),Times(CN1,C2,a,BSymbol)),c,Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,C1))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,ASymbol,BSymbol,n,q),x),ZeroQ(Plus(r,Negate(Plus(n,Negate(q)))))),ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q)))))),Not(IntegerQ(p))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),RationalQ(p)),Less(p,CN1)))),
ISetDelayed(Int(Times(Plus(A_,Times(B_DEFAULT,Power(x_,r_DEFAULT))),Power(Plus(Times(c_DEFAULT,Power(x_,j_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT))),p_)),x_Symbol),
    Condition(Module(List(Set(n,Plus(q,r))),Condition(Plus(Times(CN1,Power(x,Plus(Negate(q),C1)),Plus(Times(a,ASymbol,c),Times(a,BSymbol,c,Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,C1)),Power(Times(a,Plus(n,Negate(q)),Plus(p,C1),C2,a,c),-1)),Times(Power(Times(a,Plus(n,Negate(q)),Plus(p,C1),C2,a,c),-1),Int(Times(Power(x,Negate(q)),Plus(Times(a,ASymbol,c,Plus(Times(p,q),Times(C2,Plus(n,Negate(q)),Plus(p,C1)),C1)),Times(a,BSymbol,c,Plus(Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C3)),C1),Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,C1))),x))),ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q))))))),And(And(And(FreeQ(List(a,c,ASymbol,BSymbol,q),x),Not(IntegerQ(p))),RationalQ(p)),Less(p,CN1)))),
ISetDelayed(Int(Times(Plus(A_,Times(B_DEFAULT,Power(x_,j_DEFAULT))),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,r_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Plus(ASymbol,Times(BSymbol,Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),p)),x),And(And(FreeQ(List(a,b,c,ASymbol,BSymbol,n,p,q),x),ZeroQ(Plus(j,Negate(Plus(n,Negate(q)))))),ZeroQ(Plus(r,Negate(Plus(Times(C2,n),Negate(q)))))))),
ISetDelayed(Int(Times(Plus(A_,Times(B_DEFAULT,Power(u_,j_DEFAULT))),Power(Plus(Times(a_DEFAULT,Power(v_,q_DEFAULT)),Times(b_DEFAULT,Power(w_,n_DEFAULT)),Times(c_DEFAULT,Power(z_,r_DEFAULT))),p_)),x_Symbol),
    Condition(Times(Power(Coefficient(u,x,C1),-1),Subst(Int(Times(Plus(ASymbol,Times(BSymbol,Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),p)),x),x,u)),And(And(And(And(And(And(And(FreeQ(List(a,b,c,ASymbol,BSymbol,n,p,q),x),ZeroQ(Plus(j,Negate(Plus(n,Negate(q)))))),ZeroQ(Plus(r,Negate(Plus(Times(C2,n),Negate(q)))))),ZeroQ(Plus(u,Negate(v)))),ZeroQ(Plus(u,Negate(w)))),ZeroQ(Plus(u,Negate(z)))),LinearQ(u,x)),NonzeroQ(Plus(u,Negate(x)))))),
ISetDelayed(Int(Times(z_,Power(u_,p_DEFAULT)),x_Symbol),
    Condition(Int(Times(ExpandToSum(z,x),Power(ExpandToSum(u,x),p)),x),And(And(And(And(FreeQ(p,x),BinomialQ(z,x)),GeneralizedTrinomialQ(u,x)),ZeroQ(Plus(BinomialDegree(z,x),Negate(GeneralizedTrinomialDegree(u,x))))),Not(And(BinomialMatchQ(z,x),GeneralizedTrinomialMatchQ(u,x))))))
  );
}