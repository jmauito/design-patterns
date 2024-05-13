package article;

import java.math.BigDecimal;
import java.util.List;

public class Article {

	private long id;
	private List<Long> phones;
	private String reference;
	private String description;
	private BigDecimal retailPrice;
	private int stock;
	private List<String> tags;
	private BigDecimal wholesalePrice;
	
	public Article(long id) {
		this.id = id;
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Long> getPhones() {
		return phones;
	}

	public void setPhones(List<Long> phones) {
		this.phones = phones;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public BigDecimal getWholesalePrice() {
		return wholesalePrice;
	}

	public void setWholesalePrice(BigDecimal wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}

	public static Builder builder(long id) {
		return new Builder(id);
	}
	
	@Override
	public String toString() {
		return "{ id: "+ id +
				", description: " + description + 
				", reference: " + reference + 
				", retailPrice: " + retailPrice + 
				", stock: " + stock +
				", wholesalePrice: " + wholesalePrice + 
				"}";
	}
	
	public static class Builder 
	{
		private Article article;
		
		private Builder(long id) {
			this.article = new Article(id);
		}
		
		public Builder phones(List<Long> phones) {
			this.article.phones = phones;
			return this;
		}
		
		public Builder reference(String reference) {
			this.article.reference = reference;
			return this;
		}
		
		public Builder description(String description) {
			this.article.description = description;
			return this;
		}
		
		public Builder retailPrice(BigDecimal retailPrice) {
			this.article.retailPrice = retailPrice;
			return this;
		}
		
		public Builder stock(int stock) {
			this.article.stock = stock;
			return this;
		}
		
		public Builder tags(List<String> tags) {
			this.article.tags = tags;
			return this;
		}
		
		public Builder wholesalePrice(BigDecimal wholesalePrice) {
			this.article.wholesalePrice = wholesalePrice;
			return this;
		}
		
		public Article build() {
			return this.article;
		}
		
	}
}
