package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.interpreter.core.Tools;
import java.util.Objects;

@SuppressWarnings("unused") public class Generic_A_Obj extends A_Obj implements IGenericNode
{ 
  public IStrategoTerm aterm;

  public Generic_A_Obj (INodeSource source, IStrategoTerm term) 
  { 
    Objects.requireNonNull(term);
    this.setSourceInfo(source);
    this.aterm = term;
  }

  @Override public <T> T match(Class<T> clazz)
  { 
    return specialize(1).match(clazz);
  }

  @Override public void specializeChildren(int depth)
  { 
    throw new InterpreterException("Operation not supported", "aterm specializer", this);
  }

  @Override public A_Obj specialize(int depth)
  { 
    if(replaced())
    { 
      return (A_Obj)replacement();
    }
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final INodeSource source = NodeSource.fromStrategoTerm(term);
      if(name.equals("ObjV") && term.getSubtermCount() == 4)
      { 
        A_Obj replacement = replace(new ObjV_4(source, TermUtils.stringFromTerm(term.getSubterm(0)), new Generic_A_Super(NodeSource.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1)).specialize(1), AutoMapUtils.aterm2map_String_int(term.getSubterm(2)), AutoMapUtils.aterm2map_String_A_Method(term.getSubterm(3))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
    }
    throw new RewritingException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }
}