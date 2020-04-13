package in.ibm.demo.repo;

import java.util.List;

import in.ibm.demo.bean.Image;

public interface ImageRepository {

	public Image createImage(Image image);
	
	public List<Image> listAll();
	
	
}
