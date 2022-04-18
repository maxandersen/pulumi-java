// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInstanceTemplateSchedulingNodeAffinity extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateSchedulingNodeAffinity Empty = new GetInstanceTemplateSchedulingNodeAffinity();

    /**
     * The key for the node affinity label.
     * 
     */
    @Import(name="key", required=true)
      private final String key;

    public String key() {
        return this.key;
    }

    /**
     * The operator. Can be `IN` for node-affinities
     * or `NOT_IN` for anti-affinities.
     * 
     */
    @Import(name="operator", required=true)
      private final String operator;

    public String operator() {
        return this.operator;
    }

    @Import(name="values", required=true)
      private final List<String> values;

    public List<String> values() {
        return this.values;
    }

    public GetInstanceTemplateSchedulingNodeAffinity(
        String key,
        String operator,
        List<String> values) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private GetInstanceTemplateSchedulingNodeAffinity() {
        this.key = null;
        this.operator = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateSchedulingNodeAffinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String operator;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateSchedulingNodeAffinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetInstanceTemplateSchedulingNodeAffinity build() {
            return new GetInstanceTemplateSchedulingNodeAffinity(key, operator, values);
        }
    }
}
