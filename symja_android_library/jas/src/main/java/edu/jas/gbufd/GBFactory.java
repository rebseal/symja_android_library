/*
 * $Id$
 */

package edu.jas.gbufd;


import org.apache.log4j.Logger;

import edu.jas.arith.BigInteger;
import edu.jas.arith.BigRational;
import edu.jas.arith.ModInteger;
import edu.jas.arith.ModIntegerRing;
import edu.jas.arith.ModLong;
import edu.jas.arith.ModLongRing;
import edu.jas.arith.Product;
import edu.jas.arith.ProductRing;
import edu.jas.gb.DGroebnerBaseSeq;
import edu.jas.gb.EGroebnerBaseSeq;
import edu.jas.gb.GBProxy;
import edu.jas.gb.GroebnerBase;
import edu.jas.gb.GroebnerBaseAbstract;
import edu.jas.gb.GroebnerBaseParallel;
import edu.jas.gb.GroebnerBaseSeq;
import edu.jas.gb.ReductionSeq;
import edu.jas.gb.OrderedSyzPairlist;
import edu.jas.gb.OrderedPairlist;
import edu.jas.gb.PairList;
import edu.jas.kern.ComputerThreads;
import edu.jas.poly.GenPolynomial;
import edu.jas.poly.GenPolynomialRing;
import edu.jas.ufd.Quotient;
import edu.jas.ufd.QuotientRing;
import edu.jas.structure.GcdRingElem;
import edu.jas.structure.RingElem;
import edu.jas.structure.RingFactory;


/**
 * Groebner bases algorithms factory. Select appropriate Groebner bases engine
 * based on the coefficient types.
 * @author Heinz Kredel
 * @usage To create objects that implement the <code>GroebnerBase</code>
 *        interface use the <code>GBFactory</code>. It will select an
 *        appropriate implementation based on the types of polynomial
 *        coefficients C. The method to obtain an implementation is
 *        <code>getImplementation()</code>. <code>getImplementation()</code>
 *        returns an object of a class which implements the
 *        <code>GroebnerBase</code> interface, more precisely an object of
 *        abstract class <code>GroebnerBaseAbstract</code>.
 * 
 *        <pre>
 *
 * GroebnerBase&lt;CT&gt; engine;
 * engine = GBFactory.&lt;CT&gt; getImplementation(cofac);
 * c = engine.GB(A);
 * </pre>
 * 
 *        For example, if the coefficient type is BigInteger, the usage looks
 *        like
 * 
 *        <pre>
 *
 * BigInteger cofac = new BigInteger();
 * GroebnerBase&lt;BigInteger&gt; engine;
 * engine = GBFactory.getImplementation(cofac);
 * c = engine.GB(A);
 * </pre>
 * 
 * @see edu.jas.gb.GroebnerBase
 * @see edu.jas.application.GBAlgorithmBuilder
 */

public class GBFactory {


    private static final Logger logger = Logger.getLogger(GBFactory.class);


    /**
     * Algorithm indicators: igb = integerGB, egb = e-GB, dgb = d-GB, 
     * qgb = fraction coefficients GB, ffgb = fraction free GB.
     */
    public static enum Algo {
        igb, egb, dgb, qgb, ffgb
    };


    /**
     * Protected factory constructor.
     */
    protected GBFactory() {
    }


    /**
     * Determine suitable implementation of GB algorithms, no factory case.
     * @return GB algorithm implementation for field coefficients.
     */
    public static <C extends GcdRingElem<C>> GroebnerBaseAbstract<C> getImplementation() {
        logger.warn("no coefficent factory given, assuming field coeffcients");
        GroebnerBaseAbstract<C> bba = new GroebnerBaseSeq<C>();
        return bba;
    }


    /**
     * Determine suitable implementation of GB algorithms, case ModLong.
     * @param fac ModLongRing.
     * @return GB algorithm implementation.
     */
    public static GroebnerBaseAbstract<ModLong> getImplementation(ModLongRing fac) {
        return getImplementation(fac, new OrderedPairlist<ModLong>());
    }


    /**
     * Determine suitable implementation of GB algorithms, case ModLong.
     * @param fac ModLongRing.
     * @param pl pair selection strategy
     * @return GB algorithm implementation.
     */
    public static GroebnerBaseAbstract<ModLong> getImplementation(ModLongRing fac, PairList<ModLong> pl) {
        GroebnerBaseAbstract<ModLong> bba;
        if (fac.isField()) {
            bba = new GroebnerBaseSeq<ModLong>(pl);
        } else {
            bba = new GroebnerBasePseudoSeq<ModLong>(fac,pl);
        }
        return bba;
    }


    /**
     * Determine suitable implementation of GB algorithms, case ModInteger.
     * @param fac ModIntegerRing.
     * @return GB algorithm implementation.
     */
    public static GroebnerBaseAbstract<ModInteger> getImplementation(ModIntegerRing fac) {
        return getImplementation(fac, new OrderedPairlist<ModInteger>());
    }


    /**
     * Determine suitable implementation of GB algorithms, case ModInteger.
     * @param fac ModIntegerRing.
     * @param pl pair selection strategy
     * @return GB algorithm implementation.
     */
    public static GroebnerBaseAbstract<ModInteger> getImplementation(ModIntegerRing fac, PairList<ModInteger> pl) {
        GroebnerBaseAbstract<ModInteger> bba;
        if (fac.isField()) {
            bba = new GroebnerBaseSeq<ModInteger>(pl);
        } else {
            bba = new GroebnerBasePseudoSeq<ModInteger>(fac,pl);
        }
        return bba;
    }


    /**
     * Determine suitable implementation of GB algorithms, case BigInteger.
     * @param fac BigInteger.
     * @return GB algorithm implementation.
     */
    public static GroebnerBaseAbstract<BigInteger> getImplementation(BigInteger fac) {
        return getImplementation(fac, Algo.igb);
    }


    /**
     * Determine suitable implementation of GB algorithms, case BigInteger.
     * @param fac BigInteger.
     * @param a algorithm, a = igb, egb, dgb.
     * @return GB algorithm implementation.
     */
    public static GroebnerBaseAbstract<BigInteger> getImplementation(BigInteger fac, Algo a) {
        return getImplementation(fac, a, new OrderedPairlist<BigInteger>());
    }


    /**
     * Determine suitable implementation of GB algorithms, case BigInteger.
     * @param fac BigInteger.
     * @param pl pair selection strategy
     * @return GB algorithm implementation.
     */
    public static GroebnerBaseAbstract<BigInteger> getImplementation(BigInteger fac, PairList<BigInteger> pl) {
        return getImplementation(fac, Algo.igb, new OrderedPairlist<BigInteger>());
    }


    /**
     * Determine suitable implementation of GB algorithms, case BigInteger.
     * @param fac BigInteger.
     * @param a algorithm, a = igb, egb, dgb.
     * @param pl pair selection strategy
     * @return GB algorithm implementation.
     */
    public static GroebnerBaseAbstract<BigInteger> getImplementation(BigInteger fac, Algo a, PairList<BigInteger> pl) {
        GroebnerBaseAbstract<BigInteger> bba;
        switch (a) {
        case igb:
            bba = new GroebnerBasePseudoSeq<BigInteger>(fac,pl);
            break;
        case egb:
            bba = new EGroebnerBaseSeq<BigInteger>(); // pl not suitable
            break;
        case dgb:
            bba = new DGroebnerBaseSeq<BigInteger>(); // pl not suitable
            break;
        default:
            throw new IllegalArgumentException("algorithm not available for BigInteger " + a);
        }
        return bba;
    }


    /**
     * Determine suitable implementation of GB algorithms, case BigRational.
     * @param fac BigRational.
     * @return GB algorithm implementation.
     */
    public static GroebnerBaseAbstract<BigRational> getImplementation(BigRational fac) {
        return getImplementation(fac, Algo.qgb, new OrderedPairlist<BigRational>());
    }


    /**
     * Determine suitable implementation of GB algorithms, case BigRational.
     * @param fac BigRational.
     * @param a algorithm, a = qgb, ffgb.
     * @return GB algorithm implementation.
     */
    public static GroebnerBaseAbstract<BigRational> getImplementation(BigRational fac, Algo a) {
        return getImplementation(fac, a, new OrderedPairlist<BigRational>());
    }


    /**
     * Determine suitable implementation of GB algorithms, case BigRational.
     * @param fac BigRational.
     * @param pl pair selection strategy
     * @return GB algorithm implementation.
     */
    public static GroebnerBaseAbstract<BigRational> getImplementation(BigRational fac, PairList<BigRational> pl) {
        return getImplementation(fac, Algo.qgb, pl);
    }


    /**
     * Determine suitable implementation of GB algorithms, case BigRational.
     * @param fac BigRational.
     * @param a algorithm, a = qgb, ffgb.
     * @param pl pair selection strategy
     * @return GB algorithm implementation.
     */
    public static GroebnerBaseAbstract<BigRational> getImplementation(BigRational fac, Algo a, PairList<BigRational> pl) {
        GroebnerBaseAbstract<BigRational> bba;
        switch (a) {
        case qgb:
            bba = new GroebnerBaseSeq<BigRational>(pl);
            break;
        case ffgb:
            bba = new GroebnerBaseRational<BigRational>(); // pl not possible
            break;
        default:
            throw new IllegalArgumentException("algorithm not available for BigRational " + a);
        }
        return bba;
    }


    /**
     * Determine suitable implementation of GB algorithms, case Quotient coefficients.
     * @param fac QuotientRing.
     * @return GB algorithm implementation.
     */
    public static <C extends GcdRingElem<C>>
      GroebnerBaseAbstract<Quotient<C>> getImplementation(QuotientRing<C> fac) {
        return getImplementation(fac, Algo.qgb, new OrderedPairlist<Quotient<C>>());
    }


    /**
     * Determine suitable implementation of GB algorithms, case Quotient coefficients.
     * @param fac QuotientRing.
     * @param a algorithm, a = qgb, ffgb.
     * @return GB algorithm implementation.
     */
    public static <C extends GcdRingElem<C>>
      GroebnerBaseAbstract<Quotient<C>> getImplementation(QuotientRing<C> fac, Algo a) {
        return getImplementation(fac, a, new OrderedPairlist<Quotient<C>>());
    }


    /**
     * Determine suitable implementation of GB algorithms, case Quotient coefficients.
     * @param fac QuotientRing.
     * @param pl pair selection strategy
     * @return GB algorithm implementation.
     */
    public static <C extends GcdRingElem<C>>
      GroebnerBaseAbstract<Quotient<C>> getImplementation(QuotientRing<C> fac, PairList<Quotient<C>> pl) {
        return getImplementation(fac, Algo.qgb, pl);
    }


    /**
     * Determine suitable implementation of GB algorithms, case Quotient coefficients.
     * @param fac QuotientRing.
     * @param a algorithm, a = qgb, ffgb.
     * @param pl pair selection strategy
     * @return GB algorithm implementation.
     */
    public static <C extends GcdRingElem<C>>
      GroebnerBaseAbstract<Quotient<C>> getImplementation(QuotientRing<C> fac, Algo a, PairList<Quotient<C>> pl) {
        GroebnerBaseAbstract<Quotient<C>> bba;
        switch (a) {
        case qgb:
            bba = new GroebnerBaseSeq<Quotient<C>>(new ReductionSeq<Quotient<C>>());
            break;
        case ffgb:
            bba = new GroebnerBaseSeqQuotient<C>(fac);
            break;
        default:
            throw new IllegalArgumentException("algorithm not available for Quotient " + a);
        }
        return bba;
    }


    /**
     * Determine suitable implementation of GB algorithms, case (recursive)
     * polynomial.
     * @param fac GenPolynomialRing&lt;C&gt;.
     * @return GB algorithm implementation.
     */
    public static <C extends GcdRingElem<C>> 
      GroebnerBaseAbstract<GenPolynomial<C>> getImplementation(GenPolynomialRing<C> fac) {
        GroebnerBaseAbstract<GenPolynomial<C>> bba;
        bba = new GroebnerBasePseudoRecSeq<C>(fac);
        return bba;
    }


    /**
     * Determine suitable implementation of GB algorithms, case regular rings.
     * @param fac RegularRing.
     * @return GB algorithm implementation.
     */
    public static <C extends RingElem<C>> 
       GroebnerBaseAbstract<Product<C>> getImplementation(ProductRing<C> fac) {
        GroebnerBaseAbstract<Product<C>> bba;
        if (fac.onlyFields()) {
            bba = new RGroebnerBaseSeq<Product<C>>();
        } else {
            bba = new RGroebnerBasePseudoSeq<Product<C>>(fac);
        }
        return bba;
    }


    /**
     * Determine suitable implementation of GB algorithms, other cases.
     * @param fac RingFactory&lt;C&gt;.
     * @return GB algorithm implementation.
     */
    public static <C extends GcdRingElem<C>> // interface RingElem not sufficient 
      GroebnerBaseAbstract<C> getImplementation(RingFactory<C> fac) {
        return getImplementation(fac, new OrderedPairlist<C>());
    }


    /**
     * Determine suitable implementation of GB algorithms, other cases.
     * @param fac RingFactory&lt;C&gt;.
     * @param pl pair selection strategy
     * @return GB algorithm implementation.
     */
    @SuppressWarnings("unchecked")
    public static <C extends GcdRingElem<C>> // interface RingElem not sufficient 
      GroebnerBaseAbstract<C> getImplementation(RingFactory<C> fac, PairList<C> pl) {
        logger.debug("fac = " + fac.getClass().getName());
        if (fac.isField()) {
            return new GroebnerBaseSeq<C>(pl);
        }
        GroebnerBaseAbstract bba = null;
        Object ofac = fac;
        if (ofac instanceof GenPolynomialRing) {
            GenPolynomialRing<C> rofac = (GenPolynomialRing<C>) ofac;
            GroebnerBaseAbstract<GenPolynomial<C>> bbr = new GroebnerBasePseudoRecSeq<C>(rofac);
            bba = (GroebnerBaseAbstract) bbr;
        } else if (ofac instanceof ProductRing) {
            ProductRing pfac = (ProductRing) ofac;
            if (pfac.onlyFields()) {
                bba = new RGroebnerBaseSeq<Product<C>>();
            } else {
                bba = new RGroebnerBasePseudoSeq<Product<C>>(pfac);
            }
        } else {
            bba = new GroebnerBasePseudoSeq<C>(fac, pl);
        }
        logger.debug("bba = " + bba.getClass().getName());
        return bba;
    }


    /**
     * Determine suitable concurrent implementation of GB algorithms if
     * possible.
     * @param fac RingFactory&lt;C&gt;.
     * @return GB proxy algorithm implementation.
     */
    public static <C extends GcdRingElem<C>> // interface RingElem not sufficient 
      GroebnerBaseAbstract<C> getProxy(RingFactory<C> fac) {
        return getProxy(fac, new OrderedPairlist<C>());
    }


    /**
     * Determine suitable concurrent implementation of GB algorithms if
     * possible.
     * @param fac RingFactory&lt;C&gt;.
     * @param pl pair selection strategy
     * @return GB proxy algorithm implementation.
     */
    public static <C extends GcdRingElem<C>> // interface RingElem not sufficient 
      GroebnerBaseAbstract<C> getProxy(RingFactory<C> fac, PairList<C> pl) {
        if (ComputerThreads.NO_THREADS) {
            return GBFactory.<C> getImplementation(fac,pl);
        }
        logger.debug("fac = " + fac.getClass().getName());
        int th = ( ComputerThreads.N_CPUS > 2 ? ComputerThreads.N_CPUS-1 : 2 );
        if (fac.isField()) {
            GroebnerBaseAbstract<C> e1 = new GroebnerBaseSeq<C>(pl);
            GroebnerBaseAbstract<C> e2 = new GroebnerBaseParallel<C>(th,pl);
            return new GBProxy<C>(e1, e2);
        } else if (fac.getONE() instanceof GcdRingElem && fac.characteristic().signum() == 0) {
            GroebnerBaseAbstract<C> e1 = new GroebnerBasePseudoSeq<C>(fac,pl);
            GroebnerBaseAbstract<C> e2 = new GroebnerBasePseudoParallel<C>(th,fac,pl);
            return new GBProxy<C>(e1, e2);
        }
        return getImplementation(fac);
    }

}
