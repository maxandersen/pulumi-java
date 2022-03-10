// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firestore_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleFirestoreAdminV1beta1IndexFieldResponse {
    /**
     * The path of the field. Must match the field path specification described by google.firestore.v1beta1.Document.fields. Special field path `__name__` may be used by itself or at the end of a path. `__type__` may be used only at the end of path.
     * 
     */
    private final String fieldPath;
    /**
     * The field's mode.
     * 
     */
    private final String mode;

    @OutputCustomType.Constructor
    private GoogleFirestoreAdminV1beta1IndexFieldResponse(
        @OutputCustomType.Parameter("fieldPath") String fieldPath,
        @OutputCustomType.Parameter("mode") String mode) {
        this.fieldPath = fieldPath;
        this.mode = mode;
    }

    /**
     * The path of the field. Must match the field path specification described by google.firestore.v1beta1.Document.fields. Special field path `__name__` may be used by itself or at the end of a path. `__type__` may be used only at the end of path.
     * 
    */
    public String getFieldPath() {
        return this.fieldPath;
    }
    /**
     * The field's mode.
     * 
    */
    public String getMode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleFirestoreAdminV1beta1IndexFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fieldPath;
        private String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleFirestoreAdminV1beta1IndexFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldPath = defaults.fieldPath;
    	      this.mode = defaults.mode;
        }

        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = Objects.requireNonNull(fieldPath);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public GoogleFirestoreAdminV1beta1IndexFieldResponse build() {
            return new GoogleFirestoreAdminV1beta1IndexFieldResponse(fieldPath, mode);
        }
    }
}
