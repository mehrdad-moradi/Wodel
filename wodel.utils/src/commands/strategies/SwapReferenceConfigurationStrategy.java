package commands.strategies;

import java.util.List;

import manager.ModelManager;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author Pablo Gomez-Abajo
 * 
 * SwapAttributeConfigurationStrategy reference swap
 *  
 */

public class SwapReferenceConfigurationStrategy extends ReferenceConfigurationStrategy {
	
	/**
	 * @param value
	 * Normal constructor
	 */
	protected EReference source;
	protected EReference target;
	protected EObject eobjsrc;
	protected EObject eobjtar;
	protected EObject othereobjsrc;
	protected String othereobjsrcname;
	protected EObject othereobjtar;
	protected String othereobjtarname;
	
	@Override
	public boolean sameType() {
		Object src = eobjsrc.eGet(source);
		Object tar = eobjsrc.eGet(target);
		if (src != null && tar != null) {
			if (src.getClass().equals(tar.getClass())) {
				return true;
			}
		}
		if (source != null && target != null) {
			if (EcoreUtil.equals(source.getEReferenceType(), target.getEReferenceType())) {
				return true;
			}
		}
		return false;
	}

	public SwapReferenceConfigurationStrategy(EObject o, String target, String source) {
		super("");
		for (EReference a : o.eClass().getEAllReferences()) {
			if (a.getName().equals(source)) {
				this.source = a;
				break;
			}
		}
		for (EReference a : o.eClass().getEAllReferences()) {
			if (a.getName().equals(target)) {
				this.target = a;
				break;
			}
		}
		
		for (EReference r : ModelManager.getReferences(o)) {
			if (r.getName().equals(source)) {
				continue;
			}
			if (r.getEType().getName().equals(((EObject) o.eGet(this.source)).eClass().getName())) {
				othereobjsrc = (EObject) o.eGet(r, true);
				othereobjsrcname = r.getName();
			}
		}
				
		for (EReference r : ModelManager.getReferences(o)) {
			if (r.getName().equals(target)) {
				continue;
			}
			if (r.getEType().getName().equals(((EObject) o.eGet(this.target)).eClass().getName())) {
				othereobjtar = (EObject) o.eGet(r, true);
				othereobjtarname = r.getName();
			}
		}

		eobjsrc = EcoreUtil.copy(o);
		eobjtar = EcoreUtil.copy(o);
		
		o.eSet(this.target, eobjsrc.eGet(this.source));
		o.eSet(this.source, eobjsrc.eGet(this.target));
	}
	
	public SwapReferenceConfigurationStrategy(EObject obj_tar, String src_name, String target, String source, Resource model) {
		super("");
		//obtiene un objeto aleatorio del tipo src_name
		List<EObject> l = ModelManager.getObjectsOfType(src_name, model);
		if(l==null || l.size()==0) return;
		EObject obj_src = l.get(ModelManager.getRandomIndex(l));
		//obtiene los valores de los atributos
		for (EReference a : obj_src.eClass().getEAllReferences()) {
			if (a.getName().equals(source)) {
				this.source = a;
				break;
			}
		}
		for (EReference a : obj_tar.eClass().getEAllReferences()) {
			if (a.getName().equals(target)) {
				this.target = a;
				break;
			}
		}
		
		for (EReference r : ModelManager.getReferences(obj_src)) {
			if (r.getName().equals(source)) {
				continue;
			}
			if (obj_src.eGet(this.source) != null) {
				if (r.getEType().getName().equals(((EObject) obj_src.eGet(this.source)).eClass().getName())) {
					othereobjsrc = (EObject) obj_src.eGet(r, true);
					othereobjsrcname = r.getName();
				}
			}
		}
				
		for (EReference r : ModelManager.getReferences(obj_tar)) {
			if (r.getName().equals(target)) {
				continue;
			}
			if (obj_tar.eGet(this.target) != null) {
				if (r.getEType().getName().equals(((EObject) obj_tar.eGet(this.target)).eClass().getName())) {
					othereobjtar = (EObject) obj_tar.eGet(r, true);
					othereobjtarname = r.getName();
				}
			}
		}

		eobjsrc = EcoreUtil.copy(obj_src);
		eobjtar = EcoreUtil.copy(obj_tar);

		obj_src.eSet(this.source, obj_tar.eGet(this.target));
		obj_tar.eSet(this.target, eobjsrc.eGet(this.source));
	}

	public SwapReferenceConfigurationStrategy(EObject obj_tar, EObject obj_src, String target, String source) {
		super("");
		for (EReference a : obj_src.eClass().getEAllReferences()) {
			if (a.getName().equals(source)) {
				this.source = a;
				break;
			}
		}
		for (EReference a : obj_tar.eClass().getEAllReferences()) {
			if (a.getName().equals(target)) {
				this.target = a;
				break;
			}
		}
		
		for (EReference r : ModelManager.getReferences(obj_src)) {
			if (r.getName().equals(source)) {
				continue;
			}
			if (obj_src.eGet(this.source) != null) {
				if (r.getEType().getName().equals(((EObject) obj_src.eGet(this.source)).eClass().getName())) {
					othereobjsrc = (EObject) obj_src.eGet(r, true);
					othereobjsrcname = r.getName();
				}
			}
		}
				
		for (EReference r : ModelManager.getReferences(obj_tar)) {
			if (r.getName().equals(target)) {
				continue;
			}
			if (obj_tar.eGet(this.target) != null) {
				if (r.getEType().getName().equals(((EObject) obj_tar.eGet(this.target)).eClass().getName())) {
					othereobjtar = (EObject) obj_tar.eGet(r, true);
					othereobjtarname = r.getName();
				}
			}
		}
		
		eobjsrc = EcoreUtil.copy(obj_src);
		eobjtar = EcoreUtil.copy(obj_tar);

		obj_src.eSet(this.source, obj_tar.eGet(this.target));
		obj_tar.eSet(this.target, eobjsrc.eGet(this.source));
	}

	
	public Object getValue(EObject o) {
		return o.eGet(target);
	}
	
	public Object getPrevious(EObject o) {
		return o.eGet(this.source);
	}
	
	public Object getNext(EObject o) {
		return o.eGet(this.target);
	}
	
	public EObject getRefObject() {
		return eobjtar;
	}
	
	public EObject getOtherSource() {
		return othereobjsrc;
	}
	
	public String getOtherSourceName() {
		return othereobjsrcname;
	}

	public EObject getOtherTarget() {
		return othereobjtar;
	}
	
	public String getOtherTargetName() {
		return othereobjtarname;
	}
}
