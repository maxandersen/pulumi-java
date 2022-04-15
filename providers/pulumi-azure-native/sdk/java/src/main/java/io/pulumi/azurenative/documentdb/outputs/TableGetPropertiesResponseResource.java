// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TableGetPropertiesResponseResource {
    /**
     * A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    private final String etag;
    /**
     * Name of the Cosmos DB table
     * 
     */
    private final String id;
    /**
     * A system generated property. A unique identifier.
     * 
     */
    private final String rid;
    /**
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    private final Double ts;

    @CustomType.Constructor
    private TableGetPropertiesResponseResource(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("rid") String rid,
        @CustomType.Parameter("ts") Double ts) {
        this.etag = etag;
        this.id = id;
        this.rid = rid;
        this.ts = ts;
    }

    /**
     * A system generated property representing the resource etag required for optimistic concurrency control.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Name of the Cosmos DB table
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * A system generated property. A unique identifier.
     * 
    */
    public String rid() {
        return this.rid;
    }
    /**
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
    */
    public Double ts() {
        return this.ts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private String rid;
        private Double ts;

        public Builder() {
    	      // Empty
        }

        public Builder(TableGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.rid = defaults.rid;
    	      this.ts = defaults.ts;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder rid(String rid) {
            this.rid = Objects.requireNonNull(rid);
            return this;
        }
        public Builder ts(Double ts) {
            this.ts = Objects.requireNonNull(ts);
            return this;
        }        public TableGetPropertiesResponseResource build() {
            return new TableGetPropertiesResponseResource(etag, id, rid, ts);
        }
    }
}
