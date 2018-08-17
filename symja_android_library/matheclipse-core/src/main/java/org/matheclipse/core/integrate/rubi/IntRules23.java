package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules23 { 
  public static IAST RULES = List( 
IIntegrate(5239,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),FracPart(p)),Power(Times(Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Plus(Times(a,Power(d,-1)),Times(c,Sqr(x),Power(e,-1))),FracPart(p))),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,q)),Power(Plus(Times(a,Power(d,-1)),Times(c,Sqr(x),Power(e,-1))),p)),x),x),And(FreeQ(List(a,b,c,d,e,p,q),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(p))))),
IIntegrate(5240,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(c,Power(x,4))),FracPart(p)),Power(Times(Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Plus(Times(a,Power(d,-1)),Times(c,Sqr(x),Power(e,-1))),FracPart(p))),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,q)),Power(Plus(Times(a,Power(d,-1)),Times(c,Sqr(x),Power(e,-1))),p)),x),x),And(FreeQ(List(a,c,d,e,p,q),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p))))),
IIntegrate(5241,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),p)),x),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IGtQ(p,C0),IGtQ(q,CN2)))),
IIntegrate(5242,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(c,Power(x,4))),p)),x),x),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IGtQ(p,C0),IGtQ(q,CN2)))),
IIntegrate(5243,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(a,p),x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(d,-1)),x),Dist(Power(d,-1),Int(Times(Sqr(x),Power(Plus(d,Times(e,Sqr(x))),q),Plus(Times(d,PolynomialQuotient(Plus(Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),p),Negate(Power(a,p))),Sqr(x),x)),Times(CN1,e,Power(a,p),Plus(Times(C2,q),C3)))),x),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IGtQ(p,C0),ILtQ(Plus(q,C1D2),C0),LtQ(Plus(Times(C4,p),Times(C2,q),C1),C0)))),
IIntegrate(5244,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(a,p),x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(d,-1)),x),Dist(Power(d,-1),Int(Times(Sqr(x),Power(Plus(d,Times(e,Sqr(x))),q),Plus(Times(d,PolynomialQuotient(Plus(Power(Plus(a,Times(c,Power(x,4))),p),Negate(Power(a,p))),Sqr(x),x)),Times(CN1,e,Power(a,p),Plus(Times(C2,q),C3)))),x),x)),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IGtQ(p,C0),ILtQ(Plus(q,C1D2),C0),LtQ(Plus(Times(C4,p),Times(C2,q),C1),C0)))),
IIntegrate(5245,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("§qx"),PolynomialQuotient(Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),p),Plus(d,Times(e,Sqr(x))),x)),Set($s("R"),Coeff(PolynomialRemainder(Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),p),Plus(d,Times(e,Sqr(x))),x),x,C0))),Plus(Negate(Simp(Times($s("R"),x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(C2,d,Plus(q,C1)),-1)),x)),Dist(Power(Times(C2,d,Plus(q,C1)),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),ExpandToSum(Plus(Times(C2,d,Plus(q,C1),$s("§qx")),Times($s("R"),Plus(Times(C2,q),C3))),x)),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IGtQ(p,C0),LtQ(q,CN1)))),
IIntegrate(5246,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("§qx"),PolynomialQuotient(Power(Plus(a,Times(c,Power(x,4))),p),Plus(d,Times(e,Sqr(x))),x)),Set($s("R"),Coeff(PolynomialRemainder(Power(Plus(a,Times(c,Power(x,4))),p),Plus(d,Times(e,Sqr(x))),x),x,C0))),Plus(Negate(Simp(Times($s("R"),x,Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(C2,d,Plus(q,C1)),-1)),x)),Dist(Power(Times(C2,d,Plus(q,C1)),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),ExpandToSum(Plus(Times(C2,d,Plus(q,C1),$s("§qx")),Times($s("R"),Plus(Times(C2,q),C3))),x)),x),x))),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IGtQ(p,C0),LtQ(q,CN1)))),
IIntegrate(5247,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(c,p),Power(x,Plus(Times(C4,p),Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(e,Plus(Times(C4,p),Times(C2,q),C1)),-1)),x),Dist(Power(Times(e,Plus(Times(C4,p),Times(C2,q),C1)),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),q),ExpandToSum(Plus(Times(e,Plus(Times(C4,p),Times(C2,q),C1),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),p)),Times(CN1,d,Power(c,p),Plus(Times(C4,p),Negate(C1)),Power(x,Plus(Times(C4,p),Negate(C2)))),Times(CN1,e,Power(c,p),Plus(Times(C4,p),Times(C2,q),C1),Power(x,Times(C4,p)))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,q),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IGtQ(p,C0),Not(LtQ(q,CN1))))),
IIntegrate(5248,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(c,p),Power(x,Plus(Times(C4,p),Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Times(e,Plus(Times(C4,p),Times(C2,q),C1)),-1)),x),Dist(Power(Times(e,Plus(Times(C4,p),Times(C2,q),C1)),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),q),ExpandToSum(Plus(Times(e,Plus(Times(C4,p),Times(C2,q),C1),Power(Plus(a,Times(c,Power(x,4))),p)),Times(CN1,d,Power(c,p),Plus(Times(C4,p),Negate(C1)),Power(x,Plus(Times(C4,p),Negate(C2)))),Times(CN1,e,Power(c,p),Plus(Times(C4,p),Times(C2,q),C1),Power(x,Times(C4,p)))),x)),x),x)),And(FreeQ(List(a,c,d,e,q),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IGtQ(p,C0),Not(LtQ(q,CN1))))),
IIntegrate(5249,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Times(C2,d,Power(e,-1)),Times(CN1,b,Power(c,-1))),C2))),Plus(Dist(Times(e,Power(Times(C2,c),-1)),Int(Power(Simp(Plus(Times(d,Power(e,-1)),Times(q,x),Sqr(x)),x),-1),x),x),Dist(Times(e,Power(Times(C2,c),-1)),Int(Power(Simp(Plus(Times(d,Power(e,-1)),Times(CN1,q,x),Sqr(x)),x),-1),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0),Or(GtQ(Plus(Times(C2,d,Power(e,-1)),Times(CN1,b,Power(c,-1))),C0),And(Not(LtQ(Plus(Times(C2,d,Power(e,-1)),Times(CN1,b,Power(c,-1))),C0)),EqQ(Plus(d,Times(CN1,e,Rt(Times(a,Power(c,-1)),C2))),C0)))))),
IIntegrate(5250,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(C2,d,Power(e,-1)),C2))),Plus(Dist(Times(e,Power(Times(C2,c),-1)),Int(Power(Simp(Plus(Times(d,Power(e,-1)),Times(q,x),Sqr(x)),x),-1),x),x),Dist(Times(e,Power(Times(C2,c),-1)),Int(Power(Simp(Plus(Times(d,Power(e,-1)),Times(CN1,q,x),Sqr(x)),x),-1),x),x))),And(FreeQ(List(a,c,d,e),x),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0),PosQ(Times(d,e))))),
IIntegrate(5251,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Plus(Times(C1D2,e),Times(Plus(Times(C2,c,d),Times(CN1,b,e)),Power(Times(C2,q),-1))),Int(Power(Plus(Times(C1D2,b),Times(CN1,C1D2,q),Times(c,Sqr(x))),-1),x),x),Dist(Plus(Times(C1D2,e),Times(CN1,Plus(Times(C2,c,d),Times(CN1,b,e)),Power(Times(C2,q),-1))),Int(Power(Plus(Times(C1D2,b),Times(C1D2,q),Times(c,Sqr(x))),-1),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0),GtQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(5252,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Times(CN2,d,Power(e,-1)),Times(CN1,b,Power(c,-1))),C2))),Plus(Dist(Times(e,Power(Times(C2,c,q),-1)),Int(Times(Plus(q,Times(CN1,C2,x)),Power(Simp(Plus(Times(d,Power(e,-1)),Times(q,x),Negate(Sqr(x))),x),-1)),x),x),Dist(Times(e,Power(Times(C2,c,q),-1)),Int(Times(Plus(q,Times(C2,x)),Power(Simp(Plus(Times(d,Power(e,-1)),Times(CN1,q,x),Negate(Sqr(x))),x),-1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0),Not(GtQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0))))),
IIntegrate(5253,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN2,d,Power(e,-1)),C2))),Plus(Dist(Times(e,Power(Times(C2,c,q),-1)),Int(Times(Plus(q,Times(CN1,C2,x)),Power(Simp(Plus(Times(d,Power(e,-1)),Times(q,x),Negate(Sqr(x))),x),-1)),x),x),Dist(Times(e,Power(Times(C2,c,q),-1)),Int(Times(Plus(q,Times(C2,x)),Power(Simp(Plus(Times(d,Power(e,-1)),Times(CN1,q,x),Negate(Sqr(x))),x),-1)),x),x))),And(FreeQ(List(a,c,d,e),x),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0),NegQ(Times(d,e))))),
IIntegrate(5254,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Plus(Times(C1D2,e),Times(Plus(Times(C2,c,d),Times(CN1,b,e)),Power(Times(C2,q),-1))),Int(Power(Plus(Times(C1D2,b),Times(CN1,C1D2,q),Times(c,Sqr(x))),-1),x),x),Dist(Plus(Times(C1D2,e),Times(CN1,Plus(Times(C2,c,d),Times(CN1,b,e)),Power(Times(C2,q),-1))),Int(Power(Plus(Times(C1D2,b),Times(C1D2,q),Times(c,Sqr(x))),-1),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0),PosQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
IIntegrate(5255,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN1,a,c),C2))),Plus(Dist(Plus(Times(C1D2,e),Times(c,d,Power(Times(C2,q),-1))),Int(Power(Plus(Negate(q),Times(c,Sqr(x))),-1),x),x),Dist(Plus(Times(C1D2,e),Times(CN1,c,d,Power(Times(C2,q),-1))),Int(Power(Plus(q,Times(c,Sqr(x))),-1),x),x))),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0),PosQ(Times(CN1,a,c))))),
IIntegrate(5256,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(a,c),C2))),Plus(Dist(Times(Plus(Times(d,q),Times(a,e)),Power(Times(C2,a,c),-1)),Int(Times(Plus(q,Times(c,Sqr(x))),Power(Plus(a,Times(c,Power(x,4))),-1)),x),x),Dist(Times(Plus(Times(d,q),Times(CN1,a,e)),Power(Times(C2,a,c),-1)),Int(Times(Plus(q,Times(CN1,c,Sqr(x))),Power(Plus(a,Times(c,Power(x,4))),-1)),x),x))),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0),NegQ(Times(CN1,a,c))))),
IIntegrate(5257,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(a,Power(c,-1)),C2))),With(List(Set(r,Rt(Plus(Times(C2,q),Times(CN1,b,Power(c,-1))),C2))),Plus(Dist(Power(Times(C2,c,q,r),-1),Int(Times(Plus(Times(d,r),Times(CN1,Plus(d,Times(CN1,e,q)),x)),Power(Plus(q,Times(CN1,r,x),Sqr(x)),-1)),x),x),Dist(Power(Times(C2,c,q,r),-1),Int(Times(Plus(Times(d,r),Times(Plus(d,Times(CN1,e,q)),x)),Power(Plus(q,Times(r,x),Sqr(x)),-1)),x),x)))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NegQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
IIntegrate(5258,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),-1)),x),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IntegerQ(q)))),
IIntegrate(5259,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(c,Power(x,4))),-1)),x),x),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IntegerQ(q)))),
IIntegrate(5260,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(e),Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),-1)),Int(Power(Plus(d,Times(e,Sqr(x))),q),x),x),Dist(Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(Times(c,d),Times(CN1,b,e),Times(CN1,c,e,Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(q)),LtQ(q,CN1)))),
IIntegrate(5261,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(e),Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),-1)),Int(Power(Plus(d,Times(e,Sqr(x))),q),x),x),Dist(Times(c,Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(d,Times(CN1,e,Sqr(x))),Power(Plus(a,Times(c,Power(x,4))),-1)),x),x)),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(q)),LtQ(q,CN1)))),
IIntegrate(5262,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(r,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Times(C2,c,Power(r,-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(b,Negate(r),Times(C2,c,Sqr(x))),-1)),x),x),Negate(Dist(Times(C2,c,Power(r,-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(b,r,Times(C2,c,Sqr(x))),-1)),x),x)))),And(FreeQ(List(a,b,c,d,e,q),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(q))))),
IIntegrate(5263,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(r,Rt(Times(CN1,a,c),C2))),Plus(Negate(Dist(Times(c,Power(Times(C2,r),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(r,Times(CN1,c,Sqr(x))),-1)),x),x)),Negate(Dist(Times(c,Power(Times(C2,r),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(r,Times(c,Sqr(x))),-1)),x),x)))),And(FreeQ(List(a,c,d,e,q),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(q))))),
IIntegrate(5264,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(x,Plus(Times(C2,b,e,p),Times(c,d,Plus(Times(C4,p),C3)),Times(c,e,Plus(Times(C4,p),C1),Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),p),Power(Times(c,Plus(Times(C4,p),C1),Plus(Times(C4,p),C3)),-1)),x),Dist(Times(C2,p,Power(Times(c,Plus(Times(C4,p),C1),Plus(Times(C4,p),C3)),-1)),Int(Times(Simp(Plus(Times(C2,a,c,d,Plus(Times(C4,p),C3)),Times(CN1,a,b,e),Times(Plus(Times(C2,a,c,e,Plus(Times(C4,p),C1)),Times(b,c,d,Plus(Times(C4,p),C3)),Times(CN1,Sqr(b),e,Plus(Times(C2,p),C1))),Sqr(x))),x),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),Plus(p,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),GtQ(p,C0),FractionQ(p),IntegerQ(Times(C2,p))))),
IIntegrate(5265,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(x,Plus(Times(d,Plus(Times(C4,p),C3)),Times(e,Plus(Times(C4,p),C1),Sqr(x))),Power(Plus(a,Times(c,Power(x,4))),p),Power(Times(Plus(Times(C4,p),C1),Plus(Times(C4,p),C3)),-1)),x),Dist(Times(C2,p,Power(Times(Plus(Times(C4,p),C1),Plus(Times(C4,p),C3)),-1)),Int(Times(Simp(Plus(Times(C2,a,d,Plus(Times(C4,p),C3)),Times(C2,a,e,Plus(Times(C4,p),C1),Sqr(x))),x),Power(Plus(a,Times(c,Power(x,4))),Plus(p,Negate(C1)))),x),x)),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),GtQ(p,C0),FractionQ(p),IntegerQ(Times(C2,p))))),
IIntegrate(5266,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(x,Plus(Times(a,b,e),Times(CN1,d,Plus(Sqr(b),Times(CN1,C2,a,c))),Times(CN1,c,Plus(Times(b,d),Times(CN1,C2,a,e)),Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),Plus(p,C1)),Power(Times(C2,a,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x),Dist(Power(Times(C2,a,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1),Int(Times(Simp(Plus(Times(Plus(Times(C2,p),C3),d,Sqr(b)),Times(CN1,a,b,e),Times(CN1,C2,a,c,d,Plus(Times(C4,p),C5)),Times(Plus(Times(C4,p),C7),Plus(Times(d,b),Times(CN1,C2,a,e)),c,Sqr(x))),x),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),LtQ(p,CN1),IntegerQ(Times(C2,p))))),
IIntegrate(5267,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Plus(d,Times(e,Sqr(x))),Power(Plus(a,Times(c,Power(x,4))),Plus(p,C1)),Power(Times(C4,a,Plus(p,C1)),-1)),x)),Dist(Power(Times(C4,a,Plus(p,C1)),-1),Int(Times(Simp(Plus(Times(d,Plus(Times(C4,p),C5)),Times(e,Plus(Times(C4,p),C7),Sqr(x))),x),Power(Plus(a,Times(c,Power(x,4))),Plus(p,C1))),x),x)),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),LtQ(p,CN1),IntegerQ(Times(C2,p))))),
IIntegrate(5268,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Dist(Times(C2,Sqrt(Negate(c))),Int(Times(Plus(d,Times(e,Sqr(x))),Power(Times(Sqrt(Plus(b,q,Times(C2,c,Sqr(x)))),Sqrt(Plus(Negate(b),q,Times(CN1,C2,c,Sqr(x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),GtQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),LtQ(c,C0)))),
IIntegrate(5269,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN1,a,c),C2))),Dist(Sqrt(Negate(c)),Int(Times(Plus(d,Times(e,Sqr(x))),Power(Times(Sqrt(Plus(q,Times(c,Sqr(x)))),Sqrt(Plus(q,Times(CN1,c,Sqr(x))))),-1)),x),x)),And(FreeQ(List(a,c,d,e),x),GtQ(a,C0),LtQ(c,C0)))),
IIntegrate(5270,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(c,Power(a,-1)),C4))),Condition(Plus(Negate(Simp(Times(d,x,Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4)))),Power(Times(a,Plus(C1,Times(Sqr(q),Sqr(x)))),-1)),x)),Simp(Times(d,Plus(C1,Times(Sqr(q),Sqr(x))),Sqrt(Times(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),Power(Times(a,Sqr(Plus(C1,Times(Sqr(q),Sqr(x))))),-1))),EllipticE(Times(C2,ArcTan(Times(q,x))),Plus(C1D2,Times(CN1,b,Sqr(q),Power(Times(C4,c),-1)))),Power(Times(q,Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))))),-1)),x)),EqQ(Plus(e,Times(d,Sqr(q))),C0))),And(FreeQ(List(a,b,c,d,e),x),GtQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),GtQ(Times(c,Power(a,-1)),C0),LtQ(Times(b,Power(a,-1)),C0)))),
IIntegrate(5271,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(c,Power(a,-1)),C2))),Condition(Plus(Dist(Times(Plus(e,Times(d,q)),Power(q,-1)),Int(Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2),x),x),Negate(Dist(Times(e,Power(q,-1)),Int(Times(Plus(C1,Times(CN1,q,Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2)),x),x))),NeQ(Plus(e,Times(d,q)),C0))),And(FreeQ(List(a,b,c,d,e),x),GtQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),GtQ(Times(c,Power(a,-1)),C0),LtQ(Times(b,Power(a,-1)),C0)))),
IIntegrate(5272,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Condition(Plus(Simp(Times(e,x,Plus(b,q,Times(C2,c,Sqr(x))),Power(Times(C2,c,Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))))),-1)),x),Negate(Simp(Times(e,q,Sqrt(Times(Plus(Times(C2,a),Times(Plus(b,Negate(q)),Sqr(x))),Power(Plus(Times(C2,a),Times(Plus(b,q),Sqr(x))),-1))),Sqrt(Times(Plus(Times(C2,a),Times(Plus(b,q),Sqr(x))),Power(q,-1))),EllipticE(ArcSin(Times(x,Power(Times(Plus(Times(C2,a),Times(Plus(b,q),Sqr(x))),Power(Times(C2,q),-1)),CN1D2))),Times(Plus(b,q),Power(Times(C2,q),-1))),Power(Times(C2,c,Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4)))),Sqrt(Times(a,Power(Plus(Times(C2,a),Times(Plus(b,q),Sqr(x))),-1)))),-1)),x))),EqQ(Plus(Times(C2,c,d),Times(CN1,e,Plus(b,Negate(q)))),C0))),And(FreeQ(List(a,b,c,d,e),x),GtQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),LtQ(a,C0),GtQ(c,C0)))),
IIntegrate(5273,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN1,a,c),C2))),Condition(Plus(Simp(Times(e,x,Plus(q,Times(c,Sqr(x))),Power(Times(c,Sqrt(Plus(a,Times(c,Power(x,4))))),-1)),x),Negate(Simp(Times(CSqrt2,e,q,Sqrt(Plus(Negate(a),Times(q,Sqr(x)))),Sqrt(Times(Plus(a,Times(q,Sqr(x))),Power(q,-1))),EllipticE(ArcSin(Times(x,Power(Times(Plus(a,Times(q,Sqr(x))),Power(Times(C2,q),-1)),CN1D2))),C1D2),Power(Times(Sqrt(Negate(a)),c,Sqrt(Plus(a,Times(c,Power(x,4))))),-1)),x))),And(EqQ(Plus(Times(c,d),Times(e,q)),C0),IntegerQ(q)))),And(FreeQ(List(a,c,d,e),x),LtQ(a,C0),GtQ(c,C0)))),
IIntegrate(5274,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN1,a,c),C2))),Condition(Plus(Simp(Times(e,x,Plus(q,Times(c,Sqr(x))),Power(Times(c,Sqrt(Plus(a,Times(c,Power(x,4))))),-1)),x),Negate(Simp(Times(CSqrt2,e,q,Sqrt(Times(Plus(a,Times(CN1,q,Sqr(x))),Power(Plus(a,Times(q,Sqr(x))),-1))),Sqrt(Times(Plus(a,Times(q,Sqr(x))),Power(q,-1))),EllipticE(ArcSin(Times(x,Power(Times(Plus(a,Times(q,Sqr(x))),Power(Times(C2,q),-1)),CN1D2))),C1D2),Power(Times(c,Sqrt(Plus(a,Times(c,Power(x,4)))),Sqrt(Times(a,Power(Plus(a,Times(q,Sqr(x))),-1)))),-1)),x))),EqQ(Plus(Times(c,d),Times(e,q)),C0))),And(FreeQ(List(a,c,d,e),x),LtQ(a,C0),GtQ(c,C0)))),
IIntegrate(5275,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Condition(Plus(Dist(Times(Plus(Times(C2,c,d),Times(CN1,e,Plus(b,Negate(q)))),Power(Times(C2,c),-1)),Int(Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2),x),x),Dist(Times(e,Power(Times(C2,c),-1)),Int(Times(Plus(b,Negate(q),Times(C2,c,Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2)),x),x)),NeQ(Plus(Times(C2,c,d),Times(CN1,e,Plus(b,Negate(q)))),C0))),And(FreeQ(List(a,b,c,d,e),x),GtQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),LtQ(a,C0),GtQ(c,C0)))),
IIntegrate(5276,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN1,a,c),C2))),Condition(Plus(Dist(Times(Plus(Times(c,d),Times(e,q)),Power(c,-1)),Int(Power(Plus(a,Times(c,Power(x,4))),CN1D2),x),x),Negate(Dist(Times(e,Power(c,-1)),Int(Times(Plus(q,Times(CN1,c,Sqr(x))),Power(Plus(a,Times(c,Power(x,4))),CN1D2)),x),x))),NeQ(Plus(Times(c,d),Times(e,q)),C0))),And(FreeQ(List(a,c,d,e),x),LtQ(a,C0),GtQ(c,C0)))),
IIntegrate(5277,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Condition(Plus(Dist(d,Int(Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2),x),x),Dist(e,Int(Times(Sqr(x),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2)),x),x)),Or(PosQ(Times(Plus(b,q),Power(a,-1))),PosQ(Times(Plus(b,Negate(q)),Power(a,-1)))))),And(FreeQ(List(a,b,c,d,e),x),GtQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(5278,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(Plus(Dist(d,Int(Power(Plus(a,Times(c,Power(x,4))),CN1D2),x),x),Dist(e,Int(Times(Sqr(x),Power(Plus(a,Times(c,Power(x,4))),CN1D2)),x),x)),And(FreeQ(List(a,c,d,e),x),GtQ(Times(CN1,a,c),C0)))),
IIntegrate(5279,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Condition(Negate(Simp(Times(a,e,Rt(Times(CN1,Plus(b,q),Power(Times(C2,a),-1)),C2),Sqrt(Plus(C1,Times(Plus(b,q),Sqr(x),Power(Times(C2,a),-1)))),Sqrt(Plus(C1,Times(Plus(b,Negate(q)),Sqr(x),Power(Times(C2,a),-1)))),EllipticE(ArcSin(Times(Rt(Times(CN1,Plus(b,q),Power(Times(C2,a),-1)),C2),x)),Times(Plus(b,Negate(q)),Power(Plus(b,q),-1))),Power(Times(c,Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))))),-1)),x)),And(NegQ(Times(Plus(b,q),Power(a,-1))),EqQ(Plus(Times(C2,c,d),Times(CN1,e,Plus(b,q))),C0),Not(SimplerSqrtQ(Times(CN1,Plus(b,Negate(q)),Power(Times(C2,a),-1)),Times(CN1,Plus(b,q),Power(Times(C2,a),-1))))))),And(FreeQ(List(a,b,c,d,e),x),GtQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(5280,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Condition(Plus(Dist(Times(Plus(Times(C2,c,d),Times(CN1,e,Plus(b,q))),Power(Times(C2,c),-1)),Int(Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2),x),x),Dist(Times(e,Power(Times(C2,c),-1)),Int(Times(Plus(b,q,Times(C2,c,Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2)),x),x)),And(NegQ(Times(Plus(b,q),Power(a,-1))),NeQ(Plus(Times(C2,c,d),Times(CN1,e,Plus(b,q))),C0),Not(SimplerSqrtQ(Times(CN1,Plus(b,Negate(q)),Power(Times(C2,a),-1)),Times(CN1,Plus(b,q),Power(Times(C2,a),-1))))))),And(FreeQ(List(a,b,c,d,e),x),GtQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(5281,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Condition(Negate(Simp(Times(a,e,Rt(Times(CN1,Plus(b,Negate(q)),Power(Times(C2,a),-1)),C2),Sqrt(Plus(C1,Times(Plus(b,Negate(q)),Sqr(x),Power(Times(C2,a),-1)))),Sqrt(Plus(C1,Times(Plus(b,q),Sqr(x),Power(Times(C2,a),-1)))),EllipticE(ArcSin(Times(Rt(Times(CN1,Plus(b,Negate(q)),Power(Times(C2,a),-1)),C2),x)),Times(Plus(b,q),Power(Plus(b,Negate(q)),-1))),Power(Times(c,Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))))),-1)),x)),And(NegQ(Times(Plus(b,Negate(q)),Power(a,-1))),EqQ(Plus(Times(C2,c,d),Times(CN1,e,Plus(b,Negate(q)))),C0)))),And(FreeQ(List(a,b,c,d,e),x),GtQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(5282,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Condition(Plus(Dist(Times(Plus(Times(C2,c,d),Times(CN1,e,Plus(b,Negate(q)))),Power(Times(C2,c),-1)),Int(Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2),x),x),Dist(Times(e,Power(Times(C2,c),-1)),Int(Times(Plus(b,Negate(q),Times(C2,c,Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2)),x),x)),And(NegQ(Times(Plus(b,Negate(q)),Power(a,-1))),NeQ(Plus(Times(C2,c,d),Times(CN1,e,Plus(b,Negate(q)))),C0)))),And(FreeQ(List(a,b,c,d,e),x),GtQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
IIntegrate(5283,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(c,Power(a,-1)),C4))),Condition(Plus(Negate(Simp(Times(d,x,Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4)))),Power(Times(a,Plus(C1,Times(Sqr(q),Sqr(x)))),-1)),x)),Simp(Times(d,Plus(C1,Times(Sqr(q),Sqr(x))),Sqrt(Times(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),Power(Times(a,Sqr(Plus(C1,Times(Sqr(q),Sqr(x))))),-1))),EllipticE(Times(C2,ArcTan(Times(q,x))),Plus(C1D2,Times(CN1,b,Sqr(q),Power(Times(C4,c),-1)))),Power(Times(q,Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))))),-1)),x)),EqQ(Plus(e,Times(d,Sqr(q))),C0))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),PosQ(Times(c,Power(a,-1)))))),
IIntegrate(5284,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(c,Power(a,-1)),C4))),Condition(Plus(Negate(Simp(Times(d,x,Sqrt(Plus(a,Times(c,Power(x,4)))),Power(Times(a,Plus(C1,Times(Sqr(q),Sqr(x)))),-1)),x)),Simp(Times(d,Plus(C1,Times(Sqr(q),Sqr(x))),Sqrt(Times(Plus(a,Times(c,Power(x,4))),Power(Times(a,Sqr(Plus(C1,Times(Sqr(q),Sqr(x))))),-1))),EllipticE(Times(C2,ArcTan(Times(q,x))),C1D2),Power(Times(q,Sqrt(Plus(a,Times(c,Power(x,4))))),-1)),x)),EqQ(Plus(e,Times(d,Sqr(q))),C0))),And(FreeQ(List(a,c,d,e),x),PosQ(Times(c,Power(a,-1)))))),
IIntegrate(5285,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(c,Power(a,-1)),C2))),Condition(Plus(Dist(Times(Plus(e,Times(d,q)),Power(q,-1)),Int(Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2),x),x),Negate(Dist(Times(e,Power(q,-1)),Int(Times(Plus(C1,Times(CN1,q,Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2)),x),x))),NeQ(Plus(e,Times(d,q)),C0))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),PosQ(Times(c,Power(a,-1)))))),
IIntegrate(5286,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(c,Power(a,-1)),C2))),Condition(Plus(Dist(Times(Plus(e,Times(d,q)),Power(q,-1)),Int(Power(Plus(a,Times(c,Power(x,4))),CN1D2),x),x),Negate(Dist(Times(e,Power(q,-1)),Int(Times(Plus(C1,Times(CN1,q,Sqr(x))),Power(Plus(a,Times(c,Power(x,4))),CN1D2)),x),x))),NeQ(Plus(e,Times(d,q)),C0))),And(FreeQ(List(a,c,d,e),x),PosQ(Times(c,Power(a,-1)))))),
IIntegrate(5287,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(Dist(Times(d,Power(a,CN1D2)),Int(Times(Sqrt(Plus(C1,Times(e,Sqr(x),Power(d,-1)))),Power(Plus(C1,Times(CN1,e,Sqr(x),Power(d,-1))),CN1D2)),x),x),And(FreeQ(List(a,c,d,e),x),NegQ(Times(c,Power(a,-1))),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),GtQ(a,C0)))),
IIntegrate(5288,Int(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(c,Power(x,4),Power(a,-1)))),Power(Plus(a,Times(c,Power(x,4))),CN1D2)),Int(Times(Plus(d,Times(e,Sqr(x))),Power(Plus(C1,Times(c,Power(x,4),Power(a,-1))),CN1D2)),x),x),And(FreeQ(List(a,c,d,e),x),NegQ(Times(c,Power(a,-1))),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(GtQ(a,C0)))))
  );
}