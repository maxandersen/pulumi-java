// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.osconfig_v1alpha.outputs.OSPolicyResourceExecResourceExecResponse;
import java.util.Objects;

@CustomType
public final class OSPolicyResourceExecResourceResponse {
    /**
     * What to run to bring this resource into the desired state. An exit code of 100 indicates &#34;success&#34;, any other exit code indicates a failure running enforce.
     * 
     */
    private final OSPolicyResourceExecResourceExecResponse enforce;
    /**
     * What to run to validate this resource is in the desired state. An exit code of 100 indicates &#34;in desired state&#34;, and exit code of 101 indicates &#34;not in desired state&#34;. Any other exit code indicates a failure running validate.
     * 
     */
    private final OSPolicyResourceExecResourceExecResponse validate;

    @CustomType.Constructor
    private OSPolicyResourceExecResourceResponse(
        @CustomType.Parameter("enforce") OSPolicyResourceExecResourceExecResponse enforce,
        @CustomType.Parameter("validate") OSPolicyResourceExecResourceExecResponse validate) {
        this.enforce = enforce;
        this.validate = validate;
    }

    /**
     * What to run to bring this resource into the desired state. An exit code of 100 indicates &#34;success&#34;, any other exit code indicates a failure running enforce.
     * 
    */
    public OSPolicyResourceExecResourceExecResponse enforce() {
        return this.enforce;
    }
    /**
     * What to run to validate this resource is in the desired state. An exit code of 100 indicates &#34;in desired state&#34;, and exit code of 101 indicates &#34;not in desired state&#34;. Any other exit code indicates a failure running validate.
     * 
    */
    public OSPolicyResourceExecResourceExecResponse validate() {
        return this.validate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceExecResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceExecResourceExecResponse enforce;
        private OSPolicyResourceExecResourceExecResponse validate;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceExecResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforce = defaults.enforce;
    	      this.validate = defaults.validate;
        }

        public Builder enforce(OSPolicyResourceExecResourceExecResponse enforce) {
            this.enforce = Objects.requireNonNull(enforce);
            return this;
        }
        public Builder validate(OSPolicyResourceExecResourceExecResponse validate) {
            this.validate = Objects.requireNonNull(validate);
            return this;
        }        public OSPolicyResourceExecResourceResponse build() {
            return new OSPolicyResourceExecResourceResponse(enforce, validate);
        }
    }
}
