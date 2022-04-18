// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPermissionsDatabase {
    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    private final String catalogId;
    /**
     * Name of the table resource.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetPermissionsDatabase(
        @CustomType.Parameter("catalogId") String catalogId,
        @CustomType.Parameter("name") String name) {
        this.catalogId = catalogId;
        this.name = name;
    }

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
    */
    public String catalogId() {
        return this.catalogId;
    }
    /**
     * Name of the table resource.
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionsDatabase defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalogId;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPermissionsDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.name = defaults.name;
        }

        public Builder catalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetPermissionsDatabase build() {
            return new GetPermissionsDatabase(catalogId, name);
        }
    }
}
