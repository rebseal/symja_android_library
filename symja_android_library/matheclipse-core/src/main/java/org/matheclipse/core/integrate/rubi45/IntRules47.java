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
public class IntRules47 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,r))),q)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,f,m,n,q,r),x),IntegerQ(q),Or(GtQ(q,C0),And(IntegerQ(m),IntegerQ(r)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(d,Times(e,Power(x,Times(r,Power(n,-1))))),q),Power(Plus(a,Times(b,Log(Times(c,x)))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,e,m,n,p,q,r),x),IntegerQ(q),IntegerQ(Times(r,Power(n,-1))),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1)))),Or(GtQ(Times(Plus(m,C1),Power(n,-1)),C0),IGtQ(p,C0))))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,r))),q)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,f,m,n,p,q,r),x),IntegerQ(q),Or(GtQ(q,C0),And(IGtQ(p,C0),IntegerQ(m),IntegerQ(r)))))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,r))),q),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),FreeQ(List(a,b,c,d,e,f,m,n,p,q,r),x))),
ISetDelayed(Int(Times(Power(u_,q_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Times(f,x),m),Power(ExpandToSum(u,x),q),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),And(FreeQ(List(a,b,c,f,m,n,p,q),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x))))),
ISetDelayed(Int(Times($p("§polyx"),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§polyx"),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),x),And(FreeQ(List(a,b,c,n,p),x),PolynomialQ($s("§polyx"),x)))),
ISetDelayed(Int(Times($p("§rfx"),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),$s("§rfx"),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,n),x),RationalFunctionQ($s("§rfx"),x),IGtQ(p,C0)))),
ISetDelayed(Int(Times($p("§rfx"),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times($s("§rfx"),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,n),x),RationalFunctionQ($s("§rfx"),x),IGtQ(p,C0)))),
ISetDelayed(Int(Times($p("§afx"),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times($s("§afx"),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),And(FreeQ(List(a,b,c,n,p),x),AlgebraicFunctionQ($s("§afx"),x,True)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Plus(d,Times(e,Log(Times(c,Power(x,n))))),q)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),IntegerQ(p),IntegerQ(q)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Times(f_DEFAULT,Power(x_,r_DEFAULT)))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),x))),Plus(Dist(Plus(d,Times(e,Log(Times(f,Power(x,r))))),u,x),Negate(Dist(Times(e,r),Int(SimplifyIntegrand(Times(u,Power(x,-1)),x),x),x)))),FreeQ(List(a,b,c,d,e,f,n,p,r),x))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Log(Times(f_DEFAULT,Power(x_,r_DEFAULT))))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Plus(d,Times(e,Log(Times(f,Power(x,r))))),q)),x),Negate(Dist(Times(b,n,p),Int(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Log(Times(f,Power(x,r))))),q)),x),x)),Negate(Dist(Times(e,q,r),Int(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Plus(d,Times(e,Log(Times(f,Power(x,r))))),Plus(q,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e,f,n,r),x),IGtQ(p,C0),IGtQ(q,C0)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Log(Times(f_DEFAULT,Power(x_,r_DEFAULT))))),q_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Plus(d,Times(e,Log(Times(f,Power(x,r))))),q)),x),FreeQ(List(a,b,c,d,e,f,n,p,q,r),x))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(v_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Log(v_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coeff(v,x,C1),-1),Subst(Int(Times(Power(Plus(a,Times(b,Log(x))),p),Power(Plus(c,Times(d,Log(x))),q)),x),x,v),x),And(FreeQ(List(a,b,c,d,p,q),x),LinearQ(v,x),NeQ(Coeff(v,x,C0),C0)))),
ISetDelayed(Int(Times(Power(x_,-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Plus(d,Times(e,x)),q)),x),x,Log(Times(c,Power(x,n)))),x),FreeQ(List(a,b,c,d,e,n,p,q),x))),
ISetDelayed(Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),Plus(d_DEFAULT,Times(e_DEFAULT,Log(Times(f_DEFAULT,Power(x_,r_DEFAULT)))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x))),Plus(Dist(Plus(d,Times(e,Log(Times(f,Power(x,r))))),u,x),Negate(Dist(Times(e,r),Int(SimplifyIntegrand(Times(u,Power(x,-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p,r),x),Not(And(EqQ(p,C1),EqQ(a,C0),NeQ(d,C0)))))),
ISetDelayed(Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Log(Times(f_DEFAULT,Power(x_,r_DEFAULT))))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(g,x),Plus(m,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Plus(d,Times(e,Log(Times(f,Power(x,r))))),q),Power(Times(g,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,n,p,Power(Plus(m,C1),-1)),Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Log(Times(f,Power(x,r))))),q)),x),x)),Negate(Dist(Times(e,q,r,Power(Plus(m,C1),-1)),Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Plus(d,Times(e,Log(Times(f,Power(x,r))))),Plus(q,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,m,n,r),x),IGtQ(p,C0),IGtQ(q,C0),NeQ(m,CN1)))),
ISetDelayed(Int(Times(Power(Times(g_DEFAULT,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Log(Times(f_DEFAULT,Power(x_,r_DEFAULT))))),q_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Plus(d,Times(e,Log(Times(f,Power(x,r))))),q)),x),FreeQ(List(a,b,c,d,e,f,g,m,n,p,q,r),x))),
ISetDelayed(Int(Times(Power(u_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(v_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Log(v_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(e,Coeff(u,x,C0)),Set(f,Coeff(u,x,C1)),Set(g,Coeff(v,x,C0)),Set(h,Coeff(v,x,C1))),Condition(Dist(Power(h,-1),Subst(Int(Times(Power(Times(f,x,Power(h,-1)),m),Power(Plus(a,Times(b,Log(x))),p),Power(Plus(c,Times(d,Log(x))),q)),x),x,v),x),And(EqQ(Plus(Times(f,g),Times(CN1,e,h)),C0),NeQ(g,C0)))),And(FreeQ(List(a,b,c,d,m,p,q),x),LinearQ(List(u,v),x)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),Log(Times(d_DEFAULT,Power(Plus(e_,Times(f_DEFAULT,Power(x_,m_DEFAULT))),r_DEFAULT)))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Log(Times(d,Power(Plus(e,Times(f,Power(x,m))),r))),x))),Plus(Dist(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),u,x),Negate(Dist(Times(b,n,p),Int(Dist(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,Negate(C1))),Power(x,-1)),u,x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,r,m,n),x),IGtQ(p,C0),RationalQ(m),Or(EqQ(p,C1),And(FractionQ(m),IntegerQ(Power(m,-1))),And(EqQ(r,C1),EqQ(m,C1),EqQ(Times(d,e),C1)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),Log(Times(d_DEFAULT,Power(Plus(e_,Times(f_DEFAULT,Power(x_,m_DEFAULT))),r_DEFAULT)))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),x))),Plus(Dist(Log(Times(d,Power(Plus(e,Times(f,Power(x,m))),r))),u,x),Negate(Dist(Times(f,m,r),Int(Dist(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(e,Times(f,Power(x,m))),-1)),u,x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,r,m,n),x),IGtQ(p,C0),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),Log(Times(d_DEFAULT,Power(Plus(e_,Times(f_DEFAULT,Power(x_,m_DEFAULT))),r_DEFAULT)))),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Log(Times(d,Power(Plus(e,Times(f,Power(x,m))),r)))),x),FreeQ(List(a,b,c,d,e,f,r,m,n,p),x))),
ISetDelayed(Int(Times(Log(Times(d_DEFAULT,Power(u_,r_DEFAULT))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Log(Times(d,Power(ExpandToSum(u,x),r))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),And(FreeQ(List(a,b,c,d,r,n,p),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x))))),
ISetDelayed(Int(Times(Power(x_,-1),Log(Times(d_DEFAULT,Plus(e_,Times(f_DEFAULT,Power(x_,m_DEFAULT))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(PolyLog(C2,Times(CN1,d,f,Power(x,m))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(m,-1)),x)),Dist(Times(b,n,p,Power(m,-1)),Int(Times(PolyLog(C2,Times(CN1,d,f,Power(x,m))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,Negate(C1))),Power(x,-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m,n),x),IGtQ(p,C0),EqQ(Times(d,e),C1)))),
ISetDelayed(Int(Times(Power(x_,-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),Log(Times(d_DEFAULT,Power(Plus(e_,Times(f_DEFAULT,Power(x_,m_DEFAULT))),r_DEFAULT)))),x_Symbol),
    Condition(Plus(Simp(Times(Log(Times(d,Power(Plus(e,Times(f,Power(x,m))),r))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(f,m,r,Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,C1)),Power(Plus(e,Times(f,Power(x,m))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,r,m,n),x),IGtQ(p,C0),NeQ(Times(d,e),C1)))),
ISetDelayed(Int(Times(Power(Times(g_DEFAULT,x_),q_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),Log(Times(d_DEFAULT,Power(Plus(e_,Times(f_DEFAULT,Power(x_,m_DEFAULT))),r_DEFAULT)))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(g,x),q),Log(Times(d,Power(Plus(e,Times(f,Power(x,m))),r)))),x))),Plus(Dist(Plus(a,Times(b,Log(Times(c,Power(x,n))))),u,x),Negate(Dist(Times(b,n),Int(Dist(Power(x,-1),u,x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g,r,m,n,q),x),Or(IntegerQ(Times(Plus(q,C1),Power(m,-1))),And(RationalQ(m),RationalQ(q))),NeQ(q,CN1)))),
ISetDelayed(Int(Times(Power(Times(g_DEFAULT,x_),q_DEFAULT),Log(Times(d_DEFAULT,Plus(e_,Times(f_DEFAULT,Power(x_,m_DEFAULT))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(g,x),q),Log(Times(d,Plus(e,Times(f,Power(x,m)))))),x))),Plus(Dist(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),u,x),Negate(Dist(Times(b,n,p),Int(Dist(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,Negate(C1))),Power(x,-1)),u,x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g,m,n,q),x),IGtQ(p,C0),RationalQ(m),RationalQ(q),NeQ(q,CN1),Or(EqQ(p,C1),And(FractionQ(m),IntegerQ(Times(Plus(q,C1),Power(m,-1)))),And(IGtQ(q,C0),IntegerQ(Times(Plus(q,C1),Power(m,-1))),EqQ(Times(d,e),C1)))))),
ISetDelayed(Int(Times(Power(Times(g_DEFAULT,x_),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),Log(Times(d_DEFAULT,Power(Plus(e_,Times(f_DEFAULT,Power(x_,m_DEFAULT))),r_DEFAULT)))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(g,x),q),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x))),Plus(Dist(Log(Times(d,Power(Plus(e,Times(f,Power(x,m))),r))),u,x),Negate(Dist(Times(f,m,r),Int(Dist(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(e,Times(f,Power(x,m))),-1)),u,x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g,r,m,n,q),x),IGtQ(p,C0),RationalQ(m),RationalQ(q)))),
ISetDelayed(Int(Times(Power(Times(g_DEFAULT,x_),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),Log(Times(d_DEFAULT,Power(Plus(e_,Times(f_DEFAULT,Power(x_,m_DEFAULT))),r_DEFAULT)))),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(g,x),q),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Log(Times(d,Power(Plus(e,Times(f,Power(x,m))),r)))),x),FreeQ(List(a,b,c,d,e,f,g,r,m,n,p,q),x))),
ISetDelayed(Int(Times(Power(Times(g_DEFAULT,x_),q_DEFAULT),Log(Times(d_DEFAULT,Power(u_,r_DEFAULT))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Times(g,x),q),Log(Times(d,Power(ExpandToSum(u,x),r))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),And(FreeQ(List(a,b,c,d,g,r,n,p,q),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),PolyLog(k_,Times(e_DEFAULT,Power(x_,q_DEFAULT)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,n,x,PolyLog(k,Times(e,Power(x,q)))),x)),Negate(Dist(q,Int(Times(PolyLog(Plus(k,Negate(C1)),Times(e,Power(x,q))),Plus(a,Times(b,Log(Times(c,Power(x,n)))))),x),x)),Dist(Times(b,n,q),Int(PolyLog(Plus(k,Negate(C1)),Times(e,Power(x,q))),x),x),Simp(Times(x,PolyLog(k,Times(e,Power(x,q))),Plus(a,Times(b,Log(Times(c,Power(x,n)))))),x)),And(FreeQ(List(a,b,c,e,n,q),x),IGtQ(k,C0)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),PolyLog(k_,Times(e_DEFAULT,Power(x_,q_DEFAULT)))),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),PolyLog(k,Times(e,Power(x,q)))),x),FreeQ(List(a,b,c,e,n,p,q),x))),
ISetDelayed(Int(Times(Power(x_,-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),PolyLog(k_,Times(e_DEFAULT,Power(x_,q_DEFAULT)))),x_Symbol),
    Condition(Plus(Simp(Times(PolyLog(Plus(k,C1),Times(e,Power(x,q))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(q,-1)),x),Negate(Dist(Times(b,n,p,Power(q,-1)),Int(Times(PolyLog(Plus(k,C1),Times(e,Power(x,q))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,Negate(C1))),Power(x,-1)),x),x))),And(FreeQ(List(a,b,c,e,k,n,q),x),GtQ(p,C0)))),
ISetDelayed(Int(Times(Power(x_,-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),PolyLog(k_,Times(e_DEFAULT,Power(x_,q_DEFAULT)))),x_Symbol),
    Condition(Plus(Simp(Times(PolyLog(k,Times(e,Power(x,q))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(q,Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(PolyLog(Plus(k,Negate(C1)),Times(e,Power(x,q))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,C1)),Power(x,-1)),x),x))),And(FreeQ(List(a,b,c,e,k,n,q),x),LtQ(p,CN1)))),
ISetDelayed(Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),PolyLog(k_,Times(e_DEFAULT,Power(x_,q_DEFAULT)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,n,Power(Times(d,x),Plus(m,C1)),PolyLog(k,Times(e,Power(x,q))),Power(Times(d,Sqr(Plus(m,C1))),-1)),x)),Negate(Dist(Times(q,Power(Plus(m,C1),-1)),Int(Times(Power(Times(d,x),m),PolyLog(Plus(k,Negate(C1)),Times(e,Power(x,q))),Plus(a,Times(b,Log(Times(c,Power(x,n)))))),x),x)),Dist(Times(b,n,q,Power(Plus(m,C1),-2)),Int(Times(Power(Times(d,x),m),PolyLog(Plus(k,Negate(C1)),Times(e,Power(x,q)))),x),x),Simp(Times(Power(Times(d,x),Plus(m,C1)),PolyLog(k,Times(e,Power(x,q))),Plus(a,Times(b,Log(Times(c,Power(x,n))))),Power(Times(d,Plus(m,C1)),-1)),x)),And(FreeQ(List(a,b,c,d,e,m,n,q),x),IGtQ(k,C0)))),
ISetDelayed(Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),p_DEFAULT),PolyLog(k_,Times(e_DEFAULT,Power(x_,q_DEFAULT)))),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(d,x),m),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),PolyLog(k,Times(e,Power(x,q)))),x),FreeQ(List(a,b,c,d,e,m,n,p,q),x))),
ISetDelayed(Int(Times($p("§px",true),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),Power($(F_,Times(d_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times($s("§px"),Power(F(Times(d,Plus(e,Times(f,x)))),m)),x))),Plus(Dist(Plus(a,Times(b,Log(Times(c,Power(x,n))))),u,x),Negate(Dist(Times(b,n),Int(Dist(Power(x,-1),u,x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,n),x),PolynomialQ($s("§px"),x),IGtQ(m,C0),MemberQ(List($s("ArcSin"),$s("ArcCos"),$s("ArcSinh"),$s("ArcCosh")),FSymbol)))),
ISetDelayed(Int(Times($p("§px",true),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))),$(F_,Times(d_DEFAULT,Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times($s("§px"),F(Times(d,Plus(e,Times(f,x))))),x))),Plus(Dist(Plus(a,Times(b,Log(Times(c,Power(x,n))))),u,x),Negate(Dist(Times(b,n),Int(Dist(Power(x,-1),u,x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,n),x),PolynomialQ($s("§px"),x),MemberQ(List($s("ArcTan"),$s("ArcCot"),$s("ArcTanh"),$s("ArcCoth")),FSymbol)))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))))),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(e,-1),Subst(Int(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),x),x,Plus(d,Times(e,x))),x),FreeQ(List(a,b,c,d,e,n,p),x))),
ISetDelayed(Int(Times(Power(Plus(f_,Times(g_DEFAULT,x_)),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(e,-1),Subst(Int(Times(Power(Times(f,x,Power(d,-1)),q),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),x,Plus(d,Times(e,x))),x),And(FreeQ(List(a,b,c,d,e,f,g,n,p,q),x),EqQ(Plus(Times(e,f),Times(CN1,d,g)),C0)))),
ISetDelayed(Int(Times(Power(x_,-1),Log(Times(c_DEFAULT,Plus(d_,Times(e_DEFAULT,Power(x_,n_DEFAULT)))))),x_Symbol),
    Condition(Negate(Simp(Times(PolyLog(C2,Times(CN1,c,e,Power(x,n))),Power(n,-1)),x)),And(FreeQ(List(c,d,e,n),x),EqQ(Times(c,d),C1)))),
ISetDelayed(Int(Times(Power(x_,-1),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Plus(d_,Times(e_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,Log(Times(c,d)))),Log(x)),x),Dist(b,Int(Times(Log(Plus(C1,Times(e,x,Power(d,-1)))),Power(x,-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),GtQ(Times(c,d),C0)))),
ISetDelayed(Int(Times(Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),-1),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Plus(d_,Times(e_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Power(g,-1),Subst(Int(Times(Plus(a,Times(b,Log(Plus(C1,Times(c,e,x,Power(g,-1)))))),Power(x,-1)),x),x,Plus(f,Times(g,x))),x),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),EqQ(Plus(g,Times(c,Plus(Times(e,f),Times(CN1,d,g)))),C0)))),
ISetDelayed(Int(Times(Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),-1),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT)))))),x_Symbol),
    Condition(Plus(Simp(Times(Log(Times(e,Plus(f,Times(g,x)),Power(Plus(Times(e,f),Times(CN1,d,g)),-1))),Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Power(g,-1)),x),Negate(Dist(Times(b,e,n,Power(g,-1)),Int(Times(Log(Times(e,Plus(f,Times(g,x)),Power(Plus(Times(e,f),Times(CN1,d,g)),-1))),Power(Plus(d,Times(e,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,n),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0)))),
ISetDelayed(Int(Times(Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),q_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT)))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(f,Times(g,x)),Plus(q,C1)),Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Power(Times(g,Plus(q,C1)),-1)),x),Negate(Dist(Times(b,e,n,Power(Times(g,Plus(q,C1)),-1)),Int(Times(Power(Plus(f,Times(g,x)),Plus(q,C1)),Power(Plus(d,Times(e,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,n,q),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),NeQ(q,CN1)))),
ISetDelayed(Int(Times(Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Log(Times(e,Plus(f,Times(g,x)),Power(Plus(Times(e,f),Times(CN1,d,g)),-1))),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),Power(g,-1)),x),Negate(Dist(Times(b,e,n,p,Power(g,-1)),Int(Times(Log(Times(e,Plus(f,Times(g,x)),Power(Plus(Times(e,f),Times(CN1,d,g)),-1))),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,n,p),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),IGtQ(p,C1)))),
ISetDelayed(Int(Times(Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),-2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(d,Times(e,x)),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),Power(Times(Plus(Times(e,f),Times(CN1,d,g)),Plus(f,Times(g,x))),-1)),x),Negate(Dist(Times(b,e,n,p,Power(Plus(Times(e,f),Times(CN1,d,g)),-1)),Int(Times(Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,Negate(C1))),Power(Plus(f,Times(g,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,n),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),GtQ(p,C0)))),
ISetDelayed(Int(Times(Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(f,Times(g,x)),Plus(q,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),Power(Times(g,Plus(q,C1)),-1)),x),Negate(Dist(Times(b,e,n,p,Power(Times(g,Plus(q,C1)),-1)),Int(Times(Power(Plus(f,Times(g,x)),Plus(q,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,x)),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,n,q),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),GtQ(p,C0),NeQ(q,CN1),IntegersQ(Times(C2,p),Times(C2,q)),Or(Not(IGtQ(q,C0)),And(EqQ(p,C2),NeQ(q,C1)))))),
ISetDelayed(Int(Times(Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(f,Times(g,x)),q),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),IGtQ(q,C0)))),
ISetDelayed(Int(Times(Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(d,Times(e,x)),Power(Plus(f,Times(g,x)),q),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,C1)),Power(Times(b,e,n,Plus(p,C1)),-1)),x),Negate(Dist(Times(Plus(q,C1),Power(Times(b,n,Plus(p,C1)),-1)),Int(Times(Power(Plus(f,Times(g,x)),q),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,C1))),x),x)),Dist(Times(q,Plus(Times(e,f),Times(CN1,d,g)),Power(Times(b,e,n,Plus(p,C1)),-1)),Int(Times(Power(Plus(f,Times(g,x)),Plus(q,Negate(C1))),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,n),x),NeQ(Plus(Times(e,f),Times(CN1,d,g)),C0),LtQ(p,CN1),GtQ(q,C0))))
  );
}
