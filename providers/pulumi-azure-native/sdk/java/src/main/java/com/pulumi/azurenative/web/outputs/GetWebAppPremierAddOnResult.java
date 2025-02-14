// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppPremierAddOnResult {
    /**
     * @return Resource Id.
     * 
     */
    private final String id;
    /**
     * @return Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * @return Resource Location.
     * 
     */
    private final String location;
    /**
     * @return Premier add on Marketplace offer.
     * 
     */
    private final @Nullable String marketplaceOffer;
    /**
     * @return Premier add on Marketplace publisher.
     * 
     */
    private final @Nullable String marketplacePublisher;
    /**
     * @return Resource Name.
     * 
     */
    private final String name;
    /**
     * @return Premier add on Product.
     * 
     */
    private final @Nullable String product;
    /**
     * @return Premier add on SKU.
     * 
     */
    private final @Nullable String sku;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type.
     * 
     */
    private final String type;
    /**
     * @return Premier add on Vendor.
     * 
     */
    private final @Nullable String vendor;

    @CustomType.Constructor
    private GetWebAppPremierAddOnResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("marketplaceOffer") @Nullable String marketplaceOffer,
        @CustomType.Parameter("marketplacePublisher") @Nullable String marketplacePublisher,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("product") @Nullable String product,
        @CustomType.Parameter("sku") @Nullable String sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("vendor") @Nullable String vendor) {
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.marketplaceOffer = marketplaceOffer;
        this.marketplacePublisher = marketplacePublisher;
        this.name = name;
        this.product = product;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
        this.vendor = vendor;
    }

    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Kind of resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Resource Location.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Premier add on Marketplace offer.
     * 
     */
    public Optional<String> marketplaceOffer() {
        return Optional.ofNullable(this.marketplaceOffer);
    }
    /**
     * @return Premier add on Marketplace publisher.
     * 
     */
    public Optional<String> marketplacePublisher() {
        return Optional.ofNullable(this.marketplacePublisher);
    }
    /**
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Premier add on Product.
     * 
     */
    public Optional<String> product() {
        return Optional.ofNullable(this.product);
    }
    /**
     * @return Premier add on SKU.
     * 
     */
    public Optional<String> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Premier add on Vendor.
     * 
     */
    public Optional<String> vendor() {
        return Optional.ofNullable(this.vendor);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppPremierAddOnResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String kind;
        private String location;
        private @Nullable String marketplaceOffer;
        private @Nullable String marketplacePublisher;
        private String name;
        private @Nullable String product;
        private @Nullable String sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String vendor;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppPremierAddOnResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.marketplaceOffer = defaults.marketplaceOffer;
    	      this.marketplacePublisher = defaults.marketplacePublisher;
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vendor = defaults.vendor;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder marketplaceOffer(@Nullable String marketplaceOffer) {
            this.marketplaceOffer = marketplaceOffer;
            return this;
        }
        public Builder marketplacePublisher(@Nullable String marketplacePublisher) {
            this.marketplacePublisher = marketplacePublisher;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder product(@Nullable String product) {
            this.product = product;
            return this;
        }
        public Builder sku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder vendor(@Nullable String vendor) {
            this.vendor = vendor;
            return this;
        }        public GetWebAppPremierAddOnResult build() {
            return new GetWebAppPremierAddOnResult(id, kind, location, marketplaceOffer, marketplacePublisher, name, product, sku, tags, type, vendor);
        }
    }
}
