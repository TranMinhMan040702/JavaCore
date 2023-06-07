package oop.exercise2;

import java.util.ArrayList;
import java.util.List;

public class ManagerDocument {
	private List<Document> documents;

	public ManagerDocument() {
		this.documents = new ArrayList<>();
	}

	public void addDocument(Document document) {
		this.documents.add(document);
	}

	public List<Document> deleteDocumentById(int id) {
		for (Document document : this.documents) {
			if (document.getId() == id) {
				this.documents.remove(document);
			}
		}
		return this.documents;
	}

	public List<Document> showDocument() {
		return this.documents;
	}

	public void searchByType(int number) {
		switch (number) {
		case 1: {
			this.documents.stream().filter(o -> o instanceof Book).forEach(o -> System.out.println(o.toString()));
			break;
		}
		case 2: {
			this.documents.stream().filter(o -> o instanceof Magazine).forEach(o -> System.out.println(o.toString()));
			break;
		}
		case 3: {
			this.documents.stream().filter(o -> o instanceof Newspaper).forEach(o -> System.out.println(o.toString()));
			break;
		}
		default:
			this.documents.stream().forEach(o -> System.out.println(o.toString()));
		}
	}
}
