// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SortOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final SortOptionsResponse Empty = new SortOptionsResponse();

    /**
     * Name of the operator corresponding to the field to sort on. The corresponding property must be marked as sortable.
     * 
     */
    @Import(name="operatorName", required=true)
      private final String operatorName;

    public String operatorName() {
        return this.operatorName;
    }

    /**
     * Ascending is the default sort order
     * 
     */
    @Import(name="sortOrder", required=true)
      private final String sortOrder;

    public String sortOrder() {
        return this.sortOrder;
    }

    public SortOptionsResponse(
        String operatorName,
        String sortOrder) {
        this.operatorName = Objects.requireNonNull(operatorName, "expected parameter 'operatorName' to be non-null");
        this.sortOrder = Objects.requireNonNull(sortOrder, "expected parameter 'sortOrder' to be non-null");
    }

    private SortOptionsResponse() {
        this.operatorName = null;
        this.sortOrder = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SortOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operatorName;
        private String sortOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(SortOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operatorName = defaults.operatorName;
    	      this.sortOrder = defaults.sortOrder;
        }

        public Builder operatorName(String operatorName) {
            this.operatorName = Objects.requireNonNull(operatorName);
            return this;
        }
        public Builder sortOrder(String sortOrder) {
            this.sortOrder = Objects.requireNonNull(sortOrder);
            return this;
        }        public SortOptionsResponse build() {
            return new SortOptionsResponse(operatorName, sortOrder);
        }
    }
}
