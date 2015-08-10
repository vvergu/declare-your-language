package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class bindVar_2 extends A_bindVar__Arrow 
{ 
  public String _1;

  @Child public A_V _2;

  public bindVar_2 (INodeSource source, String _1, A_V _2) 
  { 
    this.setSourceInfo(source);
    this._1 = _1;
    this._2 = adoptChild(_2);
  }

  @Override public boolean equals(Object obj)
  { 
    if(this == obj)
    { 
      return true;
    }
    if(obj == null)
    { 
      return false;
    }
    if(getClass() != obj.getClass())
    { 
      return false;
    }
    final bindVar_2 other = (bindVar_2)obj;
    if(_1 == null)
    { 
      if(other._1 != null)
      { 
        return false;
      }
    }
    else
      if(!_1.equals(other._1))
      { 
        return false;
      }
    if(_2 == null)
    { 
      if(other._2 != null)
      { 
        return false;
      }
    }
    else
      if(!_2.equals(other._2))
      { 
        return false;
      }
    return true;
  }

  private boolean hasSpecialized;

  @Override public void specializeChildren(int depth)
  { 
    if(!hasSpecialized)
    { 
      if(_2 instanceof IGenericNode)
      { 
        ((IGenericNode)_2).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_Env exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in22800 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in30800 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in30800 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in30800 = _4;
    final String x51500000 = this._1;
    final A_V v16100000 = this._2;
    final A_This this_123700 = this_in22800;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> E4600000 = env_in30800;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_137500 = c_in30800;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_131500 = store_in30800;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_20420000 = MapUtils.plus(E4600000, new com.github.krukow.clj_lang.PersistentTreeMap<String, A_V>().plus(x51500000, v16100000));
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out30800 = store_131500;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> result_out30800 = lifted_20420000;
    return new R_default_Env(result_out30800, store_out30800);
  }

  public String get_1()
  { 
    return this._1;
  }

  public A_V get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("bindVar", 2), factory.makeString(_1), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}