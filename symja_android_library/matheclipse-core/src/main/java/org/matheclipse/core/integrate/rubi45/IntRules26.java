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
public class IntRules26 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(e),Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),-1)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x),x),Dist(Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),-1),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Simp(Plus(Times(c,d),Times(CN1,b,e),Times(CN1,c,e,Sqr(x))),x),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(q)),LtQ(q,CN1)))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(e),Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),-1)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x),x),Dist(Times(c,Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),-1)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(d,Times(CN1,e,Sqr(x))),Power(Plus(a,Times(c,Power(x,4))),-1)),x),x)),And(FreeQ(List(a,c,d,e,f,m),x),Not(IntegerQ(q)),LtQ(q,CN1)))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(d,Times(e,Sqr(x))),q),Times(Power(Times(f,x),m),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),-1)),x),x),And(FreeQ(List(a,b,c,d,e,f,q),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(q)),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(d,Times(e,Sqr(x))),q),Times(Power(Times(f,x),m),Power(Plus(a,Times(c,Power(x,4))),-1)),x),x),And(FreeQ(List(a,c,d,e,f,q),x),Not(IntegerQ(q)),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),-1),x),x),And(FreeQ(List(a,b,c,d,e,f,m,q),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(q)),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),Power(Plus(a,Times(c,Power(x,4))),-1),x),x),And(FreeQ(List(a,c,d,e,f,m,q),x),Not(IntegerQ(q)),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(r,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Times(C2,c,Power(r,-1)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(b,Negate(r),Times(C2,c,Sqr(x))),-1)),x),x),Negate(Dist(Times(C2,c,Power(r,-1)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(b,r,Times(C2,c,Sqr(x))),-1)),x),x)))),And(FreeQ(List(a,b,c,d,e,f,m,q),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(r,Rt(Times(CN1,a,c),C2))),Plus(Negate(Dist(Times(c,Power(Times(C2,r),-1)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(r,Times(CN1,c,Sqr(x))),-1)),x),x)),Negate(Dist(Times(c,Power(Times(C2,r),-1)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(r,Times(c,Sqr(x))),-1)),x),x)))),FreeQ(List(a,c,d,e,f,m,q),x))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(d,-2),Int(Times(Power(Times(f,x),m),Plus(Times(a,d),Times(Plus(Times(b,d),Times(CN1,a,e)),Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),Plus(p,Negate(C1)))),x),x),Dist(Times(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),Power(Times(Sqr(d),Power(f,4)),-1)),Int(Times(Power(Times(f,x),Plus(m,C4)),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),GtQ(p,C0),LtQ(m,CN2)))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Times(a,Power(d,-2)),Int(Times(Power(Times(f,x),m),Plus(d,Times(CN1,e,Sqr(x))),Power(Plus(a,Times(c,Power(x,4))),Plus(p,Negate(C1)))),x),x),Dist(Times(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),Power(Times(Sqr(d),Power(f,4)),-1)),Int(Times(Power(Times(f,x),Plus(m,C4)),Power(Plus(a,Times(c,Power(x,4))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,c,d,e,f),x),GtQ(p,C0),LtQ(m,CN2)))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(Times(d,e),-1),Int(Times(Power(Times(f,x),m),Plus(Times(a,e),Times(c,d,Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),Plus(p,Negate(C1)))),x),x),Negate(Dist(Times(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),Power(Times(d,e,Sqr(f)),-1)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),GtQ(p,C0),LtQ(m,C0)))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(Power(Times(d,e),-1),Int(Times(Power(Times(f,x),m),Plus(Times(a,e),Times(c,d,Sqr(x))),Power(Plus(a,Times(c,Power(x,4))),Plus(p,Negate(C1)))),x),x),Negate(Dist(Times(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),Power(Times(d,e,Sqr(f)),-1)),Int(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(a,Times(c,Power(x,4))),Plus(p,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,c,d,e,f),x),GtQ(p,C0),LtQ(m,C0)))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),p_)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(Power(f,4),Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C4))),Plus(Times(a,d),Times(Plus(Times(b,d),Times(CN1,a,e)),Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),p)),x),x)),Dist(Times(Sqr(d),Power(f,4),Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C4))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),Plus(p,C1)),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),LtQ(p,CN1),GtQ(m,C2)))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),p_)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(a,Power(f,4),Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C4))),Plus(d,Times(CN1,e,Sqr(x))),Power(Plus(a,Times(c,Power(x,4))),p)),x),x)),Dist(Times(Sqr(d),Power(f,4),Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C4))),Power(Plus(a,Times(c,Power(x,4))),Plus(p,C1)),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x)),And(FreeQ(List(a,c,d,e,f),x),LtQ(p,CN1),GtQ(m,C2)))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),p_)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(f),Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Plus(Times(a,e),Times(c,d,Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),p)),x),x),Negate(Dist(Times(d,e,Sqr(f),Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),Plus(p,C1)),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),LtQ(p,CN1),GtQ(m,C0)))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),p_)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(f),Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Plus(Times(a,e),Times(c,d,Sqr(x))),Power(Plus(a,Times(c,Power(x,4))),p)),x),x),Negate(Dist(Times(d,e,Sqr(f),Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(C2))),Power(Plus(a,Times(c,Power(x,4))),Plus(p,C1)),Power(Plus(d,Times(e,Sqr(x))),-1)),x),x))),And(FreeQ(List(a,c,d,e,f),x),LtQ(p,CN1),GtQ(m,C0)))),
ISetDelayed(Int(Times(Sqr(x_),Power(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(d,Power(Times(C2,d,e),-1)),Int(Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2),x),x),Negate(Dist(Times(d,Power(Times(C2,d,e),-1)),Int(Times(Plus(d,Times(CN1,e,Sqr(x))),Power(Times(Plus(d,Times(e,Sqr(x))),Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),PosQ(Times(c,Power(a,-1))),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0)))),
ISetDelayed(Int(Times(Sqr(x_),Power(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Sqrt(Plus(a_,Times(c_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(Plus(Dist(Times(d,Power(Times(C2,d,e),-1)),Int(Power(Plus(a,Times(c,Power(x,4))),CN1D2),x),x),Negate(Dist(Times(d,Power(Times(C2,d,e),-1)),Int(Times(Plus(d,Times(CN1,e,Sqr(x))),Power(Times(Plus(d,Times(e,Sqr(x))),Sqrt(Plus(a,Times(c,Power(x,4))))),-1)),x),x))),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),PosQ(Times(c,Power(a,-1))),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0)))),
ISetDelayed(Int(Times(Sqr(x_),Power(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(c,Power(a,-1)),C2))),Plus(Negate(Dist(Times(a,Plus(e,Times(d,q)),Power(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),-1)),Int(Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2),x),x)),Dist(Times(a,d,Plus(e,Times(d,q)),Power(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),-1)),Int(Times(Plus(C1,Times(q,Sqr(x))),Power(Times(Plus(d,Times(e,Sqr(x))),Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),PosQ(Times(c,Power(a,-1))),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0)))),
ISetDelayed(Int(Times(Sqr(x_),Power(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Sqrt(Plus(a_,Times(c_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(c,Power(a,-1)),C2))),Plus(Negate(Dist(Times(a,Plus(e,Times(d,q)),Power(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),-1)),Int(Power(Plus(a,Times(c,Power(x,4))),CN1D2),x),x)),Dist(Times(a,d,Plus(e,Times(d,q)),Power(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),-1)),Int(Times(Plus(C1,Times(q,Sqr(x))),Power(Times(Plus(d,Times(e,Sqr(x))),Sqrt(Plus(a,Times(c,Power(x,4))))),-1)),x),x))),And(FreeQ(List(a,c,d,e),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),PosQ(Times(c,Power(a,-1))),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0)))),
ISetDelayed(Int(Times(Power(x_,4),Power(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(Plus(Negate(Dist(Power(e,-2),Int(Times(Plus(d,Times(CN1,e,Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2)),x),x)),Dist(Times(Sqr(d),Power(e,-2)),Int(Power(Times(Plus(d,Times(e,Sqr(x))),Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))))),-1),x),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),PosQ(Times(c,Power(a,-1))),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0)))),
ISetDelayed(Int(Times(Power(x_,4),Power(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Sqrt(Plus(a_,Times(c_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(Plus(Negate(Dist(Power(e,-2),Int(Times(Plus(d,Times(CN1,e,Sqr(x))),Power(Plus(a,Times(c,Power(x,4))),CN1D2)),x),x)),Dist(Times(Sqr(d),Power(e,-2)),Int(Power(Times(Plus(d,Times(e,Sqr(x))),Sqrt(Plus(a,Times(c,Power(x,4))))),-1),x),x)),And(FreeQ(List(a,c,d,e),x),PosQ(Times(c,Power(a,-1))),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0)))),
ISetDelayed(Int(Times(Power(x_,4),Power(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(c,Power(a,-1)),C2))),Condition(Plus(Negate(Dist(Power(Times(e,q),-1),Int(Times(Plus(C1,Times(CN1,q,Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2)),x),x)),Dist(Times(Sqr(d),Power(Times(e,Plus(e,Times(CN1,d,q))),-1)),Int(Times(Plus(C1,Times(q,Sqr(x))),Power(Times(Plus(d,Times(e,Sqr(x))),Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))))),-1)),x),x)),EqQ(Plus(Times(C2,c,d),Times(CN1,a,e,q)),C0))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),PosQ(Times(c,Power(a,-1))),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0)))),
ISetDelayed(Int(Times(Power(x_,4),Power(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Sqrt(Plus(a_,Times(c_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(c,Power(a,-1)),C2))),Condition(Plus(Negate(Dist(Power(Times(e,q),-1),Int(Times(Plus(C1,Times(CN1,q,Sqr(x))),Power(Plus(a,Times(c,Power(x,4))),CN1D2)),x),x)),Dist(Times(Sqr(d),Power(Times(e,Plus(e,Times(CN1,d,q))),-1)),Int(Times(Plus(C1,Times(q,Sqr(x))),Power(Times(Plus(d,Times(e,Sqr(x))),Sqrt(Plus(a,Times(c,Power(x,4))))),-1)),x),x)),EqQ(Plus(Times(C2,c,d),Times(CN1,a,e,q)),C0))),And(FreeQ(List(a,c,d,e),x),PosQ(Times(c,Power(a,-1))),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0)))),
ISetDelayed(Int(Times(Power(x_,4),Power(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(c,Power(a,-1)),C2))),Plus(Negate(Dist(Times(Plus(Times(C2,c,d),Times(CN1,a,e,q)),Power(Times(c,e,Plus(e,Times(CN1,d,q))),-1)),Int(Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2),x),x)),Negate(Dist(Power(Times(e,q),-1),Int(Times(Plus(C1,Times(CN1,q,Sqr(x))),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),CN1D2)),x),x)),Dist(Times(Sqr(d),Power(Times(e,Plus(e,Times(CN1,d,q))),-1)),Int(Times(Plus(C1,Times(q,Sqr(x))),Power(Times(Plus(d,Times(e,Sqr(x))),Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),PosQ(Times(c,Power(a,-1))),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0)))),
ISetDelayed(Int(Times(Power(x_,4),Power(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Sqrt(Plus(a_,Times(c_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(c,Power(a,-1)),C2))),Plus(Negate(Dist(Times(Plus(Times(C2,c,d),Times(CN1,a,e,q)),Power(Times(c,e,Plus(e,Times(CN1,d,q))),-1)),Int(Power(Plus(a,Times(c,Power(x,4))),CN1D2),x),x)),Negate(Dist(Power(Times(e,q),-1),Int(Times(Plus(C1,Times(CN1,q,Sqr(x))),Power(Plus(a,Times(c,Power(x,4))),CN1D2)),x),x)),Dist(Times(Sqr(d),Power(Times(e,Plus(e,Times(CN1,d,q))),-1)),Int(Times(Plus(C1,Times(q,Sqr(x))),Power(Times(Plus(d,Times(e,Sqr(x))),Sqrt(Plus(a,Times(c,Power(x,4))))),-1)),x),x))),And(FreeQ(List(a,c,d,e),x),PosQ(Times(c,Power(a,-1))),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,a,Sqr(e))),C0)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,Negate(C5))),Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4)))),Power(Times(c,e,Plus(m,Negate(C3))),-1)),x),Negate(Dist(Power(Times(c,e,Plus(m,Negate(C3))),-1),Int(Times(Power(x,Plus(m,Negate(C6))),Simp(Plus(Times(a,d,Plus(m,Negate(C5))),Times(Plus(Times(a,e,Plus(m,Negate(C5))),Times(b,d,Plus(m,Negate(C4)))),Sqr(x)),Times(Plus(Times(b,e,Plus(m,Negate(C4))),Times(c,d,Plus(m,Negate(C3)))),Power(x,4))),x),Power(Times(Plus(d,Times(e,Sqr(x))),Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(Times(C1D2,m),C2)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Sqrt(Plus(a_,Times(c_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,Negate(C5))),Sqrt(Plus(a,Times(c,Power(x,4)))),Power(Times(c,e,Plus(m,Negate(C3))),-1)),x),Negate(Dist(Power(Times(c,e,Plus(m,Negate(C3))),-1),Int(Times(Power(x,Plus(m,Negate(C6))),Simp(Plus(Times(a,d,Plus(m,Negate(C5))),Times(a,e,Plus(m,Negate(C5)),Sqr(x)),Times(c,d,Plus(m,Negate(C3)),Power(x,4))),x),Power(Times(Plus(d,Times(e,Sqr(x))),Sqrt(Plus(a,Times(c,Power(x,4))))),-1)),x),x))),And(FreeQ(List(a,c,d,e),x),IGtQ(Times(C1D2,m),C2)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4)))),Power(Times(a,d,Plus(m,C1)),-1)),x),Negate(Dist(Power(Times(a,d,Plus(m,C1)),-1),Int(Times(Power(x,Plus(m,C2)),Simp(Plus(Times(a,e,Plus(m,C1)),Times(b,d,Plus(m,C2)),Times(Plus(Times(b,e,Plus(m,C2)),Times(c,d,Plus(m,C3))),Sqr(x)),Times(c,e,Plus(m,C3),Power(x,4))),x),Power(Times(Plus(d,Times(e,Sqr(x))),Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),ILtQ(Times(C1D2,m),C0)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Times(Plus(d_,Times(e_DEFAULT,Sqr(x_))),Sqrt(Plus(a_,Times(c_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Sqrt(Plus(a,Times(c,Power(x,4)))),Power(Times(a,d,Plus(m,C1)),-1)),x),Negate(Dist(Power(Times(a,d,Plus(m,C1)),-1),Int(Times(Power(x,Plus(m,C2)),Simp(Plus(Times(a,e,Plus(m,C1)),Times(c,d,Plus(m,C3),Sqr(x)),Times(c,e,Plus(m,C3),Power(x,4))),x),Power(Times(Plus(d,Times(e,Sqr(x))),Sqrt(Plus(a,Times(c,Power(x,4))))),-1)),x),x))),And(FreeQ(List(a,c,d,e),x),ILtQ(Times(C1D2,m),C0)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Times(Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_)))),Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(Dist(Times(Power(x,3),Sqrt(Plus(e,Times(d,Power(x,-2)))),Sqrt(Plus(c,Times(b,Power(x,-2)),Times(a,Power(x,-4)))),Power(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))))),-1)),Int(Times(Power(x,Plus(m,Negate(C3))),Power(Times(Sqrt(Plus(e,Times(d,Power(x,-2)))),Sqrt(Plus(c,Times(b,Power(x,-2)),Times(a,Power(x,-4))))),-1)),x),x),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IntegerQ(Times(C1D2,m))))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Times(Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_)))),Sqrt(Plus(a_,Times(c_DEFAULT,Power(x_,4))))),-1)),x_Symbol),
    Condition(Dist(Times(Power(x,3),Sqrt(Plus(e,Times(d,Power(x,-2)))),Sqrt(Plus(c,Times(a,Power(x,-4)))),Power(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Sqrt(Plus(a,Times(c,Power(x,4))))),-1)),Int(Times(Power(x,Plus(m,Negate(C3))),Power(Times(Sqrt(Plus(e,Times(d,Power(x,-2)))),Sqrt(Plus(c,Times(a,Power(x,-4))))),-1)),x),x),And(FreeQ(List(a,c,d,e),x),IntegerQ(Times(C1D2,m))))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),p_)),x_Symbol),
    Condition(With(List(Set(f,Coeff(PolynomialRemainder(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),q)),Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),x),x,C0)),Set(g,Coeff(PolynomialRemainder(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),q)),Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),x),x,C2))),Plus(Simp(Times(x,Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),Plus(p,C1)),Plus(Times(a,b,g),Times(CN1,f,Plus(Sqr(b),Times(CN1,C2,a,c))),Times(CN1,c,Plus(Times(b,f),Times(CN1,C2,a,g)),Sqr(x))),Power(Times(C2,a,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x),Dist(Power(Times(C2,a,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1),Int(Times(Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),Plus(p,C1)),Simp(ExpandToSum(Plus(Times(C2,a,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c)),PolynomialQuotient(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),q)),Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),x)),Times(Sqr(b),f,Plus(Times(C2,p),C3)),Times(CN1,C2,a,c,f,Plus(Times(C4,p),C5)),Times(CN1,a,b,g),Times(c,Plus(Times(C4,p),C7),Plus(Times(b,f),Times(CN1,C2,a,g)),Sqr(x))),x),x)),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),LtQ(p,CN1),IGtQ(q,C1),IGtQ(Times(C1D2,m),C0)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),p_)),x_Symbol),
    Condition(With(List(Set(f,Coeff(PolynomialRemainder(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),q)),Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),x),x,C0)),Set(g,Coeff(PolynomialRemainder(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),q)),Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),x),x,C2))),Plus(Simp(Times(x,Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),Plus(p,C1)),Plus(Times(a,b,g),Times(CN1,f,Plus(Sqr(b),Times(CN1,C2,a,c))),Times(CN1,c,Plus(Times(b,f),Times(CN1,C2,a,g)),Sqr(x))),Power(Times(C2,a,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x),Dist(Power(Times(C2,a,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1),Int(Times(Power(x,m),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),Plus(p,C1)),Simp(ExpandToSum(Plus(Times(C2,a,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c)),PolynomialQuotient(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),q)),Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),x),Power(Power(x,m),-1)),Times(Plus(Times(Sqr(b),f,Plus(Times(C2,p),C3)),Times(CN1,C2,a,c,f,Plus(Times(C4,p),C5)),Times(CN1,a,b,g)),Power(Power(x,m),-1)),Times(c,Plus(Times(C4,p),C7),Plus(Times(b,f),Times(CN1,C2,a,g)),Power(x,Plus(C2,Negate(m))))),x),x)),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),LtQ(p,CN1),IGtQ(q,C1),ILtQ(Times(C1D2,m),C0)))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,p,q),x),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Or(IGtQ(p,C0),IGtQ(q,C0),IntegersQ(m,q))))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(c,Power(x,4))),p)),x),x),And(FreeQ(List(a,c,d,e,f,m,p,q),x),Or(IGtQ(p,C0),IGtQ(q,C0),IntegersQ(m,q))))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(f,x),m),Power(Power(x,m),-1)),Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(a,Times(c,Power(x,4))),p)),Power(Plus(Times(d,Power(Plus(Sqr(d),Times(CN1,Sqr(e),Power(x,4))),-1)),Times(CN1,e,Sqr(x),Power(Plus(Sqr(d),Times(CN1,Sqr(e),Power(x,4))),-1))),Negate(q)),x),x),x),And(FreeQ(List(a,c,d,e,f,m,p),x),Not(IntegerQ(p)),ILtQ(q,C0)))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))),p)),x),FreeQ(List(a,b,c,d,e,f,m,p,q),x))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,4))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(c,Power(x,4))),p)),x),FreeQ(List(a,c,d,e,f,m,p,q),x))),
ISetDelayed(Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT),x_Symbol),
    Condition(Int(Times(Power(x,Times(C2,n,p)),Power(Plus(c,Times(b,Power(Power(x,n),-1)),Times(a,Power(Power(x,Times(C2,n)),-1))),p)),x),And(FreeQ(List(a,b,c),x),EqQ($s("n2"),Times(C2,n)),LtQ(n,C0),IntegerQ(p)))),
ISetDelayed(Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_),x_Symbol),
    Condition(With(List(Set(k,Denominator(n))),Dist(k,Subst(Int(Times(Power(x,Plus(k,Negate(C1))),Power(Plus(a,Times(b,Power(x,Times(k,n))),Times(c,Power(x,Times(C2,k,n)))),p)),x),x,Power(x,Power(k,-1))),x)),And(FreeQ(List(a,b,c,p),x),EqQ($s("n2"),Times(C2,n)),FractionQ(n)))),
ISetDelayed(Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(a,Times(b,Power(Power(x,n),-1)),Times(c,Power(Power(x,Times(C2,n)),-1))),p),Power(x,-2)),x),x,Power(x,-1))),And(FreeQ(List(a,b,c,p),x),EqQ($s("n2"),Times(C2,n)),ILtQ(n,C0)))),
ISetDelayed(Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(x,n))),Times(C2,p)),-1)),Int(Power(Plus(b,Times(C2,c,Power(x,n))),Times(C2,p)),x),x),And(FreeQ(List(a,b,c,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
ISetDelayed(Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),x),x),And(FreeQ(List(a,b,c,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(p,C0)))),
ISetDelayed(Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Plus(Sqr(b),Times(CN1,C2,a,c),Times(b,c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(a,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x)),Dist(Power(Times(a,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1),Int(Times(Plus(Sqr(b),Times(CN1,C2,a,c),Times(n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),Times(b,c,Plus(Times(n,Plus(Times(C2,p),C3)),C1),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),ILtQ(p,CN1)))),
ISetDelayed(Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),-1),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(a,Power(c,-1)),C2))),With(List(Set(r,Rt(Plus(Times(C2,q),Times(CN1,b,Power(c,-1))),C2))),Plus(Dist(Power(Times(C2,c,q,r),-1),Int(Times(Plus(r,Negate(Power(x,Times(C1D2,n)))),Power(Plus(q,Times(CN1,r,Power(x,Times(C1D2,n))),Power(x,n)),-1)),x),x),Dist(Power(Times(C2,c,q,r),-1),Int(Times(Plus(r,Power(x,Times(C1D2,n))),Power(Plus(q,Times(r,Power(x,Times(C1D2,n))),Power(x,n)),-1)),x),x)))),And(FreeQ(List(a,b,c),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(Times(C1D2,n),C0),NegQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
ISetDelayed(Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),-1),x_Symbol),
    Condition(With(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Dist(Times(c,Power(q,-1)),Int(Power(Plus(Times(C1D2,b),Times(CN1,C1D2,q),Times(c,Power(x,n))),-1),x),x),Negate(Dist(Times(c,Power(q,-1)),Int(Power(Plus(Times(C1D2,b),Times(C1D2,q),Times(c,Power(x,n))),-1),x),x)))),And(FreeQ(List(a,b,c),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0)))),
ISetDelayed(Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_),x_Symbol),
    Condition(Dist(Times(Power(a,IntPart(p)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),FracPart(p)),Power(Times(Power(Plus(C1,Times(C2,c,Power(x,n),Power(Plus(b,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2)),-1))),FracPart(p)),Power(Plus(C1,Times(C2,c,Power(x,n),Power(Plus(b,Negate(Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),-1))),FracPart(p))),-1)),Int(Times(Power(Plus(C1,Times(C2,c,Power(x,n),Power(Plus(b,Sqrt(Plus(Sqr(b),Times(CN1,C4,a,c)))),-1))),p),Power(Plus(C1,Times(C2,c,Power(x,n),Power(Plus(b,Negate(Sqrt(Plus(Sqr(b),Times(CN1,C4,a,c))))),-1))),p)),x),x),And(FreeQ(List(a,b,c,n,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p))))),
ISetDelayed(Int(Power(Plus(a_,Times(b_DEFAULT,Power(u_,n_)),Times(c_DEFAULT,Power(u_,$p("n2",true)))),p_),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),-1),Subst(Int(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),x),x,u),x),And(FreeQ(List(a,b,c,n,p),x),EqQ($s("n2"),Times(C2,n)),LinearQ(u,x),NeQ(u,x)))),
ISetDelayed(Int(Power(Plus(a_,Times(b_DEFAULT,Power(x_,$p("mn"))),Times(c_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT),x_Symbol),
    Condition(Int(Times(Power(Plus(b,Times(a,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Power(x,Times(n,p)),-1)),x),And(FreeQ(List(a,b,c,n),x),EqQ($s("mn"),Negate(n)),IntegerQ(p),PosQ(n))))
  );
}
