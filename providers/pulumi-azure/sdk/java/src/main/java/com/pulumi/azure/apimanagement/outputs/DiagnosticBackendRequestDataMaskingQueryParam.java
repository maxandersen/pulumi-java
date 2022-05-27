// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DiagnosticBackendRequestDataMaskingQueryParam {
    private final String mode;
    private final String value;

    @CustomType.Constructor
    private DiagnosticBackendRequestDataMaskingQueryParam(
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("value") String value) {
        this.mode = mode;
        this.value = value;
    }

    public String mode() {
        return this.mode;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticBackendRequestDataMaskingQueryParam defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticBackendRequestDataMaskingQueryParam defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.value = defaults.value;
        }

        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public DiagnosticBackendRequestDataMaskingQueryParam build() {
            return new DiagnosticBackendRequestDataMaskingQueryParam(mode, value);
        }
    }
}
