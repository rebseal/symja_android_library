package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://bitbucket.org/axelclk/symja_android_library">bitbucket.org/axelclk/symja_android_library under the tools directory</a>.</p>
 */
public interface LimitRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 41, 14 };

  final public static IAST RULES = List(
    IInit(Limit, SIZES),
    // Limit(x_^m_RealNumberQ,x_Symbol->Infinity):=If(m<0,0,Infinity)
    ISetDelayed(Limit(Power(x_,$p(m,RealNumberQ)),Rule($p(x,Symbol),oo)),
      If(Less(m,C0),C0,oo)),
    // Limit(m_NumberQ^x_,x_Symbol->Infinity):=If(m>1,Infinity,If(m==1,1,0))/;Positive(m)
    ISetDelayed(Limit(Power($p(m,NumberQ),x_),Rule($p(x,Symbol),oo)),
      Condition(If(Greater(m,C1),oo,If(Equal(m,C1),C1,C0)),Positive(m))),
    // Limit(m_NumberQ^(-x_),x_Symbol->Infinity):=0/;m>1
    ISetDelayed(Limit(Power($p(m,NumberQ),Negate(x_)),Rule($p(x,Symbol),oo)),
      Condition(C0,Greater(m,C1))),
    // Limit(E^x_,x_Symbol->Infinity):=Infinity
    ISetDelayed(Limit(Power(E,x_),Rule($p(x,Symbol),oo)),
      oo),
    // Limit(E^x_,x_Symbol->-Infinity):=0
    ISetDelayed(Limit(Power(E,x_),Rule($p(x,Symbol),Negate(oo))),
      C0),
    // Limit(Log(x_),x_Symbol->0)=-Infinity
    ISet(Limit(Log(x_),Rule($p(x,Symbol),C0)),
      Noo),
    // Limit(Log(x_),x_Symbol->Infinity)=Infinity
    ISet(Limit(Log(x_),Rule($p(x,Symbol),oo)),
      oo),
    // Limit(Log(x_),x_Symbol->-Infinity)=Infinity
    ISet(Limit(Log(x_),Rule($p(x,Symbol),Negate(oo))),
      oo),
    // Limit((1+1/x_)^x_,x_Symbol->Infinity)=E
    ISet(Limit(Power(Plus(C1,Power(x_,-1)),x_),Rule($p(x,Symbol),oo)),
      E),
    // Limit((1+a_/x_)^x_,x_Symbol->Infinity)=E^a/;FreeQ(a,x)
    ISet(Limit(Power(Plus(C1,Times(a_,Power(x_,-1))),x_),Rule($p(x,Symbol),oo)),
      Power(E,a)),
    // Limit(HarmonicNumber(y_Symbol,s_IntegerQ),x_Symbol->Infinity):=Module({v=s/2},((-1)^(v+1)*(2*Pi)^(2*v)*BernoulliB(2*v))/(2*(2*v)!))/;EvenQ(s)&&Positive(s)
    ISetDelayed(Limit(HarmonicNumber($p(y,Symbol),$p(s,IntegerQ)),Rule($p(x,Symbol),oo)),
      Condition(Module(List(Set(v,Times(C1D2,s))),Times(Power(CN1,Plus(v,C1)),Power(Times(C2,Pi),Times(C2,v)),BernoulliB(Times(C2,v)),Power(Times(C2,Factorial(Times(C2,v))),-1))),And(EvenQ(s),Positive(s)))),
    // Limit(Tan(x_),x_Symbol->Pi/2):=Indeterminate
    ISetDelayed(Limit(Tan(x_),Rule($p(x,Symbol),Times(C1D2,Pi))),
      Indeterminate),
    // Limit(Cot(x_),x_Symbol->0):=Indeterminate
    ISetDelayed(Limit(Cot(x_),Rule($p(x,Symbol),C0)),
      Indeterminate),
    // Limit(ArcCos(x_),x_Symbol->Infinity)=I*Infinity
    ISet(Limit(ArcCos(x_),Rule($p(x,Symbol),oo)),
      DirectedInfinity(CI)),
    // Limit(ArcCos(x_),x_Symbol->-Infinity)=-I*Infinity
    ISet(Limit(ArcCos(x_),Rule($p(x,Symbol),Negate(oo))),
      DirectedInfinity(CNI)),
    // Limit(ArcCot(x_),x_Symbol->Infinity)=0
    ISet(Limit(ArcCot(x_),Rule($p(x,Symbol),oo)),
      C0),
    // Limit(ArcCot(x_),x_Symbol->-Infinity)=0
    ISet(Limit(ArcCot(x_),Rule($p(x,Symbol),Negate(oo))),
      C0),
    // Limit(ArcCsc(x_),x_Symbol->Infinity)=0
    ISet(Limit(ArcCsc(x_),Rule($p(x,Symbol),oo)),
      C0),
    // Limit(ArcCsc(x_),x_Symbol->-Infinity)=0
    ISet(Limit(ArcCsc(x_),Rule($p(x,Symbol),Negate(oo))),
      C0),
    // Limit(ArcSec(x_),x_Symbol->Infinity)=Pi/2
    ISet(Limit(ArcSec(x_),Rule($p(x,Symbol),oo)),
      Times(C1D2,Pi)),
    // Limit(ArcSec(x_),x_Symbol->-Infinity)=Pi/2
    ISet(Limit(ArcSec(x_),Rule($p(x,Symbol),Negate(oo))),
      Times(C1D2,Pi)),
    // Limit(ArcSin(x_),x_Symbol->Infinity)=-I*Infinity
    ISet(Limit(ArcSin(x_),Rule($p(x,Symbol),oo)),
      DirectedInfinity(CNI)),
    // Limit(ArcSin(x_),x_Symbol->-Infinity)=I*Infinity
    ISet(Limit(ArcSin(x_),Rule($p(x,Symbol),Negate(oo))),
      DirectedInfinity(CI)),
    // Limit(ArcTan(x_),x_Symbol->Infinity)=Pi/2
    ISet(Limit(ArcTan(x_),Rule($p(x,Symbol),oo)),
      Times(C1D2,Pi)),
    // Limit(ArcTan(x_),x_Symbol->-Infinity)=(-1)*1/2*Pi
    ISet(Limit(ArcTan(x_),Rule($p(x,Symbol),Negate(oo))),
      Times(CN1D2,Pi)),
    // Limit(ArcCosh(x_),x_Symbol->Infinity)=Infinity
    ISet(Limit(ArcCosh(x_),Rule($p(x,Symbol),oo)),
      oo),
    // Limit(ArcCosh(x_),x_Symbol->-Infinity)=Infinity
    ISet(Limit(ArcCosh(x_),Rule($p(x,Symbol),Negate(oo))),
      oo),
    // Limit(ArcCoth(x_),x_Symbol->Infinity)=0
    ISet(Limit(ArcCoth(x_),Rule($p(x,Symbol),oo)),
      C0),
    // Limit(ArcCoth(x_),x_Symbol->-Infinity)=0
    ISet(Limit(ArcCoth(x_),Rule($p(x,Symbol),Negate(oo))),
      C0),
    // Limit(ArcCsch(x_),x_Symbol->Infinity)=0
    ISet(Limit(ArcCsch(x_),Rule($p(x,Symbol),oo)),
      C0),
    // Limit(ArcCsch(x_),x_Symbol->-Infinity)=0
    ISet(Limit(ArcCsch(x_),Rule($p(x,Symbol),Negate(oo))),
      C0),
    // Limit(ArcSech(x_),x_Symbol->Infinity)=I*Pi/2
    ISet(Limit(ArcSech(x_),Rule($p(x,Symbol),oo)),
      Times(CC(0L,1L,1L,2L),Pi)),
    // Limit(ArcSech(x_),x_Symbol->-Infinity)=I*Pi/2
    ISet(Limit(ArcSech(x_),Rule($p(x,Symbol),Negate(oo))),
      Times(CC(0L,1L,1L,2L),Pi)),
    // Limit(ArcSinh(x_),x_Symbol->Infinity)=Infinity
    ISet(Limit(ArcSinh(x_),Rule($p(x,Symbol),oo)),
      oo),
    // Limit(ArcSinh(x_),x_Symbol->-Infinity)=-Infinity
    ISet(Limit(ArcSinh(x_),Rule($p(x,Symbol),Negate(oo))),
      Noo),
    // Limit(ArcTanh(x_),x_Symbol->Infinity)=-I*Pi/2
    ISet(Limit(ArcTanh(x_),Rule($p(x,Symbol),oo)),
      Times(CC(0L,1L,-1L,2L),Pi)),
    // Limit(ArcTanh(x_),x_Symbol->-Infinity)=I*Pi/2
    ISet(Limit(ArcTanh(x_),Rule($p(x,Symbol),Negate(oo))),
      Times(CC(0L,1L,1L,2L),Pi)),
    // Limit(Cosh(x_),x_Symbol->Infinity)=Infinity
    ISet(Limit(Cosh(x_),Rule($p(x,Symbol),oo)),
      oo),
    // Limit(Cosh(x_),x_Symbol->-Infinity)=Infinity
    ISet(Limit(Cosh(x_),Rule($p(x,Symbol),Negate(oo))),
      oo),
    // Limit(Coth(x_),x_Symbol->Infinity)=1
    ISet(Limit(Coth(x_),Rule($p(x,Symbol),oo)),
      C1),
    // Limit(Coth(x_),x_Symbol->-Infinity)=-1
    ISet(Limit(Coth(x_),Rule($p(x,Symbol),Negate(oo))),
      CN1),
    // Limit(Csch(x_),x_Symbol->Infinity)=0
    ISet(Limit(Csch(x_),Rule($p(x,Symbol),oo)),
      C0),
    // Limit(Csch(x_),x_Symbol->-Infinity)=0
    ISet(Limit(Csch(x_),Rule($p(x,Symbol),Negate(oo))),
      C0),
    // Limit(Sech(x_),x_Symbol->Infinity)=0
    ISet(Limit(Sech(x_),Rule($p(x,Symbol),oo)),
      C0),
    // Limit(Sech(x_),x_Symbol->-Infinity)=0
    ISet(Limit(Sech(x_),Rule($p(x,Symbol),Negate(oo))),
      C0),
    // Limit(Sinh(x_),x_Symbol->Infinity)=Infinity
    ISet(Limit(Sinh(x_),Rule($p(x,Symbol),oo)),
      oo),
    // Limit(Sinh(x_),x_Symbol->-Infinity)=-Infinity
    ISet(Limit(Sinh(x_),Rule($p(x,Symbol),Negate(oo))),
      Noo),
    // Limit(Tanh(x_),x_Symbol->Infinity)=1
    ISet(Limit(Tanh(x_),Rule($p(x,Symbol),oo)),
      C1),
    // Limit(Tanh(x_),x_Symbol->-Infinity)=-1
    ISet(Limit(Tanh(x_),Rule($p(x,Symbol),Negate(oo))),
      CN1),
    // Limit(x_/Abs(x_),x_Symbol->0,Direction->1):=-1
    ISetDelayed(Limit(Times(x_,Power(Abs(x_),-1)),Rule($p(x,Symbol),C0),Rule(Direction,C1)),
      CN1),
    // Limit(x_/Abs(x_),x_Symbol->0,Direction->-1):=1
    ISetDelayed(Limit(Times(x_,Power(Abs(x_),-1)),Rule($p(x,Symbol),C0),Rule(Direction,CN1)),
      C1),
    // Limit(Tan(x_),x_Symbol->Pi/2,Direction->1):=Infinity
    ISetDelayed(Limit(Tan(x_),Rule($p(x,Symbol),Times(C1D2,Pi)),Rule(Direction,C1)),
      oo),
    // Limit(Tan(x_),x_Symbol->Pi/2,Direction->-1):=-Infinity
    ISetDelayed(Limit(Tan(x_),Rule($p(x,Symbol),Times(C1D2,Pi)),Rule(Direction,CN1)),
      Negate(oo)),
    // Limit(Cot(x_),x_Symbol->0,Direction->1):=-Infinity
    ISetDelayed(Limit(Cot(x_),Rule($p(x,Symbol),C0),Rule(Direction,C1)),
      Negate(oo)),
    // Limit(Cot(x_),x_Symbol->0,Direction->-1):=Infinity
    ISetDelayed(Limit(Cot(x_),Rule($p(x,Symbol),C0),Rule(Direction,CN1)),
      oo)
  );
}
