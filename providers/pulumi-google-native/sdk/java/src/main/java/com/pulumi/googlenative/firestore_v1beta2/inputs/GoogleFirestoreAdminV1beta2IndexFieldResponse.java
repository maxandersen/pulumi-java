// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firestore_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A field in an index. The field_path describes which field is indexed, the value_mode describes how the field value is indexed.
 * 
 */
public final class GoogleFirestoreAdminV1beta2IndexFieldResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleFirestoreAdminV1beta2IndexFieldResponse Empty = new GoogleFirestoreAdminV1beta2IndexFieldResponse();

    /**
     * Indicates that this field supports operations on `array_value`s.
     * 
     */
    @Import(name="arrayConfig", required=true)
      private final String arrayConfig;

    public String arrayConfig() {
        return this.arrayConfig;
    }

    /**
     * Can be __name__. For single field indexes, this must match the name of the field or may be omitted.
     * 
     */
    @Import(name="fieldPath", required=true)
      private final String fieldPath;

    public String fieldPath() {
        return this.fieldPath;
    }

    /**
     * Indicates that this field supports ordering by the specified order or comparing using =, &lt;, &lt;=, &gt;, &gt;=.
     * 
     */
    @Import(name="order", required=true)
      private final String order;

    public String order() {
        return this.order;
    }

    public GoogleFirestoreAdminV1beta2IndexFieldResponse(
        String arrayConfig,
        String fieldPath,
        String order) {
        this.arrayConfig = Objects.requireNonNull(arrayConfig, "expected parameter 'arrayConfig' to be non-null");
        this.fieldPath = Objects.requireNonNull(fieldPath, "expected parameter 'fieldPath' to be non-null");
        this.order = Objects.requireNonNull(order, "expected parameter 'order' to be non-null");
    }

    private GoogleFirestoreAdminV1beta2IndexFieldResponse() {
        this.arrayConfig = null;
        this.fieldPath = null;
        this.order = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleFirestoreAdminV1beta2IndexFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arrayConfig;
        private String fieldPath;
        private String order;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleFirestoreAdminV1beta2IndexFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arrayConfig = defaults.arrayConfig;
    	      this.fieldPath = defaults.fieldPath;
    	      this.order = defaults.order;
        }

        public Builder arrayConfig(String arrayConfig) {
            this.arrayConfig = Objects.requireNonNull(arrayConfig);
            return this;
        }
        public Builder fieldPath(String fieldPath) {
            this.fieldPath = Objects.requireNonNull(fieldPath);
            return this;
        }
        public Builder order(String order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }        public GoogleFirestoreAdminV1beta2IndexFieldResponse build() {
            return new GoogleFirestoreAdminV1beta2IndexFieldResponse(arrayConfig, fieldPath, order);
        }
    }
}
