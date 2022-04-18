// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Table view specification.
 * 
 */
public final class GoogleCloudDatacatalogV1ViewSpecResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1ViewSpecResponse Empty = new GoogleCloudDatacatalogV1ViewSpecResponse();

    /**
     * The query that defines the table view.
     * 
     */
    @Import(name="viewQuery", required=true)
      private final String viewQuery;

    public String viewQuery() {
        return this.viewQuery;
    }

    public GoogleCloudDatacatalogV1ViewSpecResponse(String viewQuery) {
        this.viewQuery = Objects.requireNonNull(viewQuery, "expected parameter 'viewQuery' to be non-null");
    }

    private GoogleCloudDatacatalogV1ViewSpecResponse() {
        this.viewQuery = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1ViewSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String viewQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1ViewSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.viewQuery = defaults.viewQuery;
        }

        public Builder viewQuery(String viewQuery) {
            this.viewQuery = Objects.requireNonNull(viewQuery);
            return this;
        }        public GoogleCloudDatacatalogV1ViewSpecResponse build() {
            return new GoogleCloudDatacatalogV1ViewSpecResponse(viewQuery);
        }
    }
}
