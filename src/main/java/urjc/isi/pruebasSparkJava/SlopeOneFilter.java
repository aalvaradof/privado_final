package urjc.isi.pruebasSparkJava;

import java.util.Map;

/**
 * @author nshandra, jaimefdez96, AlbertoCoding
 * <p>
 * data: userID | titleID | score<br>
 * diffMap: titleID-A | titleID-B | difference<br>
 * weightMap: titleID-A | titleID-B | weight<br>
 * predictions: userID | titleID | prediction
 */
public class SlopeOneFilter {

	Map<Integer, Map<Integer, Double>> data;
	Map<Integer, Map<Integer, Double>> diffMap;
	Map<Integer, Map<Integer, Integer>> weightMap;
	Map<Integer, Map<Integer, Double>> predictions;

	public SlopeOneFilter() {
//		JDBC call
		buildMaps();
		for (int user : data.keySet()){
			predict(user);
		}
	}

	public void buildMaps(){
		// Crear diffMap y weightMap a partir de data.
	}

	public void predict(int user) {
		// Crear predictions para ese usuario determinado.
	}

	public void recommend(int user, int nItems) {
		// Mostrar nItems predicciones con mayor puntuación.
	}
}
